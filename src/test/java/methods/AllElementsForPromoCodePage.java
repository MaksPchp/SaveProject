package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Auth.AuthPromoCodePage;
import pages.NoAuth.NoAuthPromoCodePage;

import java.time.Duration;

public class AllElementsForPromoCodePage {


    public void allElementsForPromoCodePage(){
        AuthPromoCodePage authPromoCodePage = new AuthPromoCodePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authPromoCodePage.getTextActivationPromoCode()));
        Assert.assertTrue(authPromoCodePage.getTextActivationPromoCode().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authPromoCodePage.getTextAbout()));
        Assert.assertTrue(authPromoCodePage.getTextAbout().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authPromoCodePage.getPromoCodeInput()));
        Assert.assertTrue(authPromoCodePage.getPromoCodeInput().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authPromoCodePage.getNoActiveButton()));
        Assert.assertTrue(authPromoCodePage.getNoActiveButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authPromoCodePage.getImage()));
        Assert.assertTrue(authPromoCodePage.getImage().isDisplayed());
    }

    public void allElementsForPromoCodePageNoAuth() {
        NoAuthPromoCodePage noAuthPromoCodePage = new NoAuthPromoCodePage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPromoCodePage.getComeButton()));
        Assert.assertTrue(noAuthPromoCodePage.getComeButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPromoCodePage.getH1()));
        Assert.assertTrue(noAuthPromoCodePage.getH1().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPromoCodePage.getDescription()));
        Assert.assertTrue(noAuthPromoCodePage.getDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPromoCodePage.getImage()));
        Assert.assertTrue(noAuthPromoCodePage.getImage().isDisplayed());


    }

}