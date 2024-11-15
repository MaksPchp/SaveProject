package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthForAboutUsPage;

import java.time.Duration;

public class AllElementsForAboutUs {
    NoAuthForAboutUsPage noAuthForAboutUsPage = new NoAuthForAboutUsPage();

    public void allElementsForAboutUs(){


        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getBannerBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getBannerBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getWeLidersBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getWeLidersBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getWhyMeBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getWhyMeBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getChannelsBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getChannelsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getPremiumBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getPremiumBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getLibraryBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getLibraryBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForAboutUsPage.getTariffsBlock()));
        Assert.assertTrue(noAuthForAboutUsPage.getTariffsBlock().isDisplayed());


    }
}