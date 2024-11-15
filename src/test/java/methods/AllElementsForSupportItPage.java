package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthSupportItPage;

import java.time.Duration;

public class AllElementsForSupportItPage {
    NoAuthSupportItPage noAuthSupportItPage = new NoAuthSupportItPage();

    public void allElementsForSupportItPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getLogo()));
        Assert.assertTrue(noAuthSupportItPage.getLogo().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getTextDescription()));
        Assert.assertTrue(noAuthSupportItPage.getTextDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getTvImage()));
        Assert.assertTrue(noAuthSupportItPage.getTvImage().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getAdvantagesBlock()));
        Assert.assertTrue(noAuthSupportItPage.getAdvantagesBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getGoalBlock()));
        Assert.assertTrue(noAuthSupportItPage.getGoalBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getTargetBlock()));
        Assert.assertTrue(noAuthSupportItPage.getTargetBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getIdeaBlock()));
        Assert.assertTrue(noAuthSupportItPage.getIdeaBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getHackathonBlock()));
        Assert.assertTrue(noAuthSupportItPage.getHackathonBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getDevBlock()));
        Assert.assertTrue(noAuthSupportItPage.getDevBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getFwdaysBlock()));
        Assert.assertTrue(noAuthSupportItPage.getFwdaysBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthSupportItPage.getReactorBlock()));
        Assert.assertTrue(noAuthSupportItPage.getReactorBlock().isDisplayed());

    }
}