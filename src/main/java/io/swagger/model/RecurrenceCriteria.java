package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.RecurrenceType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * RecurrenceCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class RecurrenceCriteria {

    @JsonProperty("recurrenceType")
    private RecurrenceType recurrenceType = null;

    @JsonProperty("recurringExpiry")
    private OffsetDateTime recurringExpiry = null;

    @JsonProperty("recurringFrequency")
    private Integer recurringFrequency = null;

    @JsonProperty("instalments")
    private Integer instalments = null;

    public RecurrenceCriteria recurrenceType(RecurrenceType recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }

    /**
     * Get recurrenceType
     * @return recurrenceType
     **/
    @Schema(description = "")
    @Valid
    public RecurrenceType getRecurrenceType() {
        return recurrenceType;
    }

    public void setRecurrenceType(RecurrenceType recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public RecurrenceCriteria recurringExpiry(OffsetDateTime recurringExpiry) {
        this.recurringExpiry = recurringExpiry;
        return this;
    }

    /**
     * The date and time after which this recurrence is no longer valid.
     * @return recurringExpiry
     **/
    @Schema(description = "The date and time after which this recurrence is no longer valid.")
    @Valid
    public OffsetDateTime getRecurringExpiry() {
        return recurringExpiry;
    }

    public void setRecurringExpiry(OffsetDateTime recurringExpiry) {
        this.recurringExpiry = recurringExpiry;
    }

    public RecurrenceCriteria recurringFrequency(Integer recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
        return this;
    }

    /**
     * The minimum set of days between transactions.
     * @return recurringFrequency
     **/
    @Schema(description = "The minimum set of days between transactions.")
    public Integer getRecurringFrequency() {
        return recurringFrequency;
    }

    public void setRecurringFrequency(Integer recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }

    public RecurrenceCriteria instalments(Integer instalments) {
        this.instalments = instalments;
        return this;
    }

    /**
     * The amount of instalments.
     * @return instalments
     **/
    @Schema(description = "The amount of instalments.")
    public Integer getInstalments() {
        return instalments;
    }

    public void setInstalments(Integer instalments) {
        this.instalments = instalments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecurrenceCriteria recurrenceCriteria = (RecurrenceCriteria) o;
        return (
            Objects.equals(this.recurrenceType, recurrenceCriteria.recurrenceType) &&
            Objects.equals(this.recurringExpiry, recurrenceCriteria.recurringExpiry) &&
            Objects.equals(this.recurringFrequency, recurrenceCriteria.recurringFrequency) &&
            Objects.equals(this.instalments, recurrenceCriteria.instalments)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recurrenceType, recurringExpiry, recurringFrequency, instalments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecurrenceCriteria {\n");

        sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
        sb.append("    recurringExpiry: ").append(toIndentedString(recurringExpiry)).append("\n");
        sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
        sb.append("    instalments: ").append(toIndentedString(instalments)).append("\n");
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
