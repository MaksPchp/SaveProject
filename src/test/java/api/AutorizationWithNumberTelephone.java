// Вводим номер телефона и получаем код
package api;

import org.testng.Assert;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class AutorizationWithNumberTelephone {

    int telephoneNumber;

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    public void autorizationWithNumberTelephone(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        BodyRequestPostNumberTelephoneAutorization bodyRequestPostNumberTelephoneAutorization = new BodyRequestPostNumberTelephoneAutorization();
        HeadersContentType headersContentType = new HeadersContentType();
        String getMobileTelephone = given().baseUri("https://api.sweet.tv/")
                .basePath("SignupService/SetPhone.json")
                .headers(headersContentType.headerContentType())
                .body(bodyRequestPostNumberTelephoneAutorization.numberTelephone(telephoneNumber))
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getString("status");
        Assert.assertEquals(getMobileTelephone, "OK");
    }

    public String getCode(){
       String code = given().baseUri("http://10.20.0.95/sms_gate/#")
//                .basePath("devino/getCodeByNumber.php")
                .param("phone", "380"+telephoneNumber)
                .when().get()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getString("code");
        return code;

    }

}
