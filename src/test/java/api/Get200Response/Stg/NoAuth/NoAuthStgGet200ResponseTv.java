package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseTv {

    public void get200ResponseTvUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}