package tests.Stg.Authoriz;

import driver.DriverProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import methods.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePageMobile;
import testNgRunner.TestNgRunnerMobile;

import java.time.Duration;

import static constants.Constants.*;

public class AuthStgMobileTest extends TestNgRunnerMobile {

    @Description("Проверка всех елементов в форме пополения баланса украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowUkraineMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса русский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowRussiaMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowEnglishMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех элементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyMobileAllElementsForPromoCodePageUkraine() {

        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех элементов на странице промокод русский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyMobileAllElementsForPromoCodePageRussia() {

        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех элементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyMobileAllElementsForPromoCodePageEnglish() {

        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех элементов на странице Партнеры украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_UKRAINE);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_RUSSIA);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_ENGLISH);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_UKRAINE);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_RUSSIA);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_ENGLISH);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_UKRAINE);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_RUSSIA);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_ENGLISH);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице про нас украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_UKRAINE);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_RUSSIA);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_ENGLISH);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех елементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageUkraine() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_UKRAINE);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageRussia() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_RUSSIA);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageEnglish() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_UKRAINE);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_RUSSIA);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_ENGLISH);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице как подключить украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице тв приставка украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageUkraine() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_STG_TV_PRISTAVKA_PAGE_UKRAINE);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageRussia() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_STG_TV_PRISTAVKA_PAGE_RUSSIA);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageEnglish() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_TV_PRISTAVKA_PAGE_ENGLISH);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }


}
