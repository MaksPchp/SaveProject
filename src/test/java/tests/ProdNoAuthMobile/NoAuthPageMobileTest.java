package tests.ProdNoAuthMobile;

import driver.DriverProvider;
import io.qameta.allure.Description;
import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.Auth.AuthHomePage;
import pages.Modal.ModalAutorizationPage;
import pages.NoAuth.NoAuthMovieInfoPageMobile;
import pages.NoAuth.NoAuthPromoCodePage;
import pages.NoAuth.NoAuthTariffsPage;
import pages.NoAuth.NoAuthTvPage;
import testNgRunner.TestNgRunnerMobile;

import java.time.Duration;
import java.util.ArrayList;

import static constants.Constants.*;

public class NoAuthPageMobileTest extends TestNgRunnerMobile {

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через кнопку Подключить за минуту на баннере украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromHomePageUkrain() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через кнопку Подключить за минуту на баннере русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromHomePageRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через кнопку Подключить за минуту на баннере английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromHomePageEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через телеканал украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromTvUkraine() {
        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через телеканал русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromTvRussia() {
        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через телеканал английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromTvEnglish() {
        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через фильм украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromMovieUkraine() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getPlayButton()));
        noAuthMovieInfoPageMobile.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через фильм русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromMovieRussia() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getPlayButton()));
        noAuthMovieInfoPageMobile.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой в моб. версии, через фильм английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMobileAuthorizWindowFromMovieEnglish() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getPlayButton()));
        noAuthMovieInfoPageMobile.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Работа трейлера на странице фильма моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyPlayTrailerInCinemaPageMobile(){
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getTrailerButton()));
        noAuthMovieInfoPageMobile.getTrailerButton().click();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getTimer()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getTimer().isDisplayed());
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма украинский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieUkraineMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_MOVIE_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovieMobile();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма русский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieRussiaMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_MOVIE_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovieMobile();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма английский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieEnglishMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_MOVIE_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovieMobile();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала украинский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesUkraineMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_SERIES_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeriesMobile();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала русский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesRussiaMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_SERIES_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeriesMobile();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала английский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesEnglishMobile() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriverMobile().get(URL_RANDOM_SERIES_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeriesMobile();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню украинский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonUkraineMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        homePageMobile.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню русский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonRussiaMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        homePageMobile.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню английский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonEnglishMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getLoginButtonOnTheMenu()));
        homePageMobile.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в меню украинский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderUkraineMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        homePageMobile.getTryToFreeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в меню русский язык моб. версия")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderRussiaMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        homePageMobile.getTryToFreeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в меню английский язык моб. версия")
    @Test(timeOut = 30000)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderEnglishMobile() {
        DriverProvider.getDriverMobile().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTryToFreeButton()));
        homePageMobile.getTryToFreeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonUkraine() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();

        new Actions(DriverProvider.getDriver()).moveToElement(noAuthMovieInfoPageMobile.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        noAuthMovieInfoPageMobile.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonRussia() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();

        new Actions(DriverProvider.getDriver()).moveToElement(noAuthMovieInfoPageMobile.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        noAuthMovieInfoPageMobile.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonEnglish() {
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();

        new Actions(DriverProvider.getDriver()).moveToElement(noAuthMovieInfoPageMobile.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        noAuthMovieInfoPageMobile.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу  проммокод украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageUkraine() {
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(promoCodePage.getComeButton()));
        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу  проммокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageRussia() {
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(promoCodePage.getComeButton()));
        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу  проммокод английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageEnglish() {
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(promoCodePage.getComeButton()));
        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageUkraine() {
        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tariffsPage.getConnectTariffMButton()));
        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageRussia() {
        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tariffsPage.getConnectTariffMButton()));
        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageEnglish() {
        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tariffsPage.getConnectTariffMButton()));
        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTwoTvImageInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTwoTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTwoTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowTwoFromTvImageInHomePageRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTwoTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTwoTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTwoTvImageInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTwoTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTwoTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvImageInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvImageInHomePageRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvImageInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        if (homePageMobile.getTvImageInHomePage().isDisplayed()  == false){
            for (int i = 1; homePageMobile.getTvImageInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePageMobile.getTvImageInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePageMobile.getTvImageInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка авторизации по номеру телефона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void ferifyAutorizationByTelephoneNumber() {
        String telephoneNumber = TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS;
        AuthorizationWithTelephoneNumber authorizationWithTelephoneNumber = new AuthorizationWithTelephoneNumber();

        authorizationWithTelephoneNumber.authorizationUkraine(telephoneNumber);
    }

    @Description("Проверка всех элементов во 2-м шаге авторизации украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verify2stepAuthorizWindowUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getConnectToTheOneMinutesButtonOnBanner()));
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGetSmsButton()));
        modalAutorizationPage.getGetSmsButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow2step();
    }

    @Description("Проверка всех элементов во 2-м шаге авторизации русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verify2stepAuthorizWindowRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getConnectToTheOneMinutesButtonOnBanner()));
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGetSmsButton()));
        modalAutorizationPage.getGetSmsButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow2step();
    }

    @Description("Проверка всех элементов во 2-м шаге авторизации английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verify2stepAuthorizWindowEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePageMobile homePageMobile = new HomePageMobile();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getConnectToTheOneMinutesButtonOnBanner()));
        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGetSmsButton()));
        modalAutorizationPage.getGetSmsButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow2step();
    }

    @Description("Проверка ввода не правильного кода и отработки сообщения об ошибке")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyNoValidCodeSms() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS);
        modalAutorizationPage.getGetSmsButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFiledForEnteringSmsCode()));
        modalAutorizationPage.getFiledForEnteringSmsCode().sendKeys("5555");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getNoValidCode()));
        Assert.assertTrue(modalAutorizationPage.getNoValidCode().isDisplayed());
    }

    @Description("Проверка повторной отправки смс кода в авторизации")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyReturnSendSmsCode() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePageMobile.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getToNumberTelephoneButton()));
        modalAutorizationPage.getToNumberTelephoneButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFieldForEnteringAPhoneNumber()));
        modalAutorizationPage.getFieldForEnteringAPhoneNumber().sendKeys(TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS);
        modalAutorizationPage.getGetSmsButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getSendSmsAgainButtonTwo()));
        modalAutorizationPage.getSendSmsAgainButtonTwo().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTimerReturnSendSmsCode()));
        Assert.assertTrue(modalAutorizationPage.getTimerReturnSendSmsCode().isDisplayed());
    }

    @Description("Проверка всех элементов на странице актера украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageUkraine() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_UKRAINE);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageRussia() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_RUSSIA);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageEnglish() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_ENGLISH);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех елементов в футере украина")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterUkraine() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterUkraineMobile();
    }

    @Description("Проверка всех елементов в футере русский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterRussia() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterRussiaMobile();
    }

    @Description("Проверка всех елементов в футере английский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterEnglish() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterEnglishMobile();
    }

    @Description("Проверка ссылок для соц. сетей в футере")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyLinksOnSocialNetworks() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        GoToDownPage goToDownPage = new GoToDownPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        Thread.sleep(800);
        goToDownPage.goToDownPage();
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getInstagramButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getInstagramButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        if (DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER)){
            Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER));
        } else {
            Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER_LOGOUT));
        }
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footerMobile.getFacebookButton().click();
        ArrayList<String> facebook = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(facebook.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FACEBOOK_IN_FOOTER_MOBILE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FACEBOOK_IN_FOOTER_MOBILE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(facebook.get(0));
        footerMobile.getTelegramButton().click();
        ArrayList<String> telegram = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(telegram.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TELEGRAM_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TELEGRAM_IN_FOOTER));

        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        footerMobile.getYoutubeButton().click();
        ArrayList<String> youtube = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(youtube.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_YOUTUBE_IN_FOOTER_MOBILE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_YOUTUBE_IN_FOOTER_MOBILE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        footerMobile.getPinterestButton().click();
        ArrayList<String> pinterest = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(pinterest.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PINTEREST_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PINTEREST_IN_FOOTER));
    }

    @Description("Проверяем наличие всех элементов в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageUkraine() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        allElementsForMenu.allElementsForNoAuthorizationPageUkraineMobile();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        allElementsForMenu.allElementsForNoAuthorizationPageRussiaMobile();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageEnglish() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        allElementsForMenu.allElementsForNoAuthorizationPageEnglishMobile();
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglish()  {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraine()  {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тв приставка в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        homePageMobile.getTvPristavkaButtonInMenuInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TV_PRISTAVKA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TV_PRISTAVKA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тв приставка в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        homePageMobile.getTvPristavkaButtonInMenuInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TV_PRISTAVKA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TV_PRISTAVKA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тв приставка в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTvPristavkaButtonInMenuInMenu()));
        homePageMobile.getTvPristavkaButtonInMenuInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TV_PRISTAVKA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TV_PRISTAVKA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Новости в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        homePageMobile.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Новости в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getNewsButtonInMenu()));
        homePageMobile.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        homePageMobile.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        homePageMobile.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHowToConnectInTheMenu()));
        homePageMobile.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        homePageMobile.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        homePageMobile.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getTariffsButtonInTheMenu()));
        homePageMobile.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPromoCodeButtonInTheMenu()));
        homePageMobile.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Про нас в меню украиснкий язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        homePageMobile.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        homePageMobile.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getAboutUsButtonInTheMenu()));
        homePageMobile.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        homePageMobile.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        homePageMobile.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getHollywoodButtonInTheMenu()));
        homePageMobile.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        homePageMobile.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        homePageMobile.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getItSupportButtonInTheMenu()));
        homePageMobile.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraine(){
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        homePageMobile.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        homePageMobile.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBattleOfBloggersButtonInTheMenu()));
        homePageMobile.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraine(){
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        homePageMobile.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        homePageMobile.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglish(){
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getFondKinoButtonInTheMenu()));
        homePageMobile.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        homePageMobile.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        homePageMobile.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getForThePressButtonUnTheMenu()));
        homePageMobile.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        homePageMobile.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        homePageMobile.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPartnersButtonInTheMenu()));
        homePageMobile.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_ENGLISH));
    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере украинский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterUkrainian() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        GoToDownPage goToDownPage = new GoToDownPage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footerMobile.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footerMobile.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере русский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterRussia() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        GoToDownPage goToDownPage = new GoToDownPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footerMobile.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footerMobile.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере английский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterEnglish() throws InterruptedException {
        FooterMobile footerMobile = new FooterMobile();
        GoToDownPage goToDownPage = new GoToDownPage();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footerMobile.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footerMobile.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        new Actions(DriverProvider.getDriver()).moveToElement(footerMobile.getGooglePlayConnectButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footerMobile.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Скроллим страницу вниз и проверяем, что появляется кнопка вверх украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyActiveToTopButton() throws InterruptedException {
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        Thread.sleep(300);
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getActiveToTopButton()));
        Assert.assertTrue(homePage.getActiveToTopButton().isDisplayed());
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА украиснкий язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsUkraine() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1Mobile();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsStbMobile();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000ActionMobile();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHdMobile();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsRussia() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1Mobile();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsStbMobile();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000ActionMobile();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHdMobile();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsEnglish() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1Mobile();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsStbMobile();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000ActionMobile();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHdMobile();
    }

    @Description("Проверка авторизации через гугл")
    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
    public void verifyAuthorizationByGoogle() throws InterruptedException {
        HomePage homePage = new HomePage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        AuthHomePage authHomePage = new AuthHomePage();

        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGoogleButton()));
        modalAutorizationPage.getGoogleButton().click();
        String MainWindow = DriverProvider.getDriver().getWindowHandle();

        for (String activeHandle : DriverProvider.getDriver().getWindowHandles()) {
            if (!activeHandle.equals(MainWindow)) {
                DriverProvider.getDriver().switchTo().window(activeHandle);
            }
        }
        DriverProvider.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys("testsweetprod@gmail.com");
        DriverProvider.getDriver().findElement(By.xpath("//span[text()='Далее']")).click();
        Thread.sleep(2000);
        DriverProvider.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("Cityline123");
        DriverProvider.getDriver().findElement(By.xpath("//span[text()='Далее']")).click();
        DriverProvider.getDriver().switchTo().window(MainWindow);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
    }

    @Description("Проверка авторизации через фейсбук")
    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
    public void verifyAuthorizationByFacebook() {
        HomePage homePage = new HomePage();
        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        AuthHomePage authHomePage = new AuthHomePage();

        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFacebookButton()));
        modalAutorizationPage.getFacebookButton().click();

        String MainWindow = DriverProvider.getDriver().getWindowHandle();

        for (String activeHandle : DriverProvider.getDriver().getWindowHandles()) {
            if (!activeHandle.equals(MainWindow)) {
                DriverProvider.getDriver().switchTo().window(activeHandle);
            }
        }
        DriverProvider.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("poplavskiivad@gmail.com");
        DriverProvider.getDriver().findElement(By.xpath("//input[@name='pass']")).sendKeys("zomaretka99");
        DriverProvider.getDriver().findElement(By.xpath("//div[@id='login_password_step_element']")).click();
        DriverProvider.getDriver().switchTo().window(MainWindow);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
    }

//    @Description("Проверка авторизации через интернет провайдера")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAuthorizationByInternetProvider() {
//        HomePage homePage = new HomePage();
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
//        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
//        AuthHomePage authHomePage = new AuthHomePage();
//
//        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getInternetProviderButton()));
//        modalAutorizationPage.getInternetProviderButton().click();
//        modalAutorizationPage.getInternetProviderInput().sendKeys(CODE_INTERNET_PROVIDER);
//        modalAutorizationPage.getComeButtonByInternetProvider().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
//        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
//    }

    @Description("Проверка всех элементов на странице Партнеры украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageUkraine() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_UKRAINE);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageRussia() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_RUSSIA);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageEnglish() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_ENGLISH);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageUkraine() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_UKRAINE);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageRussia() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_RUSSIA);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageEnglish() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_ENGLISH);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageUkraine() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_UKRAINE);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageRussia() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_RUSSIA);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageEnglish() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_ENGLISH);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице про нас украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageUkraine() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_UKRAINE);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageRussia() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_RUSSIA);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageEnglish() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_ENGLISH);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех елементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageUkraine() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_UKRAINE);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице промокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageRussia() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_RUSSIA);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageEnglish() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице как подключить украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageUkraine() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице тв приставка украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageUkraine() {
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_UKRAINE);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageRussia() {
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_RUSSIA);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageEnglish() {
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_ENGLISH);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }
}
