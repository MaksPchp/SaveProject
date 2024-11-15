package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseTvPristavka {

    public void get200ResponseTvPristavkaUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PRISTAVKA_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvPristavkaRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PRISTAVKA_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTvPristavkaEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TV_PRISTAVKA_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
