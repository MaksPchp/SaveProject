package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseSupportIt {

    public void get200ResponseSupportItUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSupportItRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSupportItEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_IT_SUPPORT_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
