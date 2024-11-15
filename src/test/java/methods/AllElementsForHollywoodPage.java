package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthForHollywoodPage;

import java.time.Duration;

public class AllElementsForHollywoodPage {
    NoAuthForHollywoodPage noAuthForHollywoodPage = new NoAuthForHollywoodPage();

    public void allElementsForHollywoodPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForHollywoodPage.getBannerBlock()));
        Assert.assertTrue(noAuthForHollywoodPage.getBannerBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForHollywoodPage.getAboutTextBlock()));
        Assert.assertTrue(noAuthForHollywoodPage.getAboutTextBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForHollywoodPage.getHowRiseBlock()));
        Assert.assertTrue(noAuthForHollywoodPage.getHowRiseBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForHollywoodPage.getWithOurProjectBlock()));
        Assert.assertTrue(noAuthForHollywoodPage.getWithOurProjectBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthForHollywoodPage.getBestContentBlock()));
        Assert.assertTrue(noAuthForHollywoodPage.getBestContentBlock().isDisplayed());

    }
}
