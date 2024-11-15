package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static constants.Constants.URL_STG_PARTNERS_PAGE_ENGLISH;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponsePartners {

    public void get200ResponsePartnersUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_PARTNERS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponsePartnersRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_PARTNERS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponsePartnersEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_PARTNERS_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}

