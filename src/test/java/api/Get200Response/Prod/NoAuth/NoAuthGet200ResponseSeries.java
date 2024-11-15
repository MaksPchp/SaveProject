package api.Get200Response.Prod.NoAuth;

import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static constants.Constants.URL_SERIES_PAGE_ENGLISH;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthGet200ResponseSeries {

    public void get200ResponseSeriesUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse imageBanner = given().baseUri(URL_SERIES_PAGE_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSeriesRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse imageBanner = given().baseUri(URL_SERIES_PAGE_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseSeriesEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        ValidatableResponse imageBanner = given().baseUri(URL_SERIES_PAGE_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
