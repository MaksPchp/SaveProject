package api;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetNumberOfChannelsInFavorites {
    HeadersContentTypeAndHardcodeToken headersContentTypeAndHardcodeToken = new HeadersContentTypeAndHardcodeToken();

    public int getNumberOfChannelsInFavorites(){
        List<Object> numberOfChannelsInFavoritesString = given().baseUri("https://api.sweet.tv/")
                .basePath("TvService/GetUserChannel.json")
                .headers(headersContentTypeAndHardcodeToken.headersContentTypeAndHardcodeToken())
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getList("data.channel_id");
        int numberOfChannelsInFavoritesInt = numberOfChannelsInFavoritesString.size();
        return numberOfChannelsInFavoritesInt;
    }


}
