package tests.Stg.NoUathoriz;
import api.Get200Response.Prod.NoAuth.NoAuthGet200Response3Actor;
import api.Get200Response.Prod.NoAuth.NoAuthGet200Response3Genres;
import api.Get200Response.Prod.NoAuth.NoAuthGet200Response5Movie;
import api.Get200Response.Stg.NoAuth.*;
import driver.DriverProvider;
import io.qameta.allure.Description;
import io.restassured.response.ValidatableResponse;
import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.Auth.AuthHomePage;
import pages.Auth.AuthMovieInfoPage;
import pages.Auth.AuthTvPage;
import pages.Modal.ModalAutorizationPage;
import pages.NoAuth.NoAuthMovieInfoPage;
import pages.NoAuth.NoAuthPromoCodePage;
import pages.NoAuth.NoAuthTariffsPage;
import pages.NoAuth.NoAuthTvPage;
import testNgRunner.TestNgRunner;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.testng.AssertJUnit.fail;

public class NoAuthStgTest extends TestNgRunner {

    @Description("Проверяем наличие всех элементов в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageUkraine() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        allElementsForMenu.allElementsForNoAuthorizationPageUkraine();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        allElementsForMenu.allElementsForNoAuthorizationPageRussia();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageEnglish() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        allElementsForMenu.allElementsForNoAuthorizationPageEnglish();
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussia()  {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_CARTOONS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Новости в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_NEWS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_NEWS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Новости в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_NEWS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_NEWS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_TARIFFS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_TARIFFS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PROMOCODE_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PROMOCODE_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Про нас в меню украиснкий язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_ABOUT_US_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_ABOUT_US_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_HOLLYWOOD_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_HOLLYWOOD_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_IT_SUPPORT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_IT_SUPPORT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraine(){
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_BATTLE_BLOGGERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_BATTLE_BLOGGERS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraine(){
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglish(){
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOND_KINO_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOND_KINO_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_PARTNERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_PARTNERS_PAGE_ENGLISH));
    }

    @Description("Скроллим страницу вниз и проверяем, что появляется кнопка вверх украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyActiveToTopButton() throws InterruptedException {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        Thread.sleep(300);
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getActiveToTopButton()));
        Assert.assertTrue(homePage.getActiveToTopButton().isDisplayed());
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

//    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTvImageInHomePageUkraine() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTvImageInHomePageRussia() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через картинку телевизора на главной английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTvImageInHomePageEnglish() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTwoTvImageInHomePageUkraine() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowTwoFromTvImageInHomePageRussia() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTwoTvImageInHomePageEnglish() {
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
//    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
            }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffSInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffSInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffSInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffMInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageRussia() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageEnglish() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getTariffLInHomePage()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvUkraine() {
        DriverProvider.getDriver().get(URL_STG_TV_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvRussia() {
        DriverProvider.getDriver().get(URL_STG_TV_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTvEnglish() {
        DriverProvider.getDriver().get(URL_STG_TV_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка авторизации по номеру телефона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void ferifyAutorizationByTelephoneNumber() {
        String telephoneNumber = TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS;
        HomePage homePage = new HomePage();
        AuthorizationWithTelephoneNumberSTG authorizationWithTelephoneNumberSTG = new AuthorizationWithTelephoneNumberSTG();

        authorizationWithTelephoneNumberSTG.authorizationSTGUkraine(telephoneNumber);
        homePage.getTvButtonInMenu().click();
    }

//    @Description("Проверка авторизации через интернет провайдера")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAuthorizationByInternetProvider() {
//        HomePage homePage = new HomePage();
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
//        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
//        AuthHomePage authHomePage = new AuthHomePage();
//
//        homePage.getLoginButtonOnTheMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getInternetProviderButton()));
//        modalAutorizationPage.getInternetProviderButton().click();
//        modalAutorizationPage.getInternetProviderInput().sendKeys(CODE_INTERNET_PROVIDER);
//        modalAutorizationPage.getComeButtonByInternetProvider().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
//        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
//    }

    @Description("Проверка всех элементов во 2-м шаге авторизации украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verify2stepAuthorizWindowUkraine() {
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePage.getLoginButtonOnTheMenu().click();
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
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePage.getLoginButtonOnTheMenu().click();
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
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePage.getLoginButtonOnTheMenu().click();
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
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePage.getLoginButtonOnTheMenu().click();
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
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        homePage.getLoginButtonOnTheMenu().click();
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

    @Description("Проверка всех элементов в окне авторизации открытой через тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageUkraine() {
        DriverProvider.getDriver().get(URL_STG_TARIFFS_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageRussia() {
        DriverProvider.getDriver().get(URL_STG_TARIFFS_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageEnglish() {
        DriverProvider.getDriver().get(URL_STG_TARIFFS_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через проммокод украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageUkraine() {
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через проммокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageRussia() {
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через проммокод английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageEnglish() {
        DriverProvider.getDriver().get(URL_STG_PROMOCODE_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieUkraine() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cinemaPage.getPlayButton()));
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieRussia() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieEnglish() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

//    @Description("Работа трейлера на странице фильма")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyPlayTrailerInCinemaPage(){
//        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
//
//        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getTrailerButton()));
//        authMovieInfo.getTrailerButton().click();
//
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getTimer()));
//        Assert.assertTrue(authMovieInfo.getTimer().isDisplayed());
//    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonUkraine() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(authMovieInfo.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonRussia() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(authMovieInfo.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonEnglish() {
        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        new Actions(DriverProvider.getDriver()).moveToElement(authMovieInfo.getCommentButton()).perform();
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepStg();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieUkraine() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieRussia() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieEnglish() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesUkraine() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_SERIES_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesRussia() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_SERIES_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesEnglish() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_SERIES_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

//    @Description("Проверка главной страницы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHomePage(){
//        NoAuthStgGet200ResponseHomePage noAuthGet200ResponseHomePage = new NoAuthStgGet200ResponseHomePage();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageUkraine();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageRussia();
//        noAuthGet200ResponseHomePage.get200ResponseHomePageEnglish();
//    }
//
//    @Description("Проверка страницы ТВ на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTvPage() {
//        NoAuthStgGet200ResponseTv get200ResponseTv = new NoAuthStgGet200ResponseTv();
//        get200ResponseTv.get200ResponseTvUkraine();
//        get200ResponseTv.get200ResponseTvRussia();
//        get200ResponseTv.get200ResponseTvEnglish();
//    }
//
//    @Description("Проверка страницы фильмы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForMoviePage() {
//        NoAuthStgGet200ResponseMovie get200ResponseMovie = new NoAuthStgGet200ResponseMovie();
//        get200ResponseMovie.get200ResponseMovieUkraine();
//        get200ResponseMovie.get200ResponseMovieRussia();
//        get200ResponseMovie.get200ResponseMovieEnglish();
//    }
//
//    @Description("Проверка страницы сериалы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForSeriesPage() {
//        NoAuthStgGet200ResponseSeries get200ResponseSeries = new NoAuthStgGet200ResponseSeries();
//        get200ResponseSeries.get200ResponseSeriesUkraine();
//        get200ResponseSeries.get200ResponseSeriesRussia();
//        get200ResponseSeries.get200ResponseSeriesEnglish();
//    }
//
//    @Description("Проверка страницы мультфильмы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForCartoonsPage() {
//        NoAuthStgGet200ResponseCartoons get200ResponseCartoons = new NoAuthStgGet200ResponseCartoons();
//        get200ResponseCartoons.get200ResponseCartoonsUkraine();
//        get200ResponseCartoons.get200ResponseCartoonsRussia();
//        get200ResponseCartoons.get200ResponseCartoonsEnglish();
//    }
//
//    @Description("Проверка страницы тв приставка на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTvPristavkaPage() {
//        NoAuthStgGet200ResponseTvPristavka get200ResponseTvPristavka = new NoAuthStgGet200ResponseTvPristavka();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaUkraine();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaRussia();
//        get200ResponseTvPristavka.get200ResponseTvPristavkaEnglish();
//    }
//
//    @Description("Проверка страницы новости на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForNewsPage() {
//        NoAuthStgGet200ResponseNews get200ResponseNews = new NoAuthStgGet200ResponseNews();
//        get200ResponseNews.get200ResponseNewsUkraine();
//        get200ResponseNews.get200ResponseNewsRussia();
//    }
//
//    @Description("Проверка страницы как подключить на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHowConnectPage() {
//        NoAuthStgGet200ResponseHowConnect get200ResponseHowConnect = new NoAuthStgGet200ResponseHowConnect();
//        get200ResponseHowConnect.get200ResponseHowConnectUkraine();
//        get200ResponseHowConnect.get200ResponseHowConnectRussia();
//        get200ResponseHowConnect.get200ResponseHowConnectEnglish();
//    }
//
//    @Description("Проверка страницы тарифы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForTariffsPage() {
//        NoAuthStgGet200ResponseTariffs get200ResponseTariffs = new NoAuthStgGet200ResponseTariffs();
//        get200ResponseTariffs.get200ResponseTariffsUkraine();
//        get200ResponseTariffs.get200ResponseTariffsRussia();
//        get200ResponseTariffs.get200ResponseTariffsEnglish();
//    }
//
//    @Description("Проверка страницы промо код на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForPromoCodePage() {
//        NoAuthStgGet200ResponsePromoCode get200ResponsePromoCode = new NoAuthStgGet200ResponsePromoCode();
//        get200ResponsePromoCode.get200ResponsePromoCodeUkraine();
//        get200ResponsePromoCode.get200ResponsePromoCodeRussia();
//        get200ResponsePromoCode.get200ResponsePromoCodeEnglish();
//    }
//
//    @Description("Проверка страницы про нас на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForAboutUsPage() {
//        NoAuthStgGet200ResponseAboutUs get200ResponseAboutUs = new NoAuthStgGet200ResponseAboutUs();
//        get200ResponseAboutUs.get200ResponseAboutUsUkraine();
//        get200ResponseAboutUs.get200ResponseAboutUsRussia();
//        get200ResponseAboutUs.get200ResponseAboutUsEnglish();
//    }
//
//    @Description("Проверка страницы голливуд укранским на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForHollywoodPage() {
//        NoAuthStgGet200ResponseHollywood get200ResponseHollywood = new NoAuthStgGet200ResponseHollywood();
//        get200ResponseHollywood.get200ResponseHollywoodUkraine();
//        get200ResponseHollywood.get200ResponseHollywoodRussia();
//        get200ResponseHollywood.get200ResponseHollywoodEnglish();
//    }
//
//    @Description("Проверка страницы поддержка айти на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForSupportItPage() {
//        NoAuthStgGet200ResponseSupportIt get200ResponseSupportIt = new NoAuthStgGet200ResponseSupportIt();
//        get200ResponseSupportIt.get200ResponseSupportItUkraine();
//        get200ResponseSupportIt.get200ResponseSupportItRussia();
//        get200ResponseSupportIt.get200ResponseSupportItEnglish();
//    }
//
//    @Description("Проверка страницы битва блегеров на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForBattleBloggersPage() {
//        NoAuthStgGet200ResponseBattleBloggers get200ResponseBattleBloggers = new NoAuthStgGet200ResponseBattleBloggers();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersUkraine();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersRussia();
//        get200ResponseBattleBloggers.get200ResponseBattleBloggersEnglish();
//    }
//
//    @Description("Проверка страницы фонд кино на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForFondKinoPage() {
//        NoAuthStgGet200ResponseFondKino get200ResponseFondKino = new NoAuthStgGet200ResponseFondKino();
//        get200ResponseFondKino.get200ResponseFondKinoUkraine();
//        get200ResponseFondKino.get200ResponseFondKinoRussia();
//        get200ResponseFondKino.get200ResponseFondKinoEnglish();
//    }
//
//    @Description("Проверка страницы для прессы на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForForPressPage() {
//        NoAuthStgGet200ResponseForPress get200ResponseForPress = new NoAuthStgGet200ResponseForPress();
//        get200ResponseForPress.get200ResponseForPressUkraine();
//        get200ResponseForPress.get200ResponseForPressRussia();
//        get200ResponseForPress.get200ResponseForPressEnglish();
//    }
//
//    @Description("Проверка страницы партнеры на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200ForPartnersPage() {
//        NoAuthStgGet200ResponsePartners get200ResponsePartners = new NoAuthStgGet200ResponsePartners();
//        get200ResponsePartners.get200ResponsePartnersUkraine();
//        get200ResponsePartners.get200ResponsePartnersRussia();
//        get200ResponsePartners.get200ResponsePartnersEnglish();
//    }

    @Description("Проверяем сворачивание видео при открытии телепрограммы")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMinimizingThePlayer() {
        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_UKRAINE);
        NoAuthTvPage tvPage = new NoAuthTvPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getOpenTvProgramNoAuth()));
        tvPage.getOpenTvProgramNoAuth().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getPlayerMinimizingNoAuth()));
        Assert.assertTrue(tvPage.getPlayerMinimizingNoAuth().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getOpenTvProgramNoAuth()));
        tvPage.getOpenTvProgramNoAuth().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getPlayerNotMinimizingNoAuth()));
        Assert.assertTrue(tvPage.getPlayerNotMinimizingNoAuth().isDisplayed());
    }

    @Description("Проверка работы поиска на странице ТВ украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyTvSearch() {
        AuthTvPage authTvPage = new AuthTvPage();

        DriverProvider.getDriver().get(URL_STG_TV_PAGE_UKRAINE);
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

    @Description("Проверка всех элементов на странице актера украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageUkraine() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_ACTOR_UKRAINE);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageRussia() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_ACTOR_RUSSIA);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageEnglish() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        DriverProvider.getDriver().get(URL_STG_RANDOM_ACTOR_ENGLISH);
        allElementsForActorPage.allElementsForActorPage();
    }

//    @Description("Проверка всех каналов на статус 200")
//    @Test(timeOut = 2000000)
//    public void verifyAllChannelsStatus200() {
//        DriverProvider.getDriver().get(URL_STG_TV_PAGE_UKRAINE);
//        String  i2 = null;
//        try {
//            for (int i = 1; i <= 260; i++) {
//                i2 = DriverProvider.getDriver().findElement(By.xpath("//div[@class='list-channels']//li[" + i + "]//a")).getText();
//                ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                .xpath("//div[@class='list-channels']//li[" + i + "]//a")).getAttribute("href"))
//                        .when().get()
//                        .then()
//                        .assertThat().statusCode(is(200));
//            }}catch(AssertionError e){
//            System.out.println(i2);
//            fail();
//        }
//    }

//    @Description("Проверка всех категорий в тв на статус 200 украинский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200Ukraine() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_STG_TV_PAGE_UKRAINE);
//        String  i2 = null;
//        try {
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                    .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
//            noAuthTvPage.getCategoryButton().click();
//
//            for (int i = 1; i <= 29; i++) {
//                i2 = DriverProvider.getDriver().findElement(By
//                        .xpath("//div[@class='category_list']//li[" + i + "]//a")).getText();
//                ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                .xpath("//div[@class='category_list']//li[" + i + "]//a")).getAttribute("href"))
//                        .when().get()
//                        .then()
//                        .assertThat().statusCode(is(200));
//            }}catch(AssertionError e){
//            System.out.println(i2);
//            fail();
//        }
//    }

//    @Description("Проверка всех категорий в тв на статус 200 русский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200Russia() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_STG_TV_PAGE_RUSSIA);
//        String  i2 = null;
//        try {
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                    .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
//            noAuthTvPage.getCategoryButton().click();
//
//            for (int i = 1; i <= 29; i++) {
//                i2 = DriverProvider.getDriver().findElement(By
//                        .xpath("//div[@class='category_list']//li[" + i + "]//a")).getText();
//                ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                .xpath("//div[@class='category_list']//li[" + i + "]//a")).getAttribute("href"))
//                        .when().get()
//                        .then()
//                        .assertThat().statusCode(is(200));
//            }}catch(AssertionError e){
//            System.out.println(i2);
//            fail();
//        }
//    }
//
//    @Description("Проверка всех категорий в тв на статус 200 английский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200English() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_STG_TV_PAGE_ENGLISH);
//        String  i2 = null;
//        try {
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                    .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
//            noAuthTvPage.getCategoryButton().click();
//
//            for (int i = 1; i <= 29; i++) {
//                i2 = DriverProvider.getDriver().findElement(By
//                        .xpath("//div[@class='category_list']//li[" + i + "]//a")).getText();
//                ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                .xpath("//div[@class='category_list']//li[" + i + "]//a")).getAttribute("href"))
//                        .when().get()
//                        .then()
//                        .assertThat().statusCode(is(200));
//            }}catch(AssertionError e){
//            System.out.println(i2);
//            fail();
//        }
//    }

//    @Description("Проверка наличия всех фильтров в фильмах украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllFiltersForMovieUkraine() {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_STG_USI_FILMI_PAGE_UKRAINE);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMoreCountryButton()));
//        filtersInMovieNoAuth.getMoreCountryButton().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieCountry();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getYearFilter()));
//        filtersInMovieNoAuth.getYearFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieYear();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getAudioFilter()));
//        filtersInMovieNoAuth.getAudioFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieAudio();
//    }
//
//    @Description("Проверка наличия всех фильтров в фильмах русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllFiltersForMovieRussia() {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_STG_USI_FILMI_PAGE_RUSSIA);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMoreCountryButton()));
//        filtersInMovieNoAuth.getMoreCountryButton().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieCountry();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getYearFilter()));
//        filtersInMovieNoAuth.getYearFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieYear();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getAudioFilter()));
//        filtersInMovieNoAuth.getAudioFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieAudio();
//    }
//
//    @Description("Проверка наличия всех фильтров в фильмах английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllFiltersForMovieEnglish() {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_STG_USI_FILMI_PAGE_ENGLISH);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMoreCountryButton()));
//        filtersInMovieNoAuth.getMoreCountryButton().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieCountry();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getYearFilter()));
//        filtersInMovieNoAuth.getYearFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieYear();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getAudioFilter()));
//        filtersInMovieNoAuth.getAudioFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieAudio();
//    }

    @Description("Проверка всех елементов в футере украина")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterUkraine() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        Thread.sleep(800);

        for (int i = 1; footer.getTextContentSecurity().isDisplayed()  == false; i++ ){
            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        new Actions(DriverProvider.getDriver()).moveToElement(footer.getTextContentSecurity()).perform();
        allElementsForFooter.allElementsForFooterUkraine();
    }

    @Description("Проверка всех елементов в футере русский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterRussia() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();

        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        Thread.sleep(800);

        for (int i = 1; footer.getTextContentSecurity().isDisplayed()  == false; i++ ){
            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        new Actions(DriverProvider.getDriver()).moveToElement(footer.getTextContentSecurity()).perform();
        allElementsForFooter.allElementsForFooterRussia();
    }

    @Description("Проверка всех елементов в футере английский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterEnglish() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();

        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        Thread.sleep(800);

        for (int i = 1; footer.getTextContentSecurity().isDisplayed()  == false; i++ ){
            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        new Actions(DriverProvider.getDriver()).moveToElement(footer.getTextContentSecurity()).perform();
        allElementsForFooter.allElementsForFooterEnglish();
    }

//    @Description("Проверка ссылок для соц. сетей в футере")
//    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
//    public void verifyLinksOnSocialNetworks() throws InterruptedException {
//        Footer footer = new Footer();
//        GoToDownPage goToDownPage = new GoToDownPage();
//        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
//        Thread.sleep(800);
//
//        goToDownPage.goToDownPage();
//        footer.getInstagramButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        Thread.sleep(2000);
//        if (DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER)){
//            Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER));
//        } else {
//            Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_INSTAGRAM_IN_FOOTER_LOGOUT));
//        }
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        footer.getFacebookButton().click();
//        ArrayList<String> facebook = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(facebook.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_FACEBOOK_IN_FOOTER));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FACEBOOK_IN_FOOTER));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(facebook.get(0));
//        footer.getTelegramButton().click();
//        ArrayList<String> telegram = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(telegram.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_TELEGRAM_IN_FOOTER));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TELEGRAM_IN_FOOTER));
//
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(telegram.get(0));
//        footer.getYoutubeButton().click();
//        ArrayList<String> youtube = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(youtube.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_YOUTUBE_IN_FOOTER));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_YOUTUBE_IN_FOOTER));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(telegram.get(0));
//        footer.getPinterestButton().click();
//        ArrayList<String> pinterest = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(pinterest.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_PINTEREST_IN_FOOTER));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PINTEREST_IN_FOOTER));
//    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере украинский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterUkrainian() throws InterruptedException {
        Footer footer = new Footer();
        GoToDownPage goToDownPage = new GoToDownPage();
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_UKRAINE);
        Thread.sleep(800);
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        closeStgPanel.closeStgPanel();
        goToDownPage.goToDownPage();
        footer.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footer.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footer.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footer.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере русский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterRussia() throws InterruptedException {
        Footer footer = new Footer();
        GoToDownPage goToDownPage = new GoToDownPage();
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_RUSSIA);
        Thread.sleep(800);
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        closeStgPanel.closeStgPanel();
        goToDownPage.goToDownPage();
        footer.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footer.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footer.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footer.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Проверка ссылок кнопок подлкючения через устройства в футере английский язык")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyConnectionDeviceButtonInTheFooterEnglish() throws InterruptedException {
        Footer footer = new Footer();
        GoToDownPage goToDownPage = new GoToDownPage();
        DriverProvider.getDriver().get(URL_STG_HOME_PAGE_ENGLISH);
        Thread.sleep(800);
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        closeStgPanel.closeStgPanel();
        goToDownPage.goToDownPage();
        footer.getGooglePlayConnectButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        footer.getAppStoreConnectButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        footer.getSmartTvConnectButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        footer.getAppGalleryConnectButton().click();
        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо укр. язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoUkraine() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getGoogleButton()));
        closeStgPanel.closeStgPanel();
        noAuthMovieInfoPage.getGoogleButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAppStoreButton()));
        noAuthMovieInfoPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSmartTvButton()));
        noAuthMovieInfoPage.getSmartTvButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoRussia() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_RUSSIA);

        closeStgPanel.closeStgPanel();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getGoogleButton()));
        noAuthMovieInfoPage.getGoogleButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAppStoreButton()));
        noAuthMovieInfoPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSmartTvButton()));
        noAuthMovieInfoPage.getSmartTvButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoEnglish() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_ENGLISH);

        closeStgPanel.closeStgPanel();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getGoogleButton()));
        noAuthMovieInfoPage.getGoogleButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAppStoreButton()));
        noAuthMovieInfoPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSmartTvButton()));
        noAuthMovieInfoPage.getSmartTvButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
    }

    @Description("Проверка кнопок подключения устройств через телеканал укр. язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelUkraine() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_UKRAINE);

        closeStgPanel.closeStgPanel();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        noAuthTvPage.getGooglePlayButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        noAuthTvPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
        noAuthTvPage.getSmartTvButton().click();
        ArrayList<String> smartTv = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(smartTv.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
    }

    @Description("Проверка кнопок подключения устройств телеканал русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelRussia() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_RUSSIA);

        closeStgPanel.closeStgPanel();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        noAuthTvPage.getGooglePlayButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        noAuthTvPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
        noAuthTvPage.getSmartTvButton().click();
        ArrayList<String> smartTv = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(smartTv.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
    }

    @Description("Проверка кнопок подключения устройств через телеканал английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelEnglish() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_ENGLISH);

        closeStgPanel.closeStgPanel();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getGooglePlayButton()));
        noAuthTvPage.getGooglePlayButton().click();
        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(tabs.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(tabs.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getAppStoreButton()));
        noAuthTvPage.getAppStoreButton().click();
        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(appStore.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(appStore.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getSmartTvButton()));
        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
        noAuthTvPage.getSmartTvButton().click();
        ArrayList<String> smartTv = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(smartTv.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_STG_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА украиснкий язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsUkraine() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_UKRAINE);
        closeStgPanel.closeStgPanel();
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STG_STB_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_STG_TV1000_ACTION_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_STG_DISCOVERY_HD_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsRussia() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_RUSSIA);
        closeStgPanel.closeStgPanel();
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STG_STB_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_STG_TV1000_ACTION_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_STG_DISCOVERY_HD_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsEnglish() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();
        CloseStgPanel closeStgPanel = new CloseStgPanel();

        DriverProvider.getDriver().get(URL_STG_1PLUS1_CHANNEL_ENGLISH);
        closeStgPanel.closeStgPanel();
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STG_STB_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_STG_TV1000_ACTION_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_STG_DISCOVERY_HD_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

//    @Description("Проверка 5 фильмов на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200For5Movie() {
//        NoAuthGet200Response5Movie noAuthGet200Response5Movie = new NoAuthGet200Response5Movie();
//        noAuthGet200Response5Movie.get200ResponseUkraineStg();
//        noAuthGet200Response5Movie.get200ResponseRussiaStg();
//        noAuthGet200Response5Movie.get200ResponseEnglishStg();
//    }
//
//    @Description("Проверка 3 актеров на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200For5Actor() {
//        NoAuthGet200Response3Actor noAuthGet200Response3Actor = new NoAuthGet200Response3Actor();
//        noAuthGet200Response3Actor.get200ResponseUkraineStg();
//        noAuthGet200Response3Actor.get200ResponseRussiaStg();
//        noAuthGet200Response3Actor.get200ResponseEnglishStg();
//    }
//
//    @Description("Проверка 3 жанров на статус 200")
//    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
//    public void verifyStatus200For5Genres() {
//        NoAuthGet200Response3Genres noAuthGet200Response3Genres = new NoAuthGet200Response3Genres();
//        noAuthGet200Response3Genres.get200ResponseUkraineStg();
//        noAuthGet200Response3Genres.get200ResponseRussiaStg();
//        noAuthGet200Response3Genres.get200ResponseEnglishStg();
//    }

//    @Description("Проверка всех элементов на странице Партнеры украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageUkraine() {
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_UKRAINE);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }
//
//    @Description("Проверка всех элементов на странице Партнеры русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageRussia() {
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_RUSSIA);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }
//
//    @Description("Проверка всех элементов на странице Партнеры английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInPartnersPageEnglish() {
//        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();
//
//        DriverProvider.getDriver().get(URL_STG_PARTNERS_PAGE_ENGLISH);
//        allElementsForPartnersPage.allElementsForPartnersPage();
//    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        DriverProvider.getDriver().get(URL_STG_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        DriverProvider.getDriver().get(URL_STG_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

//    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageUkraine() {
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_UKRAINE);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }
//
//    @Description("Проверка всех элементов на странице поддержка айти русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageRussia() {
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_RUSSIA);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }
//
//    @Description("Проверка всех элементов на странице поддержка айти английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageEnglish() {
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        DriverProvider.getDriver().get(URL_STG_IT_SUPPORT_PAGE_ENGLISH);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }

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

        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        DriverProvider.getDriver().get(URL_STG_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

}

