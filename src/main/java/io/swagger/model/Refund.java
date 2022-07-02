package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Currency;
import io.swagger.model.RefundStatus;
import io.swagger.model.RefundStep;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * Refund
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Refund {

    @JsonProperty("reference")
    private Long reference = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("refundNumber")
    private String refundNumber = null;

    @JsonProperty("status")
    private RefundStatus status = null;

    @JsonProperty("amountToRefund")
    private Double amountToRefund = null;

    @JsonProperty("convertedAmountToRefund")
    private Double convertedAmountToRefund = null;

    @JsonProperty("convertedCurrency")
    private Currency convertedCurrency = null;

    @JsonProperty("conversionRate")
    private Double conversionRate = null;

    @JsonProperty("steps")
    @Valid
    private List<RefundStep> steps = null;

    @JsonProperty("attributes")
    private Object attributes = null;

    public Refund reference(Long reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A unique reference of this refund.
     * @return reference
     **/
    @Schema(description = "A unique reference of this refund.")
    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Refund createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this refund has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this refund has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public Refund refundNumber(String refundNumber) {
        this.refundNumber = refundNumber;
        return this;
    }

    /**
     * A merchant supplied reference to this refund.
     * @return refundNumber
     **/
    @Schema(description = "A merchant supplied reference to this refund.")
    public String getRefundNumber() {
        return refundNumber;
    }

    public void setRefundNumber(String refundNumber) {
        this.refundNumber = refundNumber;
    }

    public Refund status(RefundStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @Schema(description = "")
    @Valid
    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    public Refund amountToRefund(Double amountToRefund) {
        this.amountToRefund = amountToRefund;
        return this;
    }

    /**
     * The amount to refund in the currency specified in the payment job.
     * @return amountToRefund
     **/
    @Schema(description = "The amount to refund in the currency specified in the payment job.")
    public Double getAmountToRefund() {
        return amountToRefund;
    }

    public void setAmountToRefund(Double amountToRefund) {
        this.amountToRefund = amountToRefund;
    }

    public Refund convertedAmountToRefund(Double convertedAmountToRefund) {
        this.convertedAmountToRefund = convertedAmountToRefund;
        return this;
    }

    /**
     * The amount to refund in the currency compatible with the selected method.  Equal to the amount to refund multiplied by the conversion rate.  If null, the amount to refund has not been converted and the amount to refund is used instead.
     * @return convertedAmountToRefund
     **/
    @Schema(
        description = "The amount to refund in the currency compatible with the selected method.  Equal to the amount to refund multiplied by the conversion rate.  If null, the amount to refund has not been converted and the amount to refund is used instead."
    )
    public Double getConvertedAmountToRefund() {
        return convertedAmountToRefund;
    }

    public void setConvertedAmountToRefund(Double convertedAmountToRefund) {
        this.convertedAmountToRefund = convertedAmountToRefund;
    }

    public Refund convertedCurrency(Currency convertedCurrency) {
        this.convertedCurrency = convertedCurrency;
        return this;
    }

    /**
     * Get convertedCurrency
     * @return convertedCurrency
     **/
    @Schema(description = "")
    @Valid
    public Currency getConvertedCurrency() {
        return convertedCurrency;
    }

    public void setConvertedCurrency(Currency convertedCurrency) {
        this.convertedCurrency = convertedCurrency;
    }

    public Refund conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /**
     * The conversion rate used for converting the amount to refund to the currency compatible with the selected method.  This rate multiplied by the amount to refund results in the converted amount to refund.  If null, the amount to refund has not been converted.
     * @return conversionRate
     **/
    @Schema(
        description = "The conversion rate used for converting the amount to refund to the currency compatible with the selected method.  This rate multiplied by the amount to refund results in the converted amount to refund.  If null, the amount to refund has not been converted."
    )
    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Refund steps(List<RefundStep> steps) {
        this.steps = steps;
        return this;
    }

    public Refund addStepsItem(RefundStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<RefundStep>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * A list of steps executed on this refund.
     * @return steps
     **/
    @Schema(description = "A list of steps executed on this refund.")
    @Valid
    public List<RefundStep> getSteps() {
        return steps;
    }

    public void setSteps(List<RefundStep> steps) {
        this.steps = steps;
    }

    public Refund attributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Attributes associated with this refund. Key options: PaymentMethodTransactionId, CashFlowsAcquiringDetails
     * @return attributes
     **/
    @Schema(description = "Attributes associated with this refund. Key options: PaymentMethodTransactionId, CashFlowsAcquiringDetails")
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refund refund = (Refund) o;
        return (
            Objects.equals(this.reference, refund.reference) &&
            Objects.equals(this.createDateTimeUtc, refund.createDateTimeUtc) &&
            Objects.equals(this.refundNumber, refund.refundNumber) &&
            Objects.equals(this.status, refund.status) &&
            Objects.equals(this.amountToRefund, refund.amountToRefund) &&
            Objects.equals(this.convertedAmountToRefund, refund.convertedAmountToRefund) &&
            Objects.equals(this.convertedCurrency, refund.convertedCurrency) &&
            Objects.equals(this.conversionRate, refund.conversionRate) &&
            Objects.equals(this.steps, refund.steps) &&
            Objects.equals(this.attributes, refund.attributes)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            reference,
            createDateTimeUtc,
            refundNumber,
            status,
            amountToRefund,
            convertedAmountToRefund,
            convertedCurrency,
            conversionRate,
            steps,
            attributes
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Refund {\n");

        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    refundNumber: ").append(toIndentedString(refundNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    amountToRefund: ").append(toIndentedString(amountToRefund)).append("\n");
        sb.append("    convertedAmountToRefund: ").append(toIndentedString(convertedAmountToRefund)).append("\n");
        sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
