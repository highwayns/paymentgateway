package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * The request object for creating a new refund.
 */
@Schema(description = "The request object for creating a new refund.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class RefundPaymentRequest {

    @JsonProperty("amountToRefund")
    private Double amountToRefund = null;

    @JsonProperty("refundNumber")
    private String refundNumber = null;

    @JsonProperty("parameters")
    private Object parameters = null;

    public RefundPaymentRequest amountToRefund(Double amountToRefund) {
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

    public RefundPaymentRequest refundNumber(String refundNumber) {
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

    public RefundPaymentRequest parameters(Object parameters) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefundPaymentRequest refundPaymentRequest = (RefundPaymentRequest) o;
        return (
            Objects.equals(this.amountToRefund, refundPaymentRequest.amountToRefund) &&
            Objects.equals(this.refundNumber, refundPaymentRequest.refundNumber) &&
            Objects.equals(this.parameters, refundPaymentRequest.parameters)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountToRefund, refundNumber, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefundPaymentRequest {\n");

        sb.append("    amountToRefund: ").append(toIndentedString(amountToRefund)).append("\n");
        sb.append("    refundNumber: ").append(toIndentedString(refundNumber)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
