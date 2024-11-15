package methods;

import driver.DriverProvider;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

import static constants.Constants.URL_HOME_PAGE_UKRAINE;

public class ChangeLanguage {

    public void chooseUk(){
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
//        new Actions(DriverProvider.getDriver()).moveToElement( homePage.getChangeLanguageButton()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getLanguageUa()));
//        homePage.getLanguageUa().click();
    }

    public void chooseRu(){
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        new Actions(DriverProvider.getDriver()).moveToElement( homePage.getChangeLanguageButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLanguageRu()));
        homePage.getLanguageRu().click();
    }

    public void chooseEn(){
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
//        HomePage homePage = new HomePage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
//        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getChangeLanguageButton()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getLanguageEn()));
//        homePage.getLanguageEn().click();
    }


}
