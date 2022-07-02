package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Gets or Sets RefundStepAction
 */
public enum RefundStepAction {
    START("Start"),
    PROCESS("Process"),
    CANCEL("Cancel");

    private String value;

    RefundStepAction(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RefundStepAction fromValue(String text) {
        for (RefundStepAction b : RefundStepAction.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
