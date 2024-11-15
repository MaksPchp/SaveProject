package api.Get200Response.Stg.NoAuth;

import io.restassured.response.ValidatableResponse;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthStgGet200ResponseBattleBloggers {

    public void get200ResponseBattleBloggersUkraine() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_BATTLE_BLOGGERS_PAGE_UKRAINE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseBattleBloggersRussia() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_BATTLE_BLOGGERS_PAGE_RUSSIA)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseBattleBloggersEnglish() {
        ValidatableResponse imageBanner = given().baseUri(URL_STG_BATTLE_BLOGGERS_PAGE_ENGLISH)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
