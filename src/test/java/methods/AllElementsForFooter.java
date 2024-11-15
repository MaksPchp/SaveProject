package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Footer;
import pages.FooterMobile;

import java.time.Duration;

public class AllElementsForFooter {

    public void allElementsForFooterUkraine(){
        Footer footer = new Footer();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
        Assert.assertTrue(footer.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
        Assert.assertTrue(footer.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
        Assert.assertTrue(footer.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
        Assert.assertTrue(footer.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getInstagramButton()));
        Assert.assertTrue(footer.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFacebookButton()));
        Assert.assertTrue(footer.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getYoutubeButton()));
        Assert.assertTrue(footer.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPinterestButton()));
        Assert.assertTrue(footer.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTelegramButton()));
        Assert.assertTrue(footer.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextWeInSocial()));
        Assert.assertTrue(footer.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAboutCompany()));
        Assert.assertTrue(footer.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMailCopyright()));
        Assert.assertTrue(footer.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAddresses()));
        Assert.assertTrue(footer.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAddresses()));
        Assert.assertTrue(footer.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMail()));
        Assert.assertTrue(footer.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextContentSecurity()));
        Assert.assertTrue(footer.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMainButton()));
        Assert.assertTrue(footer.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTvButton()));
        Assert.assertTrue(footer.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMovieButton()));
        Assert.assertTrue(footer.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getCartoonsButton()));
        Assert.assertTrue(footer.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTariffsButton()));
        Assert.assertTrue(footer.getTariffsButton().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getContactsButton()));
//        Assert.assertTrue(footer.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getDogovorButton()));
        Assert.assertTrue(footer.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getNewsButton()));
        Assert.assertTrue(footer.getNewsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivacy()));
        Assert.assertTrue(footer.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getMapButton()));
//        Assert.assertTrue(footer.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAboutUsButton()));
        Assert.assertTrue(footer.getAboutUsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getHollywoodButton()));
        Assert.assertTrue(footer.getHollywoodButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getItSupportButton()));
        Assert.assertTrue(footer.getItSupportButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getBloggersButton()));
        Assert.assertTrue(footer.getBloggersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFondKinoButton()));
        Assert.assertTrue(footer.getFondKinoButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getForPressButton()));
        Assert.assertTrue(footer.getForPressButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPartnersButton()));
        Assert.assertTrue(footer.getPartnersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivatePoliticText()));
        Assert.assertTrue(footer.getPrivatePoliticText().isDisplayed());
    }

    public void allElementsForFooterRussia(){
        Footer footer = new Footer();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
        Assert.assertTrue(footer.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
        Assert.assertTrue(footer.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
        Assert.assertTrue(footer.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
        Assert.assertTrue(footer.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getInstagramButton()));
        Assert.assertTrue(footer.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFacebookButton()));
        Assert.assertTrue(footer.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getYoutubeButton()));
        Assert.assertTrue(footer.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPinterestButton()));
        Assert.assertTrue(footer.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTelegramButton()));
        Assert.assertTrue(footer.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextWeInSocial()));
        Assert.assertTrue(footer.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAboutCompany()));
        Assert.assertTrue(footer.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMailCopyright()));
        Assert.assertTrue(footer.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAddresses()));
        Assert.assertTrue(footer.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAddresses()));
        Assert.assertTrue(footer.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMail()));
        Assert.assertTrue(footer.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextContentSecurity()));
        Assert.assertTrue(footer.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMainButton()));
        Assert.assertTrue(footer.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTvButton()));
        Assert.assertTrue(footer.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMovieButton()));
        Assert.assertTrue(footer.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getCartoonsButton()));
        Assert.assertTrue(footer.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTariffsButton()));
        Assert.assertTrue(footer.getTariffsButton().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getContactsButton()));
//        Assert.assertTrue(footer.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getDogovorButton()));
        Assert.assertTrue(footer.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getNewsButton()));
        Assert.assertTrue(footer.getNewsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivacy()));
        Assert.assertTrue(footer.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getMapButton()));
//        Assert.assertTrue(footer.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAboutUsButton()));
        Assert.assertTrue(footer.getAboutUsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getHollywoodButton()));
        Assert.assertTrue(footer.getHollywoodButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getItSupportButton()));
        Assert.assertTrue(footer.getItSupportButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getBloggersButton()));
        Assert.assertTrue(footer.getBloggersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFondKinoButton()));
        Assert.assertTrue(footer.getFondKinoButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getForPressButton()));
        Assert.assertTrue(footer.getForPressButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPartnersButton()));
        Assert.assertTrue(footer.getPartnersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivatePoliticText()));
        Assert.assertTrue(footer.getPrivatePoliticText().isDisplayed());
    }

    public void allElementsForFooterEnglish(){
        Footer footer = new Footer();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
        Assert.assertTrue(footer.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
        Assert.assertTrue(footer.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
        Assert.assertTrue(footer.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
        Assert.assertTrue(footer.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getInstagramButton()));
        Assert.assertTrue(footer.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFacebookButton()));
        Assert.assertTrue(footer.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getYoutubeButton()));
        Assert.assertTrue(footer.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPinterestButton()));
        Assert.assertTrue(footer.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTelegramButton()));
        Assert.assertTrue(footer.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextWeInSocial()));
        Assert.assertTrue(footer.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAboutCompany()));
        Assert.assertTrue(footer.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMailCopyright()));
        Assert.assertTrue(footer.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextAddresses()));
        Assert.assertTrue(footer.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getAddresses()));
        Assert.assertTrue(footer.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMail()));
        Assert.assertTrue(footer.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextContentSecurity()));
        Assert.assertTrue(footer.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextOurApps()));
        Assert.assertTrue(footer.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTextMenu()));
        Assert.assertTrue(footer.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMainButton()));
        Assert.assertTrue(footer.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTvButton()));
        Assert.assertTrue(footer.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getMovieButton()));
        Assert.assertTrue(footer.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getCartoonsButton()));
        Assert.assertTrue(footer.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTariffsButton()));
        Assert.assertTrue(footer.getTariffsButton().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getContactsButton()));
//        Assert.assertTrue(footer.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getDogovorButton()));
        Assert.assertTrue(footer.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivacy()));
        Assert.assertTrue(footer.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getMapButton()));
//        Assert.assertTrue(footer.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPrivatePoliticText()));
        Assert.assertTrue(footer.getPrivatePoliticText().isDisplayed());
    }

    public void allElementsForFooterUkraineMobile(){
        FooterMobile footerMobile = new FooterMobile();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getGooglePlayConnectButton()));
        Assert.assertTrue(footerMobile.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppStoreConnectButton()));
        Assert.assertTrue(footerMobile.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSmartTvConnectButton()));
        Assert.assertTrue(footerMobile.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppGalleryConnectButton()));
        Assert.assertTrue(footerMobile.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getInstagramButton()));
        Assert.assertTrue(footerMobile.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getFacebookButton()));
        Assert.assertTrue(footerMobile.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getYoutubeButton()));
        Assert.assertTrue(footerMobile.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPinterestButton()));
        Assert.assertTrue(footerMobile.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTelegramButton()));
        Assert.assertTrue(footerMobile.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextWeInSocial()));
        Assert.assertTrue(footerMobile.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAboutCompany()));
        Assert.assertTrue(footerMobile.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailInfo()));
        Assert.assertTrue(footerMobile.getMailInfo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailCopyright()));
        Assert.assertTrue(footerMobile.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAddresses()));
        Assert.assertTrue(footerMobile.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAddresses()));
        Assert.assertTrue(footerMobile.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMail()));
        Assert.assertTrue(footerMobile.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextContentSecurity()));
        Assert.assertTrue(footerMobile.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMainButton()));
        Assert.assertTrue(footerMobile.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTvButton()));
        Assert.assertTrue(footerMobile.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMovieButton()));
        Assert.assertTrue(footerMobile.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getCartoonsButton()));
        Assert.assertTrue(footerMobile.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSeriesButton()));
        Assert.assertTrue(footerMobile.getSeriesButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTariffsButton()));
        Assert.assertTrue(footerMobile.getTariffsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getContactsButton()));
        Assert.assertTrue(footerMobile.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getDogovorButton()));
        Assert.assertTrue(footerMobile.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getNewsButton()));
        Assert.assertTrue(footerMobile.getNewsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivacy()));
        Assert.assertTrue(footerMobile.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footerMobile.getMapButton()));
//        Assert.assertTrue(footerMobile.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAboutUsButton()));
        Assert.assertTrue(footerMobile.getAboutUsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getHollywoodButton()));
        Assert.assertTrue(footerMobile.getHollywoodButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getItSupportButton()));
        Assert.assertTrue(footerMobile.getItSupportButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getBloggersButton()));
        Assert.assertTrue(footerMobile.getBloggersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getFondKinoButton()));
        Assert.assertTrue(footerMobile.getFondKinoButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getForPressButton()));
        Assert.assertTrue(footerMobile.getForPressButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPartnersButton()));
        Assert.assertTrue(footerMobile.getPartnersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivatePoliticText()));
        Assert.assertTrue(footerMobile.getPrivatePoliticText().isDisplayed());
    }

    public void allElementsForFooterRussiaMobile(){
        FooterMobile footerMobile = new FooterMobile();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getGooglePlayConnectButton()));
        Assert.assertTrue(footerMobile.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppStoreConnectButton()));
        Assert.assertTrue(footerMobile.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSmartTvConnectButton()));
        Assert.assertTrue(footerMobile.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppGalleryConnectButton()));
        Assert.assertTrue(footerMobile.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getInstagramButton()));
        Assert.assertTrue(footerMobile.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getFacebookButton()));
        Assert.assertTrue(footerMobile.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getYoutubeButton()));
        Assert.assertTrue(footerMobile.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPinterestButton()));
        Assert.assertTrue(footerMobile.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTelegramButton()));
        Assert.assertTrue(footerMobile.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextWeInSocial()));
        Assert.assertTrue(footerMobile.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAboutCompany()));
        Assert.assertTrue(footerMobile.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailInfo()));
        Assert.assertTrue(footerMobile.getMailInfo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailCopyright()));
        Assert.assertTrue(footerMobile.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAddresses()));
        Assert.assertTrue(footerMobile.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAddresses()));
        Assert.assertTrue(footerMobile.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMail()));
        Assert.assertTrue(footerMobile.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextContentSecurity()));
        Assert.assertTrue(footerMobile.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMainButton()));
        Assert.assertTrue(footerMobile.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTvButton()));
        Assert.assertTrue(footerMobile.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMovieButton()));
        Assert.assertTrue(footerMobile.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getCartoonsButton()));
        Assert.assertTrue(footerMobile.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSeriesButton()));
        Assert.assertTrue(footerMobile.getSeriesButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTariffsButton()));
        Assert.assertTrue(footerMobile.getTariffsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getContactsButton()));
        Assert.assertTrue(footerMobile.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getDogovorButton()));
        Assert.assertTrue(footerMobile.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getNewsButton()));
        Assert.assertTrue(footerMobile.getNewsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivacy()));
        Assert.assertTrue(footerMobile.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footerMobile.getMapButton()));
//        Assert.assertTrue(footerMobile.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAboutUsButton()));
        Assert.assertTrue(footerMobile.getAboutUsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getHollywoodButton()));
        Assert.assertTrue(footerMobile.getHollywoodButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getItSupportButton()));
        Assert.assertTrue(footerMobile.getItSupportButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getBloggersButton()));
        Assert.assertTrue(footerMobile.getBloggersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getFondKinoButton()));
        Assert.assertTrue(footerMobile.getFondKinoButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getForPressButton()));
        Assert.assertTrue(footerMobile.getForPressButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPartnersButton()));
        Assert.assertTrue(footerMobile.getPartnersButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivatePoliticText()));
        Assert.assertTrue(footerMobile.getPrivatePoliticText().isDisplayed());
    }

    public void allElementsForFooterEnglishMobile(){
        FooterMobile footerMobile = new FooterMobile();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getGooglePlayConnectButton()));
        Assert.assertTrue(footerMobile.getGooglePlayConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppStoreConnectButton()));
        Assert.assertTrue(footerMobile.getAppStoreConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSmartTvConnectButton()));
        Assert.assertTrue(footerMobile.getSmartTvConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAppGalleryConnectButton()));
        Assert.assertTrue(footerMobile.getAppGalleryConnectButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getInstagramButton()));
        Assert.assertTrue(footerMobile.getInstagramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getFacebookButton()));
        Assert.assertTrue(footerMobile.getFacebookButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getYoutubeButton()));
        Assert.assertTrue(footerMobile.getYoutubeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPinterestButton()));
        Assert.assertTrue(footerMobile.getPinterestButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTelegramButton()));
        Assert.assertTrue(footerMobile.getTelegramButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextWeInSocial()));
        Assert.assertTrue(footerMobile.getTextWeInSocial().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAboutCompany()));
        Assert.assertTrue(footerMobile.getTextAboutCompany().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailInfo()));
        Assert.assertTrue(footerMobile.getMailInfo().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMailCopyright()));
        Assert.assertTrue(footerMobile.getMailCopyright().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextAddresses()));
        Assert.assertTrue(footerMobile.getTextAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getAddresses()));
        Assert.assertTrue(footerMobile.getAddresses().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMail()));
        Assert.assertTrue(footerMobile.getTextMail().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextContentSecurity()));
        Assert.assertTrue(footerMobile.getTextContentSecurity().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextOurApps()));
        Assert.assertTrue(footerMobile.getTextOurApps().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTextMenu()));
        Assert.assertTrue(footerMobile.getTextMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMainButton()));
        Assert.assertTrue(footerMobile.getMainButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTvButton()));
        Assert.assertTrue(footerMobile.getTvButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getMovieButton()));
        Assert.assertTrue(footerMobile.getMovieButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getCartoonsButton()));
        Assert.assertTrue(footerMobile.getCartoonsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getSeriesButton()));
        Assert.assertTrue(footerMobile.getSeriesButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getTariffsButton()));
        Assert.assertTrue(footerMobile.getTariffsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getContactsButton()));
        Assert.assertTrue(footerMobile.getContactsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getDogovorButton()));
        Assert.assertTrue(footerMobile.getDogovorButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivacy()));
        Assert.assertTrue(footerMobile.getPrivacy().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footerMobile.getMapButton()));
//        Assert.assertTrue(footerMobile.getMapButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footerMobile.getPrivatePoliticText()));
        Assert.assertTrue(footerMobile.getPrivatePoliticText().isDisplayed());
    }
}
