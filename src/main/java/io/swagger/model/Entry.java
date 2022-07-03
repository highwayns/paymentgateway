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
 * Entry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Entry {

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("parameters")
    @Valid
    private List<String> parameters = null;

    @JsonProperty("translatedMessage")
    private String translatedMessage = null;

    public Entry code(String code) {
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

    public Entry message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @Schema(description = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Entry parameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Entry addParametersItem(String parametersItem) {
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

    public Entry translatedMessage(String translatedMessage) {
        this.translatedMessage = translatedMessage;
        return this;
    }

    /**
     * Get translatedMessage
     * @return translatedMessage
     **/
    @Schema(description = "")
    public String getTranslatedMessage() {
        return translatedMessage;
    }

    public void setTranslatedMessage(String translatedMessage) {
        this.translatedMessage = translatedMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entry entry = (Entry) o;
        return (
            Objects.equals(this.code, entry.code) &&
            Objects.equals(this.message, entry.message) &&
            Objects.equals(this.parameters, entry.parameters) &&
            Objects.equals(this.translatedMessage, entry.translatedMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, parameters, translatedMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entry {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    translatedMessage: ").append(toIndentedString(translatedMessage)).append("\n");
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
