package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Country;
import io.swagger.model.PhoneNumberType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Address {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("middleName")
    private String middleName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("countryIso3166Alpha2")
    private Country countryIso3166Alpha2 = null;

    @JsonProperty("addressLine1")
    private String addressLine1 = null;

    @JsonProperty("addressLine2")
    private String addressLine2 = null;

    @JsonProperty("zipCode")
    private String zipCode = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("stateProvince")
    private String stateProvince = null;

    @JsonProperty("phoneNumber1")
    private String phoneNumber1 = null;

    @JsonProperty("phoneNumber1Type")
    private PhoneNumberType phoneNumber1Type = null;

    @JsonProperty("phoneNumber2")
    private String phoneNumber2 = null;

    @JsonProperty("phoneNumber2Type")
    private PhoneNumberType phoneNumber2Type = null;

    @JsonProperty("organisation")
    private String organisation = null;

    @JsonProperty("department")
    private String department = null;

    public Address title(String title) {
        this.title = title;
        return this;
    }

    /**
     * A prefix or suffix added to someone's name in certain contexts.  For example \"Mr.\" or \"Ms.\"/\"Mrs.\" for an adult man or woman.  This value is used \"as is\", regardless of the locale specified in the payment job.
     * @return title
     **/
    @Schema(
        description = "A prefix or suffix added to someone's name in certain contexts.  For example \"Mr.\" or \"Ms.\"/\"Mrs.\" for an adult man or woman.  This value is used \"as is\", regardless of the locale specified in the payment job."
    )
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Address firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * The given name of the addressee.
     * @return firstName
     **/
    @Schema(description = "The given name of the addressee.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * The middle part of the name of the addressee.  This is the portion of a personal name that is written between the person's given name and their surname.
     * @return middleName
     **/
    @Schema(
        description = "The middle part of the name of the addressee.  This is the portion of a personal name that is written between the person's given name and their surname."
    )
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The last part of the name of the addressee.  This usually is the person's surname.
     * @return lastName
     **/
    @Schema(description = "The last part of the name of the addressee.  This usually is the person's surname.")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address countryIso3166Alpha2(Country countryIso3166Alpha2) {
        this.countryIso3166Alpha2 = countryIso3166Alpha2;
        return this;
    }

    /**
     * Get countryIso3166Alpha2
     * @return countryIso3166Alpha2
     **/
    @Schema(description = "")
    @Valid
    public Country getCountryIso3166Alpha2() {
        return countryIso3166Alpha2;
    }

    public void setCountryIso3166Alpha2(Country countryIso3166Alpha2) {
        this.countryIso3166Alpha2 = countryIso3166Alpha2;
    }

    public Address addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Primary address information, such as street name and house number.
     * @return addressLine1
     **/
    @Schema(description = "Primary address information, such as street name and house number.")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Address addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Additional address information, such as floor number or apartment number.
     * @return addressLine2
     **/
    @Schema(description = "Additional address information, such as floor number or apartment number.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The zip or postal code.
     * @return zipCode
     **/
    @Schema(description = "The zip or postal code.")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The name of the city.
     * @return city
     **/
    @Schema(description = "The name of the city.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address stateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    /**
     * The name of the state or province.
     * @return stateProvince
     **/
    @Schema(description = "The name of the state or province.")
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Address phoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
        return this;
    }

    /**
     * Primary telephone number of the addressee.
     * @return phoneNumber1
     **/
    @Schema(description = "Primary telephone number of the addressee.")
    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public Address phoneNumber1Type(PhoneNumberType phoneNumber1Type) {
        this.phoneNumber1Type = phoneNumber1Type;
        return this;
    }

    /**
     * Get phoneNumber1Type
     * @return phoneNumber1Type
     **/
    @Schema(description = "")
    @Valid
    public PhoneNumberType getPhoneNumber1Type() {
        return phoneNumber1Type;
    }

    public void setPhoneNumber1Type(PhoneNumberType phoneNumber1Type) {
        this.phoneNumber1Type = phoneNumber1Type;
    }

    public Address phoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
        return this;
    }

    /**
     * Secondary telephone number of the addressee.
     * @return phoneNumber2
     **/
    @Schema(description = "Secondary telephone number of the addressee.")
    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public Address phoneNumber2Type(PhoneNumberType phoneNumber2Type) {
        this.phoneNumber2Type = phoneNumber2Type;
        return this;
    }

    /**
     * Get phoneNumber2Type
     * @return phoneNumber2Type
     **/
    @Schema(description = "")
    @Valid
    public PhoneNumberType getPhoneNumber2Type() {
        return phoneNumber2Type;
    }

    public void setPhoneNumber2Type(PhoneNumberType phoneNumber2Type) {
        this.phoneNumber2Type = phoneNumber2Type;
    }

    public Address organisation(String organisation) {
        this.organisation = organisation;
        return this;
    }

    /**
     * Name of the company or organisation, if the address is a company or organisation.
     * @return organisation
     **/
    @Schema(description = "Name of the company or organisation, if the address is a company or organisation.")
    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public Address department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Name of the department, if the address is a company or organisation.
     * @return department
     **/
    @Schema(description = "Name of the department, if the address is a company or organisation.")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return (
            Objects.equals(this.title, address.title) &&
            Objects.equals(this.firstName, address.firstName) &&
            Objects.equals(this.middleName, address.middleName) &&
            Objects.equals(this.lastName, address.lastName) &&
            Objects.equals(this.countryIso3166Alpha2, address.countryIso3166Alpha2) &&
            Objects.equals(this.addressLine1, address.addressLine1) &&
            Objects.equals(this.addressLine2, address.addressLine2) &&
            Objects.equals(this.zipCode, address.zipCode) &&
            Objects.equals(this.city, address.city) &&
            Objects.equals(this.stateProvince, address.stateProvince) &&
            Objects.equals(this.phoneNumber1, address.phoneNumber1) &&
            Objects.equals(this.phoneNumber1Type, address.phoneNumber1Type) &&
            Objects.equals(this.phoneNumber2, address.phoneNumber2) &&
            Objects.equals(this.phoneNumber2Type, address.phoneNumber2Type) &&
            Objects.equals(this.organisation, address.organisation) &&
            Objects.equals(this.department, address.department)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            firstName,
            middleName,
            lastName,
            countryIso3166Alpha2,
            addressLine1,
            addressLine2,
            zipCode,
            city,
            stateProvince,
            phoneNumber1,
            phoneNumber1Type,
            phoneNumber2,
            phoneNumber2Type,
            organisation,
            department
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    countryIso3166Alpha2: ").append(toIndentedString(countryIso3166Alpha2)).append("\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
        sb.append("    phoneNumber1: ").append(toIndentedString(phoneNumber1)).append("\n");
        sb.append("    phoneNumber1Type: ").append(toIndentedString(phoneNumber1Type)).append("\n");
        sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
        sb.append("    phoneNumber2Type: ").append(toIndentedString(phoneNumber2Type)).append("\n");
        sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
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
