package api;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetIconForChannelsInTheTv {
    HeadersContentTypeAndTokenAndLanguage headersContentTypeAndTokenAndLanguage = new HeadersContentTypeAndTokenAndLanguage();
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String body = "{\"need_icons\":false,\"need_big_icons\":false,\"need_epg\":false,\"need_categories\":true,\"need_offsets\":false}";

    public List<Object> getIconForChannelsInTheTv(String language){
        this.language = language;
        List<Object> iconForChannelsInTheTv = given().baseUri("https://api.sweet.tv/")
                .basePath("TvService/GetChannels.json")
                .headers(headersContentTypeAndTokenAndLanguage.headersContentTypeAndTokenAndLanguage(language))
                .body(body)
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("list.icon_v2_url");
        return iconForChannelsInTheTv;

    }
}
