package methods;

import driver.DriverProvider;
import io.restassured.response.ValidatableResponse;
import org.openqa.selenium.Cookie;

import java.util.Date;

import static constants.Constants.URL_GENRE_1_STATUS_200_UKRAINE;
import static constants.Constants.URL_HOME_PAGE_UKRAINE;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CookieForVpn {
    public void cookieForVpn(){
        int response = given().baseUri(URL_HOME_PAGE_UKRAINE)
                .get().statusCode();
        if (response == 200){

        }else {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        Date date = new Date(12121212121211212L);
        DriverProvider.getDriver().manage().addCookie(
                new Cookie.Builder("sweet_vpn","1")
                        .domain("sweet.tv")
                        .expiresOn(date)
                        .path("/")
                        .build()
        );
        DriverProvider.getDriver().navigate().refresh();
        }
    }

    public void cookieForVpnMobile(){
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_UKRAINE);
        Date date = new Date(12121212121211212L);
        DriverProvider.getDriverMobile().manage().addCookie(
                new Cookie.Builder("sweet_vpn","1")
                        .domain("sweet.tv")
                        .expiresOn(date)
                        .path("/")
                        .build()
        );
        DriverProvider.getDriverMobile().navigate().refresh();
    }
}
