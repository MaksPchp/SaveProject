package api;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetAllFilmsId {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String body = "{\"genre_id\":61}";

    public List<Integer> getAllFilmsId(String language){
        this.language = language;
        List<Integer> allFilmsId = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetGenreMovies.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("movies");
        return allFilmsId;

    }
}

