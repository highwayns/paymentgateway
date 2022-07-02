package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.CaptureStatus;
import io.swagger.model.Currency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * An object that represents a capture.
 */
@Schema(description = "An object that represents a capture.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Capture {

    @JsonProperty("reference")
    private Long reference = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("status")
    private CaptureStatus status = null;

    @JsonProperty("amountToCapture")
    private Double amountToCapture = null;

    @JsonProperty("convertedAmountToCapture")
    private Double convertedAmountToCapture = null;

    @JsonProperty("convertedCurrency")
    private Currency convertedCurrency = null;

    @JsonProperty("conversionRate")
    private Double conversionRate = null;

    @JsonProperty("isFinalCapture")
    private Boolean isFinalCapture = null;

    @JsonProperty("attributes")
    private Object attributes = null;

    public Capture reference(Long reference) {
        this.reference = reference;
        return this;
    }

    /**
     * A unique reference of this capture.
     * @return reference
     **/
    @Schema(description = "A unique reference of this capture.")
    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Capture createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this capture has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this capture has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public Capture status(CaptureStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @Schema(description = "")
    @Valid
    public CaptureStatus getStatus() {
        return status;
    }

    public void setStatus(CaptureStatus status) {
        this.status = status;
    }

    public Capture amountToCapture(Double amountToCapture) {
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

    public Capture convertedAmountToCapture(Double convertedAmountToCapture) {
        this.convertedAmountToCapture = convertedAmountToCapture;
        return this;
    }

    /**
     * The amount to capture in the currency compatible with the selected method.  Equal to the amount to capture multiplied by the conversion rate.  If null, the amount to capture has not been converted and the amount to capture is used instead.
     * @return convertedAmountToCapture
     **/
    @Schema(
        description = "The amount to capture in the currency compatible with the selected method.  Equal to the amount to capture multiplied by the conversion rate.  If null, the amount to capture has not been converted and the amount to capture is used instead."
    )
    public Double getConvertedAmountToCapture() {
        return convertedAmountToCapture;
    }

    public void setConvertedAmountToCapture(Double convertedAmountToCapture) {
        this.convertedAmountToCapture = convertedAmountToCapture;
    }

    public Capture convertedCurrency(Currency convertedCurrency) {
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

    public Capture conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /**
     * The conversion rate used for converting the amount to capture to the currency compatible with the selected method.  This rate multiplied by the amount to capture results in the converted amount to capture.  If null, the amount to capture has not been converted.
     * @return conversionRate
     **/
    @Schema(
        description = "The conversion rate used for converting the amount to capture to the currency compatible with the selected method.  This rate multiplied by the amount to capture results in the converted amount to capture.  If null, the amount to capture has not been converted."
    )
    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Capture isFinalCapture(Boolean isFinalCapture) {
        this.isFinalCapture = isFinalCapture;
        return this;
    }

    /**
     * Indicates that this is the last capture.
     * @return isFinalCapture
     **/
    @Schema(description = "Indicates that this is the last capture.")
    public Boolean isIsFinalCapture() {
        return isFinalCapture;
    }

    public void setIsFinalCapture(Boolean isFinalCapture) {
        this.isFinalCapture = isFinalCapture;
    }

    public Capture attributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Attributes associated with this capture. Key options: PaymentMethodTransactionId
     * @return attributes
     **/
    @Schema(description = "Attributes associated with this capture. Key options: PaymentMethodTransactionId")
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
        Capture capture = (Capture) o;
        return (
            Objects.equals(this.reference, capture.reference) &&
            Objects.equals(this.createDateTimeUtc, capture.createDateTimeUtc) &&
            Objects.equals(this.status, capture.status) &&
            Objects.equals(this.amountToCapture, capture.amountToCapture) &&
            Objects.equals(this.convertedAmountToCapture, capture.convertedAmountToCapture) &&
            Objects.equals(this.convertedCurrency, capture.convertedCurrency) &&
            Objects.equals(this.conversionRate, capture.conversionRate) &&
            Objects.equals(this.isFinalCapture, capture.isFinalCapture) &&
            Objects.equals(this.attributes, capture.attributes)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            reference,
            createDateTimeUtc,
            status,
            amountToCapture,
            convertedAmountToCapture,
            convertedCurrency,
            conversionRate,
            isFinalCapture,
            attributes
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Capture {\n");

        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    amountToCapture: ").append(toIndentedString(amountToCapture)).append("\n");
        sb.append("    convertedAmountToCapture: ").append(toIndentedString(convertedAmountToCapture)).append("\n");
        sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
        sb.append("    isFinalCapture: ").append(toIndentedString(isFinalCapture)).append("\n");
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
