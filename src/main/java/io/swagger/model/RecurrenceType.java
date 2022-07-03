package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets RecurrenceType
 */
public enum RecurrenceType {
    SUBSCRIPTION("Subscription"),
    INSTALMENT("Instalment"),
    UNSCHEDULED("Unscheduled"),
    CUSTOMERINITIATED("CustomerInitiated");

    private String value;

    RecurrenceType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RecurrenceType fromValue(String text) {
        for (RecurrenceType b : RecurrenceType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
