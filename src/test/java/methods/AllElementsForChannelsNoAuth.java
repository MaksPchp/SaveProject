package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthTvPage;

import java.time.Duration;

public class AllElementsForChannelsNoAuth {
    NoAuthTvPage noAuthTvPage = new NoAuthTvPage();

    public void AllElementsForChannels1plus1(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextLookOnAnyDevices()));
        Assert.assertTrue(noAuthTvPage.getTextLookOnAnyDevices().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        Assert.assertTrue(noAuthTvPage.getGooglePlayButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        Assert.assertTrue(noAuthTvPage.getAppStoreButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        Assert.assertTrue(noAuthTvPage.getSmartTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTrailer()));
        Assert.assertTrue(noAuthTvPage.getTrailer().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularActor()));
        Assert.assertTrue(noAuthTvPage.getTextPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularActor()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularTv()));
        Assert.assertTrue(noAuthTvPage.getTextPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularTv()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }

    public void AllElementsForChannelsStb(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextLookOnAnyDevices()));
        Assert.assertTrue(noAuthTvPage.getTextLookOnAnyDevices().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        Assert.assertTrue(noAuthTvPage.getGooglePlayButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        Assert.assertTrue(noAuthTvPage.getAppStoreButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        Assert.assertTrue(noAuthTvPage.getSmartTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTrailer()));
        Assert.assertTrue(noAuthTvPage.getTrailer().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularActor()));
        Assert.assertTrue(noAuthTvPage.getTextPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularActor()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularTv()));
        Assert.assertTrue(noAuthTvPage.getTextPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularTv()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }
    public void AllElementsForChannelsTv1000Action(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextLookOnAnyDevices()));
        Assert.assertTrue(noAuthTvPage.getTextLookOnAnyDevices().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        Assert.assertTrue(noAuthTvPage.getGooglePlayButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        Assert.assertTrue(noAuthTvPage.getAppStoreButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        Assert.assertTrue(noAuthTvPage.getSmartTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }
    public void AllElementsForChannelsDiscoveryHd(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextLookOnAnyDevices()));
        Assert.assertTrue(noAuthTvPage.getTextLookOnAnyDevices().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        Assert.assertTrue(noAuthTvPage.getGooglePlayButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        Assert.assertTrue(noAuthTvPage.getAppStoreButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        Assert.assertTrue(noAuthTvPage.getSmartTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
           }

    public void AllElementsForChannels1plus1Mobile(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTrailer()));
        Assert.assertTrue(noAuthTvPage.getTrailer().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularActor()));
        Assert.assertTrue(noAuthTvPage.getTextPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularActor()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularTv()));
        Assert.assertTrue(noAuthTvPage.getTextPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularTv()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }

    public void AllElementsForChannelsStbMobile(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTrailer()));
        Assert.assertTrue(noAuthTvPage.getTrailer().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularActor()));
        Assert.assertTrue(noAuthTvPage.getTextPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularActor()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularActor().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getTextPopularTv()));
        Assert.assertTrue(noAuthTvPage.getTextPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlockPopularTv()));
        Assert.assertTrue(noAuthTvPage.getBlockPopularTv().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }
    public void AllElementsForChannelsTv1000ActionMobile(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock1()));
        Assert.assertTrue(noAuthTvPage.getBlock1().isDisplayed());
        noAuthTvPage.getBlock1().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription1()));
        Assert.assertTrue(noAuthTvPage.getDescription1().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock2()));
        Assert.assertTrue(noAuthTvPage.getBlock2().isDisplayed());
        noAuthTvPage.getBlock2().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription2()));
        Assert.assertTrue(noAuthTvPage.getDescription2().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock3()));
        Assert.assertTrue(noAuthTvPage.getBlock3().isDisplayed());
        noAuthTvPage.getBlock3().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription3()));
        Assert.assertTrue(noAuthTvPage.getDescription3().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getBlock4()));
        Assert.assertTrue(noAuthTvPage.getBlock4().isDisplayed());
        noAuthTvPage.getBlock4().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescription4()));
        Assert.assertTrue(noAuthTvPage.getDescription4().isDisplayed());
    }
    public void AllElementsForChannelsDiscoveryHdMobile(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getWatchToFree()));
        Assert.assertTrue(noAuthTvPage.getWatchToFree().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getOpenTvProgramNoAuth()));
//        Assert.assertTrue(noAuthTvPage.getOpenTvProgramNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getNameChannel()));
        Assert.assertTrue(noAuthTvPage.getNameChannel().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getDescriptionChannel()));
        Assert.assertTrue(noAuthTvPage.getDescriptionChannel().isDisplayed());
    }


}
