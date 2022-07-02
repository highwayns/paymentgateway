package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets PhoneNumberType
 */
public enum PhoneNumberType {
    UNKNOWN("Unknown"),
    MOBILE("Mobile"),
    FIXED("Fixed");

    private String value;

    PhoneNumberType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PhoneNumberType fromValue(String text) {
        for (PhoneNumberType b : PhoneNumberType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
