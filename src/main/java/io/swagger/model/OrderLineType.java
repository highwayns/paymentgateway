package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets OrderLineType
 */
public enum OrderLineType {
    PHYSICALITEM("PhysicalItem"),
    DIGITALITEM("DigitalItem"),
    SHIPPINGCOST("ShippingCost"),
    PAYMENTCOST("PaymentCost"),
    DISCOUNT("Discount"),
    GIFTCARD("GiftCard"),
    SHOPCREDIT("ShopCredit");

    private String value;

    OrderLineType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OrderLineType fromValue(String text) {
        for (OrderLineType b : OrderLineType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
