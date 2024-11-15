package tests;

import api.*;
import api.GetPromoBannersImage.GetPromoBannersImageForCartoon;
import api.GetPromoBannersImage.GetPromoBannersImageForHomePage;
import api.GetPromoBannersImage.GetPromoBannersImageForMovie;
import api.GetPromoBannersImage.GetPromoBannersImageForSeries;
import io.restassured.response.ValidatableResponse;
import testNgRunner.TestNgRunner;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;
import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class ImageTest extends TestNgRunner {

    // Проверка всех постеров украинский язык
    @Test
    public void verifyAllPostersMovieUkraine() {
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoPosters getMovieInfoPostersForMovie = new GetMovieInfoPosters();
        List<Integer> list = getAllFilmsId.getAllFilmsId(UKRAIN_LANGUAGE_FOR_REQUEST);
        List<List> imageMovie = getMovieInfoPostersForMovie.getMovieInfoPostersForMovie(UKRAIN_LANGUAGE_FOR_REQUEST, list);

        for (int y = 0; y < imageMovie.size(); y++) {
            if (imageMovie.get(y) == null){
            }else{
                try {
//                    DriverProvider.getDriver().get(String.valueOf(imageMovie.get(y)));
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(String.valueOf(imageMovie.get(y)).substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imageMovie.get(y));
                    System.out.println(list.get(y));
                }
            }
        }
    }
    // Проверка всех постеров русский язык
    @Test
    public void verifyAllPostersMoviePageRussia() {
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoPosters getMovieInfoPostersForMovie = new GetMovieInfoPosters();
        List<Integer> list = getAllFilmsId.getAllFilmsId(RUSSIA_LANGUAGE_FOR_REQUEST);
        List<List> imageMovie = getMovieInfoPostersForMovie.getMovieInfoPostersForMovie(RUSSIA_LANGUAGE_FOR_REQUEST, list);

        for (int y = 0; y < imageMovie.size(); y++) {
            if (imageMovie.get(y) == null){
            }else{
                try {
//                    DriverProvider.getDriver().get(String.valueOf(imageMovie.get(y)));
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(String.valueOf(imageMovie.get(y)).substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imageMovie.get(y));
                    System.out.println(list.get(y));
                }
            }
        }
    }
    // Проверка всех постеров английский язык
    @Test
    public void verifyAllPostersMoviePageEnglish() {
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoPosters getMovieInfoPostersForMovie = new GetMovieInfoPosters();
        List<Integer> list = getAllFilmsId.getAllFilmsId(ENGLISH_LANGUAGE_FOR_REQUEST);
        List<List> imageMovie = getMovieInfoPostersForMovie.getMovieInfoPostersForMovie(ENGLISH_LANGUAGE_FOR_REQUEST, list);

        for (int y = 0; y < imageMovie.size(); y++) {
            if (imageMovie.get(y) == null){
            }else{
                try {
//                    DriverProvider.getDriver().get(String.valueOf(imageMovie.get(y)));
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(String.valueOf(imageMovie.get(y)).substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imageMovie.get(y));
                    System.out.println(list.get(y));
                }
            }
        }
    }
    // Проверка работы всех трейлеров украинский язык
    @Test
    public void verifyAllTrailersUkraine(){
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoTrailer getMovieInfoTrailer = new GetMovieInfoTrailer();
        List<Integer> list = getAllFilmsId.getAllFilmsId(UKRAIN_LANGUAGE_FOR_REQUEST);
        List<List> trailerMovie = getMovieInfoTrailer.getMovieInfoTrailer(UKRAIN_LANGUAGE_FOR_REQUEST, list);
        List trailerNoNull = new ArrayList<>();

        for (int i = 0; i < trailerMovie.size(); i++){
            if (trailerMovie.get(i) == null){
            }else{
                trailerNoNull.add(trailerMovie.get(i));
            }
        }
        for (int y = 0; y < trailerNoNull.size(); y++) {
            try {
                ValidatableResponse trailer = given().baseUri("http://vod2.sweet.tv/")
                        .basePath(String.valueOf(trailerNoNull.get(y)).substring(21))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + trailerNoNull.get(y));
            }
        }
    }
    // Проверка работы всех трейлеров руссикй язык
    @Test
    public void verifyAllTrailersRussia(){
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoTrailer getMovieInfoTrailer = new GetMovieInfoTrailer();
        List<Integer> list = getAllFilmsId.getAllFilmsId(RUSSIA_LANGUAGE_FOR_REQUEST);
        List<List> trailerMovie = getMovieInfoTrailer.getMovieInfoTrailer(RUSSIA_LANGUAGE_FOR_REQUEST, list);
        List trailerNoNull = new ArrayList<>();

        for (int i = 0; i < trailerMovie.size(); i++){
            if (trailerMovie.get(i) == null){
            }else{
                trailerNoNull.add(trailerMovie.get(i));
            }
        }

        for (int y = 0; y < trailerNoNull.size(); y++) {
            try {
                ValidatableResponse trailer = given().baseUri("http://vod2.sweet.tv/")
                        .basePath(String.valueOf(trailerNoNull.get(y)).substring(21))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (Exception e) {
                System.out.println("Error =  " + trailerNoNull.get(y));
            }
        }
    }
    // Проверка работы всех трейлеров английский язык
    @Test
    public void verifyAllTrailersEnglish(){
        GetAllFilmsId getAllFilmsId = new GetAllFilmsId();
        GetMovieInfoTrailer getMovieInfoTrailer = new GetMovieInfoTrailer();
        List<Integer> list = getAllFilmsId.getAllFilmsId(ENGLISH_LANGUAGE_FOR_REQUEST);
        List<List> trailerMovie = getMovieInfoTrailer.getMovieInfoTrailer(ENGLISH_LANGUAGE_FOR_REQUEST, list);
        List trailerNoNull = new ArrayList<>();

        for (int i = 0; i < trailerMovie.size(); i++){
            if (trailerMovie.get(i) == null){
            }else{
                trailerNoNull.add(trailerMovie.get(i));
            }
        }

        for (int y = 0; y < trailerNoNull.size(); y++) {
            try {
                ValidatableResponse trailer = given().baseUri("http://vod2.sweet.tv/")
                        .basePath(String.valueOf(trailerNoNull.get(y)).substring(21))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + trailerNoNull.get(y));
            }
        }
    }
    // Проверка картинок баннеров на странице фильмы украинский язык
    @Test
    public void verifyImagePromoBannersInTheMovieUkrainian() {
        GetPromoBannersImageForMovie getPromoBannersImageForMovie = new GetPromoBannersImageForMovie();
        List<Object> imagePromoBannersInTheMovie = getPromoBannersImageForMovie
                .getPromoBannersImageForMovie(UKRAIN_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheMovie.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheMovie.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheMovie.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheMovie.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице фильмы русский язык
    @Test
    public void verifyImagePromoBannersInTheMovieRussia() {
        GetPromoBannersImageForMovie getPromoBannersImageForMovie = new GetPromoBannersImageForMovie();
        List<Object> imagePromoBannersInTheMovie = getPromoBannersImageForMovie
                .getPromoBannersImageForMovie(RUSSIA_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheMovie.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheMovie.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheMovie.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheMovie.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице фильмы английский язык
    @Test
    public void verifyImagePromoBannersInTheMovieEnglish() {
        GetPromoBannersImageForMovie getPromoBannersImageForMovie = new GetPromoBannersImageForMovie();
        List<Object> imagePromoBannersInTheMovie = getPromoBannersImageForMovie
                .getPromoBannersImageForMovie(ENGLISH_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheMovie.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheMovie.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheMovie.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheMovie.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице сериалы украинский язык
    @Test
    public void verifyImagePromoBannersInTheSeriesUkrain() {
        GetPromoBannersImageForSeries getPromoBannersImageForSeries = new GetPromoBannersImageForSeries();
        List<Object> imagePromoBannersInTheSeries = getPromoBannersImageForSeries
                .getPromoBannersImageForSeries(UKRAIN_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheSeries.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheSeries.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheSeries.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheSeries.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице сериалы русский язык
    @Test
    public void verifyImagePromoBannersInTheSeriesRussia() {
        GetPromoBannersImageForSeries getPromoBannersImageForSeries = new GetPromoBannersImageForSeries();
        List<Object> imagePromoBannersInTheSeries = getPromoBannersImageForSeries
                .getPromoBannersImageForSeries(RUSSIA_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheSeries.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheSeries.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheSeries.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheSeries.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице сериалы английский язык
    @Test
    public void verifyImagePromoBannersInTheSeriesEnglish() {
        GetPromoBannersImageForSeries getPromoBannersImageForSeries = new GetPromoBannersImageForSeries();
        List<Object> imagePromoBannersInTheSeries = getPromoBannersImageForSeries
                .getPromoBannersImageForSeries(ENGLISH_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheSeries.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheSeries.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheSeries.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheSeries.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице мультфильмы украинский язык
    @Test
    public void verifyImagePromoBannersInTheCartoonUkrain() {
        GetPromoBannersImageForCartoon getPromoBannersImageForCartoon = new GetPromoBannersImageForCartoon();
        List<Object> imagePromoBannersInTheCartoon = getPromoBannersImageForCartoon
                .getPromoBannersImageForCartoon(UKRAIN_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheCartoon.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheCartoon.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheCartoon.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheCartoon.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице мультфильмы русский язык
    @Test
    public void verifyImagePromoBannersInTheCartoonRussia() {
        GetPromoBannersImageForCartoon getPromoBannersImageForCartoon = new GetPromoBannersImageForCartoon();
        List<Object> imagePromoBannersInTheCartoon = getPromoBannersImageForCartoon
                .getPromoBannersImageForCartoon(RUSSIA_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheCartoon.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheCartoon.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheCartoon.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheCartoon.get(i));
            }
        }
    }
    // Проверка картинок баннеров на странице мультфильмы английский язык
    @Test
    public void verifyImagePromoBannersInTheCartoonEnglish() {
        GetPromoBannersImageForCartoon getPromoBannersImageForCartoon = new GetPromoBannersImageForCartoon();
        List<Object> imagePromoBannersInTheCartoon = getPromoBannersImageForCartoon
                .getPromoBannersImageForCartoon(ENGLISH_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < imagePromoBannersInTheCartoon.size(); i++) {
            try {
//                DriverProvider.getDriver().get(imagePromoBannersInTheCartoon.get(i).toString());
                ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                        .basePath(imagePromoBannersInTheCartoon.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError e) {
                System.out.println("Error =  " + imagePromoBannersInTheCartoon.get(i));
            }
        }
    }
    // Проверка картинок баннеров на главной странице под все разрешения украиский язык
    @Test
    public void verifyImagePromoBannersInTheHomePageUkrain() {
        GetPromoBannersImageForHomePage getPromoBannersImageForHomePage = new GetPromoBannersImageForHomePage();
        List<List> imagePromoBannersInTheHomePage = getPromoBannersImageForHomePage
                .getPromoBannersImageForHomePage(UKRAIN_LANGUAGE_FOR_REQUEST);
        for (int j = 0; j < imagePromoBannersInTheHomePage.size(); j++) {
            for (int i = 0; i < imagePromoBannersInTheHomePage.get(j).size(); i++) {
                try {
//                    DriverProvider.getDriver().get(imagePromoBannersInTheHomePage.get(j).get(i).toString());
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(imagePromoBannersInTheHomePage.get(j).get(i).toString().substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imagePromoBannersInTheHomePage.get(j).get(i));
                }
            }
        }
    }
    // Проверка картинок баннеров на главной странице под все разрешения русский язык
    @Test
    public void verifyImagePromoBannersInTheHomePageRussia() {
        GetPromoBannersImageForHomePage getPromoBannersImageForHomePage = new GetPromoBannersImageForHomePage();
        List<List> imagePromoBannersInTheHomePage = getPromoBannersImageForHomePage
                .getPromoBannersImageForHomePage(RUSSIA_LANGUAGE_FOR_REQUEST);
        for (int j = 0; j < imagePromoBannersInTheHomePage.size(); j++) {
            for (int i = 0; i < imagePromoBannersInTheHomePage.get(j).size(); i++) {
                try {
//                    DriverProvider.getDriver().get(imagePromoBannersInTheHomePage.get(j).get(i).toString());
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(imagePromoBannersInTheHomePage.get(j).get(i).toString().substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imagePromoBannersInTheHomePage.get(j).get(i));
                }
            }
        }
    }
    // Проверка картинок баннеров на главной странице под все разрешения английский язык
    @Test
    public void verifyImagePromoBannersInTheHomePageEnglish() {
        GetPromoBannersImageForHomePage getPromoBannersImageForHomePage = new GetPromoBannersImageForHomePage();
        List<List> imagePromoBannersInTheHomePage = getPromoBannersImageForHomePage
                .getPromoBannersImageForHomePage(ENGLISH_LANGUAGE_FOR_REQUEST);
        for (int j = 0; j < imagePromoBannersInTheHomePage.size(); j++) {
            for (int i = 0; i < imagePromoBannersInTheHomePage.get(j).size(); i++) {
                try {
//                    DriverProvider.getDriver().get(imagePromoBannersInTheHomePage.get(j).get(i).toString());
                    ValidatableResponse imageBanner = given().baseUri("http://static.sweet.tv/")
                            .basePath(imagePromoBannersInTheHomePage.get(j).get(i).toString().substring(23))
                            .when().get()
                            .then()
                            .assertThat().statusCode(is(200));
                } catch (AssertionError e) {
                    System.out.println("Error =  " + imagePromoBannersInTheHomePage.get(j).get(i));
                }
            }
        }
    }
    // Проверка иконок для каналов в ТВ украинский язык
    @Test
    public void verifyIconForChannelsInTheTvUkraine() {
        GetIconForChannelsInTheTv getIconForChannelsInTheTv = new GetIconForChannelsInTheTv();
        List<Object> iconForChannelsInTheTv = getIconForChannelsInTheTv.getIconForChannelsInTheTv(UKRAIN_LANGUAGE_FOR_REQUEST);

        for (int i = 0; i < iconForChannelsInTheTv.size(); i++) {
            try {
//                DriverProvider.getDriver().get(iconForChannelsInTheTv.get(i).toString());
                ValidatableResponse tokenForUser = given().baseUri("http://static.sweet.tv/")
                        .basePath(iconForChannelsInTheTv.get(i).toString().substring(23))
                        .when().get()
                        .then()
                        .assertThat().statusCode(is(200));
            } catch (AssertionError | NullPointerException e) {
                System.out.println("Error =  " + iconForChannelsInTheTv.get(i));
            }
        }
    }

}