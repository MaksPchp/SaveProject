package api.Get200Response.Stg.Auth;

import api.HeadersContentTypeAndHardcodeToken;
import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AuthStgGet200ResponseForPress {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public void get200ResponseForPressUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseForPressRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseForPressEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}