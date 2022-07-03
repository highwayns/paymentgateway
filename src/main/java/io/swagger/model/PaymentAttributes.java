package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Attributes associated with this payment.
 */
@Schema(description = "Attributes associated with this payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class PaymentAttributes {

    @JsonProperty("OriginatingIpAddress")
    private String originatingIpAddress = null;

    @JsonProperty("OriginHeader")
    private String originHeader = null;

    @JsonProperty("UserAgent")
    private String userAgent = null;

    @JsonProperty("ReturnUrlSuccess")
    private String returnUrlSuccess = null;

    @JsonProperty("ReturnUrlFailed")
    private String returnUrlFailed = null;

    @JsonProperty("ReturnUrlCancelled")
    private String returnUrlCancelled = null;

    @JsonProperty("SimulatedStatus")
    private String simulatedStatus = null;

    @JsonProperty("IdealBic")
    private String idealBic = null;

    @JsonProperty("PaymentMethodTransactionId")
    private String paymentMethodTransactionId = null;

    @JsonProperty("PaymentMethodVoidTransactionId")
    private String paymentMethodVoidTransactionId = null;

    @JsonProperty("Token")
    private String token = null;

    @JsonProperty("CashFlowsAcquiringDetails")
    private String cashFlowsAcquiringDetails = null;

    @JsonProperty("Descriptor")
    private String descriptor = null;

    @JsonProperty("EWalletType")
    private String ewalletType = null;

    public PaymentAttributes originatingIpAddress(String originatingIpAddress) {
        this.originatingIpAddress = originatingIpAddress;
        return this;
    }

    /**
     * Get originatingIpAddress
     * @return originatingIpAddress
     **/
    @Schema(description = "")
    public String getOriginatingIpAddress() {
        return originatingIpAddress;
    }

    public void setOriginatingIpAddress(String originatingIpAddress) {
        this.originatingIpAddress = originatingIpAddress;
    }

    public PaymentAttributes originHeader(String originHeader) {
        this.originHeader = originHeader;
        return this;
    }

    /**
     * Get originHeader
     * @return originHeader
     **/
    @Schema(description = "")
    public String getOriginHeader() {
        return originHeader;
    }

    public void setOriginHeader(String originHeader) {
        this.originHeader = originHeader;
    }

    public PaymentAttributes userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Get userAgent
     * @return userAgent
     **/
    @Schema(description = "")
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public PaymentAttributes returnUrlSuccess(String returnUrlSuccess) {
        this.returnUrlSuccess = returnUrlSuccess;
        return this;
    }

    /**
     * Get returnUrlSuccess
     * @return returnUrlSuccess
     **/
    @Schema(description = "")
    public String getReturnUrlSuccess() {
        return returnUrlSuccess;
    }

    public void setReturnUrlSuccess(String returnUrlSuccess) {
        this.returnUrlSuccess = returnUrlSuccess;
    }

    public PaymentAttributes returnUrlFailed(String returnUrlFailed) {
        this.returnUrlFailed = returnUrlFailed;
        return this;
    }

    /**
     * Get returnUrlFailed
     * @return returnUrlFailed
     **/
    @Schema(description = "")
    public String getReturnUrlFailed() {
        return returnUrlFailed;
    }

    public void setReturnUrlFailed(String returnUrlFailed) {
        this.returnUrlFailed = returnUrlFailed;
    }

    public PaymentAttributes returnUrlCancelled(String returnUrlCancelled) {
        this.returnUrlCancelled = returnUrlCancelled;
        return this;
    }

    /**
     * Get returnUrlCancelled
     * @return returnUrlCancelled
     **/
    @Schema(description = "")
    public String getReturnUrlCancelled() {
        return returnUrlCancelled;
    }

    public void setReturnUrlCancelled(String returnUrlCancelled) {
        this.returnUrlCancelled = returnUrlCancelled;
    }

    public PaymentAttributes simulatedStatus(String simulatedStatus) {
        this.simulatedStatus = simulatedStatus;
        return this;
    }

    /**
     * Get simulatedStatus
     * @return simulatedStatus
     **/
    @Schema(description = "")
    public String getSimulatedStatus() {
        return simulatedStatus;
    }

    public void setSimulatedStatus(String simulatedStatus) {
        this.simulatedStatus = simulatedStatus;
    }

    public PaymentAttributes idealBic(String idealBic) {
        this.idealBic = idealBic;
        return this;
    }

    /**
     * Get idealBic
     * @return idealBic
     **/
    @Schema(description = "")
    public String getIdealBic() {
        return idealBic;
    }

    public void setIdealBic(String idealBic) {
        this.idealBic = idealBic;
    }

    public PaymentAttributes paymentMethodTransactionId(String paymentMethodTransactionId) {
        this.paymentMethodTransactionId = paymentMethodTransactionId;
        return this;
    }

    /**
     * Get paymentMethodTransactionId
     * @return paymentMethodTransactionId
     **/
    @Schema(description = "")
    public String getPaymentMethodTransactionId() {
        return paymentMethodTransactionId;
    }

    public void setPaymentMethodTransactionId(String paymentMethodTransactionId) {
        this.paymentMethodTransactionId = paymentMethodTransactionId;
    }

    public PaymentAttributes paymentMethodVoidTransactionId(String paymentMethodVoidTransactionId) {
        this.paymentMethodVoidTransactionId = paymentMethodVoidTransactionId;
        return this;
    }

    /**
     * Get paymentMethodVoidTransactionId
     * @return paymentMethodVoidTransactionId
     **/
    @Schema(description = "")
    public String getPaymentMethodVoidTransactionId() {
        return paymentMethodVoidTransactionId;
    }

    public void setPaymentMethodVoidTransactionId(String paymentMethodVoidTransactionId) {
        this.paymentMethodVoidTransactionId = paymentMethodVoidTransactionId;
    }

    public PaymentAttributes token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     * @return token
     **/
    @Schema(description = "")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PaymentAttributes cashFlowsAcquiringDetails(String cashFlowsAcquiringDetails) {
        this.cashFlowsAcquiringDetails = cashFlowsAcquiringDetails;
        return this;
    }

    /**
     * Get cashFlowsAcquiringDetails
     * @return cashFlowsAcquiringDetails
     **/
    @Schema(description = "")
    public String getCashFlowsAcquiringDetails() {
        return cashFlowsAcquiringDetails;
    }

    public void setCashFlowsAcquiringDetails(String cashFlowsAcquiringDetails) {
        this.cashFlowsAcquiringDetails = cashFlowsAcquiringDetails;
    }

    public PaymentAttributes descriptor(String descriptor) {
        this.descriptor = descriptor;
        return this;
    }

    /**
     * Get descriptor
     * @return descriptor
     **/
    @Schema(description = "")
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public PaymentAttributes ewalletType(String ewalletType) {
        this.ewalletType = ewalletType;
        return this;
    }

    /**
     * Get ewalletType
     * @return ewalletType
     **/
    @Schema(description = "")
    public String getEwalletType() {
        return ewalletType;
    }

    public void setEwalletType(String ewalletType) {
        this.ewalletType = ewalletType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentAttributes paymentAttributes = (PaymentAttributes) o;
        return (
            Objects.equals(this.originatingIpAddress, paymentAttributes.originatingIpAddress) &&
            Objects.equals(this.originHeader, paymentAttributes.originHeader) &&
            Objects.equals(this.userAgent, paymentAttributes.userAgent) &&
            Objects.equals(this.returnUrlSuccess, paymentAttributes.returnUrlSuccess) &&
            Objects.equals(this.returnUrlFailed, paymentAttributes.returnUrlFailed) &&
            Objects.equals(this.returnUrlCancelled, paymentAttributes.returnUrlCancelled) &&
            Objects.equals(this.simulatedStatus, paymentAttributes.simulatedStatus) &&
            Objects.equals(this.idealBic, paymentAttributes.idealBic) &&
            Objects.equals(this.paymentMethodTransactionId, paymentAttributes.paymentMethodTransactionId) &&
            Objects.equals(this.paymentMethodVoidTransactionId, paymentAttributes.paymentMethodVoidTransactionId) &&
            Objects.equals(this.token, paymentAttributes.token) &&
            Objects.equals(this.cashFlowsAcquiringDetails, paymentAttributes.cashFlowsAcquiringDetails) &&
            Objects.equals(this.descriptor, paymentAttributes.descriptor) &&
            Objects.equals(this.ewalletType, paymentAttributes.ewalletType)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            originatingIpAddress,
            originHeader,
            userAgent,
            returnUrlSuccess,
            returnUrlFailed,
            returnUrlCancelled,
            simulatedStatus,
            idealBic,
            paymentMethodTransactionId,
            paymentMethodVoidTransactionId,
            token,
            cashFlowsAcquiringDetails,
            descriptor,
            ewalletType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentAttributes {\n");

        sb.append("    originatingIpAddress: ").append(toIndentedString(originatingIpAddress)).append("\n");
        sb.append("    originHeader: ").append(toIndentedString(originHeader)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    returnUrlSuccess: ").append(toIndentedString(returnUrlSuccess)).append("\n");
        sb.append("    returnUrlFailed: ").append(toIndentedString(returnUrlFailed)).append("\n");
        sb.append("    returnUrlCancelled: ").append(toIndentedString(returnUrlCancelled)).append("\n");
        sb.append("    simulatedStatus: ").append(toIndentedString(simulatedStatus)).append("\n");
        sb.append("    idealBic: ").append(toIndentedString(idealBic)).append("\n");
        sb.append("    paymentMethodTransactionId: ").append(toIndentedString(paymentMethodTransactionId)).append("\n");
        sb.append("    paymentMethodVoidTransactionId: ").append(toIndentedString(paymentMethodVoidTransactionId)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    cashFlowsAcquiringDetails: ").append(toIndentedString(cashFlowsAcquiringDetails)).append("\n");
        sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
        sb.append("    ewalletType: ").append(toIndentedString(ewalletType)).append("\n");
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
