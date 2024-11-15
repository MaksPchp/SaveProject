package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthHowConnect;

import java.time.Duration;

public class AllElementsForHowConnectPage {
    NoAuthHowConnect noAuthHowConnect = new NoAuthHowConnect();

    public void allElementsForHowConnectPage(){


        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getH1Text()));
        Assert.assertTrue(noAuthHowConnect.getH1Text().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getDescriptionH1()));
        Assert.assertTrue(noAuthHowConnect.getDescriptionH1().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getSmartTvDevices()));
        Assert.assertTrue(noAuthHowConnect.getSmartTvDevices().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getAnyTvDevices()));
        Assert.assertTrue(noAuthHowConnect.getAnyTvDevices().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getSmartphone()));
        Assert.assertTrue(noAuthHowConnect.getSmartphone().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getPc()));
        Assert.assertTrue(noAuthHowConnect.getPc().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getPay()));
        Assert.assertTrue(noAuthHowConnect.getPay().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getAnother()));
        Assert.assertTrue(noAuthHowConnect.getAnother().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getLgIcon()));
        Assert.assertTrue(noAuthHowConnect.getLgIcon().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getSamsungIcon()));
        Assert.assertTrue(noAuthHowConnect.getSamsungIcon().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getAndroidTvIcon()));
        Assert.assertTrue(noAuthHowConnect.getAndroidTvIcon().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getPlayer()));
        Assert.assertTrue(noAuthHowConnect.getPlayer().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthHowConnect.getInstruction()));
        Assert.assertTrue(noAuthHowConnect.getInstruction().isDisplayed());




    }
}