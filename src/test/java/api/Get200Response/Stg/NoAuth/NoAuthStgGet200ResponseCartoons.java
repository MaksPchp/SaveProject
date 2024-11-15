package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseCartoons {

    public void get200ResponseCartoonsUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CARTOONS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseCartoonsRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CARTOONS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseCartoonsEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_CARTOONS_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
