package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Entry;
import io.swagger.model.Locale;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * ErrorReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class ErrorReport {

    @JsonProperty("errors")
    @Valid
    private List<Entry> errors = null;

    @JsonProperty("warnings")
    @Valid
    private List<Entry> warnings = null;

    @JsonProperty("language")
    private Locale language = null;

    @JsonProperty("isFatalError")
    private Boolean isFatalError = null;

    public ErrorReport errors(List<Entry> errors) {
        this.errors = errors;
        return this;
    }

    public ErrorReport addErrorsItem(Entry errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<Entry>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     * @return errors
     **/
    @Schema(description = "")
    @Valid
    public List<Entry> getErrors() {
        return errors;
    }

    public void setErrors(List<Entry> errors) {
        this.errors = errors;
    }

    public ErrorReport warnings(List<Entry> warnings) {
        this.warnings = warnings;
        return this;
    }

    public ErrorReport addWarningsItem(Entry warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<Entry>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * Get warnings
     * @return warnings
     **/
    @Schema(description = "")
    @Valid
    public List<Entry> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Entry> warnings) {
        this.warnings = warnings;
    }

    public ErrorReport language(Locale language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     **/
    @Schema(description = "")
    @Valid
    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public ErrorReport isFatalError(Boolean isFatalError) {
        this.isFatalError = isFatalError;
        return this;
    }

    /**
     * Get isFatalError
     * @return isFatalError
     **/
    @Schema(description = "")
    public Boolean isIsFatalError() {
        return isFatalError;
    }

    public void setIsFatalError(Boolean isFatalError) {
        this.isFatalError = isFatalError;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorReport errorReport = (ErrorReport) o;
        return (
            Objects.equals(this.errors, errorReport.errors) &&
            Objects.equals(this.warnings, errorReport.warnings) &&
            Objects.equals(this.language, errorReport.language) &&
            Objects.equals(this.isFatalError, errorReport.isFatalError)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, warnings, language, isFatalError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorReport {\n");

        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    isFatalError: ").append(toIndentedString(isFatalError)).append("\n");
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
