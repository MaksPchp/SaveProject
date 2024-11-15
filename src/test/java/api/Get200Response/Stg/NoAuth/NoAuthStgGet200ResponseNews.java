package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseNews {

    public void get200ResponseNewsUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_NEWS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseNewsRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_NEWS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}