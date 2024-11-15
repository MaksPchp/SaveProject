package api.GetCollectionIdList;

import api.HeadersContentTypeAndTokenAndLanguage;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetCollectionIdListForSeries {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String body = "{\"type\":3}";

    public List<List> getCollectionIdListForSeries(String language){
        this.language = language;
        List<List> collectionIdListForSeries = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetCollections.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("collection.id_list");
        return collectionIdListForSeries;

    }
}