package methods;

import driver.DriverProvider;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Auth.AuthHomePage;

import java.time.Duration;
import java.util.Date;

import static constants.Constants.*;

public class AuthorizationWithToken {

    public void authorizationWithTokenUkraine(){
        AuthHomePage authHomePage = new AuthHomePage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        Date date = new Date(12121212121211212L);
        DriverProvider.getDriver().manage().addCookie(
                new Cookie.Builder("refresh_token",REFRESH_TOKEN)
                        .domain("sweet.tv")
                        .expiresOn(date)
                        .path("/")
                        .build()
        );
        DriverProvider.getDriver().navigate().refresh();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getCabinetButton()));
        authHomePage.getCabinetButton().isDisplayed();
    }

    public void authorizationWithTokenRussia(){
        AuthHomePage authHomePage = new AuthHomePage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        Date date = new Date(12121212121211212L);
        DriverProvider.getDriver().manage().addCookie(
                new Cookie.Builder("refresh_token",REFRESH_TOKEN)
                        .domain("sweet.tv")
                        .expiresOn(date)
                        .path("/")
                        .build()
        );
        DriverProvider.getDriver().navigate().refresh();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getCabinetButton()));
        authHomePage.getCabinetButton().isDisplayed();
    }

    public void authorizationWithTokenEnglish(){
        AuthHomePage authHomePage = new AuthHomePage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        Date date = new Date(12121212121211212L);
        DriverProvider.getDriver().manage().addCookie(
                new Cookie.Builder("refresh_token",REFRESH_TOKEN)
                        .domain("sweet.tv")
                        .expiresOn(date)
                        .path("/")
                        .build()
        );
        DriverProvider.getDriver().navigate().refresh();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getCabinetButton()));
        authHomePage.getCabinetButton().isDisplayed();
    }

    }
