package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static constants.Constants.URL_STG_HOLLYWOOD_PAGE_RUSSIA;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseHollywood {

    public void get200ResponseHollywoodUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOLLYWOOD_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHollywoodRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOLLYWOOD_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHollywoodEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOLLYWOOD_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
