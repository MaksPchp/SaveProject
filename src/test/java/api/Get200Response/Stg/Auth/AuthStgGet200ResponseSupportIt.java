package api.Get200Response.Stg.Auth;

import api.HeadersContentTypeAndHardcodeToken;
import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static constants.Constants.URL_STG_IT_SUPPORT_PAGE_RUSSIA;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AuthStgGet200ResponseSupportIt {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public void get200ResponseSupportItUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_UKRAINE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSupportItRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_RUSSIA)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSupportItEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_ENGLISH)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())


                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
