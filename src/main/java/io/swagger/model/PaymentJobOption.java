package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets PaymentJobOption
 */
public enum PaymentJobOption {
    ISRECURRINGPAYMENTJOBPARENT("IsRecurringPaymentJobParent"),
    ISMOTO("IsMoto"),
    STORECUSTOMERINFORMATION("StoreCustomerInformation"),
    STORECARDDETAILS("StoreCardDetails"),
    GENERATETOKEN("GenerateToken"),
    FRICTIONLESS("Frictionless");

    private String value;

    PaymentJobOption(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentJobOption fromValue(String text) {
        for (PaymentJobOption b : PaymentJobOption.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
