package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.AbuseTrigger;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * AbuseReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class AbuseReport {

    @JsonProperty("score")
    private Double score = null;

    @JsonProperty("triggers")
    @Valid
    private List<AbuseTrigger> triggers = null;

    @JsonProperty("createdDateTimeUtc")
    private OffsetDateTime createdDateTimeUtc = null;

    public AbuseReport score(Double score) {
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

    public AbuseReport triggers(List<AbuseTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public AbuseReport addTriggersItem(AbuseTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<AbuseTrigger>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    /**
     * Get triggers
     * @return triggers
     **/
    @Schema(description = "")
    @Valid
    public List<AbuseTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<AbuseTrigger> triggers) {
        this.triggers = triggers;
    }

    public AbuseReport createdDateTimeUtc(OffsetDateTime createdDateTimeUtc) {
        this.createdDateTimeUtc = createdDateTimeUtc;
        return this;
    }

    /**
     * Get createdDateTimeUtc
     * @return createdDateTimeUtc
     **/
    @Schema(description = "")
    @Valid
    public OffsetDateTime getCreatedDateTimeUtc() {
        return createdDateTimeUtc;
    }

    public void setCreatedDateTimeUtc(OffsetDateTime createdDateTimeUtc) {
        this.createdDateTimeUtc = createdDateTimeUtc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbuseReport abuseReport = (AbuseReport) o;
        return (
            Objects.equals(this.score, abuseReport.score) &&
            Objects.equals(this.triggers, abuseReport.triggers) &&
            Objects.equals(this.createdDateTimeUtc, abuseReport.createdDateTimeUtc)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, triggers, createdDateTimeUtc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbuseReport {\n");

        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    createdDateTimeUtc: ").append(toIndentedString(createdDateTimeUtc)).append("\n");
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
