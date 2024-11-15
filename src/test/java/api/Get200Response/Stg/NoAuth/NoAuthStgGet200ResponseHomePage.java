package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseHomePage {

    public void get200ResponseHomePageUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOME_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
    public void get200ResponseHomePageRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOME_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
    public void get200ResponseHomePageEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_HOME_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

}
