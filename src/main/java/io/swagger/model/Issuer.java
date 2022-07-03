package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * An issuer, such as a bank.
 */
@Schema(description = "An issuer, such as a bank.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
public class Issuer {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    public Issuer id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique identifier for an issuer.  For example a bank identification code (BIC) in case of iDEAL.
     * @return id
     **/
    @Schema(description = "A unique identifier for an issuer.  For example a bank identification code (BIC) in case of iDEAL.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Issuer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the issuer.
     * @return name
     **/
    @Schema(description = "Name of the issuer.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Issuer issuer = (Issuer) o;
        return Objects.equals(this.id, issuer.id) && Objects.equals(this.name, issuer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Issuer {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
