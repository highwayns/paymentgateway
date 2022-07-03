package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Attributes associated with this payment job.
 */
@Schema(description = "Attributes associated with this payment job.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class PaymentJobAttributes {

    @JsonProperty("WebhookUrl")
    private String webhookUrl = null;

    @JsonProperty("GoogleAnalyticsClientId")
    private String googleAnalyticsClientId = null;

    @JsonProperty("AllowedParentFrameDomains")
    private String allowedParentFrameDomains = null;

    @JsonProperty("PaymentPageReference")
    private String paymentPageReference = null;

    public PaymentJobAttributes webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * Get webhookUrl
     * @return webhookUrl
     **/
    @Schema(description = "")
    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public PaymentJobAttributes googleAnalyticsClientId(String googleAnalyticsClientId) {
        this.googleAnalyticsClientId = googleAnalyticsClientId;
        return this;
    }

    /**
     * Get googleAnalyticsClientId
     * @return googleAnalyticsClientId
     **/
    @Schema(description = "")
    public String getGoogleAnalyticsClientId() {
        return googleAnalyticsClientId;
    }

    public void setGoogleAnalyticsClientId(String googleAnalyticsClientId) {
        this.googleAnalyticsClientId = googleAnalyticsClientId;
    }

    public PaymentJobAttributes allowedParentFrameDomains(String allowedParentFrameDomains) {
        this.allowedParentFrameDomains = allowedParentFrameDomains;
        return this;
    }

    /**
     * Get allowedParentFrameDomains
     * @return allowedParentFrameDomains
     **/
    @Schema(description = "")
    public String getAllowedParentFrameDomains() {
        return allowedParentFrameDomains;
    }

    public void setAllowedParentFrameDomains(String allowedParentFrameDomains) {
        this.allowedParentFrameDomains = allowedParentFrameDomains;
    }

    public PaymentJobAttributes paymentPageReference(String paymentPageReference) {
        this.paymentPageReference = paymentPageReference;
        return this;
    }

    /**
     * Get paymentPageReference
     * @return paymentPageReference
     **/
    @Schema(description = "")
    public String getPaymentPageReference() {
        return paymentPageReference;
    }

    public void setPaymentPageReference(String paymentPageReference) {
        this.paymentPageReference = paymentPageReference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentJobAttributes paymentJobAttributes = (PaymentJobAttributes) o;
        return (
            Objects.equals(this.webhookUrl, paymentJobAttributes.webhookUrl) &&
            Objects.equals(this.googleAnalyticsClientId, paymentJobAttributes.googleAnalyticsClientId) &&
            Objects.equals(this.allowedParentFrameDomains, paymentJobAttributes.allowedParentFrameDomains) &&
            Objects.equals(this.paymentPageReference, paymentJobAttributes.paymentPageReference)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhookUrl, googleAnalyticsClientId, allowedParentFrameDomains, paymentPageReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentJobAttributes {\n");

        sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
        sb.append("    googleAnalyticsClientId: ").append(toIndentedString(googleAnalyticsClientId)).append("\n");
        sb.append("    allowedParentFrameDomains: ").append(toIndentedString(allowedParentFrameDomains)).append("\n");
        sb.append("    paymentPageReference: ").append(toIndentedString(paymentPageReference)).append("\n");
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
