package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.ErrorReport;
import io.swagger.model.Links;
import io.swagger.model.TokenisedCard;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * The response to a create card tokenisation request.
 */
@Schema(description = "The response to a create card tokenisation request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class CardTokenisationResponse {

    @JsonProperty("data")
    private TokenisedCard data = null;

    @JsonProperty("errorReport")
    private ErrorReport errorReport = null;

    @JsonProperty("links")
    private Links links = null;

    public CardTokenisationResponse data(TokenisedCard data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Schema(description = "")
    @Valid
    public TokenisedCard getData() {
        return data;
    }

    public void setData(TokenisedCard data) {
        this.data = data;
    }

    public CardTokenisationResponse errorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }

    /**
     * Get errorReport
     * @return errorReport
     **/
    @Schema(description = "")
    @Valid
    public ErrorReport getErrorReport() {
        return errorReport;
    }

    public void setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
    }

    public CardTokenisationResponse links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     **/
    @Schema(description = "")
    @Valid
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardTokenisationResponse cardTokenisationResponse = (CardTokenisationResponse) o;
        return (
            Objects.equals(this.data, cardTokenisationResponse.data) &&
            Objects.equals(this.errorReport, cardTokenisationResponse.errorReport) &&
            Objects.equals(this.links, cardTokenisationResponse.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errorReport, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardTokenisationResponse {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errorReport: ").append(toIndentedString(errorReport)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
