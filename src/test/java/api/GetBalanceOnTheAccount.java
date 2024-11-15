// Получаем баланс аккаунта в формате Инт
package api;

import driver.DriverProvider;
import static constants.Constants.URL_HOME_PAGE_UKRAINE;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class GetBalanceOnTheAccount {
    String numberTelephone;

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public int getBalanceOnTheAccount(String numberTelephone){
        this.numberTelephone = numberTelephone;
        GetToken getToken = new GetToken();
        HeadersContentTypeAndToken headersContentTypeAndToken = new HeadersContentTypeAndToken();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        String balanceOnTheAccountString = given().baseUri("https://api.sweet.tv/")
                .basePath("TvService/GetUserInfo.json")
                .headers(headersContentTypeAndToken.headersContentTypeAndToken(numberTelephone))
                .when().post()
                .then()
                .statusCode(is(200))
                .extract().jsonPath().getString("info.balance");
        float balanceOnTheAccountFloat = (Float.parseFloat(balanceOnTheAccountString));
        int balanceOnTheAccountInt = Math.round(balanceOnTheAccountFloat);
        return balanceOnTheAccountInt;
    }

}
