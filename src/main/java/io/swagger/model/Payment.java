package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.AbuseReport;
import io.swagger.model.Capture;
import io.swagger.model.Currency;
import io.swagger.model.ErrorReport;
import io.swagger.model.PaymentAttributes;
import io.swagger.model.PaymentMethod;
import io.swagger.model.PaymentStatus;
import io.swagger.model.PaymentStep;
import io.swagger.model.Refund;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Payment {

    @JsonProperty("reference")
    private Long reference = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("paymentMethods")
    @Valid
    private List<PaymentMethod> paymentMethods = null;

    @JsonProperty("status")
    private PaymentStatus status = null;

    @JsonProperty("lastErrorReport")
    private ErrorReport lastErrorReport = null;

    @JsonProperty("abuseReport")
    private AbuseReport abuseReport = null;

    @JsonProperty("amountToCollect")
    private Double amountToCollect = null;

    @JsonProperty("surchargeAmount")
    private Double surchargeAmount = null;

    @JsonProperty("convertedTotalAmount")
    private Double convertedTotalAmount = null;

    @JsonProperty("convertedCurrency")
    private Currency convertedCurrency = null;

    @JsonProperty("conversionRate")
    private Double conversionRate = null;

    @JsonProperty("paidAmount")
    private Double paidAmount = null;

    @JsonProperty("steps")
    @Valid
    private List<PaymentStep> steps = null;

    @JsonProperty("flags")
    private Object flags = null;

    @JsonProperty("attributes")
    private PaymentAttributes attributes = null;

    @JsonProperty("refunds")
    @Valid
    private List<Refund> refunds = null;

    @JsonProperty("captures")
    @Valid
    private List<Capture> captures = null;

    public Payment reference(Long reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A unique reference of this payment.
     * @return reference
     **/
    @Schema(description = "A unique reference of this payment.")
    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Payment createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this payment has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this payment has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public Payment paymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
        return this;
    }

    public Payment addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
        if (this.paymentMethods == null) {
            this.paymentMethods = new ArrayList<PaymentMethod>();
        }
        this.paymentMethods.add(paymentMethodsItem);
        return this;
    }

    /**
     * List of the payment method(s) to use.  This list will consist of multiple payment methods in case of a hosted payment, which are then reduced to exactly one payment method,  during a payment. This is done by asking the payer to make a choice what payment method he wants to use.
     * @return paymentMethods
     **/
    @Schema(
        description = "List of the payment method(s) to use.  This list will consist of multiple payment methods in case of a hosted payment, which are then reduced to exactly one payment method,  during a payment. This is done by asking the payer to make a choice what payment method he wants to use."
    )
    @Valid
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Payment status(PaymentStatus status) {
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

    public Payment lastErrorReport(ErrorReport lastErrorReport) {
        this.lastErrorReport = lastErrorReport;
        return this;
    }

    /**
     * Get lastErrorReport
     * @return lastErrorReport
     **/
    @Schema(description = "")
    @Valid
    public ErrorReport getLastErrorReport() {
        return lastErrorReport;
    }

    public void setLastErrorReport(ErrorReport lastErrorReport) {
        this.lastErrorReport = lastErrorReport;
    }

    public Payment abuseReport(AbuseReport abuseReport) {
        this.abuseReport = abuseReport;
        return this;
    }

    /**
     * Get abuseReport
     * @return abuseReport
     **/
    @Schema(description = "")
    @Valid
    public AbuseReport getAbuseReport() {
        return abuseReport;
    }

    public void setAbuseReport(AbuseReport abuseReport) {
        this.abuseReport = abuseReport;
    }

    public Payment amountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
        return this;
    }

    /**
     * The amount to collect in this payment in the currency specified in the payment job.  If left empty the entire amountToCollect of the payment job is used upon start of the payment.
     * @return amountToCollect
     **/
    @Schema(
        description = "The amount to collect in this payment in the currency specified in the payment job.  If left empty the entire amountToCollect of the payment job is used upon start of the payment."
    )
    public Double getAmountToCollect() {
        return amountToCollect;
    }

    public void setAmountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    public Payment surchargeAmount(Double surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
        return this;
    }

    /**
     * The amount which will be added to the originally supplied amount to collect.
     * @return surchargeAmount
     **/
    @Schema(description = "The amount which will be added to the originally supplied amount to collect.")
    public Double getSurchargeAmount() {
        return surchargeAmount;
    }

    public void setSurchargeAmount(Double surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    public Payment convertedTotalAmount(Double convertedTotalAmount) {
        this.convertedTotalAmount = convertedTotalAmount;
        return this;
    }

    /**
     * The total amount to be paid in this payment in the currency compatible with the selected payment method.  Equal to the amount to collect + surcharge amount, multiplied by the conversion rate.  If null, the total amount has not been converted and the amount to collect + surcharge amount is used instead.
     * @return convertedTotalAmount
     **/
    @Schema(
        description = "The total amount to be paid in this payment in the currency compatible with the selected payment method.  Equal to the amount to collect + surcharge amount, multiplied by the conversion rate.  If null, the total amount has not been converted and the amount to collect + surcharge amount is used instead."
    )
    public Double getConvertedTotalAmount() {
        return convertedTotalAmount;
    }

    public void setConvertedTotalAmount(Double convertedTotalAmount) {
        this.convertedTotalAmount = convertedTotalAmount;
    }

    public Payment convertedCurrency(Currency convertedCurrency) {
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

    public Payment conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /**
     * The conversion rate used for converting the total amount to the currency compatible with the selected payment  method. If null, the amount to collect has not been converted.
     * @return conversionRate
     **/
    @Schema(
        description = "The conversion rate used for converting the total amount to the currency compatible with the selected payment  method. If null, the amount to collect has not been converted."
    )
    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Payment paidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    /**
     * The amount that the payer has has paid to the receiver.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture.
     * @return paidAmount
     **/
    @Schema(
        description = "The amount that the payer has has paid to the receiver.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture."
    )
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Payment steps(List<PaymentStep> steps) {
        this.steps = steps;
        return this;
    }

    public Payment addStepsItem(PaymentStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<PaymentStep>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * A list of steps executed on this payment.
     * @return steps
     **/
    @Schema(description = "A list of steps executed on this payment.")
    @Valid
    public List<PaymentStep> getSteps() {
        return steps;
    }

    public void setSteps(List<PaymentStep> steps) {
        this.steps = steps;
    }

    public Payment flags(Object flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Flags that apply to this payment.  They can either not be set or set with a true or false value. Key options: Started
     * @return flags
     **/
    @Schema(
        description = "Flags that apply to this payment.  They can either not be set or set with a true or false value. Key options: Started"
    )
    public Object getFlags() {
        return flags;
    }

    public void setFlags(Object flags) {
        this.flags = flags;
    }

    public Payment attributes(PaymentAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     **/
    @Schema(description = "")
    @Valid
    public PaymentAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(PaymentAttributes attributes) {
        this.attributes = attributes;
    }

    public Payment refunds(List<Refund> refunds) {
        this.refunds = refunds;
        return this;
    }

    public Payment addRefundsItem(Refund refundsItem) {
        if (this.refunds == null) {
            this.refunds = new ArrayList<Refund>();
        }
        this.refunds.add(refundsItem);
        return this;
    }

    /**
     * List of refunds that are or will be executed on this payment.
     * @return refunds
     **/
    @Schema(description = "List of refunds that are or will be executed on this payment.")
    @Valid
    public List<Refund> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    public Payment captures(List<Capture> captures) {
        this.captures = captures;
        return this;
    }

    public Payment addCapturesItem(Capture capturesItem) {
        if (this.captures == null) {
            this.captures = new ArrayList<Capture>();
        }
        this.captures.add(capturesItem);
        return this;
    }

    /**
     * List of captures that are or will be executed on this payment.
     * @return captures
     **/
    @Schema(description = "List of captures that are or will be executed on this payment.")
    @Valid
    public List<Capture> getCaptures() {
        return captures;
    }

    public void setCaptures(List<Capture> captures) {
        this.captures = captures;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Payment payment = (Payment) o;
        return (
            Objects.equals(this.reference, payment.reference) &&
            Objects.equals(this.createDateTimeUtc, payment.createDateTimeUtc) &&
            Objects.equals(this.paymentMethods, payment.paymentMethods) &&
            Objects.equals(this.status, payment.status) &&
            Objects.equals(this.lastErrorReport, payment.lastErrorReport) &&
            Objects.equals(this.abuseReport, payment.abuseReport) &&
            Objects.equals(this.amountToCollect, payment.amountToCollect) &&
            Objects.equals(this.surchargeAmount, payment.surchargeAmount) &&
            Objects.equals(this.convertedTotalAmount, payment.convertedTotalAmount) &&
            Objects.equals(this.convertedCurrency, payment.convertedCurrency) &&
            Objects.equals(this.conversionRate, payment.conversionRate) &&
            Objects.equals(this.paidAmount, payment.paidAmount) &&
            Objects.equals(this.steps, payment.steps) &&
            Objects.equals(this.flags, payment.flags) &&
            Objects.equals(this.attributes, payment.attributes) &&
            Objects.equals(this.refunds, payment.refunds) &&
            Objects.equals(this.captures, payment.captures)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            reference,
            createDateTimeUtc,
            paymentMethods,
            status,
            lastErrorReport,
            abuseReport,
            amountToCollect,
            surchargeAmount,
            convertedTotalAmount,
            convertedCurrency,
            conversionRate,
            paidAmount,
            steps,
            flags,
            attributes,
            refunds,
            captures
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Payment {\n");

        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastErrorReport: ").append(toIndentedString(lastErrorReport)).append("\n");
        sb.append("    abuseReport: ").append(toIndentedString(abuseReport)).append("\n");
        sb.append("    amountToCollect: ").append(toIndentedString(amountToCollect)).append("\n");
        sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
        sb.append("    convertedTotalAmount: ").append(toIndentedString(convertedTotalAmount)).append("\n");
        sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
        sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
        sb.append("    captures: ").append(toIndentedString(captures)).append("\n");
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
