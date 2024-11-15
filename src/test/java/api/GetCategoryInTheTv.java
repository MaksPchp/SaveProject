package api;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetCategoryInTheTv {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    String body = "{\"need_icons\":false,\"need_big_icons\":false,\"need_epg\":false,\"need_categories\":true,\"need_offsets\":false}";

    public List<Object> getCategoryInTheTv(){
        List<Object> nameCategoryInTheTv = given().baseUri("https://api.sweet.tv/")
                .basePath("TvService/GetChannels.json")
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("categories.caption");
        return nameCategoryInTheTv;

    }
}
