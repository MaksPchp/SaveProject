package tests.Stg.Authoriz;

import api.Get200Response.Stg.Auth.*;
import api.GetCategoryInTheTv;
import api.GetNumberOfChannelsInFavorites;
import driver.DriverProvider;
import io.qameta.allure.Description;
import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.Auth.AuthTvPage;
import pages.Auth.CabinetPage;
import testNgRunner.TestNgRunner;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.List;

import static constants.Constants.*;
import static constants.Constants.URL_STG_TV_PRISTAVKA_PAGE_UKRAINE;


public class AuthStgTest extends TestNgRunner {

    @Description("Проверяем наличие всех элементов в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsMenuAuthUkraine() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        allElementsForMenu.allElementsForAuthorizationPageUkraine();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык авторизованная сторона")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyAllElementsMenuAuthRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        allElementsForMenu.allElementsForAuthorizationPageRussia();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык авторизованная сторона")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyAllElementsMenuAuthEnglish() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        allElementsForMenu.allElementsForAuthorizationPageEnglish();
    }

    @Description("Проверяем нажатие на логотип украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOME_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOME_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие на логотип русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOME_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOME_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие на логотип английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOME_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOME_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        AuthTvPage authTvPage = new AuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        AuthTvPage authTvPage = new AuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        AuthTvPage authTvPage = new AuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню язык язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_ENGLISH));
    }


    @Description("Проверяем нажатие кнопки Новости в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_NEWS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_NEWS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Новости в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_NEWS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_NEWS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CabinetPage cabinetPage = new CabinetPage();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getTextPopolnenieSchetaModalPay()));
        Assert.assertTrue(cabinetPage.getTextPopolnenieSchetaModalPay().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Про нас в меню украиснкий язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык  авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_ENGLISH));
    }
    // Проверка выхода из аккаунта
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyLogOut() throws InterruptedException {
//        String numberTelephone = TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS;
//        HomePage homePage = new HomePage();
//        AuthHomePage authHomePage = new AuthHomePage();
//        CabinetPage cabinetPage = new CabinetPage();
//        AuthorizationWithTelephoneNumberSTG authorizationWithTelephoneNumberSTG = new AuthorizationWithTelephoneNumberSTG();
//
//        authorizationWithTelephoneNumberSTG.authorizationSTGUkraine(numberTelephone);
//        authHomePage.getCabinetButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(cabinetPage.getLogOutButton()));
//        cabinetPage.getLogOutButton().click();
//
//        Thread.sleep(Duration.ofSeconds(10)00);
//        DriverProvider.getDriver().switchTo().alert().accept();
//        Thread.sleep(Duration.ofSeconds(10)00);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getTryToFreeButton()));
//        homePage.getTryToFreeButton().isDisplayed();
//    }

    @Description("Проверяем сворачивание видео при открытии телепрограммы")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMinimizingThePlayer() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getOpenTvProgram()));
        authTvPage.getOpenTvProgram().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getPlayerMinimizing()));
        Assert.assertTrue(authTvPage.getPlayerMinimizing().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getOpenTvProgram()));
        authTvPage.getOpenTvProgram().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getPlayerNotMinimizing()));
        Assert.assertTrue(authTvPage.getPlayerNotMinimizing().isDisplayed());
    }

    @Description("Проверяем запрет перемотки на канале")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyRewindProhibition() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getSearchButtonInTheTvPage()));
        authTvPage.getSearchButtonInTheTvPage().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getSearchFiled()));
        authTvPage.getSearchFiled().sendKeys("Украина HD");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getUkraineHdChannel()));
        authTvPage.getUkraineHdChannel().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getProgressBar()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTvPage.getProgressBar()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getChannelForbadeRewinding()));
        Assert.assertTrue(authTvPage.getChannelForbadeRewinding().isDisplayed());
    }

    @Description("Проверяем что по умолчанию стоит качество авто")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyDefaultQualityAuto() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getQualityAuto()));
        Assert.assertTrue(authTvPage.getQualityAuto().isDisplayed());
    }

    @Description("Проверка кнопок Вначало и в Эфир в тв")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyToStartAndToEfirButton() {
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getToStartButton()));
        Assert.assertTrue(authTvPage.getToStartButton().isDisplayed());
        authTvPage.getToStartButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getToEfirButton()));
        Assert.assertTrue(authTvPage.getToEfirButton().isDisplayed());
        authTvPage.getToEfirButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getToStartButton()));
        Assert.assertTrue(authTvPage.getToStartButton().isDisplayed());
    }

    @Description("проверка добавление канала в избранное украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAddingAndDeletingAChannelToFavorites() {
        HomePage homePage = new HomePage();
        GetNumberOfChannelsInFavorites getNumberOfChannelsInFavorites = new GetNumberOfChannelsInFavorites();
        AuthTvPage authTvPage = new AuthTvPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        // Первый запрос кол-ва каналов в избранном
        int firstNumberOfChannelsInFavorites = getNumberOfChannelsInFavorites.getNumberOfChannelsInFavorites();
        // Добавляем канал в избранное
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstNoLikedChanel()));
        authTvPage.getFirstNoLikedChanel().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstNoLikedIconChanel()));
        authTvPage.getFirstNoLikedIconChanel().click();
        // Второй запрос кол-ва каналов в избранном
        int secondNumberOfChannelsInFavorites = getNumberOfChannelsInFavorites.getNumberOfChannelsInFavorites();
        int actualResult = secondNumberOfChannelsInFavorites - firstNumberOfChannelsInFavorites;
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstLikedChanel()));
        authTvPage.getFirstLikedChanel().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstLikedIconChanel()));
        authTvPage.getFirstLikedIconChanel().click();
    }

    @Description("Проверяем наличие категорий на странице ТВ украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyCategoryInTheTv() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        GetCategoryInTheTv getCategoryInTheTv = new GetCategoryInTheTv();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        List<Object> categoryInTheTv = getCategoryInTheTv.getCategoryInTheTv();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        authTvPage.getCategoryButton().click();
        for (int i = 0; i < categoryInTheTv.size(); i++){
            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//li[text()='"+ categoryInTheTv.get(i) +"']"))));
            Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//li[text()='"+ categoryInTheTv.get(i) +"']")).isDisplayed());
        }
    }

    @Description("Проверка открытия и закрытия фуллскрина в ТВ украинский язык с помощью элементов управления")
    @Test(timeOut = 60000, retryAnalyzer = Retry.class)
    public void verifyWorkFullscreenInTheTVUkraine() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        // Открытие и закрытие фуллскрин кнопкой в плеере
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getEnterFullScreenButton()));
        Assert.assertTrue(authTvPage.getEnterFullScreenButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getEnterFullScreenButton()));
        authTvPage.getEnterFullScreenButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getExitFullScreenButton()));
        Assert.assertTrue(authTvPage.getExitFullScreenButton().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getExitFullScreenButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(authTvPage.getExitFullScreenButton()).perform();
        authTvPage.getExitFullScreenButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getEnterFullScreenButton()));
        Assert.assertTrue(authTvPage.getEnterFullScreenButton().isDisplayed());
    }

    @Description("Проверка работы поиска на странице ТВ украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyTvSearch() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getSearchButtonInTheTvPage()));
        authTvPage.getSearchButtonInTheTvPage().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getSearchFiled()));
        authTvPage.getSearchFiled().sendKeys("Nickelodeon HD");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getNickelodeonHdChanel()));
        Assert.assertTrue(authTvPage.getNickelodeonHdChanel().isDisplayed());
    }

//    @Description("Проверка главной страницы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHomePage(){
//        AuthStgGet200ResponseHomePage noAuthGet200ResponseHomePage = new AuthStgGet200ResponseHomePage();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageUkraine();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageRussia();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageEnglish();
//    }
//
//    @Description("Проверка страницы ТВ на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTvPage() {
//        AuthStgGet200ResponseTv get200ResponseTv = new AuthStgGet200ResponseTv();
//        get200ResponseTv.get200ResponseTvUkraine();
//        get200ResponseTv.get200ResponseTvRussia();
//        get200ResponseTv.get200ResponseTvEnglish();
//    }
//
//    @Description("Проверка страницы фильмы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForMoviePage() {
//        AuthStgGet200ResponseMovie get200ResponseMovie = new AuthStgGet200ResponseMovie();
//        get200ResponseMovie.get200ResponseMovieUkraine();
//        get200ResponseMovie.get200ResponseMovieRussia();
//        get200ResponseMovie.get200ResponseMovieEnglish();
//    }
//
//    @Description("Проверка страницы сериалы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForSeriesPage() {
//        AuthStgGet200ResponseSeries get200ResponseSeries = new AuthStgGet200ResponseSeries();
//        get200ResponseSeries.get200ResponseSeriesUkraine();
//        get200ResponseSeries.get200ResponseSeriesRussia();
//        get200ResponseSeries.get200ResponseSeriesEnglish();
//    }
//
//    @Description("Проверка страницы мультфильмы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForCartoonsPage() {
//        AuthStgGet200ResponseCartoons get200ResponseCartoons = new AuthStgGet200ResponseCartoons();
//        get200ResponseCartoons.get200ResponseCartoonsUkraine();
//        get200ResponseCartoons.get200ResponseCartoonsRussia();
//        get200ResponseCartoons.get200ResponseCartoonsEnglish();
//    }
//
//    @Description("Проверка страницы тв приставка на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTvPristavkaPage() {
//        AuthStgGet200ResponseTvPristavka get200ResponseTvPristavka = new AuthStgGet200ResponseTvPristavka();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaUkraine();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaRussia();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaEnglish();
//    }
//
//    @Description("Проверка страницы новости на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForNewsPage() {
//        AuthStgGet200ResponseNews get200ResponseNews = new AuthStgGet200ResponseNews();
//        get200ResponseNews.get200ResponseNewsUkraine();
//        get200ResponseNews.get200ResponseNewsRussia();
//    }
//
//    @Description("Проверка страницы как подключить на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHowConnectPage() {
//        AuthStgGet200ResponseHowConnect get200ResponseHowConnect = new AuthStgGet200ResponseHowConnect();
//        get200ResponseHowConnect.get200ResponseHowConnectUkraine();
//        get200ResponseHowConnect.get200ResponseHowConnectRussia();
//        get200ResponseHowConnect.get200ResponseHowConnectEnglish();
//    }
//
//    @Description("Проверка страницы тарифы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTariffsPage() {
//        AuthStgGet200ResponseTariffs get200ResponseTariffs = new AuthStgGet200ResponseTariffs();
//        get200ResponseTariffs.get200ResponseTariffsUkraine();
//        get200ResponseTariffs.get200ResponseTariffsRussia();
//        get200ResponseTariffs.get200ResponseTariffsEnglish();
//    }
//
//    @Description("Проверка страницы промо код на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForPromoCodePage() {
//        AuthStgGet200ResponsePromoCode get200ResponsePromoCode = new AuthStgGet200ResponsePromoCode();
//        get200ResponsePromoCode.get200ResponsePromoCodeUkraine();
//        get200ResponsePromoCode.get200ResponsePromoCodeRussia();
//        get200ResponsePromoCode.get200ResponsePromoCodeEnglish();
//    }
//
//    @Description("Проверка страницы про нас на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForAboutUsPage() {
//        AuthStgGet200ResponseAboutUs get200ResponseAboutUs = new AuthStgGet200ResponseAboutUs();
//        get200ResponseAboutUs.get200ResponseAboutUsUkraine();
//        get200ResponseAboutUs.get200ResponseAboutUsRussia();
//        get200ResponseAboutUs.get200ResponseAboutUsEnglish();
//    }
//
//    @Description("Проверка страницы голливуд укранским на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHollywoodPage() {
//        AuthStgGet200ResponseHollywood get200ResponseHollywood = new AuthStgGet200ResponseHollywood();
//        get200ResponseHollywood.get200ResponseHollywoodUkraine();
//        get200ResponseHollywood.get200ResponseHollywoodRussia();
//        get200ResponseHollywood.get200ResponseHollywoodEnglish();
//    }
//
//    @Description("Проверка страницы поддержка айти на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForSupportItPage() {
//        AuthStgGet200ResponseSupportIt get200ResponseSupportIt = new AuthStgGet200ResponseSupportIt();
//        get200ResponseSupportIt.get200ResponseSupportItUkraine();
//        get200ResponseSupportIt.get200ResponseSupportItRussia();
//        get200ResponseSupportIt.get200ResponseSupportItEnglish();
//    }
//
//    @Description("Проверка страницы битва блегеров на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForBattleBloggersPage() {
//        AuthStgGet200ResponseBattleBloggers get200ResponseBattleBloggers = new AuthStgGet200ResponseBattleBloggers();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersUkraine();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersRussia();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersEnglish();
//    }
//
//    @Description("Проверка страницы фонд кино на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForFondKinoPage() {
//        AuthStgGet200ResponseFondKino get200ResponseFondKino = new AuthStgGet200ResponseFondKino();
//        get200ResponseFondKino.get200ResponseFondKinoUkraine();
//        get200ResponseFondKino.get200ResponseFondKinoRussia();
//        get200ResponseFondKino.get200ResponseFondKinoEnglish();
//    }
//
//    @Description("Проверка страницы для прессы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForForPressPage() {
//        AuthStgGet200ResponseForPress get200ResponseForPress = new AuthStgGet200ResponseForPress();
//        get200ResponseForPress.get200ResponseForPressUkraine();
//        get200ResponseForPress.get200ResponseForPressRussia();
//        get200ResponseForPress.get200ResponseForPressEnglish();
//    }
//
//    @Description("Проверка страницы партнеры на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForPartnersPage() {
//        AuthStgGet200ResponsePartners get200ResponsePartners = new AuthStgGet200ResponsePartners();
//        get200ResponsePartners.get200ResponsePartnersUkraine();
//        get200ResponsePartners.get200ResponsePartnersRussia();
//        get200ResponsePartners.get200ResponsePartnersEnglish();
//    }

    @Description("Проверка всех елементов в форме пополения баланса украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowUkraine() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();

        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowRussia() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenRussia();

        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowEnglish() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();

        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }


//    @Description("Проверка всех элементов на странице Партнеры украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageUkraine() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenUkraine();
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_UKRAINE);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }
//
//    @Description("Проверка всех элементов на странице Партнеры русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageRussia() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenRussia();
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_RUSSIA);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }
//
//    @Description("Проверка всех элементов на странице Партнеры английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageEnglish() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenEnglish();
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_ENGLISH);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }

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

//    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageUkraine() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenUkraine();
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_UKRAINE);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }
//
//    @Description("Проверка всех элементов на странице поддержка айти русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageRussia() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenRussia();
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_RUSSIA);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }
//
//    @Description("Проверка всех элементов на странице поддержка айти английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageEnglish() {
//        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        authorizationWithTokenSTG.authorizationWithTokenEnglish();
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_ENGLISH);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }

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

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageUkraine() {
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenUkraine();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_UKRAINE);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPage();
    }

    @Description("Проверка всех елементов на странице тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageRussia() {
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenRussia();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_RUSSIA);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPage();
    }

    @Description("Проверка всех елементов на странице тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsOnTheTariffsPageEnglish() {
        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
        AuthorizationWithTokenSTG authorizationWithTokenSTG = new AuthorizationWithTokenSTG();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        authorizationWithTokenSTG.authorizationWithTokenEnglish();
        DriverProvider.getDriverMobile().get(URL_STG_TARIFFS_PAGE_ENGLISH);
        closeStgPanel.closeStgPanel();
        allElementsForTariffsPage.allElementsForTariffsPage();
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


}
