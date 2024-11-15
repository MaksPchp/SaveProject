package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthFondKinoPage;

import java.time.Duration;

public class AllElementsForFondKinoPage {
    NoAuthFondKinoPage noAuthFondKinoPage = new NoAuthFondKinoPage();

    public void allElementsForCinemaFondPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getBannerImage()));
        Assert.assertTrue(noAuthFondKinoPage.getBannerImage().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getInfoBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getInfoBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getIdeaBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getIdeaBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getHollywoodBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getHollywoodBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getFundBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getFundBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getFocusBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getFocusBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthFondKinoPage.getSupportBlock()));
        Assert.assertTrue(noAuthFondKinoPage.getSupportBlock().isDisplayed());
    }
}

