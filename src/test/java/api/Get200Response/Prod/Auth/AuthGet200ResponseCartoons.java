package api.Get200Response.Prod.Auth;

import api.HeadersContentTypeAndHardcodeToken;
import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AuthGet200ResponseCartoons {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public void get200ResponseCartoonsUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse imageBanner = given().baseUri(URL_CARTOONS_PAGE_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseCartoonsRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse imageBanner = given().baseUri(URL_CARTOONS_PAGE_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseCartoonsEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        ValidatableResponse imageBanner = given().baseUri(URL_CARTOONS_PAGE_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
