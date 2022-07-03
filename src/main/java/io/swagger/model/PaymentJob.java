package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Currency;
import io.swagger.model.Locale;
import io.swagger.model.Order;
import io.swagger.model.Payment;
import io.swagger.model.PaymentJobAttributes;
import io.swagger.model.PaymentJobType;
import io.swagger.model.PaymentMethod;
import io.swagger.model.PaymentStatus;
import io.swagger.model.RecurrenceCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * PaymentJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class PaymentJob {

    @JsonProperty("reference")
    private Long reference = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("type")
    private PaymentJobType type = null;

    @JsonProperty("traceReference")
    private Long traceReference = null;

    @JsonProperty("configurationId")
    private String configurationId = null;

    @JsonProperty("domain")
    private String domain = null;

    @JsonProperty("locale")
    private Locale locale = null;

    @JsonProperty("timeZone")
    private String timeZone = null;

    @JsonProperty("order")
    private Order order = null;

    @JsonProperty("orderHistory")
    @Valid
    private List<Order> orderHistory = null;

    @JsonProperty("parentPaymentJobReference")
    private Long parentPaymentJobReference = null;

    @JsonProperty("paymentMethodsToUse")
    @Valid
    private List<PaymentMethod> paymentMethodsToUse = null;

    @JsonProperty("displayUrl")
    private String displayUrl = null;

    @JsonProperty("currency")
    private Currency currency = null;

    @JsonProperty("amountToCollect")
    private Double amountToCollect = null;

    @JsonProperty("amountCollected")
    private Double amountCollected = null;

    @JsonProperty("paidAmount")
    private Double paidAmount = null;

    @JsonProperty("paidDateTimeUtc")
    private OffsetDateTime paidDateTimeUtc = null;

    @JsonProperty("expirationDateTimeUtc")
    private OffsetDateTime expirationDateTimeUtc = null;

    @JsonProperty("dueDateTimeUtc")
    private OffsetDateTime dueDateTimeUtc = null;

    @JsonProperty("lastUpdateTimeUtc")
    private OffsetDateTime lastUpdateTimeUtc = null;

    @JsonProperty("lastProcessedTimeUtc")
    private OffsetDateTime lastProcessedTimeUtc = null;

    @JsonProperty("flags")
    private Object flags = null;

    @JsonProperty("attributes")
    private PaymentJobAttributes attributes = null;

    @JsonProperty("paymentStatus")
    private PaymentStatus paymentStatus = null;

    @JsonProperty("payments")
    @Valid
    private List<Payment> payments = null;

    @JsonProperty("recurrenceCriteria")
    private RecurrenceCriteria recurrenceCriteria = null;

    public PaymentJob reference(Long reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A unique reference of this payment job.
     * @return reference
     **/
    @Schema(description = "A unique reference of this payment job.")
    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public PaymentJob createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this payment job has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this payment job has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public PaymentJob type(PaymentJobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Schema(description = "")
    @Valid
    public PaymentJobType getType() {
        return type;
    }

    public void setType(PaymentJobType type) {
        this.type = type;
    }

    public PaymentJob traceReference(Long traceReference) {
        this.traceReference = traceReference;
        return this;
    }

    /**
     * A reference to a trace object which will trace all actions executed on this payment.
     * @return traceReference
     **/
    @Schema(description = "A reference to a trace object which will trace all actions executed on this payment.")
    public Long getTraceReference() {
        return traceReference;
    }

    public void setTraceReference(Long traceReference) {
        this.traceReference = traceReference;
    }

    public PaymentJob configurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * The id of the site or service the payment job is associated with.
     * @return configurationId
     **/
    @Schema(description = "The id of the site or service the payment job is associated with.")
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public PaymentJob domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The domain where the request arrived on.
     * @return domain
     **/
    @Schema(description = "The domain where the request arrived on.")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public PaymentJob locale(Locale locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     * @return locale
     **/
    @Schema(description = "")
    @Valid
    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public PaymentJob timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The time zone of the target audience of this payment job.
     * @return timeZone
     **/
    @Schema(description = "The time zone of the target audience of this payment job.")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public PaymentJob order(Order order) {
        this.order = order;
        return this;
    }

    /**
     * Get order
     * @return order
     **/
    @Schema(description = "")
    @Valid
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentJob orderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
        return this;
    }

    public PaymentJob addOrderHistoryItem(Order orderHistoryItem) {
        if (this.orderHistory == null) {
            this.orderHistory = new ArrayList<Order>();
        }
        this.orderHistory.add(orderHistoryItem);
        return this;
    }

    /**
     * The history of updated orders.
     * @return orderHistory
     **/
    @Schema(description = "The history of updated orders.")
    @Valid
    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public PaymentJob parentPaymentJobReference(Long parentPaymentJobReference) {
        this.parentPaymentJobReference = parentPaymentJobReference;
        return this;
    }

    /**
     * A reference to the parent payment job.
     * @return parentPaymentJobReference
     **/
    @Schema(description = "A reference to the parent payment job.")
    public Long getParentPaymentJobReference() {
        return parentPaymentJobReference;
    }

    public void setParentPaymentJobReference(Long parentPaymentJobReference) {
        this.parentPaymentJobReference = parentPaymentJobReference;
    }

    public PaymentJob paymentMethodsToUse(List<PaymentMethod> paymentMethodsToUse) {
        this.paymentMethodsToUse = paymentMethodsToUse;
        return this;
    }

    public PaymentJob addPaymentMethodsToUseItem(PaymentMethod paymentMethodsToUseItem) {
        if (this.paymentMethodsToUse == null) {
            this.paymentMethodsToUse = new ArrayList<PaymentMethod>();
        }
        this.paymentMethodsToUse.add(paymentMethodsToUseItem);
        return this;
    }

    /**
     * A list of payment methods (for example iDeal, PayPal, AfterPay) to enable for this request.  If none are supplied, all configured and applicable payment methods will be used.
     * @return paymentMethodsToUse
     **/
    @Schema(
        description = "A list of payment methods (for example iDeal, PayPal, AfterPay) to enable for this request.  If none are supplied, all configured and applicable payment methods will be used."
    )
    @Valid
    public List<PaymentMethod> getPaymentMethodsToUse() {
        return paymentMethodsToUse;
    }

    public void setPaymentMethodsToUse(List<PaymentMethod> paymentMethodsToUse) {
        this.paymentMethodsToUse = paymentMethodsToUse;
    }

    public PaymentJob displayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    /**
     * A URL that is shown in the portal to the receiver.  This can be used to store a link to an order in the receiver's order system for easy navigation.
     * @return displayUrl
     **/
    @Schema(
        description = "A URL that is shown in the portal to the receiver.  This can be used to store a link to an order in the receiver's order system for easy navigation."
    )
    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public PaymentJob currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     **/
    @Schema(description = "")
    @Valid
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PaymentJob amountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
        return this;
    }

    /**
     * The amount to collect in this payment job.
     * @return amountToCollect
     **/
    @Schema(description = "The amount to collect in this payment job.")
    public Double getAmountToCollect() {
        return amountToCollect;
    }

    public void setAmountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    public PaymentJob amountCollected(Double amountCollected) {
        this.amountCollected = amountCollected;
        return this;
    }

    /**
     * The amount collected in this payment job so far.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture.
     * @return amountCollected
     **/
    @Schema(
        description = "The amount collected in this payment job so far.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture."
    )
    public Double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(Double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public PaymentJob paidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    /**
     * The amount that the payer has has paid, which includes surcharge amounts.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture.
     * @return paidAmount
     **/
    @Schema(
        description = "The amount that the payer has has paid, which includes surcharge amounts.  Only set after a payment is final (reversals such as chargebacks aside), for instance after a card capture."
    )
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public PaymentJob paidDateTimeUtc(OffsetDateTime paidDateTimeUtc) {
        this.paidDateTimeUtc = paidDateTimeUtc;
        return this;
    }

    /**
     * The date and time the total to amount to collect has been paid.  Null if the payment job is not fully paid.
     * @return paidDateTimeUtc
     **/
    @Schema(description = "The date and time the total to amount to collect has been paid.  Null if the payment job is not fully paid.")
    @Valid
    public OffsetDateTime getPaidDateTimeUtc() {
        return paidDateTimeUtc;
    }

    public void setPaidDateTimeUtc(OffsetDateTime paidDateTimeUtc) {
        this.paidDateTimeUtc = paidDateTimeUtc;
    }

    public PaymentJob expirationDateTimeUtc(OffsetDateTime expirationDateTimeUtc) {
        this.expirationDateTimeUtc = expirationDateTimeUtc;
        return this;
    }

    /**
     * The date and time the payment job expires and is no longer valid.
     * @return expirationDateTimeUtc
     **/
    @Schema(description = "The date and time the payment job expires and is no longer valid.")
    @Valid
    public OffsetDateTime getExpirationDateTimeUtc() {
        return expirationDateTimeUtc;
    }

    public void setExpirationDateTimeUtc(OffsetDateTime expirationDateTimeUtc) {
        this.expirationDateTimeUtc = expirationDateTimeUtc;
    }

    public PaymentJob dueDateTimeUtc(OffsetDateTime dueDateTimeUtc) {
        this.dueDateTimeUtc = dueDateTimeUtc;
        return this;
    }

    /**
     * The date and time the payment job is due for processing.  Null if the payment job is not due for processing.
     * @return dueDateTimeUtc
     **/
    @Schema(description = "The date and time the payment job is due for processing.  Null if the payment job is not due for processing.")
    @Valid
    public OffsetDateTime getDueDateTimeUtc() {
        return dueDateTimeUtc;
    }

    public void setDueDateTimeUtc(OffsetDateTime dueDateTimeUtc) {
        this.dueDateTimeUtc = dueDateTimeUtc;
    }

    public PaymentJob lastUpdateTimeUtc(OffsetDateTime lastUpdateTimeUtc) {
        this.lastUpdateTimeUtc = lastUpdateTimeUtc;
        return this;
    }

    /**
     * The date and time of the last update to the payment job.
     * @return lastUpdateTimeUtc
     **/
    @Schema(description = "The date and time of the last update to the payment job.")
    @Valid
    public OffsetDateTime getLastUpdateTimeUtc() {
        return lastUpdateTimeUtc;
    }

    public void setLastUpdateTimeUtc(OffsetDateTime lastUpdateTimeUtc) {
        this.lastUpdateTimeUtc = lastUpdateTimeUtc;
    }

    public PaymentJob lastProcessedTimeUtc(OffsetDateTime lastProcessedTimeUtc) {
        this.lastProcessedTimeUtc = lastProcessedTimeUtc;
        return this;
    }

    /**
     * The date and time this payment job was processed for the last time.
     * @return lastProcessedTimeUtc
     **/
    @Schema(description = "The date and time this payment job was processed for the last time.")
    @Valid
    public OffsetDateTime getLastProcessedTimeUtc() {
        return lastProcessedTimeUtc;
    }

    public void setLastProcessedTimeUtc(OffsetDateTime lastProcessedTimeUtc) {
        this.lastProcessedTimeUtc = lastProcessedTimeUtc;
    }

    public PaymentJob flags(Object flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Flags that apply to this payment job.  They can either not be set or set with a true or false value. Key options: PaymentAbandonmentEmailSent, PaidByPaymentAbandonmentEmail, Moto, ApplePay, ForcedMoto, RecurringParent, Direct, GenerateToken, StoreCardDetails, CreatedOnMapi, Frictionless
     * @return flags
     **/
    @Schema(
        description = "Flags that apply to this payment job.  They can either not be set or set with a true or false value. Key options: PaymentAbandonmentEmailSent, PaidByPaymentAbandonmentEmail, Moto, ApplePay, ForcedMoto, RecurringParent, Direct, GenerateToken, StoreCardDetails, CreatedOnMapi, Frictionless"
    )
    public Object getFlags() {
        return flags;
    }

    public void setFlags(Object flags) {
        this.flags = flags;
    }

    public PaymentJob attributes(PaymentJobAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     **/
    @Schema(description = "")
    @Valid
    public PaymentJobAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(PaymentJobAttributes attributes) {
        this.attributes = attributes;
    }

    public PaymentJob paymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Get paymentStatus
     * @return paymentStatus
     **/
    @Schema(description = "")
    @Valid
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentJob payments(List<Payment> payments) {
        this.payments = payments;
        return this;
    }

    public PaymentJob addPaymentsItem(Payment paymentsItem) {
        if (this.payments == null) {
            this.payments = new ArrayList<Payment>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * List of payments that are part of this payment job.
     * @return payments
     **/
    @Schema(description = "List of payments that are part of this payment job.")
    @Valid
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public PaymentJob recurrenceCriteria(RecurrenceCriteria recurrenceCriteria) {
        this.recurrenceCriteria = recurrenceCriteria;
        return this;
    }

    /**
     * Get recurrenceCriteria
     * @return recurrenceCriteria
     **/
    @Schema(description = "")
    @Valid
    public RecurrenceCriteria getRecurrenceCriteria() {
        return recurrenceCriteria;
    }

    public void setRecurrenceCriteria(RecurrenceCriteria recurrenceCriteria) {
        this.recurrenceCriteria = recurrenceCriteria;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentJob paymentJob = (PaymentJob) o;
        return (
            Objects.equals(this.reference, paymentJob.reference) &&
            Objects.equals(this.createDateTimeUtc, paymentJob.createDateTimeUtc) &&
            Objects.equals(this.type, paymentJob.type) &&
            Objects.equals(this.traceReference, paymentJob.traceReference) &&
            Objects.equals(this.configurationId, paymentJob.configurationId) &&
            Objects.equals(this.domain, paymentJob.domain) &&
            Objects.equals(this.locale, paymentJob.locale) &&
            Objects.equals(this.timeZone, paymentJob.timeZone) &&
            Objects.equals(this.order, paymentJob.order) &&
            Objects.equals(this.orderHistory, paymentJob.orderHistory) &&
            Objects.equals(this.parentPaymentJobReference, paymentJob.parentPaymentJobReference) &&
            Objects.equals(this.paymentMethodsToUse, paymentJob.paymentMethodsToUse) &&
            Objects.equals(this.displayUrl, paymentJob.displayUrl) &&
            Objects.equals(this.currency, paymentJob.currency) &&
            Objects.equals(this.amountToCollect, paymentJob.amountToCollect) &&
            Objects.equals(this.amountCollected, paymentJob.amountCollected) &&
            Objects.equals(this.paidAmount, paymentJob.paidAmount) &&
            Objects.equals(this.paidDateTimeUtc, paymentJob.paidDateTimeUtc) &&
            Objects.equals(this.expirationDateTimeUtc, paymentJob.expirationDateTimeUtc) &&
            Objects.equals(this.dueDateTimeUtc, paymentJob.dueDateTimeUtc) &&
            Objects.equals(this.lastUpdateTimeUtc, paymentJob.lastUpdateTimeUtc) &&
            Objects.equals(this.lastProcessedTimeUtc, paymentJob.lastProcessedTimeUtc) &&
            Objects.equals(this.flags, paymentJob.flags) &&
            Objects.equals(this.attributes, paymentJob.attributes) &&
            Objects.equals(this.paymentStatus, paymentJob.paymentStatus) &&
            Objects.equals(this.payments, paymentJob.payments) &&
            Objects.equals(this.recurrenceCriteria, paymentJob.recurrenceCriteria)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            reference,
            createDateTimeUtc,
            type,
            traceReference,
            configurationId,
            domain,
            locale,
            timeZone,
            order,
            orderHistory,
            parentPaymentJobReference,
            paymentMethodsToUse,
            displayUrl,
            currency,
            amountToCollect,
            amountCollected,
            paidAmount,
            paidDateTimeUtc,
            expirationDateTimeUtc,
            dueDateTimeUtc,
            lastUpdateTimeUtc,
            lastProcessedTimeUtc,
            flags,
            attributes,
            paymentStatus,
            payments,
            recurrenceCriteria
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentJob {\n");

        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    traceReference: ").append(toIndentedString(traceReference)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    orderHistory: ").append(toIndentedString(orderHistory)).append("\n");
        sb.append("    parentPaymentJobReference: ").append(toIndentedString(parentPaymentJobReference)).append("\n");
        sb.append("    paymentMethodsToUse: ").append(toIndentedString(paymentMethodsToUse)).append("\n");
        sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amountToCollect: ").append(toIndentedString(amountToCollect)).append("\n");
        sb.append("    amountCollected: ").append(toIndentedString(amountCollected)).append("\n");
        sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
        sb.append("    paidDateTimeUtc: ").append(toIndentedString(paidDateTimeUtc)).append("\n");
        sb.append("    expirationDateTimeUtc: ").append(toIndentedString(expirationDateTimeUtc)).append("\n");
        sb.append("    dueDateTimeUtc: ").append(toIndentedString(dueDateTimeUtc)).append("\n");
        sb.append("    lastUpdateTimeUtc: ").append(toIndentedString(lastUpdateTimeUtc)).append("\n");
        sb.append("    lastProcessedTimeUtc: ").append(toIndentedString(lastProcessedTimeUtc)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    recurrenceCriteria: ").append(toIndentedString(recurrenceCriteria)).append("\n");
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
