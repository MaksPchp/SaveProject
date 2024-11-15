package api.GetPromoBannersImage;

import api.HeadersContentTypeAndTokenAndLanguage;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetPromoBannersImageForMovie {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String body = "{\"page\":1}";

    public List<Object> getPromoBannersImageForMovie(String language){
        this.language = language;
        List<Object> getPromoBannersImageForMovie = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetPromoBanners.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("banners.image_url");
        return getPromoBannersImageForMovie;

    }
}
