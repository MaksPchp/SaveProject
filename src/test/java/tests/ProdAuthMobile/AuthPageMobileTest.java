package tests.ProdAuthMobile;

import driver.DriverProvider;
import io.qameta.allure.Description;
import methods.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Auth.AuthTvPage;
import pages.Auth.CabinetPage;
import pages.HomePageMobile;
import testNgRunner.TestNgRunnerMobile;

import java.time.Duration;

import static constants.Constants.*;
import static constants.Constants.URL_CINEMA_PAGE_ENGLISH;

public class AuthPageMobileTest extends TestNgRunnerMobile {

    @Description("Проверка всех елементов в форме пополения баланса украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowUkraineMobile() {
        HomePageMobile homePageMobile = new HomePageMobile();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();

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
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageUkraine() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_UKRAINE);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageRussia() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_RUSSIA);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageEnglish() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверяем наличие всех элементов в меню украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyLogoImageUkraine() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
        allElementsForMenu.allElementsForAuthorizationPageUkraineMobile();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
        allElementsForMenu.allElementsForAuthorizationPageRussiaMobile();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageEnglish() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        allElementsForMenu.allElementsForAuthorizationPageEnglishMobile();
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();
        HomePageMobile homePageMobile = new HomePageMobile();

        authorizationWithToken.authorizationWithTokenUkraine();
        homePageMobile.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню язык язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePageMobile homePageMobile = new HomePageMobile();
        homePageMobile.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тв приставка в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Тв приставка в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Тв приставка в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTvPristavkaButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Новости в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Новости в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePageMobile homePageMobile = new HomePageMobile();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getBurgerMenuButton()));
        homePageMobile.getBurgerMenuButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePageMobile.getPayButtonInTheMenu()));
        homePageMobile.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Про нас в меню украиснкий язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык  авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
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

    @Description("Проверка всех элементов на странице Партнеры украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_UKRAINE);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_RUSSIA);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_ENGLISH);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_UKRAINE);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_RUSSIA);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_ENGLISH);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_UKRAINE);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_RUSSIA);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_ENGLISH);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице про нас украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_UKRAINE);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_RUSSIA);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_ENGLISH);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех елементов на странице тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_UKRAINE);
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_RUSSIA);
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_ENGLISH);
        allElementsForTariffsPage.allElementsForTariffsPageMobile();
    }

    @Description("Проверка всех елементов на странице как подключить украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице тв приставка украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_UKRAINE);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_RUSSIA);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }

    @Description("Проверка всех елементов на странице тв приставка английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForTvPristavkaPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForTvPristavkaPage allElementsForTvPristavkaPage = new AllElementsForTvPristavkaPage();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_TV_PRISTAVKA_PAGE_ENGLISH);
        allElementsForTvPristavkaPage.allElementsForTvPristavkaPage();
    }




}
