package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthPartnersPage;

import java.time.Duration;

public class AllElementsForPartnersPage {
    NoAuthPartnersPage noAuthPartnersPage = new NoAuthPartnersPage();

    public void allElementsForPartnersPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getOurPartnersText()));
        Assert.assertTrue(noAuthPartnersPage.getOurPartnersText().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getOurPartnersBlockDescription()));
        Assert.assertTrue(noAuthPartnersPage.getOurPartnersBlockDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getImageFirstBlock()));
        Assert.assertTrue(noAuthPartnersPage.getImageFirstBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getHollywoodBlock()));
        Assert.assertTrue(noAuthPartnersPage.getHollywoodBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getSupportBlock()));
        Assert.assertTrue(noAuthPartnersPage.getSupportBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthPartnersPage.getSupportBlock()));
        Assert.assertTrue(noAuthPartnersPage.getSupportBlock().isDisplayed());
    }
}
