package tests.ProdNoAuth;

import api.Get200Response.Prod.NoAuth.*;
import driver.DriverProvider;
import io.qameta.allure.Description;
import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.*;
import pages.Auth.AuthMovieInfoPage;
import pages.Auth.AuthTvPage;
import pages.Modal.ModalAutorizationPage;
import pages.NoAuth.*;
import testNgRunner.TestNgRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import static constants.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.testng.AssertJUnit.fail;

public class NoAuthPageTest extends TestNgRunner {

    @Description("Проверяем наличие всех элементов в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyLogoImageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        allElementsForMenu.allElementsForNoAuthorizationPageUkraine();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        allElementsForMenu.allElementsForNoAuthorizationPageRussia();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyLogoImageEnglish() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        allElementsForMenu.allElementsForNoAuthorizationPageEnglish();
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglish()  {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
        Assert.assertTrue(noAuthTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraine()  {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_ENGLISH));
    }


    @Description("Проверяем нажатие кнопки Новости в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Новости в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Оплата в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getTextLoginOrGerestration()));
        Assert.assertTrue(modalAutorizationPage.getTextLoginOrGerestration().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Про нас в меню украиснкий язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraine(){
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraine(){
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglish(){
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_ENGLISH));
    }

    @Description("Скроллим страницу вниз и проверяем, что появляется кнопка вверх украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyActiveToTopButton() throws InterruptedException {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        HomePage homePage = new HomePage();
        Thread.sleep(300);
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getActiveToTopButton()));
        Assert.assertTrue(homePage.getActiveToTopButton().isDisplayed());

    }

//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере украинский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterUkrainian() throws InterruptedException {
//        Footer footer = new Footer();
//        GoToDownPage goToDownPage = new GoToDownPage();
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//        Thread.sleep(800);
//
//        goToDownPage.goToDownPage();
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }
//
//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере русский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterRussia() throws InterruptedException {
//        Footer footer = new Footer();
//        GoToDownPage goToDownPage = new GoToDownPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
//        Thread.sleep(800);
//
//        goToDownPage.goToDownPage();
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }
//
//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере английский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterEnglish() throws InterruptedException {
//        Footer footer = new Footer();
//        GoToDownPage goToDownPage = new GoToDownPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseEn();
//        Thread.sleep(800);
//
//        goToDownPage.goToDownPage();
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.DOWN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }

    @Description("Проверка ссылок для соц. сетей в футере")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyLinksOnSocialNetworks() throws InterruptedException {
        Footer footer = new Footer();
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        Thread.sleep(800);

        for (int i = 1; footer.getTextContentSecurity().isDisplayed()  == false; i++ ){
            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        new Actions(DriverProvider.getDriver()).moveToElement(footer.getTextContentSecurity()).perform();
        footer.getInstagramButton().click();
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
        footer.getFacebookButton().click();
        ArrayList<String> facebook = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(facebook.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FACEBOOK_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FACEBOOK_IN_FOOTER));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(facebook.get(0));
        footer.getTelegramButton().click();
        ArrayList<String> telegram = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(telegram.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TELEGRAM_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TELEGRAM_IN_FOOTER));

        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        footer.getYoutubeButton().click();
        ArrayList<String> youtube = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(youtube.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_YOUTUBE_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_YOUTUBE_IN_FOOTER));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        footer.getPinterestButton().click();
        ArrayList<String> pinterest = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(pinterest.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PINTEREST_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PINTEREST_IN_FOOTER));
    }

    @Description("Проверка всех елементов в футере украина")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterUkraine() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterUkraine();
    }

    @Description("Проверка всех елементов в футере русский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterRussia() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterRussia();
    }

    @Description("Проверка всех елементов в футере английский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterEnglish() throws InterruptedException {
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        Thread.sleep(800);

        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterEnglish();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Войти в меню английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromMenuLoginButtonEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getLoginButtonOnTheMenu().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить за 1 минуту на баннере английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectForOneMinutesInBannerEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectToTheOneMinutesButtonOnBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку Подключить бесплатно в шапке английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromButtonConnectFreeInHeaderEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        homePage.getConnectFreeButtonInHeader().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageButtonInBanner()));
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageButtonInBanner()));
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку логотипа на баннере английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromLogoImageButtonImBannerEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLogoImageButtonInBanner()));
        homePage.getLogoImageButtonInBanner().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTwoTvImageInHomePageUkraine() {
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowTwoFromTvImageInHomePageRussia() {
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
//    }
//
//    @Description("Проверка всех элементов в окне авторизации открытой через вторую картинку телевизора на главной английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAutorizWindowFromTwoTvImageInHomePageEnglish() {
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseEn();
//
//        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
//        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
//        HomePage homePage = new HomePage();
//        if (homePage.getTwoTvImageInHomePage().isDisplayed()  == false){
//            for (int i = 1; homePage.getTwoTvImageInHomePage().isDisplayed()  == false; i++ ){
//                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
//        }
//        homePage.getTwoTvImageInHomePage().click();
//        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
//    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа S на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffSInHomePageEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffSInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffSInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffSInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа M на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffMInHomePageEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffMInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffMInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffMInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку тарифа L на главной английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTariffLInHomePageEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        if (homePage.getTariffLInHomePage().isDisplayed()  == false){
            for (int i = 1; homePage.getTariffLInHomePage().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        homePage.getTariffLInHomePage().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromTvRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_TV_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через телеканал английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTvEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTvPage tvPage = new NoAuthTvPage();
        tvPage.getChannel240().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(tvPage.getWatchToFree()));
        tvPage.getWatchToFree().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка авторизации по номеру телефона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void ferifyAutorizationByTelephoneNumber() {
        String telephoneNumber = TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS;
        AuthorizationWithTelephoneNumber authorizationWithTelephoneNumber = new AuthorizationWithTelephoneNumber();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        authorizationWithTelephoneNumber.authorizationRussia(telephoneNumber);
    }

//    @Description("Проверка авторизации через гугл")
//    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
//    public void verifyAuthorizationByGoogle() throws InterruptedException {
//        HomePage homePage = new HomePage();
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
//        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
//        AuthHomePage authHomePage = new AuthHomePage();
//
//        homePage.getLoginButtonOnTheMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getGoogleButton()));
//        modalAutorizationPage.getGoogleButton().click();
//        String MainWindow = DriverProvider.getDriver().getWindowHandle();
//
//        for (String activeHandle : DriverProvider.getDriver().getWindowHandles()) {
//            if (!activeHandle.equals(MainWindow)) {
//                DriverProvider.getDriver().switchTo().window(activeHandle);
//            }
//        }
//        DriverProvider.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys("testsweetprod@gmail.com");
//        DriverProvider.getDriver().findElement(By.xpath("//span[text()='Далее']")).click();
//        Thread.sleep(2000);
//        DriverProvider.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("Cityline123");
//        DriverProvider.getDriver().findElement(By.xpath("//span[text()='Далее']")).click();
//        DriverProvider.getDriver().switchTo().window(MainWindow);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
//        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
//    }

//    @Description("Проверка авторизации через фейсбук")
//    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
//    public void verifyAuthorizationByFacebook() {
//        HomePage homePage = new HomePage();
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
//        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();
//        AuthHomePage authHomePage = new AuthHomePage();
//
//        homePage.getLoginButtonOnTheMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAutorizationPage.getFacebookButton()));
//        modalAutorizationPage.getFacebookButton().click();
//
//        String MainWindow = DriverProvider.getDriver().getWindowHandle();
//
//        for (String activeHandle : DriverProvider.getDriver().getWindowHandles()) {
//            if (!activeHandle.equals(MainWindow)) {
//                DriverProvider.getDriver().switchTo().window(activeHandle);
//            }
//        }
//        DriverProvider.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("poplavskiivad@gmail.com");
//        DriverProvider.getDriver().findElement(By.xpath("//input[@name='pass']")).sendKeys("zomaretka99");
//        DriverProvider.getDriver().findElement(By.xpath("//input[@name='login']")).click();
//        DriverProvider.getDriver().switchTo().window(MainWindow);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getBannersBlock()));
//        Assert.assertTrue(authHomePage.getBannersBlock().isDisplayed());
//    }

//    @Description("Проверка авторизации через интернет провайдера")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAuthorizationByInternetProvider() {
//        HomePage homePage = new HomePage();
//        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_HOME_PAGE_UKRAINE);
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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_HOME_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        HomePage homePage = new HomePage();
        ModalAutorizationPage modalAutorizationPage = new ModalAutorizationPage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getLoginButtonOnTheMenu()));
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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
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

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_HOME_PAGE_RUSSIA);
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

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_UKRAINE);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу тарифы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromTariffsPageEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_TARIFFS_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthTariffsPage tariffsPage = new NoAuthTariffsPage();

        tariffsPage.getConnectTariffMButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через страницу  проммокод украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromPromokodPageUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
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
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthPromoCodePage promoCodePage = new NoAuthPromoCodePage();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(promoCodePage.getComeButton()));
        promoCodePage.getComeButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieUkraine() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);

        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cinemaPage.getPlayButton()));
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через фильм английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAuthorizWindowFromMovieEnglish() {

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        NoAuthMovieInfoPage cinemaPage = new NoAuthMovieInfoPage();
        cinemaPage.getPlayButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

//    @Description("Работа трейлера на странице фильма")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyPlayTrailerInCinemaPage(){
//        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
//
//        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
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

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonRussia() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в окне авторизации открытой через кнопку оставить комментарий в муви ифно английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAutorizWindowFromCommentButtonEnglish() {

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);
        AllElementsForAuthorizationWindow allElementsForAuthorizationWindow = new AllElementsForAuthorizationWindow();
        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
        if (authMovieInfo.getCommentButton().isDisplayed()  == false){
            for (int i = 1; authMovieInfo.getCommentButton().isDisplayed()  == false; i++ ){
                ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        }
        authMovieInfo.getCommentButton().click();
        allElementsForAuthorizationWindow.allElementsForAuthorizationWindow1stepProduction();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieUkraine() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieRussia() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице фильма английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForMovieEnglish() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForMovie();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesUkraine() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_RANDOM_SERIES_UKRAINIAN);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesRussia() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_RANDOM_SERIES_RUSSIA);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

    @Description("Проверка всех элементов в муви инфо на странице сериала английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInMovieInfoForSeriesEnglish() {
        GoToDownPage goToDownPage = new GoToDownPage();
        AllElementsForMovieInfoPage allElementsForMovieInfoPage = new AllElementsForMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_RANDOM_SERIES_ENGLISH);
        goToDownPage.goToDownPage();
        allElementsForMovieInfoPage.AllElementsForMovieInfoPageForSeries();
    }

    @Description("Проверка главной страницы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageUk(){
        NoAuthGet200ResponseHomePage noAuthGet200ResponseHomePage = new NoAuthGet200ResponseHomePage();
        noAuthGet200ResponseHomePage.get200ResponseHomePageUkraine();
    }
    @Description("Проверка главной страницы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageRu(){
        NoAuthGet200ResponseHomePage noAuthGet200ResponseHomePage = new NoAuthGet200ResponseHomePage();
        noAuthGet200ResponseHomePage.get200ResponseHomePageRussia();
    }
    @Description("Проверка главной страницы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageEn(){
        NoAuthGet200ResponseHomePage noAuthGet200ResponseHomePage = new NoAuthGet200ResponseHomePage();
        noAuthGet200ResponseHomePage.get200ResponseHomePageEnglish();
    }

    @Description("Проверка страницы ТВ на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageUk() {
        NoAuthGet200ResponseTv get200ResponseTv = new NoAuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvUkraine();
    }

    @Description("Проверка страницы ТВ на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageRu() {
        NoAuthGet200ResponseTv get200ResponseTv = new NoAuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvRussia();
    }

    @Description("Проверка страницы ТВ на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageEn() {
        NoAuthGet200ResponseTv get200ResponseTv = new NoAuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvEnglish();
    }

    @Description("Проверка страницы фильмы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageUa() {
        NoAuthGet200ResponseMovie get200ResponseMovie = new NoAuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieUkraine();
    }

    @Description("Проверка страницы фильмы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageRu() {
        NoAuthGet200ResponseMovie get200ResponseMovie = new NoAuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieRussia();
    }

    @Description("Проверка страницы фильмы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageEn() {
        NoAuthGet200ResponseMovie get200ResponseMovie = new NoAuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieEnglish();
    }

    @Description("Проверка страницы сериалы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageUa() {
        NoAuthGet200ResponseSeries get200ResponseSeries = new NoAuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesUkraine();
    }

    @Description("Проверка страницы сериалы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageRu() {
        NoAuthGet200ResponseSeries get200ResponseSeries = new NoAuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesRussia();
    }

    @Description("Проверка страницы сериалы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageEn() {
        NoAuthGet200ResponseSeries get200ResponseSeries = new NoAuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesEnglish();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageUk() {
        NoAuthGet200ResponseCartoons get200ResponseCartoons = new NoAuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsUkraine();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageRu() {
        NoAuthGet200ResponseCartoons get200ResponseCartoons = new NoAuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsRussia();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageEn() {
        NoAuthGet200ResponseCartoons get200ResponseCartoons = new NoAuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsEnglish();
    }

    @Description("Проверка страницы новости на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForNewsPageUk() {
        NoAuthGet200ResponseNews get200ResponseNews = new NoAuthGet200ResponseNews();
        get200ResponseNews.get200ResponseNewsUkraine();
    }

    @Description("Проверка страницы новости на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForNewsPageRu() {
        NoAuthGet200ResponseNews get200ResponseNews = new NoAuthGet200ResponseNews();
        get200ResponseNews.get200ResponseNewsRussia();
    }

    @Description("Проверка страницы как подключить на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageUk() {
        NoAuthGet200ResponseHowConnect get200ResponseHowConnect = new NoAuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectUkraine();
    }

    @Description("Проверка страницы как подключить на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageRu() {
        NoAuthGet200ResponseHowConnect get200ResponseHowConnect = new NoAuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectRussia();
    }

    @Description("Проверка страницы как подключить на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageEn() {
        NoAuthGet200ResponseHowConnect get200ResponseHowConnect = new NoAuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectEnglish();
    }

    @Description("Проверка страницы тарифы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageUk() {
        NoAuthGet200ResponseTariffs get200ResponseTariffs = new NoAuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsUkraine();
    }

    @Description("Проверка страницы тарифы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageRu() {
        NoAuthGet200ResponseTariffs get200ResponseTariffs = new NoAuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsRussia();
    }

    @Description("Проверка страницы тарифы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageEn() {
        NoAuthGet200ResponseTariffs get200ResponseTariffs = new NoAuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsEnglish();
    }

    @Description("Проверка страницы промо код на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageUk() {
        NoAuthGet200ResponsePromoCode get200ResponsePromoCode = new NoAuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeUkraine();
    }

    @Description("Проверка страницы промо код на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageRu() {
        NoAuthGet200ResponsePromoCode get200ResponsePromoCode = new NoAuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeRussia();
    }

    @Description("Проверка страницы промо код на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageEn() {
        NoAuthGet200ResponsePromoCode get200ResponsePromoCode = new NoAuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeEnglish();
    }

    @Description("Проверка страницы про нас на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageUk() {
        NoAuthGet200ResponseAboutUs get200ResponseAboutUs = new NoAuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsUkraine();
    }

    @Description("Проверка страницы про нас на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageRu() {
        NoAuthGet200ResponseAboutUs get200ResponseAboutUs = new NoAuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsRussia();
    }

    @Description("Проверка страницы про нас на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageEn() {
        NoAuthGet200ResponseAboutUs get200ResponseAboutUs = new NoAuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsEnglish();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageUk() {
        NoAuthGet200ResponseHollywood get200ResponseHollywood = new NoAuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodUkraine();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageRu() {
        NoAuthGet200ResponseHollywood get200ResponseHollywood = new NoAuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodRussia();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageEn() {
        NoAuthGet200ResponseHollywood get200ResponseHollywood = new NoAuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodEnglish();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageUk() {
        NoAuthGet200ResponseSupportIt get200ResponseSupportIt = new NoAuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItUkraine();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageRu() {
        NoAuthGet200ResponseSupportIt get200ResponseSupportIt = new NoAuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItRussia();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageEn() {
        NoAuthGet200ResponseSupportIt get200ResponseSupportIt = new NoAuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItEnglish();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageUk() {
        NoAuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new NoAuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersUkraine();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageRu() {
        NoAuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new NoAuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersRussia();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageEn() {
        NoAuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new NoAuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersEnglish();
    }

    @Description("Проверка страницы фонд кино на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageUk() {
        NoAuthGet200ResponseFondKino get200ResponseFondKino = new NoAuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoUkraine();
    }

    @Description("Проверка страницы фонд кино на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageRu() {
        NoAuthGet200ResponseFondKino get200ResponseFondKino = new NoAuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoRussia();
    }

    @Description("Проверка страницы фонд кино на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageEn() {
        NoAuthGet200ResponseFondKino get200ResponseFondKino = new NoAuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoEnglish();
    }

    @Description("Проверка страницы для прессы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageUk() {
        NoAuthGet200ResponseForPress get200ResponseForPress = new NoAuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressUkraine();
    }

    @Description("Проверка страницы для прессы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageRu() {
        NoAuthGet200ResponseForPress get200ResponseForPress = new NoAuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressRussia();
    }

    @Description("Проверка страницы для прессы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageEn() {
        NoAuthGet200ResponseForPress get200ResponseForPress = new NoAuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressEnglish();
    }

    @Description("Проверка страницы партнеры на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageUk() {
        NoAuthGet200ResponsePartners get200ResponsePartners = new NoAuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersUkraine();
    }

    @Description("Проверка страницы партнеры на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageRu() {
        NoAuthGet200ResponsePartners get200ResponsePartners = new NoAuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersRussia();
    }

    @Description("Проверка страницы партнеры на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageEn() {
        NoAuthGet200ResponsePartners get200ResponsePartners = new NoAuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersEnglish();
    }

//    @Description("Проверяем сворачивание видео при открытии телепрограммы")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyMinimizingThePlayer() {
//        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_UKRAINE);
//        NoAuthTvPage tvPage = new NoAuthTvPage();
//
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(tvPage.getOpenTvProgramNoAuth()));
//        tvPage.getOpenTvProgramNoAuth().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(tvPage.getPlayerMinimizingNoAuth()));
//        Assert.assertTrue(tvPage.getPlayerMinimizingNoAuth().isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(tvPage.getOpenTvProgramNoAuth()));
//        tvPage.getOpenTvProgramNoAuth().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(tvPage.getPlayerNotMinimizingNoAuth()));
//        Assert.assertTrue(tvPage.getPlayerNotMinimizingNoAuth().isDisplayed());
//    }

    @Description("Проверка работы поиска на странице ТВ украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyTvSearch() {
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
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

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_UKRAINE);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageRussia() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_RUSSIA);
        allElementsForActorPage.allElementsForActorPage();
    }

    @Description("Проверка всех элементов на странице актера английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInActorPageEnglish() {
        AllElementsForActorPage allElementsForActorPage = new AllElementsForActorPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_RANDOM_ACTOR_ENGLISH);
        allElementsForActorPage.allElementsForActorPage();
    }

//    @Description("Проверка всех каналов на статус 200")
//    @Test(timeOut = 180000)
//    public void verifyAllChannelsStatus200() {
//        DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
//        String  i2 = null;
//        try {
//        for (int i = 1; i <= 260; i++) {
//                    i2 = DriverProvider.getDriver().findElement(By.xpath("//div[@class='list-channels']//li[" + i + "]//a")).getText();
//                    ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                    .xpath("//div[@class='list-channels']//li[" + i + "]//a")).getAttribute("href"))
//                            .when().get()
//                            .then()
//                            .assertThat().statusCode(is(200));
//                }}catch(AssertionError e){
//            System.out.println(i2);
//            fail();
//        }
//        }

//    @Description("Проверка всех категорий в тв на статус 200 украинский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200Ukraine() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
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
//    @Description("Проверка всех категорий в тв на статус 200 русский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200Russia() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_TV_PAGE_RUSSIA);
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

//    @Description("Проверка всех категорий в тв на статус 200 английский язык")
//    @Test(timeOut = 30000)
//    public void verifyAllCategoryInTvStatus200English() {
//        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();
//        DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
//        String  i2 = null;
//        try {
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthTvPage.getCategoryButton()));
//        noAuthTvPage.getCategoryButton().click();
//
//            for (int i = 1; i <= 29; i++) {
//                i2 = DriverProvider.getDriver().findElement(By
//                        .xpath("//div[@class='category_list']//li[" + i + "]//a")).getText();
//                ValidatableResponse imageBanner = given().baseUri(DriverProvider.getDriver().findElement(By
//                                .xpath("//div[@class='category_list']//li[" + i + "]//a")).getAttribute("href"))
//                        .when().get()
//                        .then()
//                        .assertThat().statusCode(is(200));
//                }}catch(AssertionError e){
//                System.out.println(i2);
//                fail();
//            }
//        }

//    @Description("Проверка наличия всех фильтров в фильмах украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllFiltersForMovieUkraine() throws InterruptedException {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_USI_FILMI_PAGE_UKRAINE);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        Thread.sleep(Duration.ofSeconds(10)00);
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
//    public void verifyAllFiltersForMovieRussia() throws InterruptedException {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_USI_FILMI_PAGE_RUSSIA);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        Thread.sleep(Duration.ofSeconds(10)00);
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
//    public void verifyAllFiltersForMovieEnglish() throws InterruptedException {
//        AllElementsForFiltersInMovie allElementsForFiltersInMovie = new AllElementsForFiltersInMovie();
//        FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();
//
//        DriverProvider.getDriver().get(URL_USI_FILMI_PAGE_ENGLISH);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getGenreFilter()));
//        filtersInMovieNoAuth.getGenreFilter().click();
//        allElementsForFiltersInMovie.allElementsForFiltersInMovieGenre();
//        filtersInMovieNoAuth.getCountryFilter().click();
//        Thread.sleep(Duration.ofSeconds(10)00);
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

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА украиснкий язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsUkraine() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_UKRAINE);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsRussia() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_RUSSIA);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

    @Description("ПРОВЕРКА ВСЕХ ЭЛЕМЕНТОВ НА СТРАНИЦЕ КАНАЛА английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInTheChannelsEnglish() {
        AllElementsForChannelsNoAuth allElementsForChannelsNoAuth = new AllElementsForChannelsNoAuth();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannels1plus1();
        DriverProvider.getDriver().get(URL_STB_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsStb();
        DriverProvider.getDriver().get(URL_TV1000_ACTION_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsTv1000Action();
        DriverProvider.getDriver().get(URL_DISCOVERY_HD_CHANNEL_ENGLISH);
        allElementsForChannelsNoAuth.AllElementsForChannelsDiscoveryHd();
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо укр. язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoUkraine() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getGoogleButton()));
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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoRussia() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_RUSSIA);

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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
    }

    @Description("Проверка кнопок подключения через устройство в муви инфо английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInMovieInfoEnglish() {
        NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_ENGLISH);

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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
    }

    @Description("Проверка кнопок подключения устройств через телеканал укр. язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelUkraine() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_UKRAINE);

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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
    }

    @Description("Проверка кнопок подключения устройств телеканал русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelRussia() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_RUSSIA);

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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
    }

    @Description("Проверка кнопок подключения устройств через телеканал английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyConnectDevicesInChannelEnglish() {
        NoAuthTvPage noAuthTvPage = new NoAuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_1PLUS1_CHANNEL_ENGLISH);

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
                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
    }
    // Проверка 5 фильмов на статус 200
    @Description("Проверка 5 фильмов на статус 200")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200For5Movie() {
        NoAuthGet200Response5Movie noAuthGet200Response5Movie = new NoAuthGet200Response5Movie();
        noAuthGet200Response5Movie.get200ResponseRussia();
        noAuthGet200Response5Movie.get200ResponseUkraine();
        noAuthGet200Response5Movie.get200ResponseEnglish();
    }

    @Description("Проверка 3 актеров на статус 200")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200For5Actor() {
        NoAuthGet200Response3Actor noAuthGet200Response3Actor = new NoAuthGet200Response3Actor();
        noAuthGet200Response3Actor.get200ResponseRussia();
        noAuthGet200Response3Actor.get200ResponseUkraine();
        noAuthGet200Response3Actor.get200ResponseEnglish();
    }

    @Description("Проверка 3 жанров на статус 200")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200For5Genres() {
        NoAuthGet200Response3Genres noAuthGet200Response3Genres = new NoAuthGet200Response3Genres();
        noAuthGet200Response3Genres.get200ResponseRussia();
        noAuthGet200Response3Genres.get200ResponseUkraine();
        noAuthGet200Response3Genres.get200ResponseEnglish();
    }

    @Description("Проверка всех элементов на странице Партнеры украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageUkraine() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_UKRAINE);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageRussia() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_RUSSIA);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageEnglish() {
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_ENGLISH);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageUkraine() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_UKRAINE);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageRussia() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_RUSSIA);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageEnglish() {
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_ENGLISH);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageUkraine() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_UKRAINE);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageRussia() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_RUSSIA);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageEnglish() {
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_ENGLISH);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице про нас украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageUkraine() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_UKRAINE);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageRussia() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_RUSSIA);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageEnglish() {
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_ENGLISH);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех елементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageUkraine() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_UKRAINE);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице промокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageRussia() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_RUSSIA);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageEnglish() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePageNoAuth();
    }

    @Description("Проверка всех елементов на странице как подключить украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageUkraine() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }



}
