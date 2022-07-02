package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * AbuseTrigger
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class AbuseTrigger {

    @JsonProperty("score")
    private Double score = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("parameters")
    @Valid
    private List<String> parameters = null;

    public AbuseTrigger score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     **/
    @Schema(description = "")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public AbuseTrigger code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
    @Schema(description = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AbuseTrigger description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AbuseTrigger parameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public AbuseTrigger addParametersItem(String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<String>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     **/
    @Schema(description = "")
    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbuseTrigger abuseTrigger = (AbuseTrigger) o;
        return (
            Objects.equals(this.score, abuseTrigger.score) &&
            Objects.equals(this.code, abuseTrigger.code) &&
            Objects.equals(this.description, abuseTrigger.description) &&
            Objects.equals(this.parameters, abuseTrigger.parameters)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, code, description, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbuseTrigger {\n");

        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
