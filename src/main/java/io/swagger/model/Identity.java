package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

/**
 * An object containing information, additional to the address object, such as an email address, gender, and government numbers.
 */
@Schema(
    description = "An object containing information, additional to the address object, such as an email address, gender, and government numbers."
)
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Identity {

    @JsonProperty("debtorId")
    private String debtorId = null;

    @JsonProperty("emailAddress")
    private String emailAddress = null;

    @JsonProperty("gender")
    private Gender gender = null;

    @JsonProperty("dateOfBirth")
    private OffsetDateTime dateOfBirth = null;

    @JsonProperty("socialSecurityNumber")
    private String socialSecurityNumber = null;

    @JsonProperty("chamberOfCommerceNumber")
    private String chamberOfCommerceNumber = null;

    @JsonProperty("vatNumber")
    private String vatNumber = null;

    public Identity debtorId(String debtorId) {
        this.debtorId = debtorId;
        return this;
    }

    /**
     * A reference, unique to the company, to the person this object relates to.  This reference is supplied by the merchant.
     * @return debtorId
     **/
    @Schema(
        description = "A reference, unique to the company, to the person this object relates to.  This reference is supplied by the merchant."
    )
    public String getDebtorId() {
        return debtorId;
    }

    public void setDebtorId(String debtorId) {
        this.debtorId = debtorId;
    }

    public Identity emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Email address of the person this object relates to.
     * @return emailAddress
     **/
    @Schema(description = "Email address of the person this object relates to.")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Identity gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get gender
     * @return gender
     **/
    @Schema(description = "")
    @Valid
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Identity dateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * The date of birth of the person this object relates to.
     * @return dateOfBirth
     **/
    @Schema(description = "The date of birth of the person this object relates to.")
    @Valid
    public OffsetDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Identity socialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * A number, unique to the specified country, identifying the person this object relates to.  This property can for example be used for a nine-digit Social Security number (SSN) for U.S citizens or a burgerservicenummer (BSN) for Dutch citizens.
     * @return socialSecurityNumber
     **/
    @Schema(
        description = "A number, unique to the specified country, identifying the person this object relates to.  This property can for example be used for a nine-digit Social Security number (SSN) for U.S citizens or a burgerservicenummer (BSN) for Dutch citizens."
    )
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Identity chamberOfCommerceNumber(String chamberOfCommerceNumber) {
        this.chamberOfCommerceNumber = chamberOfCommerceNumber;
        return this;
    }

    /**
     * A number, unique to the chamber of commerce of the specified country, identifying the person, organisation or company this object relates to.
     * @return chamberOfCommerceNumber
     **/
    @Schema(
        description = "A number, unique to the chamber of commerce of the specified country, identifying the person, organisation or company this object relates to."
    )
    public String getChamberOfCommerceNumber() {
        return chamberOfCommerceNumber;
    }

    public void setChamberOfCommerceNumber(String chamberOfCommerceNumber) {
        this.chamberOfCommerceNumber = chamberOfCommerceNumber;
    }

    public Identity vatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
        return this;
    }

    /**
     * A globally unique value added tax identification number of the person, organisation or company this object relates to.
     * @return vatNumber
     **/
    @Schema(
        description = "A globally unique value added tax identification number of the person, organisation or company this object relates to."
    )
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Identity identity = (Identity) o;
        return (
            Objects.equals(this.debtorId, identity.debtorId) &&
            Objects.equals(this.emailAddress, identity.emailAddress) &&
            Objects.equals(this.gender, identity.gender) &&
            Objects.equals(this.dateOfBirth, identity.dateOfBirth) &&
            Objects.equals(this.socialSecurityNumber, identity.socialSecurityNumber) &&
            Objects.equals(this.chamberOfCommerceNumber, identity.chamberOfCommerceNumber) &&
            Objects.equals(this.vatNumber, identity.vatNumber)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtorId, emailAddress, gender, dateOfBirth, socialSecurityNumber, chamberOfCommerceNumber, vatNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Identity {\n");

        sb.append("    debtorId: ").append(toIndentedString(debtorId)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
        sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
        sb.append("    chamberOfCommerceNumber: ").append(toIndentedString(chamberOfCommerceNumber)).append("\n");
        sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
