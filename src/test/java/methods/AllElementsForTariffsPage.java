package methods;

import driver.DriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Auth.AuthTariffsPage;

import java.time.Duration;

public class AllElementsForTariffsPage {
    AuthTariffsPage authTariffsPage = new AuthTariffsPage();

    public void allElementsForTariffsPage(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getYourTariffPlanText()));
        Assert.assertTrue(authTariffsPage.getYourTariffPlanText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getMyTariffBlock()));
        Assert.assertTrue(authTariffsPage.getMyTariffBlock().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getOurTariffPlansText()));
        Assert.assertTrue(authTariffsPage.getOurTariffPlansText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage1()));
        Assert.assertTrue(authTariffsPage.getImage1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage2()));
        Assert.assertTrue(authTariffsPage.getImage2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage3()));
        Assert.assertTrue(authTariffsPage.getImage3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage4()));
        Assert.assertTrue(authTariffsPage.getImage4().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getAdvertisementsForFilmsAreNotText()));
        Assert.assertTrue(authTariffsPage.getAdvertisementsForFilmsAreNotText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getAvailableOnSmartphonesText()));
        Assert.assertTrue(authTariffsPage.getAvailableOnSmartphonesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getUpto5DevicesText()));
        Assert.assertTrue(authTariffsPage.getUpto5DevicesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLargeCatalogFfFilmstext()));
        Assert.assertTrue(authTariffsPage.getLargeCatalogFfFilmstext().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFullAnd4KText()));
        Assert.assertTrue(authTariffsPage.getFullAnd4KText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContentSaveInRecordText()));
        Assert.assertTrue(authTariffsPage.getContentSaveInRecordText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getPaymentMethodText()));
        Assert.assertTrue(authTariffsPage.getPaymentMethodText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getPaySystemBlock()));
        Assert.assertTrue(authTariffsPage.getPaySystemBlock().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFaqText()));
        Assert.assertTrue(authTariffsPage.getFaqText().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageText()));
        authTariffsPage.getSubscriptionAdvantageText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageText()));
        Assert.assertTrue(authTariffsPage.getSubscriptionAdvantageText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageTextPlus()));
        Assert.assertTrue(authTariffsPage.getSubscriptionAdvantageTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectText()));
        authTariffsPage.getHowToConnectText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectText()));
        Assert.assertTrue(authTariffsPage.getHowToConnectText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectTextPlus()));
        Assert.assertTrue(authTariffsPage.getHowToConnectTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftext()));
        authTariffsPage.getContinuationOfTheTarifftext().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftext()));
        Assert.assertTrue(authTariffsPage.getContinuationOfTheTarifftext().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftextPlus()));
        Assert.assertTrue(authTariffsPage.getContinuationOfTheTarifftextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodText()));
        authTariffsPage.getTestPeriodText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodText()));
        Assert.assertTrue(authTariffsPage.getTestPeriodText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodTextPlus()));
        Assert.assertTrue(authTariffsPage.getTestPeriodTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveText()));
        authTariffsPage.getLiveText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveText()));
        Assert.assertTrue(authTariffsPage.getLiveText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveTextPlus()));
        Assert.assertTrue(authTariffsPage.getLiveTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesText()));
        authTariffsPage.getFiveDevicesText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesText()));
        Assert.assertTrue(authTariffsPage.getFiveDevicesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesTextPlus()));
        Assert.assertTrue(authTariffsPage.getFiveDevicesTextPlus().isDisplayed());

    }

    public void allElementsForTariffsPageMobile(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getYourTariffPlanText()));
        Assert.assertTrue(authTariffsPage.getYourTariffPlanText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getMyTariffBlock()));
        Assert.assertTrue(authTariffsPage.getMyTariffBlock().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getOurTariffPlansText()));
        Assert.assertTrue(authTariffsPage.getOurTariffPlansText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage1()));
        Assert.assertTrue(authTariffsPage.getImage1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage2()));
        Assert.assertTrue(authTariffsPage.getImage2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage3()));
        Assert.assertTrue(authTariffsPage.getImage3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getImage4()));
        Assert.assertTrue(authTariffsPage.getImage4().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getAdvertisementsForFilmsAreNotText()));
        Assert.assertTrue(authTariffsPage.getAdvertisementsForFilmsAreNotText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getAvailableOnSmartphonesText()));
        Assert.assertTrue(authTariffsPage.getAvailableOnSmartphonesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getUpto5DevicesText()));
        Assert.assertTrue(authTariffsPage.getUpto5DevicesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLargeCatalogFfFilmstext()));
        Assert.assertTrue(authTariffsPage.getLargeCatalogFfFilmstext().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFullAnd4KText()));
        Assert.assertTrue(authTariffsPage.getFullAnd4KText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContentSaveInRecordText()));
        Assert.assertTrue(authTariffsPage.getContentSaveInRecordText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getPaymentMethodText()));
        Assert.assertTrue(authTariffsPage.getPaymentMethodText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getPaySystemBlock()));
        Assert.assertTrue(authTariffsPage.getPaySystemBlock().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFaqText()));
        Assert.assertTrue(authTariffsPage.getFaqText().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageText()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getSubscriptionAdvantageText()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authTariffsPage.getSubscriptionAdvantageText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageText()));
        Assert.assertTrue(authTariffsPage.getSubscriptionAdvantageText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getSubscriptionAdvantageTextPlus()));
        Assert.assertTrue(authTariffsPage.getSubscriptionAdvantageTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectText()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getHowToConnectText()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authTariffsPage.getHowToConnectText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectText()));
        Assert.assertTrue(authTariffsPage.getHowToConnectText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getHowToConnectTextPlus()));
        Assert.assertTrue(authTariffsPage.getHowToConnectTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftext()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getContinuationOfTheTarifftext()).perform();
        authTariffsPage.getContinuationOfTheTarifftext().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftext()));
        Assert.assertTrue(authTariffsPage.getContinuationOfTheTarifftext().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getContinuationOfTheTarifftextPlus()));
        Assert.assertTrue(authTariffsPage.getContinuationOfTheTarifftextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodText()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getTestPeriodText()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authTariffsPage.getTestPeriodText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodText()));
        Assert.assertTrue(authTariffsPage.getTestPeriodText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getTestPeriodTextPlus()));
        Assert.assertTrue(authTariffsPage.getTestPeriodTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveText()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getLiveText()).perform();
        authTariffsPage.getLiveText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveText()));
        Assert.assertTrue(authTariffsPage.getLiveText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getLiveTextPlus()));
        Assert.assertTrue(authTariffsPage.getLiveTextPlus().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesText()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTariffsPage.getFiveDevicesText()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authTariffsPage.getFiveDevicesText().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesText()));
        Assert.assertTrue(authTariffsPage.getFiveDevicesText().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTariffsPage.getFiveDevicesTextPlus()));
        Assert.assertTrue(authTariffsPage.getFiveDevicesTextPlus().isDisplayed());
    }

}
