package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseHowConnect {

    public void get200ResponseHowConnectUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHowConnectRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHowConnectEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}