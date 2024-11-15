package api.Get200Response.Prod.NoAuth;

import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthGet200ResponseTariffs {

    public void get200ResponseTariffsUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse imageBanner = given().baseUri(URL_TARIFFS_PAGE_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTariffsRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse imageBanner = given().baseUri(URL_TARIFFS_PAGE_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseTariffsEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        ValidatableResponse imageBanner = given().baseUri(URL_TARIFFS_PAGE_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
