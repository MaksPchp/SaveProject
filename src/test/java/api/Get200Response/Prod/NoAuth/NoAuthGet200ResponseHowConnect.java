package api.Get200Response.Prod.NoAuth;

import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthGet200ResponseHowConnect {

    public void get200ResponseHowConnectUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse imageBanner = given().baseUri(URL_HOW_TO_CONNECT_PAGE_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHowConnectRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse imageBanner = given().baseUri(URL_HOW_TO_CONNECT_PAGE_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseHowConnectEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        ValidatableResponse imageBanner = given().baseUri(URL_HOW_TO_CONNECT_PAGE_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}