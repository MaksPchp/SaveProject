package methods;

import driver.DriverProvider;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import pages.HomePageMobile;

import java.time.Duration;

public class AllElementsForMenu {
    public void allElementsForNoAuthorizationPageUkraine(){
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getNewsButtonInMenu()));
        Assert.assertTrue(homePage.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
//        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTryToFreeButton()));
        Assert.assertTrue(homePage.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }
    public void allElementsForNoAuthorizationPageRussia(){
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getNewsButtonInMenu()));
        Assert.assertTrue(homePage.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
//        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTryToFreeButton()));
        Assert.assertTrue(homePage.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }
    public void allElementsForNoAuthorizationPageEnglish(){
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
//        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTryToFreeButton()));
        Assert.assertTrue(homePage.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageUkraine() {
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getNewsButtonInMenu()));
        Assert.assertTrue(homePage.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePage.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageRussia() {
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getNewsButtonInMenu()));
        Assert.assertTrue(homePage.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePage.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageEnglish() {
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageInMenu()));
        Assert.assertTrue(homePage.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        Assert.assertTrue(homePage.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        Assert.assertTrue(homePage.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        Assert.assertTrue(homePage.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePage.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePage.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePage.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePage.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        Assert.assertTrue(homePage.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePage.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePage.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePage.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePage.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePage.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePage.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePage.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        Assert.assertTrue(homePage.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePage.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getChangeLanguageButton()));
        Assert.assertTrue(homePage.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePage.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePage.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageUkraineMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        Assert.assertTrue(homePageMobile.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePageMobile.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageRussiaMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        Assert.assertTrue(homePageMobile.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePageMobile.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForAuthorizationPageEnglishMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeWhiteSkinsButton()));
        Assert.assertTrue(homePageMobile.getChangeWhiteSkinsButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }

    public void allElementsForNoAuthorizationPageUkraineMobile(){
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        Assert.assertTrue(homePageMobile.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        Assert.assertTrue(homePageMobile.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }
    public void allElementsForNoAuthorizationPageRussiaMobile(){
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        Assert.assertTrue(homePageMobile.getNewsButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        Assert.assertTrue(homePageMobile.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }
    public void allElementsForNoAuthorizationPageEnglishMobile(){
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLogoImageInMenu()));
        Assert.assertTrue(homePageMobile.getLogoImageInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvButtonInMenu()));
        Assert.assertTrue(homePageMobile.getTvButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getCinemaButtonInMenu()));
        Assert.assertTrue(homePageMobile.getCinemaButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSeriesButtonInMenu()));
        Assert.assertTrue(homePageMobile.getSeriesButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getMultfilmeButtonInMenu()));
        Assert.assertTrue(homePageMobile.getMultfilmeButtonInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        Assert.assertTrue(homePageMobile.getTvPristavkaButtonInMenuInMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        Assert.assertTrue(homePageMobile.getHowToConnectInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getTariffsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPromoCodeButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPayButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getAboutUsButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getHollywoodButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getItSupportButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getBattleOfBloggersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getFondKinoButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        Assert.assertTrue(homePageMobile.getForThePressButtonUnTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getPartnersButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        Assert.assertTrue(homePageMobile.getBurgerMenuButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        Assert.assertTrue(homePageMobile.getTryToFreeButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getChangeLanguageButton()));
        Assert.assertTrue(homePageMobile.getChangeLanguageButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getSearchButtonInTheMenu()));
        Assert.assertTrue(homePageMobile.getSearchButtonInTheMenu().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        Assert.assertTrue(homePageMobile.getLoginButtonOnTheMenu().isDisplayed());
    }



}
