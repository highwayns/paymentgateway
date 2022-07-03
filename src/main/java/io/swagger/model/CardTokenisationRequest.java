package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * The request object for creating a new card tokenisation.
 */
@Schema(description = "The request object for creating a new card tokenisation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class CardTokenisationRequest {

    @JsonProperty("cardNumber")
    private String cardNumber = null;

    @JsonProperty("cardHolderName")
    private String cardHolderName = null;

    @JsonProperty("cardExpiryYear")
    private String cardExpiryYear = null;

    @JsonProperty("cardExpiryMonth")
    private String cardExpiryMonth = null;

    @JsonProperty("cardCvc")
    private String cardCvc = null;

    public CardTokenisationRequest cardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * The card number to be tokenised.
     * @return cardNumber
     **/
    @Schema(description = "The card number to be tokenised.")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardTokenisationRequest cardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        return this;
    }

    /**
     * Get cardHolderName
     * @return cardHolderName
     **/
    @Schema(required = true, description = "")
    @NotNull
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public CardTokenisationRequest cardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
        return this;
    }

    /**
     * Year in 2 digit format YY.
     * @return cardExpiryYear
     **/
    @Schema(required = true, description = "Year in 2 digit format YY.")
    @NotNull
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public CardTokenisationRequest cardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
        return this;
    }

    /**
     * Month in format MM {01-12}.
     * @return cardExpiryMonth
     **/
    @Schema(required = true, description = "Month in format MM {01-12}.")
    @NotNull
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public CardTokenisationRequest cardCvc(String cardCvc) {
        this.cardCvc = cardCvc;
        return this;
    }

    /**
     * Security code of the card.
     * @return cardCvc
     **/
    @Schema(required = true, description = "Security code of the card.")
    @NotNull
    public String getCardCvc() {
        return cardCvc;
    }

    public void setCardCvc(String cardCvc) {
        this.cardCvc = cardCvc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardTokenisationRequest cardTokenisationRequest = (CardTokenisationRequest) o;
        return (
            Objects.equals(this.cardNumber, cardTokenisationRequest.cardNumber) &&
            Objects.equals(this.cardHolderName, cardTokenisationRequest.cardHolderName) &&
            Objects.equals(this.cardExpiryYear, cardTokenisationRequest.cardExpiryYear) &&
            Objects.equals(this.cardExpiryMonth, cardTokenisationRequest.cardExpiryMonth) &&
            Objects.equals(this.cardCvc, cardTokenisationRequest.cardCvc)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardHolderName, cardExpiryYear, cardExpiryMonth, cardCvc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardTokenisationRequest {\n");

        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
        sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
        sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
        sb.append("    cardCvc: ").append(toIndentedString(cardCvc)).append("\n");
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
