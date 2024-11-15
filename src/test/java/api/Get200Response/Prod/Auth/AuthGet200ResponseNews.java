package api.Get200Response.Prod.Auth;

import api.HeadersContentTypeAndHardcodeToken;
import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static constants.Constants.DOCUMENT_COOKIE_VALUE;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AuthGet200ResponseNews {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public void get200ResponseNewsUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse imageBanner = given().baseUri(URL_NEWS_PAGE_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseNewsRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse imageBanner = given().baseUri(URL_NEWS_PAGE_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}