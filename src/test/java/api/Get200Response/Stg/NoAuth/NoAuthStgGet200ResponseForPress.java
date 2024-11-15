package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseForPress {

    public void get200ResponseForPressUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseForPressRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseForPressEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
