package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseAboutUs {

    public void get200ResponseAboutUsUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_ABOUT_US_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseAboutUsRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_ABOUT_US_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseAboutUsEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_ABOUT_US_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}