package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseMovie {

    public void get200ResponseMovieUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CINEMA_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseMovieRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CINEMA_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseMovieEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CINEMA_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
