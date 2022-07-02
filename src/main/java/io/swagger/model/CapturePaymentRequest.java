package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * The request object for creating a new capture.
 */
@Schema(description = "The request object for creating a new capture.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class CapturePaymentRequest {

    @JsonProperty("amountToCapture")
    private Double amountToCapture = null;

    @JsonProperty("isFinalCapture")
    private Boolean isFinalCapture = null;

    @JsonProperty("parameters")
    private Object parameters = null;

    public CapturePaymentRequest amountToCapture(Double amountToCapture) {
        this.amountToCapture = amountToCapture;
        return this;
    }

    /**
     * The amount to capture in the currency specified in the payment job.
     * @return amountToCapture
     **/
    @Schema(description = "The amount to capture in the currency specified in the payment job.")
    public Double getAmountToCapture() {
        return amountToCapture;
    }

    public void setAmountToCapture(Double amountToCapture) {
        this.amountToCapture = amountToCapture;
    }

    public CapturePaymentRequest isFinalCapture(Boolean isFinalCapture) {
        this.isFinalCapture = isFinalCapture;
        return this;
    }

    /**
     * Indicates if additional captures are allowed. Only applicable for partial captures.
     * @return isFinalCapture
     **/
    @Schema(description = "Indicates if additional captures are allowed. Only applicable for partial captures.")
    public Boolean isIsFinalCapture() {
        return isFinalCapture;
    }

    public void setIsFinalCapture(Boolean isFinalCapture) {
        this.isFinalCapture = isFinalCapture;
    }

    public CapturePaymentRequest parameters(Object parameters) {
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
        CapturePaymentRequest capturePaymentRequest = (CapturePaymentRequest) o;
        return (
            Objects.equals(this.amountToCapture, capturePaymentRequest.amountToCapture) &&
            Objects.equals(this.isFinalCapture, capturePaymentRequest.isFinalCapture) &&
            Objects.equals(this.parameters, capturePaymentRequest.parameters)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountToCapture, isFinalCapture, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapturePaymentRequest {\n");

        sb.append("    amountToCapture: ").append(toIndentedString(amountToCapture)).append("\n");
        sb.append("    isFinalCapture: ").append(toIndentedString(isFinalCapture)).append("\n");
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
