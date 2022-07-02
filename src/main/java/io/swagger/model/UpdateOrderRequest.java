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

/**
 * The request object used to update an order.
 */
@Schema(description = "The request object used to update an order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class UpdateOrderRequest {

    @JsonProperty("orderNumber")
    private String orderNumber = null;

    @JsonProperty("note")
    private String note = null;

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

    public UpdateOrderRequest orderNumber(String orderNumber) {
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

    public UpdateOrderRequest note(String note) {
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

    public UpdateOrderRequest customerReference(Long customerReference) {
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

    public UpdateOrderRequest billingAddress(Address billingAddress) {
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

    public UpdateOrderRequest billingIdentity(Identity billingIdentity) {
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

    public UpdateOrderRequest shippingAddress(Address shippingAddress) {
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

    public UpdateOrderRequest orderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    public UpdateOrderRequest addOrderLinesItem(OrderLine orderLinesItem) {
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
        UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
        return (
            Objects.equals(this.orderNumber, updateOrderRequest.orderNumber) &&
            Objects.equals(this.note, updateOrderRequest.note) &&
            Objects.equals(this.customerReference, updateOrderRequest.customerReference) &&
            Objects.equals(this.billingAddress, updateOrderRequest.billingAddress) &&
            Objects.equals(this.billingIdentity, updateOrderRequest.billingIdentity) &&
            Objects.equals(this.shippingAddress, updateOrderRequest.shippingAddress) &&
            Objects.equals(this.orderLines, updateOrderRequest.orderLines)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, note, customerReference, billingAddress, billingIdentity, shippingAddress, orderLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderRequest {\n");

        sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
