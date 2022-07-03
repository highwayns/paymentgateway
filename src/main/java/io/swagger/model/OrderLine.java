package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.OrderLineType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Part of an object that specify the order line details.
 */
@Schema(description = "Part of an object that specify the order line details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class OrderLine {

    @JsonProperty("lineNumber")
    private Long lineNumber = null;

    @JsonProperty("type")
    private OrderLineType type = null;

    @JsonProperty("skuCode")
    private String skuCode = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("quantity")
    private Double quantity = null;

    @JsonProperty("unitPriceExclVat")
    private Double unitPriceExclVat = null;

    @JsonProperty("unitPriceInclVat")
    private Double unitPriceInclVat = null;

    @JsonProperty("vatPercentage")
    private Double vatPercentage = null;

    @JsonProperty("vatPercentageLabel")
    private String vatPercentageLabel = null;

    @JsonProperty("discountPercentageLabel")
    private String discountPercentageLabel = null;

    @JsonProperty("totalLineAmount")
    private Double totalLineAmount = null;

    @JsonProperty("url")
    private String url = null;

    public OrderLine lineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * A number, unique to an order, to determine the order of the order lines.
     * @return lineNumber
     **/
    @Schema(description = "A number, unique to an order, to determine the order of the order lines.")
    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public OrderLine type(OrderLineType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Schema(description = "")
    @Valid
    public OrderLineType getType() {
        return type;
    }

    public void setType(OrderLineType type) {
        this.type = type;
    }

    public OrderLine skuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    /**
     * A (unique) code that refers to a particular stock keeping unit.
     * @return skuCode
     **/
    @Schema(description = "A (unique) code that refers to a particular stock keeping unit.")
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public OrderLine name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the product or service.
     * @return name
     **/
    @Schema(required = true, description = "The name of the product or service.")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderLine description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the product or service.
     * @return description
     **/
    @Schema(description = "A description of the product or service.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderLine quantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The ordered quantity.
     * @return quantity
     **/
    @Schema(description = "The ordered quantity.")
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public OrderLine unitPriceExclVat(Double unitPriceExclVat) {
        this.unitPriceExclVat = unitPriceExclVat;
        return this;
    }

    /**
     * Unit price excluding value-added tax (VAT).  <br>Note: either one or both unit prices must be specified.
     * @return unitPriceExclVat
     **/
    @Schema(description = "Unit price excluding value-added tax (VAT).  <br>Note: either one or both unit prices must be specified.")
    public Double getUnitPriceExclVat() {
        return unitPriceExclVat;
    }

    public void setUnitPriceExclVat(Double unitPriceExclVat) {
        this.unitPriceExclVat = unitPriceExclVat;
    }

    public OrderLine unitPriceInclVat(Double unitPriceInclVat) {
        this.unitPriceInclVat = unitPriceInclVat;
        return this;
    }

    /**
     * Unit price including value-added tax (VAT).  <br>Note: either one or both unit prices must be specified.
     * @return unitPriceInclVat
     **/
    @Schema(description = "Unit price including value-added tax (VAT).  <br>Note: either one or both unit prices must be specified.")
    public Double getUnitPriceInclVat() {
        return unitPriceInclVat;
    }

    public void setUnitPriceInclVat(Double unitPriceInclVat) {
        this.unitPriceInclVat = unitPriceInclVat;
    }

    public OrderLine vatPercentage(Double vatPercentage) {
        this.vatPercentage = vatPercentage;
        return this;
    }

    /**
     * Applied VAT percentage.
     * @return vatPercentage
     **/
    @Schema(description = "Applied VAT percentage.")
    public Double getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(Double vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public OrderLine vatPercentageLabel(String vatPercentageLabel) {
        this.vatPercentageLabel = vatPercentageLabel;
        return this;
    }

    /**
     * VAT percentage to display.
     * @return vatPercentageLabel
     **/
    @Schema(description = "VAT percentage to display.")
    public String getVatPercentageLabel() {
        return vatPercentageLabel;
    }

    public void setVatPercentageLabel(String vatPercentageLabel) {
        this.vatPercentageLabel = vatPercentageLabel;
    }

    public OrderLine discountPercentageLabel(String discountPercentageLabel) {
        this.discountPercentageLabel = discountPercentageLabel;
        return this;
    }

    /**
     * Discount percentage to display.
     * @return discountPercentageLabel
     **/
    @Schema(description = "Discount percentage to display.")
    public String getDiscountPercentageLabel() {
        return discountPercentageLabel;
    }

    public void setDiscountPercentageLabel(String discountPercentageLabel) {
        this.discountPercentageLabel = discountPercentageLabel;
    }

    public OrderLine totalLineAmount(Double totalLineAmount) {
        this.totalLineAmount = totalLineAmount;
        return this;
    }

    /**
     * Total order line amount.  Including VAT if the unit price including VAT is specified, otherwise excluding VAT.
     * @return totalLineAmount
     **/
    @Schema(description = "Total order line amount.  Including VAT if the unit price including VAT is specified, otherwise excluding VAT.")
    public Double getTotalLineAmount() {
        return totalLineAmount;
    }

    public void setTotalLineAmount(Double totalLineAmount) {
        this.totalLineAmount = totalLineAmount;
    }

    public OrderLine url(String url) {
        this.url = url;
        return this;
    }

    /**
     * A URL that is shown in the portal to the receiver.  This can be used to store a link to a product for easy navigation.
     * @return url
     **/
    @Schema(
        description = "A URL that is shown in the portal to the receiver.  This can be used to store a link to a product for easy navigation."
    )
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLine orderLine = (OrderLine) o;
        return (
            Objects.equals(this.lineNumber, orderLine.lineNumber) &&
            Objects.equals(this.type, orderLine.type) &&
            Objects.equals(this.skuCode, orderLine.skuCode) &&
            Objects.equals(this.name, orderLine.name) &&
            Objects.equals(this.description, orderLine.description) &&
            Objects.equals(this.quantity, orderLine.quantity) &&
            Objects.equals(this.unitPriceExclVat, orderLine.unitPriceExclVat) &&
            Objects.equals(this.unitPriceInclVat, orderLine.unitPriceInclVat) &&
            Objects.equals(this.vatPercentage, orderLine.vatPercentage) &&
            Objects.equals(this.vatPercentageLabel, orderLine.vatPercentageLabel) &&
            Objects.equals(this.discountPercentageLabel, orderLine.discountPercentageLabel) &&
            Objects.equals(this.totalLineAmount, orderLine.totalLineAmount) &&
            Objects.equals(this.url, orderLine.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            lineNumber,
            type,
            skuCode,
            name,
            description,
            quantity,
            unitPriceExclVat,
            unitPriceInclVat,
            vatPercentage,
            vatPercentageLabel,
            discountPercentageLabel,
            totalLineAmount,
            url
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLine {\n");

        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    unitPriceExclVat: ").append(toIndentedString(unitPriceExclVat)).append("\n");
        sb.append("    unitPriceInclVat: ").append(toIndentedString(unitPriceInclVat)).append("\n");
        sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
        sb.append("    vatPercentageLabel: ").append(toIndentedString(vatPercentageLabel)).append("\n");
        sb.append("    discountPercentageLabel: ").append(toIndentedString(discountPercentageLabel)).append("\n");
        sb.append("    totalLineAmount: ").append(toIndentedString(totalLineAmount)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
