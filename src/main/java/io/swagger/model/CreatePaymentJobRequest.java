package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Currency;
import io.swagger.model.GatewayPaymentMethod;
import io.swagger.model.Locale;
import io.swagger.model.PaymentJobOption;
import io.swagger.model.PaymentJobType;
import io.swagger.model.RecurrenceCriteria;
import io.swagger.model.UpdateOrderRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * The request object for creating a new payment job.
 */
@Schema(description = "The request object for creating a new payment job.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class CreatePaymentJobRequest {

    @JsonProperty("type")
    private PaymentJobType type = null;

    @JsonProperty("locale")
    private Locale locale = null;

    @JsonProperty("timeZone")
    private String timeZone = null;

    @JsonProperty("order")
    private UpdateOrderRequest order = null;

    @JsonProperty("parentPaymentJobReference")
    private Long parentPaymentJobReference = null;

    @JsonProperty("paymentMethodsToUse")
    @Valid
    private List<GatewayPaymentMethod> paymentMethodsToUse = null;

    @JsonProperty("parameters")
    private Object parameters = null;

    @JsonProperty("options")
    @Valid
    private List<PaymentJobOption> options = null;

    @JsonProperty("preparationIds")
    @Valid
    private List<UUID> preparationIds = null;

    @JsonProperty("displayUrl")
    private String displayUrl = null;

    @JsonProperty("currency")
    private Currency currency = null;

    @JsonProperty("amountToCollect")
    private Double amountToCollect = null;

    @JsonProperty("expirationDateTimeUtc")
    private OffsetDateTime expirationDateTimeUtc = null;

    @JsonProperty("recurrenceCriteria")
    private RecurrenceCriteria recurrenceCriteria = null;

    public CreatePaymentJobRequest type(PaymentJobType type) {
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

    public CreatePaymentJobRequest locale(Locale locale) {
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

    public CreatePaymentJobRequest timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The time zone of the intented audience of the payment job.
     * @return timeZone
     **/
    @Schema(description = "The time zone of the intented audience of the payment job.")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreatePaymentJobRequest order(UpdateOrderRequest order) {
        this.order = order;
        return this;
    }

    /**
     * Get order
     * @return order
     **/
    @Schema(description = "")
    @Valid
    public UpdateOrderRequest getOrder() {
        return order;
    }

    public void setOrder(UpdateOrderRequest order) {
        this.order = order;
    }

    public CreatePaymentJobRequest parentPaymentJobReference(Long parentPaymentJobReference) {
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

    public CreatePaymentJobRequest paymentMethodsToUse(List<GatewayPaymentMethod> paymentMethodsToUse) {
        this.paymentMethodsToUse = paymentMethodsToUse;
        return this;
    }

    public CreatePaymentJobRequest addPaymentMethodsToUseItem(GatewayPaymentMethod paymentMethodsToUseItem) {
        if (this.paymentMethodsToUse == null) {
            this.paymentMethodsToUse = new ArrayList<GatewayPaymentMethod>();
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
    public List<GatewayPaymentMethod> getPaymentMethodsToUse() {
        return paymentMethodsToUse;
    }

    public void setPaymentMethodsToUse(List<GatewayPaymentMethod> paymentMethodsToUse) {
        this.paymentMethodsToUse = paymentMethodsToUse;
    }

    public CreatePaymentJobRequest parameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Additional parameters, like AutoInvoice, and HostedNotCancelable to use when executing the request,  as well as payment method specific parameters, like BIC for iDEAL, for use by one or more payment methods. Key options: OriginatingIpAddress, OriginHeader, UserAgent, ThreeDSecureChallengeAcceptHeader, ThreeDSecureV2ChallengeWindowSize, BrowserLanguage, BrowserTimeZoneOffset, BrowserJavaEnabled, BrowserJavaScriptEnabled, BrowserScreenHeight, BrowserScreenWidth, BrowserScreenColorDepth, ReturnUrlSuccess, ReturnUrlFailed, ReturnUrlCancelled, WebhookUrl, PaymentPageReference, SimulatedStatus, IdealBic, SelectedPaymentMethod, CardNumber, CardCvc, CardExpiryMonth, CardExpiryYear, CardHolderName, Mcc, RecipientDetails, PaRes, Md, RReq, CRes, ThreeDSSessionData, ThreeDSMethodData, ThreeDSecureXid, ThreeDSecureCavv, ThreeDSecureEci, ThreeDSecureVersion, ThreeDSecureDSTransId, Token, PayerId, GoogleAnalyticsClientId, AllowedParentFrameDomains, Descriptor, EWalletType, ApplePayTransactionIdentifier
     * @return parameters
     **/
    @Schema(
        description = "Additional parameters, like AutoInvoice, and HostedNotCancelable to use when executing the request,  as well as payment method specific parameters, like BIC for iDEAL, for use by one or more payment methods. Key options: OriginatingIpAddress, OriginHeader, UserAgent, ThreeDSecureChallengeAcceptHeader, ThreeDSecureV2ChallengeWindowSize, BrowserLanguage, BrowserTimeZoneOffset, BrowserJavaEnabled, BrowserJavaScriptEnabled, BrowserScreenHeight, BrowserScreenWidth, BrowserScreenColorDepth, ReturnUrlSuccess, ReturnUrlFailed, ReturnUrlCancelled, WebhookUrl, PaymentPageReference, SimulatedStatus, IdealBic, SelectedPaymentMethod, CardNumber, CardCvc, CardExpiryMonth, CardExpiryYear, CardHolderName, Mcc, RecipientDetails, PaRes, Md, RReq, CRes, ThreeDSSessionData, ThreeDSMethodData, ThreeDSecureXid, ThreeDSecureCavv, ThreeDSecureEci, ThreeDSecureVersion, ThreeDSecureDSTransId, Token, PayerId, GoogleAnalyticsClientId, AllowedParentFrameDomains, Descriptor, EWalletType, ApplePayTransactionIdentifier"
    )
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public CreatePaymentJobRequest options(List<PaymentJobOption> options) {
        this.options = options;
        return this;
    }

    public CreatePaymentJobRequest addOptionsItem(PaymentJobOption optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<PaymentJobOption>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Additional options used to steer payment job related flows.
     * @return options
     **/
    @Schema(description = "Additional options used to steer payment job related flows.")
    @Valid
    public List<PaymentJobOption> getOptions() {
        return options;
    }

    public void setOptions(List<PaymentJobOption> options) {
        this.options = options;
    }

    public CreatePaymentJobRequest preparationIds(List<UUID> preparationIds) {
        this.preparationIds = preparationIds;
        return this;
    }

    public CreatePaymentJobRequest addPreparationIdsItem(UUID preparationIdsItem) {
        if (this.preparationIds == null) {
            this.preparationIds = new ArrayList<UUID>();
        }
        this.preparationIds.add(preparationIdsItem);
        return this;
    }

    /**
     * List of preparation ids, used to store some values to be used in this payment job create request.
     * @return preparationIds
     **/
    @Schema(description = "List of preparation ids, used to store some values to be used in this payment job create request.")
    @Valid
    public List<UUID> getPreparationIds() {
        return preparationIds;
    }

    public void setPreparationIds(List<UUID> preparationIds) {
        this.preparationIds = preparationIds;
    }

    public CreatePaymentJobRequest displayUrl(String displayUrl) {
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

    public CreatePaymentJobRequest currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     **/
    @Schema(required = true, description = "")
    @NotNull
    @Valid
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CreatePaymentJobRequest amountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
        return this;
    }

    /**
     * The amount to collect in this payment job.  This amount is initially supplied by the instantiator of the payment request.  The amount which is actually collected is the sum of the amount to collect and the surcharge amount together.
     * @return amountToCollect
     **/
    @Schema(
        description = "The amount to collect in this payment job.  This amount is initially supplied by the instantiator of the payment request.  The amount which is actually collected is the sum of the amount to collect and the surcharge amount together."
    )
    public Double getAmountToCollect() {
        return amountToCollect;
    }

    public void setAmountToCollect(Double amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    public CreatePaymentJobRequest expirationDateTimeUtc(OffsetDateTime expirationDateTimeUtc) {
        this.expirationDateTimeUtc = expirationDateTimeUtc;
        return this;
    }

    /**
     * The date and time the payment job expires and is no longer valid.  If not supplied, the payment job will expire after six months after creation.
     * @return expirationDateTimeUtc
     **/
    @Schema(
        description = "The date and time the payment job expires and is no longer valid.  If not supplied, the payment job will expire after six months after creation."
    )
    @Valid
    public OffsetDateTime getExpirationDateTimeUtc() {
        return expirationDateTimeUtc;
    }

    public void setExpirationDateTimeUtc(OffsetDateTime expirationDateTimeUtc) {
        this.expirationDateTimeUtc = expirationDateTimeUtc;
    }

    public CreatePaymentJobRequest recurrenceCriteria(RecurrenceCriteria recurrenceCriteria) {
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
        CreatePaymentJobRequest createPaymentJobRequest = (CreatePaymentJobRequest) o;
        return (
            Objects.equals(this.type, createPaymentJobRequest.type) &&
            Objects.equals(this.locale, createPaymentJobRequest.locale) &&
            Objects.equals(this.timeZone, createPaymentJobRequest.timeZone) &&
            Objects.equals(this.order, createPaymentJobRequest.order) &&
            Objects.equals(this.parentPaymentJobReference, createPaymentJobRequest.parentPaymentJobReference) &&
            Objects.equals(this.paymentMethodsToUse, createPaymentJobRequest.paymentMethodsToUse) &&
            Objects.equals(this.parameters, createPaymentJobRequest.parameters) &&
            Objects.equals(this.options, createPaymentJobRequest.options) &&
            Objects.equals(this.preparationIds, createPaymentJobRequest.preparationIds) &&
            Objects.equals(this.displayUrl, createPaymentJobRequest.displayUrl) &&
            Objects.equals(this.currency, createPaymentJobRequest.currency) &&
            Objects.equals(this.amountToCollect, createPaymentJobRequest.amountToCollect) &&
            Objects.equals(this.expirationDateTimeUtc, createPaymentJobRequest.expirationDateTimeUtc) &&
            Objects.equals(this.recurrenceCriteria, createPaymentJobRequest.recurrenceCriteria)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            locale,
            timeZone,
            order,
            parentPaymentJobReference,
            paymentMethodsToUse,
            parameters,
            options,
            preparationIds,
            displayUrl,
            currency,
            amountToCollect,
            expirationDateTimeUtc,
            recurrenceCriteria
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePaymentJobRequest {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    parentPaymentJobReference: ").append(toIndentedString(parentPaymentJobReference)).append("\n");
        sb.append("    paymentMethodsToUse: ").append(toIndentedString(paymentMethodsToUse)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    preparationIds: ").append(toIndentedString(preparationIds)).append("\n");
        sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amountToCollect: ").append(toIndentedString(amountToCollect)).append("\n");
        sb.append("    expirationDateTimeUtc: ").append(toIndentedString(expirationDateTimeUtc)).append("\n");
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
