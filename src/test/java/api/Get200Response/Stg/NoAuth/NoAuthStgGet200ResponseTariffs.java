package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static constants.Constants.URL_STG_TARIFFS_PAGE_RUSSIA;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseTariffs {

    public void get200ResponseTariffsUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TARIFFS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTariffsRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TARIFFS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTariffsEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_TARIFFS_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
