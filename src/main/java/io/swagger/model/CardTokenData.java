package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Customer token data.
 */
@Schema(description = "Customer token data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class CardTokenData {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("cardExpiryMonth")
    private String cardExpiryMonth = null;

    @JsonProperty("cardExpiryYear")
    private String cardExpiryYear = null;

    @JsonProperty("issuerReturnCode")
    private String issuerReturnCode = null;

    @JsonProperty("truncatedCardNumber")
    private String truncatedCardNumber = null;

    public CardTokenData token(String token) {
        this.token = token;
        return this;
    }

    /**
     * The actual token for the tokenised payment data.
     * @return token
     **/
    @Schema(description = "The actual token for the tokenised payment data.")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CardTokenData cardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
        return this;
    }

    /**
     * The payment card’s expiry month.
     * @return cardExpiryMonth
     **/
    @Schema(description = "The payment card’s expiry month.")
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public CardTokenData cardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
        return this;
    }

    /**
     * The payment card’s expiry year as two digits.
     * @return cardExpiryYear
     **/
    @Schema(description = "The payment card’s expiry year as two digits.")
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public CardTokenData issuerReturnCode(String issuerReturnCode) {
        this.issuerReturnCode = issuerReturnCode;
        return this;
    }

    /**
     * Card issuer’s alphanumeric response code (where available).
     * @return issuerReturnCode
     **/
    @Schema(description = "Card issuer’s alphanumeric response code (where available).")
    public String getIssuerReturnCode() {
        return issuerReturnCode;
    }

    public void setIssuerReturnCode(String issuerReturnCode) {
        this.issuerReturnCode = issuerReturnCode;
    }

    public CardTokenData truncatedCardNumber(String truncatedCardNumber) {
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
        CardTokenData cardTokenData = (CardTokenData) o;
        return (
            Objects.equals(this.token, cardTokenData.token) &&
            Objects.equals(this.cardExpiryMonth, cardTokenData.cardExpiryMonth) &&
            Objects.equals(this.cardExpiryYear, cardTokenData.cardExpiryYear) &&
            Objects.equals(this.issuerReturnCode, cardTokenData.issuerReturnCode) &&
            Objects.equals(this.truncatedCardNumber, cardTokenData.truncatedCardNumber)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, cardExpiryMonth, cardExpiryYear, issuerReturnCode, truncatedCardNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardTokenData {\n");

        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
        sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
        sb.append("    issuerReturnCode: ").append(toIndentedString(issuerReturnCode)).append("\n");
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
