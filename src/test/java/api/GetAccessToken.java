// Получить аксес токен с помощью рефреш токена
package api;

import static constants.Constants.REFRESH_TOKEN;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

    public class GetAccessToken {
        HeadersContentType headersContentType = new HeadersContentType();

        public String getToken(){

            String body = "{\n" +
                    "                    \"device\": {\n" +
                    "                        \"type\": \"DT_Web_Browser\",\n" +
                    "                        \"application\": {\n" +
                    "                            \"type\": \"AT_SWEET_TV_Player\"\n" +
                    "                        },\n" +
                    "                        \"model\": \"AutoTest\",\n" +
                    "                        \"firmware\": {\n" +
                    "                            \"versionCode\": 1,\n" +
                    "                            \"versionString\": \"2.0.0\"\n" +
                    "                        },\n" +
                    "                        \"supported_drm\": {}\n" +
                    "                    },\n" +
                    "\"refresh_token\": \"" + REFRESH_TOKEN + "\"\n" +
                    "                }";

            String tokenForUser = given().baseUri("https://api.sweet.tv/")
                    .basePath("AuthenticationService/Token.json")
                    .headers(headersContentType.headerContentType())
                    .body(body)
                    .when().post()
                    .then()
                    .statusCode(is(200))
                    .extract().jsonPath().getString("access_token");
            return tokenForUser;
        }
    }

