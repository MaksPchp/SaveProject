package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthActorPage;

import java.time.Duration;

public class AllElementsForActorPage {
    NoAuthActorPage noAuthActorPage = new NoAuthActorPage();

    public void allElementsForActorPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10) )
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getBreadcrumb()));
        Assert.assertTrue(noAuthActorPage.getBreadcrumb().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getActorPhoto()));
        Assert.assertTrue(noAuthActorPage.getActorPhoto().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getNameActor()));
        Assert.assertTrue(noAuthActorPage.getNameActor().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getRoleActor()));
        Assert.assertTrue(noAuthActorPage.getRoleActor().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getMiniDescriptionAboutActor()));
        Assert.assertTrue(noAuthActorPage.getMiniDescriptionAboutActor().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getOpenDescription()));
        Assert.assertTrue(noAuthActorPage.getOpenDescription().isDisplayed());

        noAuthActorPage.getOpenDescription().click();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getFullDescriptionAboutActor()));
        Assert.assertTrue(noAuthActorPage.getFullDescriptionAboutActor().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getTextFilmsWithActor()));
        Assert.assertTrue(noAuthActorPage.getTextFilmsWithActor().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthActorPage.getBlockFilmsWithActor()));
        Assert.assertTrue(noAuthActorPage.getBlockFilmsWithActor().isDisplayed());
    }

}
