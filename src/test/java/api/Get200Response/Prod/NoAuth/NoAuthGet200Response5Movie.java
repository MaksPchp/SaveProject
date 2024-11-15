package api.Get200Response.Prod.NoAuth;

import io.restassured.response.ValidatableResponse;
import methods.ChangeLanguage;

import static constants.Constants.*;
import static constants.Constants.URL_STG_MOVIE_5_STATUS_200_ENGLISH;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class NoAuthGet200Response5Movie {

    public void get200ResponseUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        ValidatableResponse movie1 = given().baseUri(URL_MOVIE_1_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_MOVIE_2_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_MOVIE_3_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_MOVIE_4_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_MOVIE_5_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        ValidatableResponse movie1 = given().baseUri(URL_MOVIE_1_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_MOVIE_2_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_MOVIE_3_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_MOVIE_4_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_MOVIE_5_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        ValidatableResponse movie1 = given().baseUri(URL_MOVIE_1_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_MOVIE_2_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_MOVIE_3_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_MOVIE_4_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_MOVIE_5_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseUkraineStg() {
        ValidatableResponse movie1 = given().baseUri(URL_STG_MOVIE_1_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_STG_MOVIE_2_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_STG_MOVIE_3_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_STG_MOVIE_4_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_STG_MOVIE_5_STATUS_200_UKRAINE)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseRussiaStg() {
        ValidatableResponse movie1 = given().baseUri(URL_STG_MOVIE_1_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_STG_MOVIE_2_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_STG_MOVIE_3_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_STG_MOVIE_4_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_STG_MOVIE_5_STATUS_200_RUSSIA)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }

    public void get200ResponseEnglishStg() {
        ValidatableResponse movie1 = given().baseUri(URL_STG_MOVIE_1_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie2 = given().baseUri(URL_STG_MOVIE_2_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie3 = given().baseUri(URL_STG_MOVIE_3_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie4 = given().baseUri(URL_STG_MOVIE_4_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));

        ValidatableResponse movie5 = given().baseUri(URL_STG_MOVIE_5_STATUS_200_ENGLISH)
                .cookie(DOCUMENT_COOKIE_NAME,DOCUMENT_COOKIE_VALUE)
                .when().get()
                .then()
                .assertThat().statusCode(is(200));
    }
}
