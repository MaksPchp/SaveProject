package api.GetCollectionName;

import api.HeadersContentTypeAndTokenAndLanguage;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetCollectionNameForCartoonPage {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String body = "{\"type\":4}";

    public List<List> getCollectionNameForCartoonPage(String language){
        this.language = language;
        List<List> collectionNameForCartoonPage = given().baseUri("https://api.sweet.tv/")
                .basePath("MovieService/GetCollections.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("collection.title");
        return collectionNameForCartoonPage;

    }
}
