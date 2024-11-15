package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Modal.ModalAutorizationPage;

import java.time.Duration;

public class AllElementsForAuthorizationWindow {

    public void allElementsForAuthorizationWindow1stepProduction(){
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();



        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getCloseButton()));
        Assert.assertTrue(modalAutorizationPage.getCloseButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getLogo()));
        Assert.assertTrue(modalAutorizationPage.getLogo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGoogleButton()));
        Assert.assertTrue(modalAutorizationPage.getGoogleButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFacebookButton()));
        Assert.assertTrue(modalAutorizationPage.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getAppleButton()));
        Assert.assertTrue(modalAutorizationPage.getAppleButton().isDisplayed());
    }

    public void allElementsForAuthorizationWindow1stepStg(){
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getCloseButton()));
        Assert.assertTrue(modalAutorizationPage.getCloseButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getLogo()));
        Assert.assertTrue(modalAutorizationPage.getLogo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFacebookButton()));
        Assert.assertTrue(modalAutorizationPage.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getAppleButton()));
        Assert.assertTrue(modalAutorizationPage.getAppleButton().isDisplayed());
    }

    public void allElementsForAuthorizationWindow2step(){
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getCloseButtonTwo()));
        Assert.assertTrue(modalAutorizationPage.getCloseButtonTwo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextSmsSentToNumberTwo()));
        Assert.assertTrue(modalAutorizationPage.getTextSmsSentToNumberTwo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFiledForEnteringSmsCode()));
        Assert.assertTrue(modalAutorizationPage.getFiledForEnteringSmsCode().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getComeButtonTwo()));
        Assert.assertTrue(modalAutorizationPage.getComeButtonTwo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getChangeTelephoneNumberButton()));
        Assert.assertTrue(modalAutorizationPage.getChangeTelephoneNumberButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getSendSmsAgainButtonTwo()));
        Assert.assertTrue(modalAutorizationPage.getSendSmsAgainButtonTwo().isDisplayed());
    }
}
