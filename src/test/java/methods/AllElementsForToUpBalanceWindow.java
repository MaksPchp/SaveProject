package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Modal.ModalAutorizationPage;
import pages.Modal.ModalToUpBalancePage;

import java.time.Duration;

public class AllElementsForToUpBalanceWindow {
    ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();

    public void allElementsForToUpBalanceWindow(){
        ModalAutorizationPage modalAutorizationPage;
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        Assert.assertTrue(toUpBalancePage.getToUpBalanceText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getSumInput()));
        Assert.assertTrue(toUpBalancePage.getSumInput().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getTextMinSum()));
        Assert.assertTrue(toUpBalancePage.getTextMinSum().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getCloseButton()));
        Assert.assertTrue(toUpBalancePage.getCloseButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getNoActiveButton()));
        Assert.assertTrue(toUpBalancePage.getNoActiveButton().isDisplayed());
    }

}
