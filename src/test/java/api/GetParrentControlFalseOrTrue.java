package api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetParrentControlFalseOrTrue {
    HeadersContentTypeAndToken headersContentTypeAndToken = new HeadersContentTypeAndToken();
    String numberTelephone;

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public boolean getParrentControlFalseOrTrue(String numberTelephone){
        this.numberTelephone = numberTelephone;
        boolean getParrentControlFalseOrTrue = given().baseUri("https://api.sweet.tv/")
                .basePath("TvService/GetUserInfo.json")
                .headers(headersContentTypeAndToken.headersContentTypeAndToken(numberTelephone))
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getBoolean("info.parental_control_enabled");
        return getParrentControlFalseOrTrue;

    }
}