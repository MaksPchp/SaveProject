package api;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetFavoriteMovies {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public List getFavoriteMovies(){
        List getFavoriteMovies = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetFavoriteMovies.json")
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("movies");
        return getFavoriteMovies;

    }
}
