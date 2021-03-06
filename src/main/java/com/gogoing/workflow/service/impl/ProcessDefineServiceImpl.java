package com.gogoing.workflow.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.pagehelper.util.StringUtil;
import com.gogoing.workflow.bpmn.builder.BpmnBuilder;
import com.gogoing.workflow.bpmn.builder.ImageBpmnModelUtils;
import com.gogoing.workflow.bpmn.builder.ImageGenerator;
import com.gogoing.workflow.bpmn.converter.CustomBpmnJsonConverter;
import com.gogoing.workflow.constant.ProcessConstants;
import com.gogoing.workflow.domain.ProcessCreateDefineParam;
import com.gogoing.workflow.domain.ProcessCreateDefineResult;
import com.gogoing.workflow.domain.ProcessDefineResult;
import com.gogoing.workflow.exception.ProcessException;
import com.gogoing.workflow.service.ProcessDefineService;
import com.gogoing.workflow.utils.XmlUtil;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import lombok.extern.slf4j.Slf4j;
import org.activiti.bpmn.BpmnAutoLayout;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.GraphicInfo;
import org.activiti.bpmn.model.Process;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.persistence.entity.ModelEntityImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * ??????????????????Service??????
 * @author lhj
 */
@Service
@Slf4j
public class ProcessDefineServiceImpl implements ProcessDefineService {

    private static final Logger log = LoggerFactory.getLogger(ProcessDefineServiceImpl.class);

    @Resource
    private RepositoryService repositoryService;

    @Resource
    private ObjectMapper objectMapper;

    /**
     * bpmn???json????????????
     */
    private BpmnJsonConverter bpmnJsonConverter = new CustomBpmnJsonConverter();

    /**
     * bpmn???xml????????????
     */
    private BpmnXMLConverter bpmnXmlConverter = new BpmnXMLConverter();

    /**
     * ?????????????????????????????????
     *
     * @return
     */
    @Override
    public List<ProcessDefineResult> listProcessDefine() {
        // ???????????????????????????
        List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().orderByProcessDefinitionVersion().asc().list();

        // ??????????????????
        List<ProcessDefineResult> result = Collections.emptyList();
        if (CollectionUtil.isNotEmpty(list)) {
            result = list.stream().map(this::convertProcessDefResult).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * ??????????????????key????????????????????????
     *
     * @param processDefKey ????????????key
     * @return ??????????????????
     */
    @Override
    public ProcessDefineResult getProcessDefByKey(String processDefKey) {
        if (StringUtil.isNotEmpty(processDefKey)) {
            // ??????processKey??????????????????
            ProcessDefinition processDefinition = repositoryService
                .createProcessDefinitionQuery()
                .processDefinitionKey(processDefKey)
                .singleResult();
            if (processDefinition != null) {
                return convertProcessDefResult(processDefinition);
            }
        }
        return null;
    }

    /**
     * ??????????????????
     * @param createProcessDefineParam
     * @return
     */
    @Override
    public ProcessCreateDefineResult createProcessDefine(ProcessCreateDefineParam createProcessDefineParam) {
        BpmnBuilder builder = new BpmnBuilder(createProcessDefineParam);
        BpmnModel bpmnModel = builder.build();
        // ???bpmnmodel??????json
        ObjectNode modelNode = bpmnJsonConverter.convertToJson(bpmnModel);
        DeploymentBuilder deployment = repositoryService.createDeployment();
        deployment.addBpmnModel(createProcessDefineParam.getProcessKey() + ".bpmn", bpmnModel);
        deployment.key(createProcessDefineParam.getProcessKey());
        deployment.name(bpmnModel.getMainProcess().getName());
        deployment.tenantId(createProcessDefineParam.getTenantId());
        Deployment deploy = deployment.deploy();
        log.info("?????????????????????????????????{}", ToStringBuilder.reflectionToString(deploy, ToStringStyle.JSON_STYLE));

        // ??????model???MateInfo??????
        ObjectNode modelObjectNode = objectMapper.createObjectNode();
        modelObjectNode.put(ProcessConstants.MODEL_NAME, createProcessDefineParam.getProcessName());
        modelObjectNode.put(ProcessConstants.MODEL_REVISION, 1);
        modelObjectNode.put(ProcessConstants.MODEL_DESCRIPTION, createProcessDefineParam.getDescription());
        Model model = new ModelEntityImpl();
        model.setMetaInfo(modelObjectNode.toString());
        model.setName(createProcessDefineParam.getProcessName());
        model.setKey(createProcessDefineParam.getProcessKey());
        model.setTenantId(createProcessDefineParam.getTenantId());
        model.setDeploymentId(deploy.getId());
        // ????????????????????????????????????xml?????????
        try {
            this.updateModelAndSource(model, bpmnModel, modelNode);
        } catch (IOException e) {
            throw new ProcessException("????????????????????????");
        }

        ProcessCreateDefineResult result = new ProcessCreateDefineResult();
        result.setDeployId(deploy.getId());
        result.setProcessKey(deploy.getKey());
        result.setCode(true);
        return result;
    }

    /**
     * ??????bpmn????????????????????????
     *
     * @param file ???????????????
     * @return ?????????????????????
     */
    @Override
    public Boolean importModel(MultipartFile file) {
        try {
            // ???bpmn????????????????????????BpmnModel???
            XMLInputFactory xif = XmlUtil.createSafeXmlInputFactory();
            InputStreamReader xmlIn = new InputStreamReader(file.getInputStream(), ProcessConstants.COMMON_CHARACTER_ENCODING_UTF_8);
            XMLStreamReader xtr = xif.createXMLStreamReader(xmlIn);
            BpmnModel bpmnModel = bpmnXmlConverter.convertToBpmnModel(xtr);

            Process mainProcess = bpmnModel.getMainProcess();
            if (null == mainProcess) {
                throw new ProcessException("No process found in definition " + file.getOriginalFilename());
            }

            // ???????????????????????????
            if (bpmnModel.getLocationMap().size() == 0) {
                BpmnAutoLayout bpmnLayout = new BpmnAutoLayout(bpmnModel);
                bpmnLayout.execute();
            }

            String key = mainProcess.getId();
            String name = mainProcess.getName();
            String description = mainProcess.getDocumentation();
            // ???bpmnmodel??????json
            ObjectNode modelNode = bpmnJsonConverter.convertToJson(bpmnModel);

            // ???bpmnModel???????????????????????????
            byte[] modelFileBytes = bpmnXmlConverter.convertToXML(bpmnModel);
            //?????????????????????????????????
            Deployment deployment = repositoryService
                .createDeployment()
                .addBytes(key + ProcessConstants.RESOURCE_NAME_SUFFIX, modelFileBytes)
                .key(key)
                .name(name)
                .deploy();

            // ??????model???MateInfo??????
            ObjectNode modelObjectNode = objectMapper.createObjectNode();
            modelObjectNode.put(ProcessConstants.MODEL_NAME, name);
            modelObjectNode.put(ProcessConstants.MODEL_REVISION, 1);
            modelObjectNode.put(ProcessConstants.MODEL_DESCRIPTION, description);
            Model model = new ModelEntityImpl();
            model.setMetaInfo(modelObjectNode.toString());
            model.setName(name);
            model.setKey(key);
            model.setDeploymentId(deployment.getId());
            // ????????????????????????????????????xml?????????
            updateModelAndSource(model, bpmnModel, modelNode);
            return true;
        } catch (Exception e) {
            //log.error("?????????????????????????????????????????????bpmn2.0????????????", e);
            throw new ProcessException("?????????????????????????????????????????????bpmn2.0????????????");
        }
    }

    /**
     * ??????????????????
     * @param processDefinitionId
     * @return
     */
    @Override
    public BpmnModel export(String processDefinitionId) {
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        return bpmnModel;
    }

    /**
     * ?????????????????????????????????????????????
     * @param processDefinition ?????????????????????
     * @return ?????????????????????
     */
    private ProcessDefineResult convertProcessDefResult(ProcessDefinition processDefinition) {
        ProcessDefineResult processDef = new ProcessDefineResult();
        processDef.setProcessDefId(processDefinition.getId());
        processDef.setProcessDefName(processDefinition.getName());
        processDef.setProcessDefKey(processDefinition.getKey());
        processDef.setDgrmResourceName(processDefinition.getDiagramResourceName());
        processDef.setResourceName(processDefinition.getResourceName());
        processDef.setDeploymentId(processDefinition.getDeploymentId());
        processDef.setSuspensionState(processDefinition.isSuspended());
        processDef.setCategory(processDefinition.getCategory());
        return processDef;
    }

    /**
     * ??????model?????????model?????????????????????(json???png)
     *
     * @param model ????????????
     * @param bpmnModel ?????????bpmnModel??????
     * @param jsonNode ?????????json??????
     * @throws IOException
     */

    public void updateModelAndSource(Model model, BpmnModel bpmnModel, JsonNode jsonNode) throws IOException {
        repositoryService.saveModel(model);
        byte[] result = null;
        // ???????????????????????????(???json???????????????act_ge_bytearray???)
        this.repositoryService.addModelEditorSource(
                model.getId(),
                jsonNode.toString().getBytes(ProcessConstants.COMMON_CHARACTER_ENCODING_UTF_8)
            );
        // ??????????????????????????????
        double scaleFactor = 1.0;
        GraphicInfo diagramInfo = ImageBpmnModelUtils.calculateDiagramSize(bpmnModel);
        if (diagramInfo.getWidth() > 300f) {
            scaleFactor = diagramInfo.getWidth() / 300f;
            ImageBpmnModelUtils.scaleDiagram(bpmnModel, scaleFactor);
        }
        // ???????????????????????????
        BufferedImage modelImage = ImageGenerator.createImage(bpmnModel, scaleFactor);
        if (modelImage != null) {
            result = ImageGenerator.createByteArrayForImage(modelImage, "png");
        }
        // ?????????????????????act_ge_bytearray???
        if (result != null && result.length > 0) {
            this.repositoryService.addModelEditorSourceExtra(model.getId(), result);
        }
    }
}
