package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthForPressPage;

import java.time.Duration;

public class AllElementsForPressPage {
    NoAuthForPressPage noAuthForPressPage = new NoAuthForPressPage();

    public void allElementsForPressPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getForPressBlock()));
        Assert.assertTrue(noAuthForPressPage.getForPressBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getForPressImage()));
        Assert.assertTrue(noAuthForPressPage.getForPressImage().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getInfoText()));
        Assert.assertTrue(noAuthForPressPage.getInfoText().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getInfoImage()));
        Assert.assertTrue(noAuthForPressPage.getInfoImage().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getContactsBlock()));
        Assert.assertTrue(noAuthForPressPage.getContactsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForPressPage.getMediaBlock()));
        Assert.assertTrue(noAuthForPressPage.getMediaBlock().isDisplayed());
    }
}