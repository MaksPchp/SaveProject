package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Auth.AuthHomePage;

import java.time.Duration;

public class AllElementsInBannerForHomePage {
    AuthHomePage authHomePage = new AuthHomePage();

    public void AllElementsInBannerForHomePage(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getRightButtonInBanner()));
        Assert.assertTrue(authHomePage.getRightButtonInBanner().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getLeftButtonInBanner()));
        Assert.assertTrue(authHomePage.getLeftButtonInBanner().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getGoDownBlockInSlider()));
        Assert.assertTrue(authHomePage.getGoDownBlockInSlider().isDisplayed());
    }
}
