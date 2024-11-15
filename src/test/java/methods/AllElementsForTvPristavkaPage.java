package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthForTvPristavkaPage;

import java.time.Duration;

public class AllElementsForTvPristavkaPage {
    NoAuthForTvPristavkaPage noAuthForTvPristavkaPage = new NoAuthForTvPristavkaPage();

    public void allElementsForTvPristavkaPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForTvPristavkaPage.getTvPristavkaBlock()));
        Assert.assertTrue(noAuthForTvPristavkaPage.getTvPristavkaBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForTvPristavkaPage.getHowGetBlock()));
        Assert.assertTrue(noAuthForTvPristavkaPage.getHowGetBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForTvPristavkaPage.getAdvantagesBlock()));
        Assert.assertTrue(noAuthForTvPristavkaPage.getAdvantagesBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForTvPristavkaPage.getAndroidTvBlock()));
        Assert.assertTrue(noAuthForTvPristavkaPage.getAndroidTvBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForTvPristavkaPage.getHurryUpBlock()));
        Assert.assertTrue(noAuthForTvPristavkaPage.getHurryUpBlock().isDisplayed());

    }
}