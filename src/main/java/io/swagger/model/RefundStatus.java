package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets RefundStatus
 */
public enum RefundStatus {
    PENDING("Pending"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    RefundStatus(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RefundStatus fromValue(String text) {
        for (RefundStatus b : RefundStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
