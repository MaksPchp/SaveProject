package api;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetMovieInfoTrailer {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;
    List<Integer> myBody;

    public List<Integer> getMyBody() {
        return myBody;
    }

    public void setMyBody(List<Integer> myBody) {
        this.myBody = myBody;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<List> getMovieInfoTrailer(String language, List<Integer> myBody){
        this.language = language;
        this.myBody = myBody;
        String body = "{\"movies\":"+ myBody.toString() +",\"offset\":0,\"need_extended_info\":false}";
        List<List> movieInfoTrailer = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetMovieInfo.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("movies.trailer_url");
        return movieInfoTrailer;

    }
}
