package api.Get200Response.Stg.Auth;

import api.HeadersContentTypeAndHardcodeToken;
import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AuthStgGet200ResponseTv {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public void get200ResponseTvUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_UKRAINE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_RUSSIA)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_ENGLISH)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}