package api;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetWatchList {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public List getWatchList(){
        List getWatchList = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetWatchList.json")
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("movies");
        return getWatchList;

    }
}