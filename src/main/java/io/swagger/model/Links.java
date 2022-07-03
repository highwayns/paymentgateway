package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Link;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Links
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Links {

    @JsonProperty("data")
    private Link data = null;

    @JsonProperty("action")
    private Link action = null;

    @JsonProperty("documentation")
    private Link documentation = null;

    public Links data(Link data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Schema(description = "")
    @Valid
    public Link getData() {
        return data;
    }

    public void setData(Link data) {
        this.data = data;
    }

    public Links action(Link action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     **/
    @Schema(description = "")
    @Valid
    public Link getAction() {
        return action;
    }

    public void setAction(Link action) {
        this.action = action;
    }

    public Links documentation(Link documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * Get documentation
     * @return documentation
     **/
    @Schema(description = "")
    @Valid
    public Link getDocumentation() {
        return documentation;
    }

    public void setDocumentation(Link documentation) {
        this.documentation = documentation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links links = (Links) o;
        return (
            Objects.equals(this.data, links.data) &&
            Objects.equals(this.action, links.action) &&
            Objects.equals(this.documentation, links.documentation)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, action, documentation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
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
