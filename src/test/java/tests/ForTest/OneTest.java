package tests.ForTest;


import driver.DriverProvider;
import io.qameta.allure.Description;
import methods.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NoAuth.NoAuthActorPage;
import testNgRunner.TestNgRunner;

import static constants.Constants.*;

public class OneTest extends TestNgRunner {
    @Description("Первый удачный тест")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void firstHappyTest() {

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
    }

    @Description("Второй удачный тест")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void secondHappyTest() {

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
    }

    @Description("Не удачный тест")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        NoAuthActorPage noAuthActorPage = new NoAuthActorPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        Assert.assertTrue(noAuthActorPage.getNameActor().isDisplayed());

    }

}
