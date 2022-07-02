package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Address;
import io.swagger.model.Identity;
import io.swagger.model.OrderLine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * An object containing information about ordered goods and services.
 */
@Schema(description = "An object containing information about ordered goods and services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Order {

    @JsonProperty("orderNumber")
    private String orderNumber = null;

    @JsonProperty("note")
    private String note = null;

    @JsonProperty("createDateTimeUtc")
    private OffsetDateTime createDateTimeUtc = null;

    @JsonProperty("customerReference")
    private Long customerReference = null;

    @JsonProperty("billingAddress")
    private Address billingAddress = null;

    @JsonProperty("billingIdentity")
    private Identity billingIdentity = null;

    @JsonProperty("shippingAddress")
    private Address shippingAddress = null;

    @JsonProperty("orderLines")
    @Valid
    private List<OrderLine> orderLines = null;

    public Order orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * The order number.
     * @return orderNumber
     **/
    @Schema(description = "The order number.")
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Additional comments or requests.
     * @return note
     **/
    @Schema(description = "Additional comments or requests.")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order createDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
        return this;
    }

    /**
     * The date and time this order has been created.
     * @return createDateTimeUtc
     **/
    @Schema(description = "The date and time this order has been created.")
    @Valid
    public OffsetDateTime getCreateDateTimeUtc() {
        return createDateTimeUtc;
    }

    public void setCreateDateTimeUtc(OffsetDateTime createDateTimeUtc) {
        this.createDateTimeUtc = createDateTimeUtc;
    }

    public Order customerReference(Long customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * A reference to the customer used for default billing address, billing identity and shipping address details.
     * @return customerReference
     **/
    @Schema(description = "A reference to the customer used for default billing address, billing identity and shipping address details.")
    public Long getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(Long customerReference) {
        this.customerReference = customerReference;
    }

    public Order billingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * Get billingAddress
     * @return billingAddress
     **/
    @Schema(description = "")
    @Valid
    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order billingIdentity(Identity billingIdentity) {
        this.billingIdentity = billingIdentity;
        return this;
    }

    /**
     * Get billingIdentity
     * @return billingIdentity
     **/
    @Schema(description = "")
    @Valid
    public Identity getBillingIdentity() {
        return billingIdentity;
    }

    public void setBillingIdentity(Identity billingIdentity) {
        this.billingIdentity = billingIdentity;
    }

    public Order shippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get shippingAddress
     * @return shippingAddress
     **/
    @Schema(description = "")
    @Valid
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Order orderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    public Order addOrderLinesItem(OrderLine orderLinesItem) {
        if (this.orderLines == null) {
            this.orderLines = new ArrayList<OrderLine>();
        }
        this.orderLines.add(orderLinesItem);
        return this;
    }

    /**
     * List of order lines that that contain the order line details.
     * @return orderLines
     **/
    @Schema(description = "List of order lines that that contain the order line details.")
    @Valid
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return (
            Objects.equals(this.orderNumber, order.orderNumber) &&
            Objects.equals(this.note, order.note) &&
            Objects.equals(this.createDateTimeUtc, order.createDateTimeUtc) &&
            Objects.equals(this.customerReference, order.customerReference) &&
            Objects.equals(this.billingAddress, order.billingAddress) &&
            Objects.equals(this.billingIdentity, order.billingIdentity) &&
            Objects.equals(this.shippingAddress, order.shippingAddress) &&
            Objects.equals(this.orderLines, order.orderLines)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            orderNumber,
            note,
            createDateTimeUtc,
            customerReference,
            billingAddress,
            billingIdentity,
            shippingAddress,
            orderLines
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");

        sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    createDateTimeUtc: ").append(toIndentedString(createDateTimeUtc)).append("\n");
        sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    billingIdentity: ").append(toIndentedString(billingIdentity)).append("\n");
        sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
        sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
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
