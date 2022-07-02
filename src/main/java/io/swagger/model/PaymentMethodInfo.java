package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.CardTokenData;
import io.swagger.model.Currency;
import io.swagger.model.Issuer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Object containing details about a payment method.
 */
@Schema(description = "Object containing details about a payment method.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class PaymentMethodInfo {

    @JsonProperty("paymentMethod")
    private String paymentMethod = null;

    @JsonProperty("logo")
    private String logo = null;

    @JsonProperty("issuerList")
    @Valid
    private List<Issuer> issuerList = null;

    @JsonProperty("supportsTokenisation")
    private Boolean supportsTokenisation = null;

    @JsonProperty("tokenizedCards")
    @Valid
    private List<CardTokenData> tokenizedCards = null;

    @JsonProperty("currencies")
    @Valid
    private List<Currency> currencies = new ArrayList<Currency>();

    @JsonProperty("surchargeAmount")
    private Double surchargeAmount = null;

    @JsonProperty("surchargeAmountExclVat")
    private Double surchargeAmountExclVat = null;

    @JsonProperty("surchargeAmountVat")
    private Double surchargeAmountVat = null;

    @JsonProperty("surchargeVatPercentage")
    private Double surchargeVatPercentage = null;

    @JsonProperty("description")
    private String description = null;

    public PaymentMethodInfo paymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * The payment method.
     * @return paymentMethod
     **/
    @Schema(required = true, description = "The payment method.")
    @NotNull
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethodInfo logo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * The logo of this payment method.
     * @return logo
     **/
    @Schema(description = "The logo of this payment method.")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public PaymentMethodInfo issuerList(List<Issuer> issuerList) {
        this.issuerList = issuerList;
        return this;
    }

    public PaymentMethodInfo addIssuerListItem(Issuer issuerListItem) {
        if (this.issuerList == null) {
            this.issuerList = new ArrayList<Issuer>();
        }
        this.issuerList.add(issuerListItem);
        return this;
    }

    /**
     * List of supported issuers for this payment method.
     * @return issuerList
     **/
    @Schema(description = "List of supported issuers for this payment method.")
    @Valid
    public List<Issuer> getIssuerList() {
        return issuerList;
    }

    public void setIssuerList(List<Issuer> issuerList) {
        this.issuerList = issuerList;
    }

    public PaymentMethodInfo supportsTokenisation(Boolean supportsTokenisation) {
        this.supportsTokenisation = supportsTokenisation;
        return this;
    }

    /**
     * Flag that indicates whether or not the payment method supports tokenisation.
     * @return supportsTokenisation
     **/
    @Schema(description = "Flag that indicates whether or not the payment method supports tokenisation.")
    public Boolean isSupportsTokenisation() {
        return supportsTokenisation;
    }

    public void setSupportsTokenisation(Boolean supportsTokenisation) {
        this.supportsTokenisation = supportsTokenisation;
    }

    public PaymentMethodInfo tokenizedCards(List<CardTokenData> tokenizedCards) {
        this.tokenizedCards = tokenizedCards;
        return this;
    }

    public PaymentMethodInfo addTokenizedCardsItem(CardTokenData tokenizedCardsItem) {
        if (this.tokenizedCards == null) {
            this.tokenizedCards = new ArrayList<CardTokenData>();
        }
        this.tokenizedCards.add(tokenizedCardsItem);
        return this;
    }

    /**
     * A list of cards that are tokenized.
     * @return tokenizedCards
     **/
    @Schema(description = "A list of cards that are tokenized.")
    @Valid
    public List<CardTokenData> getTokenizedCards() {
        return tokenizedCards;
    }

    public void setTokenizedCards(List<CardTokenData> tokenizedCards) {
        this.tokenizedCards = tokenizedCards;
    }

    public PaymentMethodInfo currencies(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    public PaymentMethodInfo addCurrenciesItem(Currency currenciesItem) {
        this.currencies.add(currenciesItem);
        return this;
    }

    /**
     * Supported currencies for this payment method.
     * @return currencies
     **/
    @Schema(required = true, description = "Supported currencies for this payment method.")
    @NotNull
    @Valid
    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public PaymentMethodInfo surchargeAmount(Double surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
        return this;
    }

    /**
     * Amount on top of the amount to collect, for the use of this payment method, including value-added tax.
     * @return surchargeAmount
     **/
    @Schema(description = "Amount on top of the amount to collect, for the use of this payment method, including value-added tax.")
    public Double getSurchargeAmount() {
        return surchargeAmount;
    }

    public void setSurchargeAmount(Double surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    public PaymentMethodInfo surchargeAmountExclVat(Double surchargeAmountExclVat) {
        this.surchargeAmountExclVat = surchargeAmountExclVat;
        return this;
    }

    /**
     * Amount on top of the amount to collect, for the use of this payment method, excluding value-added tax.
     * @return surchargeAmountExclVat
     **/
    @Schema(description = "Amount on top of the amount to collect, for the use of this payment method, excluding value-added tax.")
    public Double getSurchargeAmountExclVat() {
        return surchargeAmountExclVat;
    }

    public void setSurchargeAmountExclVat(Double surchargeAmountExclVat) {
        this.surchargeAmountExclVat = surchargeAmountExclVat;
    }

    public PaymentMethodInfo surchargeAmountVat(Double surchargeAmountVat) {
        this.surchargeAmountVat = surchargeAmountVat;
        return this;
    }

    /**
     * The amount of value-added tax in the surcharge amount.
     * @return surchargeAmountVat
     **/
    @Schema(description = "The amount of value-added tax in the surcharge amount.")
    public Double getSurchargeAmountVat() {
        return surchargeAmountVat;
    }

    public void setSurchargeAmountVat(Double surchargeAmountVat) {
        this.surchargeAmountVat = surchargeAmountVat;
    }

    public PaymentMethodInfo surchargeVatPercentage(Double surchargeVatPercentage) {
        this.surchargeVatPercentage = surchargeVatPercentage;
        return this;
    }

    /**
     * The surcharge vat percentage.
     * @return surchargeVatPercentage
     **/
    @Schema(description = "The surcharge vat percentage.")
    public Double getSurchargeVatPercentage() {
        return surchargeVatPercentage;
    }

    public void setSurchargeVatPercentage(Double surchargeVatPercentage) {
        this.surchargeVatPercentage = surchargeVatPercentage;
    }

    public PaymentMethodInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description about this payment method.
     * @return description
     **/
    @Schema(description = "A description about this payment method.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) o;
        return (
            Objects.equals(this.paymentMethod, paymentMethodInfo.paymentMethod) &&
            Objects.equals(this.logo, paymentMethodInfo.logo) &&
            Objects.equals(this.issuerList, paymentMethodInfo.issuerList) &&
            Objects.equals(this.supportsTokenisation, paymentMethodInfo.supportsTokenisation) &&
            Objects.equals(this.tokenizedCards, paymentMethodInfo.tokenizedCards) &&
            Objects.equals(this.currencies, paymentMethodInfo.currencies) &&
            Objects.equals(this.surchargeAmount, paymentMethodInfo.surchargeAmount) &&
            Objects.equals(this.surchargeAmountExclVat, paymentMethodInfo.surchargeAmountExclVat) &&
            Objects.equals(this.surchargeAmountVat, paymentMethodInfo.surchargeAmountVat) &&
            Objects.equals(this.surchargeVatPercentage, paymentMethodInfo.surchargeVatPercentage) &&
            Objects.equals(this.description, paymentMethodInfo.description)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethod,
            logo,
            issuerList,
            supportsTokenisation,
            tokenizedCards,
            currencies,
            surchargeAmount,
            surchargeAmountExclVat,
            surchargeAmountVat,
            surchargeVatPercentage,
            description
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethodInfo {\n");

        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    issuerList: ").append(toIndentedString(issuerList)).append("\n");
        sb.append("    supportsTokenisation: ").append(toIndentedString(supportsTokenisation)).append("\n");
        sb.append("    tokenizedCards: ").append(toIndentedString(tokenizedCards)).append("\n");
        sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
        sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
        sb.append("    surchargeAmountExclVat: ").append(toIndentedString(surchargeAmountExclVat)).append("\n");
        sb.append("    surchargeAmountVat: ").append(toIndentedString(surchargeAmountVat)).append("\n");
        sb.append("    surchargeVatPercentage: ").append(toIndentedString(surchargeVatPercentage)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
