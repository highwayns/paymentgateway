package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.PaymentMethod;
import io.swagger.model.PaymentStatus;
import io.swagger.model.PaymentStepAction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * PaymentStep
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class PaymentStep {

    @JsonProperty("reference")
    private Long reference = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("action")
    private PaymentStepAction action = null;

    @JsonProperty("paymentMethods")
    @Valid
    private List<PaymentMethod> paymentMethods = null;

    @JsonProperty("status")
    private PaymentStatus status = null;

    @JsonProperty("amountToCollect")
    private Double amountToCollect = null;

    public PaymentStep reference(Long reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A unique reference of this payment step.
     * @return reference
     **/
    @Schema(description = "A unique reference of this payment step.")
    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public PaymentStep createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this payment step has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this payment step has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public PaymentStep action(PaymentStepAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     **/
    @Schema(description = "")
    @Valid
    public PaymentStepAction getAction() {
        return action;
    }

    public void setAction(PaymentStepAction action) {
        this.action = action;
    }

    public PaymentStep paymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
        return this;
    }

    public PaymentStep addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
        if (this.paymentMethods == null) {
            this.paymentMethods = new ArrayList<PaymentMethod>();
        }
        this.paymentMethods.add(paymentMethodsItem);
        return this;
    }

    /**
     * List of the payment method(s) to use.  This list will consist of multiple payment methods in case of a hosted payment, which are then reduced to exactly one payment method,  during a payment. This is done by asking the payer to make a choice in what payment method he wants to use.
     * @return paymentMethods
     **/
    @Schema(
        description = "List of the payment method(s) to use.  This list will consist of multiple payment methods in case of a hosted payment, which are then reduced to exactly one payment method,  during a payment. This is done by asking the payer to make a choice in what payment method he wants to use."
    )
    @Valid
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public PaymentStep status(PaymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @Schema(description = "")
    @Valid
    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStep amountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
        return this;
    }

    /**
     * The amount to collect in this payment in the currency specified in the payment job.
     * @return amountToCollect
     **/
    @Schema(description = "The amount to collect in this payment in the currency specified in the payment job.")
    public Double getAmountToCollect() {
        return amountToCollect;
    }

    public void setAmountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentStep paymentStep = (PaymentStep) o;
        return (
            Objects.equals(this.reference, paymentStep.reference) &&
            Objects.equals(this.createDateTimeUtc, paymentStep.createDateTimeUtc) &&
            Objects.equals(this.action, paymentStep.action) &&
            Objects.equals(this.paymentMethods, paymentStep.paymentMethods) &&
            Objects.equals(this.status, paymentStep.status) &&
            Objects.equals(this.amountToCollect, paymentStep.amountToCollect)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, createDateTimeUtc, action, paymentMethods, status, amountToCollect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentStep {\n");

        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    amountToCollect: ").append(toIndentedString(amountToCollect)).append("\n");
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
