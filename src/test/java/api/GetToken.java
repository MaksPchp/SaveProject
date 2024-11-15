// Получаем токен акканута в формате стринг с помощью номера телефона и смс
package api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetToken {

    String numberTelephone;

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public String getToken(String numberTelephone){
        this.numberTelephone = numberTelephone;
        String code;
        BodyRequestMobileNumberAndCode bodyRequestMobileNumberAndCode = new BodyRequestMobileNumberAndCode();
        HeadersContentType headersContentType = new HeadersContentType();
        AutorizationWithNumberTelephone autorizationWithNumberTelephone = new AutorizationWithNumberTelephone();
        autorizationWithNumberTelephone.autorizationWithNumberTelephone(Integer.parseInt(numberTelephone));
        code = autorizationWithNumberTelephone.getCode();
        int codeInt = Integer.parseInt(code);

        String tokenForUser = given().baseUri("https://api.sweet.tv/")
                .basePath("SignupService/SetCode.json")
                .headers(headersContentType.headerContentType())
                .body(bodyRequestMobileNumberAndCode.numberTelephoneAndCode(Integer.parseInt(numberTelephone),codeInt))
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getString("access_token");
        return tokenForUser;
    }
}
