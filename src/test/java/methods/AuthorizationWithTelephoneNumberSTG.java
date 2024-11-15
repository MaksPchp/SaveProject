package methods;

import api.AutorizationWithNumberTelephone;
import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Auth.AuthHomePage;
import pages.HomePage;
import pages.Modal.ModalAutorizationPage;

import java.time.Duration;

import static constants.Constants.*;

public class AuthorizationWithTelephoneNumberSTG {
    String telephoneNumber;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void authorizationSTGUkraine(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        String code;
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        AuthHomePage authHomePage = new AuthHomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        AutorizationWithNumberTelephone autorizationWithNumberTelephone = new AutorizationWithNumberTelephone();

        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(telephoneNumber);
        modalAutorizationPage.getGetSmsButton().click();
        autorizationWithNumberTelephone.autorizationWithNumberTelephone(Integer.parseInt(telephoneNumber));
        code = autorizationWithNumberTelephone.getCode();
        modalAutorizationPage.getFiledForEnteringSmsCode().sendKeys(code);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
    }

    public void authorizationSTGRussia(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        String code;
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        AuthHomePage authHomePage = new AuthHomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        AutorizationWithNumberTelephone autorizationWithNumberTelephone = new AutorizationWithNumberTelephone();

        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(telephoneNumber);
        modalAutorizationPage.getGetSmsButton().click();
        autorizationWithNumberTelephone.autorizationWithNumberTelephone(Integer.parseInt(telephoneNumber));
        code = autorizationWithNumberTelephone.getCode();
        modalAutorizationPage.getFiledForEnteringSmsCode().sendKeys(code);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
    }

    public void authorizationSTGEnglish(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        String code;
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        AuthHomePage authHomePage = new AuthHomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        AutorizationWithNumberTelephone autorizationWithNumberTelephone = new AutorizationWithNumberTelephone();

        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(telephoneNumber);
        modalAutorizationPage.getGetSmsButton().click();
        autorizationWithNumberTelephone.autorizationWithNumberTelephone(Integer.parseInt(telephoneNumber));
        code = autorizationWithNumberTelephone.getCode();
        modalAutorizationPage.getFiledForEnteringSmsCode().sendKeys(code);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
    }

}
