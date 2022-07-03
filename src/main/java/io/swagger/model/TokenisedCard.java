package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Tokenisation response.
 */
@Schema(description = "Tokenisation response.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class TokenisedCard {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("cardExpiryMonth")
    private String cardExpiryMonth = null;

    @JsonProperty("cardExpiryYear")
    private String cardExpiryYear = null;

    @JsonProperty("truncatedCardNumber")
    private String truncatedCardNumber = null;

    public TokenisedCard token(String token) {
        this.token = token;
        return this;
    }

    /**
     * The created token.
     * @return token
     **/
    @Schema(description = "The created token.")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenisedCard cardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
        return this;
    }

    /**
     * The expiry month { 01 - 12 }.
     * @return cardExpiryMonth
     **/
    @Schema(description = "The expiry month { 01 - 12 }.")
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public TokenisedCard cardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
        return this;
    }

    /**
     * The expiry year (abbreviated to 2 digits).
     * @return cardExpiryYear
     **/
    @Schema(description = "The expiry year (abbreviated to 2 digits).")
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public TokenisedCard truncatedCardNumber(String truncatedCardNumber) {
        this.truncatedCardNumber = truncatedCardNumber;
        return this;
    }

    /**
     * The truncated card number.
     * @return truncatedCardNumber
     **/
    @Schema(description = "The truncated card number.")
    public String getTruncatedCardNumber() {
        return truncatedCardNumber;
    }

    public void setTruncatedCardNumber(String truncatedCardNumber) {
        this.truncatedCardNumber = truncatedCardNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenisedCard tokenisedCard = (TokenisedCard) o;
        return (
            Objects.equals(this.token, tokenisedCard.token) &&
            Objects.equals(this.cardExpiryMonth, tokenisedCard.cardExpiryMonth) &&
            Objects.equals(this.cardExpiryYear, tokenisedCard.cardExpiryYear) &&
            Objects.equals(this.truncatedCardNumber, tokenisedCard.truncatedCardNumber)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, cardExpiryMonth, cardExpiryYear, truncatedCardNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenisedCard {\n");

        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
        sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
        sb.append("    truncatedCardNumber: ").append(toIndentedString(truncatedCardNumber)).append("\n");
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
