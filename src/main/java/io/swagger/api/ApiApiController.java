package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.CapturePaymentRequest;
import io.swagger.model.CapturePaymentResponse;
import io.swagger.model.CardTokenisationRequest;
import io.swagger.model.CardTokenisationResponse;
import io.swagger.model.CreatePaymentJobRequest;
import io.swagger.model.Currency;
import io.swagger.model.ErrorResponse;
import io.swagger.model.Locale;
import io.swagger.model.PaymentJobResponse;
import io.swagger.model.PaymentResponse;
import io.swagger.model.RefundPaymentRequest;
import io.swagger.model.RefundPaymentResponse;
import io.swagger.model.SupportedPaymentMethodsResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-03T01:14:53.240Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CardTokenisationResponse> apiGatewayCardTokenisationPost(
        @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "locale",
            required = false
        ) Locale locale,
        @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema) @Valid @RequestBody CardTokenisationRequest body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CardTokenisationResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Token\" : \"1000000000030419\",\n    \"CardExpiryMonth\" : \"10\",\n    \"CardExpiryYear\" : \"21\",\n    \"TruncatedCardNumber\" : \"400000****0002\"\n  }\n}",
                        CardTokenisationResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CardTokenisationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CardTokenisationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentJobResponse> apiGatewayPaymentJobsPaymentJobReferenceCancelPatch(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job to cancel.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "A hexadecimal sha512 hash of your password.", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentJobResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190721000461508600,\n    \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n    \"Type\" : 0,\n    \"TraceReference\" : 190720104714528770,\n    \"ConfigurationId\" : \"12345\",\n    \"Domain\" : \"paycheckout.com\",\n    \"Locale\" : 2057,\n    \"TimeZone\" : \"Europe/London\",\n    \"Order\" : {\n      \"OrderNumber\" : \"2019-03-18/1001\",\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n      \"CustomerReference\" : 190729000042078200,\n      \"BillingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"MiddleName\" : \"Van\",\n        \"LastName\" : \"Dijk\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Business Centre Road\",\n        \"AddressLine2\" : \"Unit 7\",\n        \"ZipCode\" : \"XX12 1XX\",\n        \"City\" : \"TestCity\",\n        \"PhoneNumber1\" : \"+44 9999 123456\",\n        \"PhoneNumber1Type\" : 20,\n        \"PhoneNumber2\" : \"+44 8888 123456\",\n        \"PhoneNumber2Type\" : 0,\n        \"Organisation\" : \"Sample Business Ltd\"\n      },\n      \"BillingIdentity\" : {\n        \"DebtorId\" : \"debtorId\",\n        \"EmailAddress\" : \"John.Doe@example.com\",\n        \"Gender\" : 1\n      },\n      \"ShippingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"LastName\" : \"Doe\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Addressline1\",\n        \"AddressLine2\" : \"Addressline2\",\n        \"ZipCode\" : \"XX21 5XX\",\n        \"City\" : \"Cambridge\",\n        \"PhoneNumber1\" : \"+44 9999 000000\",\n        \"PhoneNumber1Type\" : 20,\n        \"Organisation\" : \"TestCompany\"\n      },\n      \"OrderLines\" : [ {\n        \"LineNumber\" : 1,\n        \"Type\" : 0,\n        \"SkuCode\" : \"1234567890123\",\n        \"Name\" : \"Bike\",\n        \"Quantity\" : 1.1,\n        \"UnitPriceExclVat\" : 100,\n        \"UnitPriceInclVat\" : 121,\n        \"VatPercentage\" : 21,\n        \"VatPercentageLabel\" : \"Vat 21%\",\n        \"DiscountPercentageLabel\" : \"discount 6%\",\n        \"TotalLineAmount\" : 121\n      } ]\n    },\n    \"PaymentMethodsToUse\" : [ \"Card\", \"PayPal\" ],\n    \"Currency\" : 826,\n    \"AmountToCollect\" : 121,\n    \"ExpirationDateTimeUtc\" : \"2020-01-12T10:22:04.18Z\",\n    \"DueDateTimeUtc\" : \"2020-07-12T11:22:04.18Z\",\n    \"LastUpdateTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"LastProcessedTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"Attributes\" : {\n      \"WebhookUrl\" : \"http://internal-dev-private-165961934.eu-west-1.elb.amazonaws.com/notifier/api/notifier-test\"\n    },\n    \"PaymentStatus\" : 10,\n    \"Payments\" : [ {\n      \"Reference\" : 190721100444600320,\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n      \"PaymentMethods\" : [ \"Card\", \"PayPal\" ],\n      \"Status\" : 10,\n      \"AbuseReport\" : {\n        \"Score\" : 46,\n        \"Triggers\" : [ {\n          \"Score\" : 0,\n          \"Code\" : \"I\",\n          \"Description\" : \"Internet inconsistencies. The IP address and email domain are not consistent with the billing address.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"Q\",\n          \"Description\" : \"Phone inconsistencies. The customer’s phone number is suspicious.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"V\",\n          \"Description\" : \"Velocity. The account number was used many times in the past 15 minutes.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"COR-BA\",\n          \"Description\" : \"The billing address has corrected elements or can be normalized.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-BA\",\n          \"Description\" : \"The billing country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-SA\",\n          \"Description\" : \"The shipping country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-IP\",\n          \"Description\" : \"The IP address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-SA\",\n          \"Description\" : \"The shipping address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-IP\",\n          \"Description\" : \"The IP address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-SA\",\n          \"Description\" : \"The shipping address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-IPCO\",\n          \"Description\" : \"The country of the customer’s IP address is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"CS_GLOBAL\",\n          \"Description\" : \"Global score from CyberSource.\",\n          \"Parameters\" : [ ]\n        } ],\n        \"CreatedDateTimeUtc\" : \"2019-08-23T09:53:45.188Z\"\n      },\n      \"AmountToCollect\" : 121,\n      \"Steps\" : [ {\n        \"Reference\" : 190721221516783600,\n        \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n        \"Action\" : 100,\n        \"PaymentMethods\" : [ 3, 2 ],\n        \"Status\" : 10,\n        \"AmountToCollect\" : 121\n      } ],\n      \"Attributes\" : {\n        \"ReturnUrlSuccess\" : \"https://www.example.com?status=success&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlFailed\" : \"https://www.example.com?status=failed&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlCancelled\" : \"https://www.example.com?status=cancelled&status=cancelled&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\"\n      }\n    } ]\n  },\n  \"Links\" : {\n    \"Data\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/api/gateway/payment-jobs/190721000461508616\",\n      \"Type\" : \"application/json\"\n    },\n    \"Action\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/payment?ref=4d28fe4d70398af4c041eaadd657e605bcaed35422030a70dd593a834b04d61dd7bad0fa073af78290f56fd7c994b7c2\",\n      \"Type\" : \"text/html\"\n    }\n  }\n}",
                        PaymentJobResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentJobResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentJobResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentJobResponse> apiGatewayPaymentJobsPaymentJobReferenceGet(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job to retrieve.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "A hexadecimal sha512 hash of your password.", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentJobResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190721000461508600,\n    \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n    \"Type\" : 0,\n    \"TraceReference\" : 190720104714528770,\n    \"ConfigurationId\" : \"12345\",\n    \"Domain\" : \"paycheckout.com\",\n    \"Locale\" : 2057,\n    \"TimeZone\" : \"Europe/London\",\n    \"Order\" : {\n      \"OrderNumber\" : \"2019-03-18/1001\",\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n      \"CustomerReference\" : 190729000042078200,\n      \"BillingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"MiddleName\" : \"Van\",\n        \"LastName\" : \"Dijk\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Business Centre Road\",\n        \"AddressLine2\" : \"Unit 7\",\n        \"ZipCode\" : \"XX12 1XX\",\n        \"City\" : \"TestCity\",\n        \"PhoneNumber1\" : \"+44 9999 123456\",\n        \"PhoneNumber1Type\" : 20,\n        \"PhoneNumber2\" : \"+44 8888 123456\",\n        \"PhoneNumber2Type\" : 0,\n        \"Organisation\" : \"Sample Business Ltd\"\n      },\n      \"BillingIdentity\" : {\n        \"DebtorId\" : \"debtorId\",\n        \"EmailAddress\" : \"John.Doe@example.com\",\n        \"Gender\" : 1\n      },\n      \"ShippingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"LastName\" : \"Doe\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Addressline1\",\n        \"AddressLine2\" : \"Addressline2\",\n        \"ZipCode\" : \"XX21 5XX\",\n        \"City\" : \"Cambridge\",\n        \"PhoneNumber1\" : \"+44 9999 000000\",\n        \"PhoneNumber1Type\" : 20,\n        \"Organisation\" : \"TestCompany\"\n      },\n      \"OrderLines\" : [ {\n        \"LineNumber\" : 1,\n        \"Type\" : 0,\n        \"SkuCode\" : \"1234567890123\",\n        \"Name\" : \"Bike\",\n        \"Quantity\" : 1.1,\n        \"UnitPriceExclVat\" : 100,\n        \"UnitPriceInclVat\" : 121,\n        \"VatPercentage\" : 21,\n        \"VatPercentageLabel\" : \"Vat 21%\",\n        \"DiscountPercentageLabel\" : \"discount 6%\",\n        \"TotalLineAmount\" : 121\n      } ]\n    },\n    \"PaymentMethodsToUse\" : [ \"Card\", \"PayPal\" ],\n    \"Currency\" : 826,\n    \"AmountToCollect\" : 121,\n    \"ExpirationDateTimeUtc\" : \"2020-01-12T10:22:04.18Z\",\n    \"DueDateTimeUtc\" : \"2020-07-12T11:22:04.18Z\",\n    \"LastUpdateTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"LastProcessedTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"Attributes\" : {\n      \"WebhookUrl\" : \"http://internal-dev-private-165961934.eu-west-1.elb.amazonaws.com/notifier/api/notifier-test\"\n    },\n    \"PaymentStatus\" : 10,\n    \"Payments\" : [ {\n      \"Reference\" : 190721100444600320,\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n      \"PaymentMethods\" : [ \"Card\", \"PayPal\" ],\n      \"Status\" : 10,\n      \"AbuseReport\" : {\n        \"Score\" : 46,\n        \"Triggers\" : [ {\n          \"Score\" : 0,\n          \"Code\" : \"I\",\n          \"Description\" : \"Internet inconsistencies. The IP address and email domain are not consistent with the billing address.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"Q\",\n          \"Description\" : \"Phone inconsistencies. The customer’s phone number is suspicious.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"V\",\n          \"Description\" : \"Velocity. The account number was used many times in the past 15 minutes.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"COR-BA\",\n          \"Description\" : \"The billing address has corrected elements or can be normalized.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-BA\",\n          \"Description\" : \"The billing country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-SA\",\n          \"Description\" : \"The shipping country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-IP\",\n          \"Description\" : \"The IP address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-SA\",\n          \"Description\" : \"The shipping address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-IP\",\n          \"Description\" : \"The IP address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-SA\",\n          \"Description\" : \"The shipping address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-IPCO\",\n          \"Description\" : \"The country of the customer’s IP address is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"CS_GLOBAL\",\n          \"Description\" : \"Global score from CyberSource.\",\n          \"Parameters\" : [ ]\n        } ],\n        \"CreatedDateTimeUtc\" : \"2019-08-23T09:53:45.188Z\"\n      },\n      \"AmountToCollect\" : 121,\n      \"Steps\" : [ {\n        \"Reference\" : 190721221516783600,\n        \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n        \"Action\" : 100,\n        \"PaymentMethods\" : [ 3, 2 ],\n        \"Status\" : 10,\n        \"AmountToCollect\" : 121\n      } ],\n      \"Attributes\" : {\n        \"ReturnUrlSuccess\" : \"https://www.example.com?status=success&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlFailed\" : \"https://www.example.com?status=failed&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlCancelled\" : \"https://www.example.com?status=cancelled&status=cancelled&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\"\n      }\n    } ]\n  },\n  \"Links\" : {\n    \"Data\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/api/gateway/payment-jobs/190721000461508616\",\n      \"Type\" : \"application/json\"\n    },\n    \"Action\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/payment?ref=4d28fe4d70398af4c041eaadd657e605bcaed35422030a70dd593a834b04d61dd7bad0fa073af78290f56fd7c994b7c2\",\n      \"Type\" : \"text/html\"\n    }\n  }\n}",
                        PaymentJobResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentJobResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentJobResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentResponse> apiGatewayPaymentJobsPaymentJobReferencePaymentsPaymentReferenceCancelPatch(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job which payment to cancel.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment to cancel.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentReference") Long paymentReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "A hexadecimal sha512 hash of your password.", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190721100444600320,\n    \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.439Z\",\n    \"PaymentMethods\" : [ \"Card\", \"PayPal\" ],\n    \"Status\" : 9100,\n    \"AbuseReport\" : {\n      \"Score\" : 46,\n      \"Triggers\" : [ {\n        \"Score\" : 0,\n        \"Code\" : \"I\",\n        \"Description\" : \"Internet inconsistencies. The IP address and email domain are not consistent with the billing address.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"Q\",\n        \"Description\" : \"Phone inconsistencies. The customer’s phone number is suspicious.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"V\",\n        \"Description\" : \"Velocity. The account number was used many times in the past 15 minutes.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"COR-BA\",\n        \"Description\" : \"The billing address has corrected elements or can be normalized.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-BA\",\n        \"Description\" : \"The billing country is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-SA\",\n        \"Description\" : \"The shipping country is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELL-IP\",\n        \"Description\" : \"The IP address has been used several times during the long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELL-SA\",\n        \"Description\" : \"The shipping address has been used several times during the long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELV-IP\",\n        \"Description\" : \"The IP address has been used several times during the very long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELV-SA\",\n        \"Description\" : \"The shipping address has been used several times during the very long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-IPCO\",\n        \"Description\" : \"The country of the customer’s IP address is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 46,\n        \"Code\" : \"CS_GLOBAL\",\n        \"Description\" : \"Global score from CyberSource.\",\n        \"Parameters\" : [ ]\n      } ],\n      \"CreatedDateTimeUtc\" : \"2019-08-23T09:53:45.188Z\"\n    },\n    \"AmountToCollect\" : 121,\n    \"Steps\" : [ {\n      \"Reference\" : 190721221516783600,\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.439Z\",\n      \"Action\" : 100,\n      \"PaymentMethods\" : [ 3, 2 ],\n      \"Status\" : 10,\n      \"AmountToCollect\" : 121\n    } ],\n    \"Attributes\" : {\n      \"ReturnUrlSuccess\" : \"https://www.example.com?status=success&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n      \"ReturnUrlFailed\" : \"https://www.example.com?status=failed&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n      \"ReturnUrlCancelled\" : \"https://www.example.com?status=cancelled&status=cancelled&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\"\n    }\n  },\n  \"Links\" : {\n    \"Data\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/api/gateway/payment-jobs/190721000461508616/payments/190721100444600320\",\n      \"Type\" : \"application/json\"\n    }\n  }\n}",
                        PaymentResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CapturePaymentResponse> apiGatewayPaymentJobsPaymentJobReferencePaymentsPaymentReferenceCapturesPost(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job which payment to capture.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment to create a capture for.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentReference") Long paymentReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(
            in = ParameterIn.HEADER,
            description = "A hexadecimal sha512 hash of your password + the body.",
            schema = @Schema
        ) @RequestHeader(value = "hash", required = false) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale,
        @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema) @Valid @RequestBody CapturePaymentRequest body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CapturePaymentResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190723517188388860,\n    \"CreateDateTimeUtc\" : \"2022-05-03T01:03:54.1096767Z\",\n    \"Status\" : 9010,\n    \"AmountToCapture\" : 121,\n    \"IsFinalCapture\" : false\n  }\n}",
                        CapturePaymentResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CapturePaymentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CapturePaymentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentResponse> apiGatewayPaymentJobsPaymentJobReferencePaymentsPaymentReferenceGet(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job which payment to retrieve.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment to retrieve.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentReference") Long paymentReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "A hexadecimal sha512 hash of your password.", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190721100444600320,\n    \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.439Z\",\n    \"PaymentMethods\" : [ \"Card\", \"PayPal\" ],\n    \"Status\" : 9100,\n    \"AbuseReport\" : {\n      \"Score\" : 46,\n      \"Triggers\" : [ {\n        \"Score\" : 0,\n        \"Code\" : \"I\",\n        \"Description\" : \"Internet inconsistencies. The IP address and email domain are not consistent with the billing address.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"Q\",\n        \"Description\" : \"Phone inconsistencies. The customer’s phone number is suspicious.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"V\",\n        \"Description\" : \"Velocity. The account number was used many times in the past 15 minutes.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"COR-BA\",\n        \"Description\" : \"The billing address has corrected elements or can be normalized.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-BA\",\n        \"Description\" : \"The billing country is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-SA\",\n        \"Description\" : \"The shipping country is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELL-IP\",\n        \"Description\" : \"The IP address has been used several times during the long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELL-SA\",\n        \"Description\" : \"The shipping address has been used several times during the long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELV-IP\",\n        \"Description\" : \"The IP address has been used several times during the very long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"VELV-SA\",\n        \"Description\" : \"The shipping address has been used several times during the very long tracking interval.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 0,\n        \"Code\" : \"INTL-IPCO\",\n        \"Description\" : \"The country of the customer’s IP address is outside of the U.S.\",\n        \"Parameters\" : [ ]\n      }, {\n        \"Score\" : 46,\n        \"Code\" : \"CS_GLOBAL\",\n        \"Description\" : \"Global score from CyberSource.\",\n        \"Parameters\" : [ ]\n      } ],\n      \"CreatedDateTimeUtc\" : \"2019-08-23T09:53:45.188Z\"\n    },\n    \"AmountToCollect\" : 121,\n    \"Steps\" : [ {\n      \"Reference\" : 190721221516783600,\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.439Z\",\n      \"Action\" : 100,\n      \"PaymentMethods\" : [ 3, 2 ],\n      \"Status\" : 10,\n      \"AmountToCollect\" : 121\n    } ],\n    \"Attributes\" : {\n      \"ReturnUrlSuccess\" : \"https://www.example.com?status=success&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n      \"ReturnUrlFailed\" : \"https://www.example.com?status=failed&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n      \"ReturnUrlCancelled\" : \"https://www.example.com?status=cancelled&status=cancelled&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\"\n    }\n  },\n  \"Links\" : {\n    \"Data\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/api/gateway/payment-jobs/190721000461508616/payments/190721100444600320\",\n      \"Type\" : \"application/json\"\n    }\n  }\n}",
                        PaymentResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RefundPaymentResponse> apiGatewayPaymentJobsPaymentJobReferencePaymentsPaymentReferenceRefundsPost(
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment job which payment to refund.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentJobReference") Long paymentJobReference,
        @Parameter(
            in = ParameterIn.PATH,
            description = "The reference of the payment to create a refund for.",
            required = true,
            schema = @Schema
        ) @PathVariable("paymentReference") Long paymentReference,
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(
            in = ParameterIn.HEADER,
            description = "A hexadecimal sha512 hash of your password + the body.",
            schema = @Schema
        ) @RequestHeader(value = "hash", required = false) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale,
        @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema) @Valid @RequestBody RefundPaymentRequest body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RefundPaymentResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190723017339252740,\n    \"CreateDateTimeUtc\" : \"2019-07-12T12:14:47.896Z\",\n    \"RefundNumber\" : \"1234\",\n    \"Status\" : 9010,\n    \"AmountToRefund\" : 0.85,\n    \"Steps\" : [ {\n      \"Reference\" : 190723117330864130,\n      \"CreateDateTimeUtc\" : \"2019-07-12T12:14:47.896Z\",\n      \"Action\" : 100,\n      \"Status\" : 9010\n    } ]\n  }\n}",
                        RefundPaymentResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RefundPaymentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RefundPaymentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentJobResponse> apiGatewayPaymentJobsPost(
        @Parameter(in = ParameterIn.HEADER, description = "Your configuration ID.", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(
            in = ParameterIn.HEADER,
            description = "A hexadecimal sha512 hash of your password + the body.",
            schema = @Schema
        ) @RequestHeader(value = "hash", required = false) String hash,
        @Parameter(
            in = ParameterIn.QUERY,
            description = "The locale to translate errors and warnings to.",
            schema = @Schema
        ) @Valid @RequestParam(value = "locale", required = false) Locale locale,
        @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema) @Valid @RequestBody CreatePaymentJobRequest body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentJobResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : {\n    \"Reference\" : 190721000461508600,\n    \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n    \"Type\" : 0,\n    \"TraceReference\" : 190720104714528770,\n    \"ConfigurationId\" : \"12345\",\n    \"Domain\" : \"paycheckout.com\",\n    \"Locale\" : 2057,\n    \"TimeZone\" : \"Europe/London\",\n    \"Order\" : {\n      \"OrderNumber\" : \"2019-03-18/1001\",\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.18Z\",\n      \"CustomerReference\" : 190729000042078200,\n      \"BillingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"MiddleName\" : \"Van\",\n        \"LastName\" : \"Dijk\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Business Centre Road\",\n        \"AddressLine2\" : \"Unit 7\",\n        \"ZipCode\" : \"XX12 1XX\",\n        \"City\" : \"TestCity\",\n        \"PhoneNumber1\" : \"+44 9999 123456\",\n        \"PhoneNumber1Type\" : 20,\n        \"PhoneNumber2\" : \"+44 8888 123456\",\n        \"PhoneNumber2Type\" : 0,\n        \"Organisation\" : \"Sample Business Ltd\"\n      },\n      \"BillingIdentity\" : {\n        \"DebtorId\" : \"debtorId\",\n        \"EmailAddress\" : \"John.Doe@example.com\",\n        \"Gender\" : 1\n      },\n      \"ShippingAddress\" : {\n        \"Title\" : \"Mr.\",\n        \"FirstName\" : \"John\",\n        \"LastName\" : \"Doe\",\n        \"CountryIso3166Alpha2\" : 826,\n        \"AddressLine1\" : \"Addressline1\",\n        \"AddressLine2\" : \"Addressline2\",\n        \"ZipCode\" : \"XX21 5XX\",\n        \"City\" : \"Cambridge\",\n        \"PhoneNumber1\" : \"+44 9999 000000\",\n        \"PhoneNumber1Type\" : 20,\n        \"Organisation\" : \"TestCompany\"\n      },\n      \"OrderLines\" : [ {\n        \"LineNumber\" : 1,\n        \"Type\" : 0,\n        \"SkuCode\" : \"1234567890123\",\n        \"Name\" : \"Bike\",\n        \"Quantity\" : 1.1,\n        \"UnitPriceExclVat\" : 100,\n        \"UnitPriceInclVat\" : 121,\n        \"VatPercentage\" : 21,\n        \"VatPercentageLabel\" : \"Vat 21%\",\n        \"DiscountPercentageLabel\" : \"discount 6%\",\n        \"TotalLineAmount\" : 121\n      } ]\n    },\n    \"PaymentMethodsToUse\" : [ \"Card\", \"PayPal\" ],\n    \"Currency\" : 826,\n    \"AmountToCollect\" : 121,\n    \"ExpirationDateTimeUtc\" : \"2020-01-12T10:22:04.18Z\",\n    \"DueDateTimeUtc\" : \"2020-07-12T11:22:04.18Z\",\n    \"LastUpdateTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"LastProcessedTimeUtc\" : \"2020-07-12T10:22:04.18Z\",\n    \"Attributes\" : {\n      \"WebhookUrl\" : \"http://internal-dev-private-165961934.eu-west-1.elb.amazonaws.com/notifier/api/notifier-test\"\n    },\n    \"PaymentStatus\" : 10,\n    \"Payments\" : [ {\n      \"Reference\" : 190721100444600320,\n      \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n      \"PaymentMethods\" : [ \"Card\", \"PayPal\" ],\n      \"Status\" : 10,\n      \"AbuseReport\" : {\n        \"Score\" : 46,\n        \"Triggers\" : [ {\n          \"Score\" : 0,\n          \"Code\" : \"I\",\n          \"Description\" : \"Internet inconsistencies. The IP address and email domain are not consistent with the billing address.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"Q\",\n          \"Description\" : \"Phone inconsistencies. The customer’s phone number is suspicious.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"V\",\n          \"Description\" : \"Velocity. The account number was used many times in the past 15 minutes.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"COR-BA\",\n          \"Description\" : \"The billing address has corrected elements or can be normalized.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-BA\",\n          \"Description\" : \"The billing country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-SA\",\n          \"Description\" : \"The shipping country is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-IP\",\n          \"Description\" : \"The IP address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELL-SA\",\n          \"Description\" : \"The shipping address has been used several times during the long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-IP\",\n          \"Description\" : \"The IP address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"VELV-SA\",\n          \"Description\" : \"The shipping address has been used several times during the very long tracking interval.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"INTL-IPCO\",\n          \"Description\" : \"The country of the customer’s IP address is outside of the U.S.\",\n          \"Parameters\" : [ ]\n        }, {\n          \"Score\" : 0,\n          \"Code\" : \"CS_GLOBAL\",\n          \"Description\" : \"Global score from CyberSource.\",\n          \"Parameters\" : [ ]\n        } ],\n        \"CreatedDateTimeUtc\" : \"2019-08-23T09:53:45.188Z\"\n      },\n      \"AmountToCollect\" : 121,\n      \"Steps\" : [ {\n        \"Reference\" : 190721221516783600,\n        \"CreateDateTimeUtc\" : \"2019-07-12T10:22:04.44Z\",\n        \"Action\" : 100,\n        \"PaymentMethods\" : [ 3, 2 ],\n        \"Status\" : 10,\n        \"AmountToCollect\" : 121\n      } ],\n      \"Attributes\" : {\n        \"ReturnUrlSuccess\" : \"https://www.example.com?status=success&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlFailed\" : \"https://www.example.com?status=failed&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\",\n        \"ReturnUrlCancelled\" : \"https://www.example.com?status=cancelled&status=cancelled&paymentjobref=190721000461508616&paymentref=190721100444600320&ordernumber=2019-03-18%2f1001\"\n      }\n    } ]\n  },\n  \"Links\" : {\n    \"Data\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/api/gateway/payment-jobs/190721000461508616\",\n      \"Type\" : \"application/json\"\n    },\n    \"Action\" : {\n      \"Url\" : \"https://secure-dev.paycheckout.com/payment?ref=4d28fe4d70398af4c041eaadd657e605bcaed35422030a70dd593a834b04d61dd7bad0fa073af78290f56fd7c994b7c2\",\n      \"Type\" : \"text/html\"\n    }\n  }\n}",
                        PaymentJobResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentJobResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentJobResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SupportedPaymentMethodsResponse> apiGatewaySupportedPaymentMethodsGet(
        @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema) @RequestHeader(
            value = "configurationId",
            required = false
        ) String configurationId,
        @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema) @RequestHeader(
            value = "hash",
            required = false
        ) String hash,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "collectAmount",
            required = false
        ) Double collectAmount,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "currency",
            required = false
        ) Currency currency,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "all",
            required = false
        ) Boolean all,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "customerReference",
            required = false
        ) Long customerReference,
        @Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema) @Valid @RequestParam(
            value = "locale",
            required = false
        ) Locale locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SupportedPaymentMethodsResponse>(
                    objectMapper.readValue(
                        "{\n  \"Data\" : [ {\n    \"PaymentMethod\" : \"Card\",\n    \"Logo\" : \"https://secure-dev.paycheckout.com/assets/payment-method-card.svg\",\n    \"SupportsTokenisation\" : true,\n    \"TokenizedCards\" : [ {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    }, {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    }, {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    }, {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    }, {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    }, {\n      \"CardExpiryMonth\" : \"02\",\n      \"CardExpiryYear\" : \"20\",\n      \"TruncatedCardNumber\" : \"400000****0002\"\n    } ],\n    \"Currencies\" : [ 826, 978, 840 ],\n    \"SurchargeAmount\" : 0,\n    \"SurchargeAmountExclVat\" : 0,\n    \"SurchargeAmountVat\" : 0,\n    \"SurchargeVatPercentage\" : 0,\n    \"Description\" : \"Card Simulator\"\n  }, {\n    \"PaymentMethod\" : \"Ideal\",\n    \"Logo\" : \"https://secure-dev.paycheckout.com/assets/payment-method-ideal.png\",\n    \"IssuerList\" : [ {\n      \"Id\" : \"TRIONL2U\",\n      \"Name\" : \"Triodos Bank\"\n    }, {\n      \"Id\" : \"RBRBNL21\",\n      \"Name\" : \"RegioBank\"\n    }, {\n      \"Id\" : \"KNABNL2H\",\n      \"Name\" : \"Knab\"\n    }, {\n      \"Id\" : \"ASNBNL21\",\n      \"Name\" : \"ASN Bank\"\n    }, {\n      \"Id\" : \"SNSBNL2A\",\n      \"Name\" : \"SNS\"\n    }, {\n      \"Id\" : \"RABONL2U\",\n      \"Name\" : \"Rabobank\"\n    }, {\n      \"Id\" : \"INGBNL2A\",\n      \"Name\" : \"ING\"\n    }, {\n      \"Id\" : \"ABNANL2A\",\n      \"Name\" : \"ABN AMRO\"\n    }, {\n      \"Id\" : \"FVLBNL22\",\n      \"Name\" : \"Van Lanschot\"\n    }, {\n      \"Id\" : \"BUNQNL2A\",\n      \"Name\" : \"bunq\"\n    }, {\n      \"Id\" : \"MOYONL21\",\n      \"Name\" : \"Moneyou\"\n    } ],\n    \"SupportsTokenisation\" : false,\n    \"Currencies\" : [ 978 ],\n    \"SurchargeAmount\" : 0.25,\n    \"SurchargeAmountExclVat\" : 0.25,\n    \"SurchargeAmountVat\" : 0,\n    \"SurchargeVatPercentage\" : 0,\n    \"Description\" : \"iDEAL Simulator\"\n  }, {\n    \"PaymentMethod\" : \"PayPal\",\n    \"Logo\" : \"https://secure-dev.paycheckout.com/assets/payment-method-paypal.png\",\n    \"SupportsTokenisation\" : false,\n    \"Currencies\" : [ 826, 978, 840 ],\n    \"SurchargeAmount\" : 1.5,\n    \"SurchargeAmountExclVat\" : 1.5,\n    \"SurchargeAmountVat\" : 0,\n    \"SurchargeVatPercentage\" : 0,\n    \"Description\" : \"PayPal Simulator\"\n  } ]\n}",
                        SupportedPaymentMethodsResponse.class
                    ),
                    HttpStatus.NOT_IMPLEMENTED
                );
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SupportedPaymentMethodsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SupportedPaymentMethodsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }
}
