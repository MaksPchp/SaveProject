package tests.ProdAuth;

import api.*;
import api.Get200Response.Prod.Auth.*;
import driver.DriverProvider;
import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import pages.Auth.*;
import pages.Modal.ModalAreYou18YearsOld;
import pages.Modal.ModalParrentsControl;
import pages.Modal.ModalPlatonWindow;
import pages.Modal.ModalToUpBalancePage;
import testNgRunner.TestNgRunner;
import methods.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static constants.Constants.*;


public class  AuthPageTest extends TestNgRunner {

    @Description("Проверяем наличие всех элементов в меню украинский язык")
    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
    public void verifyLogoImageUkraine() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        allElementsForMenu.allElementsForAuthorizationPageUkraine();
    }

    @Description("Проверяем наличие всех элементов в меню русский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageRussia() {
        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        allElementsForMenu.allElementsForAuthorizationPageRussia();
    }

    @Description("Проверяем наличие всех элементов в меню английский язык")
    @Test(timeOut = 15000, retryAnalyzer = Retry.class)
    public void verifyLogoImageEnglish() {
        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        AllElementsForMenu allElementsForMenu = new AllElementsForMenu();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        authorizationWithToken.authorizationWithTokenEnglish();
        allElementsForMenu.allElementsForAuthorizationPageEnglish();
    }

    @Description("Скроллим страницу вниз и проверяем, что появляется кнопка вверх украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyActiveToTopButton() throws InterruptedException {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        HomePage homePage = new HomePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        Thread.sleep(1500);
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getActiveToTopButton()));
        Assert.assertTrue(homePage.getActiveToTopButton().isDisplayed());
    }

//    @Description("проверка добавление канала в избранное")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAddingAndDeletingAChannelToFavorites() {
//            HomePage homePage = new HomePage();
//            GetNumberOfChannelsInFavorites getNumberOfChannelsInFavorites = new GetNumberOfChannelsInFavorites();
//            AuthTvPage authTvPage = new AuthTvPage();
//            AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//            ChangeLanguage changeLanguage = new ChangeLanguage();
//            changeLanguage.chooseRu();
//
//            authorizationWithToken.authorizationWithTokenRussia();
//            homePage.getTvButtonInMenu().click();
//            // Первый запрос кол-ва каналов в избранном
//            int firstNumberOfChannelsInFavorites = getNumberOfChannelsInFavorites.getNumberOfChannelsInFavorites();
//            // Добавляем канал в избранное
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstNoLikedChanel()));
//            authTvPage.getFirstNoLikedChanel().click();
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstNoLikedIconChanel()));
//            authTvPage.getFirstNoLikedIconChanel().click();
//            // Второй запрос кол-ва каналов в избранном
//            int secondNumberOfChannelsInFavorites = getNumberOfChannelsInFavorites.getNumberOfChannelsInFavorites();
//            int actualResult = secondNumberOfChannelsInFavorites - firstNumberOfChannelsInFavorites;
//            int expectedResult = 1;
//            Assert.assertEquals(actualResult, expectedResult);
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstLikedChanel()));
//            authTvPage.getFirstLikedChanel().click();
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getFirstLikedIconChanel()));
//            authTvPage.getFirstLikedIconChanel().click();
//    }

    @Description("Проверка работы поиска на странице ТВ")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyTvSearch() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
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

    @Description("Проверяем наличие категорий на странице ТВ")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyCategoryInTheTv() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        GetCategoryInTheTv getCategoryInTheTv = new GetCategoryInTheTv();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getTvButtonInMenu()));
        homePage.getTvButtonInMenu().click();
        List<Object> categoryInTheTv = getCategoryInTheTv.getCategoryInTheTv();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        authTvPage.getCategoryButton().click();
        for (int i = 0; i < categoryInTheTv.size(); i++){
            Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//li[text()='"+ categoryInTheTv.get(i) +"']")).isDisplayed());
        }
    }

    @Description("Проверка открытия и закрытия фуллскрина в ТВ украинский язык с помощью элементов управления")
    @Test(timeOut = 60000, retryAnalyzer = Retry.class)
    public void verifyWorkFullscreenInTheTVUkraine() {
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
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

//    @Description("Проверка работы родительского контроля каждый раз и один при входе")
//    @Test(timeOut = 40000, retryAnalyzer = Retry.class)
//    public void verifyIfParentalControlsAreWorking() {
//        HomePage homePage = new HomePage();
//        AuthHomePage authHomePage = new AuthHomePage();
//        CabinetPage cabinetPage = new CabinetPage();
//        ModalParrentsControl modalParrentsControl = new ModalParrentsControl();
//        AuthTvPage authTvPage = new AuthTvPage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        // Проверка запроса кода каждый раз
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getCabinetButton()));
//        authHomePage.getCabinetButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(cabinetPage.getSettingParentalControlsButton()));
//        cabinetPage.getSettingParentalControlsButton().click();
//        modalParrentsControl.getEveryTimeYouOpenContentCheckBox().click();
//        modalParrentsControl.getSaveSettings().click();
//        modalParrentsControl.getCloseModalWindow().click();
//        homePage.getTvButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
//        authTvPage.getCategoryButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getCategory18plus()));
//        authTvPage.getCategory18plus().click();
//        authTvPage.getFirstChannelInTheList().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getTextEnterPinCode18()));
//        Assert.assertTrue(authTvPage.getTextEnterPinCode18().isDisplayed());
//        authTvPage.getCodeEntryFieldOnChannel18().sendKeys("5555");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getEfirInThePlayer()));
//        Assert.assertTrue(authTvPage.getEfirInThePlayer().isDisplayed());
//        DriverProvider.getDriver().navigate().refresh();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getTextEnterPinCode18()));
//        Assert.assertTrue(authTvPage.getTextEnterPinCode18().isDisplayed());
//        // Проверка запроса один раз
//        authHomePage.getCabinetButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(cabinetPage.getSettingParentalControlsButton()));
//        cabinetPage.getSettingParentalControlsButton().click();
//        modalParrentsControl.getDontEveryTimeYouOpenContentCheckBox().click();
//        modalParrentsControl.getSaveSettings().click();
//        modalParrentsControl.getCloseModalWindow().click();
//        homePage.getTvButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getTextEnterPinCode18()));
//        Assert.assertTrue(authTvPage.getTextEnterPinCode18().isDisplayed());
//        authTvPage.getCodeEntryFieldOnChannel18().sendKeys("5555");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getEfirInThePlayer()));
//        Assert.assertTrue(authTvPage.getEfirInThePlayer().isDisplayed());
//        DriverProvider.getDriver().navigate().refresh();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getEfirInThePlayer()));
//        Assert.assertTrue(authTvPage.getEfirInThePlayer().isDisplayed());
//    }

    @Description("Проверка смены пин-кода родительского контроля")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyChangeTheCodeOfParentalControl() {
        AuthHomePage authHomePage = new AuthHomePage();
        CabinetPage cabinetPage = new CabinetPage();
        ModalParrentsControl modalParrentsControl = new ModalParrentsControl();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        authHomePage.getCabinetButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cabinetPage.getSettingParentalControlsButton()));
        cabinetPage.getSettingParentalControlsButton().click();
        modalParrentsControl.getChangePinCode().click();
        modalParrentsControl.getOldPinCode().sendKeys("5555");
        modalParrentsControl.getNewPinCode().sendKeys("5555");
        modalParrentsControl.getConfirmPinCodeChangeButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalParrentsControl.getPasswordChangedText()));
        Assert.assertTrue(modalParrentsControl.getPasswordChangedText().isDisplayed());
    }
//    // Проверка выхода из аккаунта
//    @Test(timeOut = 35000, retryAnalyzer = Retry.class)
//    public void verifyLogOut() throws InterruptedException {
//        String numberTelephone = TELEPHONE_NUMBER_FOR_AUTHORIZATION_WITH_SMS;
//        HomePage homePage = new HomePage();
//        AuthHomePage authHomePage = new AuthHomePage();
//        CabinetPage cabinetPage = new CabinetPage();
//        AuthorizationWithTelephoneNumber authorizationWithTelephoneNumber = new AuthorizationWithTelephoneNumber();
//
//        authorizationWithTelephoneNumber.authorizationUkraine(numberTelephone);
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

//    @Description("Проверка отображения окна 18+ при открытии муви инфо, работа кнопок да и нет")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyDisplayWindow18WhenOpeningMovieInfo() {
//        ModalAreYou18YearsOld modalAreYou18YearsOld = new ModalAreYou18YearsOld();
//        AuthCinemaPage authCinemaPage = new AuthCinemaPage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        DriverProvider.getDriver().get("https://sweet.tv/ru/movie/8952-zhittya");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAreYou18YearsOld.getDoYouHave18Text()));
//        Assert.assertTrue(modalAreYou18YearsOld.getDoYouHave18Text().isDisplayed());
//        modalAreYou18YearsOld.getNoButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_HOME_PAGE_RUSSIA));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOME_PAGE_RUSSIA));
//        DriverProvider.getDriver().get("https://sweet.tv/ru/movie/8952-zhittya");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(modalAreYou18YearsOld.getDoYouHave18Text()));
//        Assert.assertTrue(modalAreYou18YearsOld.getDoYouHave18Text().isDisplayed());
//        modalAreYou18YearsOld.getYesButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getPlayButton()));
//        Assert.assertTrue(authCinemaPage.getPlayButton().isDisplayed());
//    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница фильмы украинский язык")
    @Test(timeOut = 50000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsFilmsPageUkrain() {
        AuthCinemaPage authCinemaPage = new AuthCinemaPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getDisneyCollection()));
        authCinemaPage.getDisneyCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_DISNEY_UKRAIN_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_DISNEY_UKRAIN_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getPictureboxCollection()));
        authCinemaPage.getPictureboxCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_UKRAIN_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_UKRAIN_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getParamountCollection()));
        authCinemaPage.getParamountCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARAMOUNT_UKRAIN_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARAMOUNT_UKRAIN_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getSonyCollection()));
        authCinemaPage.getSonyCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SONY_UKRAIN_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SONY_UKRAIN_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getMgmCollection()));
        authCinemaPage.getMgmCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_MGM_UKRAIN_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_MGM_UKRAIN_FOR_MOVIE));
    }


//    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница фильмы русский язык")
//    @Test(timeOut = 40000, retryAnalyzer = Retry.class)
//    public void verifyLinksOnCollectionsFilmsPageRussia() {
//        AuthCinemaPage authCinemaPage = new AuthCinemaPage();
//        HomePage homePage = new HomePage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
//        homePage.getCinemaButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getDisneyCollection()));
//        authCinemaPage.getDisneyCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_DISNEY_RUSSIA_FOR_MOVIE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_DISNEY_RUSSIA_FOR_MOVIE));
//        homePage.getCinemaButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getPictureboxCollection()));
//        authCinemaPage.getPictureboxCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_RUSSIA_FOR_MOVIE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_RUSSIA_FOR_MOVIE));
//        homePage.getCinemaButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getParamountCollection()));
//        authCinemaPage.getParamountCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_PARAMOUNT_RUSSIA_FOR_MOVIE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARAMOUNT_RUSSIA_FOR_MOVIE));
//        homePage.getCinemaButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getSonyCollection()));
//        authCinemaPage.getSonyCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SONY_RUSSIA_FOR_MOVIE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SONY_RUSSIA_FOR_MOVIE));
//        homePage.getCinemaButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getMgmCollection()));
//        authCinemaPage.getMgmCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_MGM_RUSSIA_FOR_MOVIE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_MGM_RUSSIA_FOR_MOVIE));
//    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница фильмы английский язык")
    @Test(timeOut = 50000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsFilmsPageEnglish() {
        AuthCinemaPage authCinemaPage = new AuthCinemaPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getCinemaButtonInMenu()));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getDisneyCollection()));
        authCinemaPage.getDisneyCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_DISNEY_ENGLISH_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_DISNEY_ENGLISH_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getPictureboxCollection()));
        authCinemaPage.getPictureboxCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_ENGLISH_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_ENGLISH_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getParamountCollection()));
        authCinemaPage.getParamountCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARAMOUNT_ENGLISH_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARAMOUNT_ENGLISH_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getSonyCollection()));
        authCinemaPage.getSonyCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SONY_ENGLISH_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SONY_ENGLISH_FOR_MOVIE));
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCinemaPage.getMgmCollection()));
        authCinemaPage.getMgmCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_MGM_ENGLISH_FOR_MOVIE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_MGM_ENGLISH_FOR_MOVIE));
    }

//    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница сериалы украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyLinksOnCollectionsSeriesPageUkrain() {
//        AuthSeriesPage authSeriesPage = new AuthSeriesPage();
//        HomePage homePage = new HomePage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
//        homePage.getSeriesButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authSeriesPage.getAbcStudioCollection()));
//        authSeriesPage.getAbcStudioCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_ABC_UKRAIN_FOR_SERIES));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABC_UKRAIN_FOR_SERIES));
//        homePage.getSeriesButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authSeriesPage.getPictureboxCollection()));
//        authSeriesPage.getPictureboxCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_UKRAIN_FOR_SERIES));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_UKRAIN_FOR_SERIES));
//    }
//
//    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница сериалы русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyLinksOnCollectionsSeriesPageRussia() {
//        AuthSeriesPage authSeriesPage = new AuthSeriesPage();
//        HomePage homePage = new HomePage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
//        homePage.getSeriesButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authSeriesPage.getAbcStudioCollection()));
//        authSeriesPage.getAbcStudioCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_ABC_RUSSIA_FOR_SERIES));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABC_RUSSIA_FOR_SERIES));
//        homePage.getSeriesButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authSeriesPage.getPictureboxCollection()));
//        authSeriesPage.getPictureboxCollection().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_RUSSIA_FOR_SERIES));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_RUSSIA_FOR_SERIES));
//    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница сериалы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsSeriesPageEnglish() {
        AuthSeriesPage authSeriesPage = new AuthSeriesPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getSeriesButtonInMenu()));
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authSeriesPage.getAbcStudioCollection()));
        authSeriesPage.getAbcStudioCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABC_ENGLISH_FOR_SERIES));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABC_ENGLISH_FOR_SERIES));
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authSeriesPage.getPictureboxCollection()));
        authSeriesPage.getPictureboxCollection().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PICTUREBOX_ENGLISH_FOR_SERIES));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PICTUREBOX_ENGLISH_FOR_SERIES));
    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница мультфильмы украинский язык")
    @Test(timeOut = 50000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsCartoonsPageUkrain() {
        AuthCartoonPage authCartoonPage = new AuthCartoonPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection3years()));
        authCartoonPage.getCollection3years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_3_YEARS_UKRAIN_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_3_YEARS_UKRAIN_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection8years()));
        authCartoonPage.getCollection8years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_8_YEAR_UKRAIN_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_8_YEAR_UKRAIN_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForChildren()));
        authCartoonPage.getCollectionForChildren().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_CHILDREN_UKRAIN_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_CHILDREN_UKRAIN_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForAllFamily()));
        authCartoonPage.getCollectionForAllFamily().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_ALL_FAMILY_UKRAIN_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_ALL_FAMILY_UKRAIN_FOR_CARTOON));
    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница мультфильмы русский язык")
    @Test(timeOut = 50000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsCartoonsPageRussia() {
        AuthCartoonPage authCartoonPage = new AuthCartoonPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection3years()));
        authCartoonPage.getCollection3years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_3_YEARS_RUSSIA_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_3_YEARS_RUSSIA_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection8years()));
        authCartoonPage.getCollection8years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_8_YEAR_RUSSIA_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_8_YEAR_RUSSIA_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForChildren()));
        authCartoonPage.getCollectionForChildren().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_CHILDREN_RUSSIA_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_CHILDREN_RUSSIA_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForAllFamily()));
        authCartoonPage.getCollectionForAllFamily().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_ALL_FAMILY_RUSSIA_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_ALL_FAMILY_RUSSIA_FOR_CARTOON));
    }

    @Description("Проверка ссылок на коллекциях дисней, пикчербокс, парамаунт и т.д. страница мультфильмы английский язык")
    @Test(timeOut = 50000, retryAnalyzer = Retry.class)
    public void verifyLinksOnCollectionsCartoonsPageEnglish() {
        AuthCartoonPage authCartoonPage = new AuthCartoonPage();
        HomePage homePage = new HomePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getMultfilmeButtonInMenu()));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection3years()));
        authCartoonPage.getCollection3years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_3_YEARS_ENGLISH_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_3_YEARS_ENGLISH_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollection8years()));
        authCartoonPage.getCollection8years().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_8_YEAR_ENGLISH_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_8_YEAR_ENGLISH_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForChildren()));
        authCartoonPage.getCollectionForChildren().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_CHILDREN_ENGLISH_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_CHILDREN_ENGLISH_FOR_CARTOON));
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authCartoonPage.getCollectionForAllFamily()));
        authCartoonPage.getCollectionForAllFamily().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_ALL_FAMILY_ENGLISH_FOR_CARTOON));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_ALL_FAMILY_ENGLISH_FOR_CARTOON));
    }

    @Description("Проверка ссылок для соц. сетей в футере")
    @Test(timeOut = 65000, retryAnalyzer = Retry.class)
    public void verifyLinksOnSocialNetworks() throws InterruptedException {
        Footer footer = new Footer();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        Thread.sleep(1500);
        goToDownPage.goToDownPage();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getInstagramButton()));
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
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getFacebookButton()));
        footer.getFacebookButton().click();
        ArrayList<String> facebook = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(facebook.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FACEBOOK_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FACEBOOK_IN_FOOTER));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(facebook.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getTelegramButton()));
        footer.getTelegramButton().click();
        ArrayList<String> telegram = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(telegram.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TELEGRAM_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TELEGRAM_IN_FOOTER));

        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getYoutubeButton()));
        footer.getYoutubeButton().click();
        ArrayList<String> youtube = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(youtube.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_YOUTUBE_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_YOUTUBE_IN_FOOTER));
        DriverProvider.getDriver().close();
        DriverProvider.getDriver().switchTo().window(telegram.get(0));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(footer.getPinterestButton()));
        footer.getPinterestButton().click();
        ArrayList<String> pinterest = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
        DriverProvider.getDriver().switchTo().window(pinterest.get(1));
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PINTEREST_IN_FOOTER));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PINTEREST_IN_FOOTER));
    }
//    // Проверка написания, редактирования и удаления комментария
//    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
//    public void verifyAddChangedAndDeleteComment(){
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        DriverProvider.getDriver().get(URL_STG_RANDOM_MOVIE_UKRAINIAN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getCommentTextInput()));
//        authMovieInfo.getCommentTextInput().sendKeys("Test text 1");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getWriteCommentButton()));
//        authMovieInfo.getWriteCommentButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//p[text()='Test text 1']"))));
//        Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//p[text()='Test text 1']")).isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getChangeCommentButton()));
//        authMovieInfo.getChangeCommentButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getChangeCommentInput()));
//        authMovieInfo.getChangeCommentInput().click();
//        authMovieInfo.getChangeCommentInput().sendKeys("Changed");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getSaveChangedCommentButton()));
//        authMovieInfo.getSaveChangedCommentButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//p[text()='Test text 1Changed']"))));
//        Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//p[text()='Test text 1Changed']")).isDisplayed());
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getDeleteCommentButton()));
//        authMovieInfo.getDeleteCommentButton().click();
//    }

    @Description("Проверка открытия и закрытия тв в фуллскрин, кнопками ENTER и ESCAPE")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyWorkFullscreenInTheTVUkraineEnterButton() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getEnterFullScreenButton()));
        Assert.assertTrue(authTvPage.getEnterFullScreenButton().isDisplayed());
        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.ENTER);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getExitFullScreenButton()));
        Assert.assertTrue(authTvPage.getExitFullScreenButton().isDisplayed());
        DriverProvider.getDriver().findElement(By.xpath("//*")).sendKeys(Keys.ENTER);
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getEnterFullScreenButton()));
        Assert.assertTrue(authTvPage.getEnterFullScreenButton().isDisplayed());
    }

//    @Description("Проверка всех елементов на странице тарифы украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsOnTheTariffsPageUkraine() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_UKRAINE);
//        allElementsForTariffsPage.allElementsForTariffsPage();
//    }
//
//    @Description("Проверка всех елементов на странице тарифы русский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsOnTheTariffsPageRussia() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_RUSSIA);
//        allElementsForTariffsPage.allElementsForTariffsPage();
//    }
//
//    @Description("Проверка всех елементов на странице тарифы английский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsOnTheTariffsPageEnglish() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        AllElementsForTariffsPage allElementsForTariffsPage = new AllElementsForTariffsPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseEn();
//
//        authorizationWithToken.authorizationWithTokenEnglish();
//        DriverProvider.getDriverMobile().get(URL_TARIFFS_PAGE_ENGLISH);
//        allElementsForTariffsPage.allElementsForTariffsPage();
//    }

//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере украинский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterUkrainian() throws InterruptedException {
//        Footer footer = new Footer();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        GoToDownPage goToDownPage = new GoToDownPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        Thread.sleep(1500);
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_UKRAINE));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_UKRAINE));
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }
//
//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере русский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterRussia() throws InterruptedException {
//        Footer footer = new Footer();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        GoToDownPage goToDownPage = new GoToDownPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        Thread.sleep(1500);
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
//        new Actions(DriverProvider.getDriver()).moveToElement(footer.getImageFromFooter()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_RUSSIA));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_RUSSIA));
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }
//
//    @Description("Проверка ссылок кнопок подлкючения через устройства в футере английский язык")
//    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
//    public void verifyConnectionDeviceButtonInTheFooterEnglish() throws InterruptedException {
//        Footer footer = new Footer();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        GoToDownPage goToDownPage = new GoToDownPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseEn();
//
//        authorizationWithToken.authorizationWithTokenEnglish();
//        Thread.sleep(1500);
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getGooglePlayConnectButton()));
//        new Actions(DriverProvider.getDriver()).moveToElement(footer.getImageFromFooter()).perform();
//        footer.getGooglePlayConnectButton().click();
//        ArrayList<String> tabs = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(tabs.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_GOOGLE_PLAY_BUTTON_IN_FOOTER_ENGLISH));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(tabs.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppStoreConnectButton()));
//        footer.getAppStoreConnectButton().click();
//        ArrayList<String> appStore = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appStore.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_STORE_BUTTON_IN_FOOTER_MULTI));
//        DriverProvider.getDriver().close();
//        DriverProvider.getDriver().switchTo().window(appStore.get(0));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getSmartTvConnectButton()));
//        footer.getSmartTvConnectButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SMART_TV_BUTTON_IN_FOOTER_ENGLISH));
//        goToDownPage.goToDownPage();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(footer.getAppGalleryConnectButton()));
//        footer.getAppGalleryConnectButton().click();
//        ArrayList<String> appGallery = new ArrayList<String>(DriverProvider.getDriver().getWindowHandles());
//        DriverProvider.getDriver().switchTo().window(appGallery.get(1));
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_APP_GALLERY_BUTTON_IN_FOOTER_MULTI));
//    }

    @Description("Проверяем нажатие на логотип украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOME_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOME_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие на логотип русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOME_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOME_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие на логотип английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickLogoImageEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getLogoImageInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOME_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOME_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки ТВ в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();
        HomePage homePage = new HomePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки ТВ в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyCkickTvInMenuButtonEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getCategoryButton()));
        Assert.assertTrue(authTvPage.getCategoryButton().isDisplayed());
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMovieButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getCinemaButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CINEMA_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CINEMA_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Сериалы в меню язык язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickSeriesButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getSeriesButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_SERIES_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_SERIES_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Мультфильмы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickMultfilmsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        homePage.getMultfilmeButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_CARTOONS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_CARTOONS_PAGE_ENGLISH));
    }


    @Description("Проверяем нажатие кнопки Новости в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Новости в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickNewsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getNewsButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_NEWS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_NEWS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Как подключить в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHowToCinnectButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHowToConnectInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOW_TO_CONNECT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Тарифы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickTariffsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getTariffsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_TARIFFS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_TARIFFS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Промокод в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPromoCodeButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPromoCodeButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PROMO_CODE_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PROMO_CODE_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Оплата в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPayButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
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
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
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
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        CabinetPage cabinetPage = new CabinetPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
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
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Про нас в меню английский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickAboutUsButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getAboutUsButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_ABOUT_US_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_ABOUT_US_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню украинский язык  авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Голливуд на украинском в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickHollywoodButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getHollywoodButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_HOLLYWOOD_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_HOLLYWOOD_PAGE_ENGLISH));
    }
//
//    @Description("Проверяем нажатие кнопки Поддержка айти в меню украинский язык авторизованная сторона")
//    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
//    public void verifyClickItSupportButtonInTheMenuUkraineAuthoriz() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        HomePage homePage = new HomePage();
//        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
//        homePage.getItSupportButtonInTheMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_UKRAINE));
//        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_UKRAINE));
//    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню русский язык авторизованная сторона")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Поддержка айти в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickItSupportButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getItSupportButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_IT_SUPPORT_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_IT_SUPPORT_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Битва блогеров в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickBattleOfTheBloggersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getBattleOfBloggersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_BATTLE_BLOGGERS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Фонд кино в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickFondKinoButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getFondKinoButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOND_KINO_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOND_KINO_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Для прессы в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickForThePressButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getForThePressButtonUnTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_FOR_THE_PRESS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_FOR_THE_PRESS_PAGE_ENGLISH));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню украинский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuUkraineAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_UKRAINE));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_UKRAINE));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню русский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuRussiaAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_RUSSIA));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_RUSSIA));
    }

    @Description("Проверяем нажатие кнопки Партнеры в меню английский язык авторизованная сторона")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyClickPartnersButtonInTheMenuEnglishAuthoriz() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        HomePage homePage = new HomePage();
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        homePage.getPartnersButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe(URL_PARTNERS_PAGE_ENGLISH));
        Assert.assertTrue(DriverProvider.getDriver().getCurrentUrl().equals(URL_PARTNERS_PAGE_ENGLISH));
    }

//    @Description("Проверка кнопок Вначало и в Эфир в тв")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyToStartAndToEfirButton() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        HomePage homePage = new HomePage();
//        AuthTvPage authTvPage = new AuthTvPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        homePage.getTvButtonInMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getToStartButton()));
//        Assert.assertTrue(authTvPage.getToStartButton().isDisplayed());
//        authTvPage.getToStartButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getToEfirButton()));
//        Assert.assertTrue(authTvPage.getToEfirButton().isDisplayed());
//        authTvPage.getToEfirButton().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authTvPage.getToStartButton()));
//        Assert.assertTrue(authTvPage.getToStartButton().isDisplayed());
//    }

    @Description("Проверяем что по умолчанию стоит качество авто")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyDefaultQualityAuto() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        homePage.getTvButtonInMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(authTvPage.getQualityAuto()));
        Assert.assertTrue(authTvPage.getQualityAuto().isDisplayed());
    }

    @Description("Проверяем запрет перемотки на канале")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyRewindProhibition() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверка всех елементов в футере украинский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterUkraine() throws InterruptedException {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        Thread.sleep(1500);
        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterUkraine();
    }

    @Description("Проверка всех елементов в футере русский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterRussia() throws InterruptedException {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        Thread.sleep(1500);
        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterRussia();
    }

    @Description("Проверка всех елементов в футере английский")
    @Test(timeOut = 45000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFooterEnglish() throws InterruptedException {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        Footer footer = new Footer();
        AllElementsForFooter allElementsForFooter = new AllElementsForFooter();
        GoToDownPage goToDownPage = new GoToDownPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        Thread.sleep(1500);
        goToDownPage.goToDownPage();
        allElementsForFooter.allElementsForFooterEnglish();
    }

    @Description("Проверка всех елементов в форме пополения баланса украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowUkraine() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowRussia() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка всех елементов в форме пополения баланса английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForToUpWindowEnglish() {
        HomePage homePage = new HomePage();
        AllElementsForToUpBalanceWindow allElementsForToUpBalanceWindow = new AllElementsForToUpBalanceWindow();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        allElementsForToUpBalanceWindow.allElementsForToUpBalanceWindow();
    }

    @Description("Проверка ошибки, при вводе суммы 0 грн украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyErrorForSumNullUkraine() {
        HomePage homePage = new HomePage();
        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        toUpBalancePage.getSumInput().sendKeys("0");
        toUpBalancePage.getActiveButton().click();
        Assert.assertTrue(toUpBalancePage.getErrorNullSumTextUkraine().isDisplayed());
    }

    @Description("Проверка ошибки, при вводе суммы 0 грн русский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyErrorForSumNullRussia() {
        HomePage homePage = new HomePage();
        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        toUpBalancePage.getSumInput().sendKeys("0");
        toUpBalancePage.getActiveButton().click();
        Assert.assertTrue(toUpBalancePage.getErrorNullSumTextRussia().isDisplayed());
    }

//    @Description("Проверка ошибки, при вводе суммы 0 грн английский язык")
//    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
//    public void verifyErrorForSumNullEnglish() {
//        HomePage homePage = new HomePage();
//        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseEn();
//
//        authorizationWithToken.authorizationWithTokenEnglish();
//
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
//        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
//        homePage.getPayButtonInTheMenu().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
//        toUpBalancePage.getSumInput().sendKeys("0");
//        toUpBalancePage.getActiveButton().click();
//        Assert.assertTrue(toUpBalancePage.getErrorNullSumTextEnglish().isDisplayed());
//    }

    @Description("Проверка ввода 1 грн и открытие формы платона украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyEnter1UahAndOpenPlatonWindow() {
        HomePage homePage = new HomePage();
        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        ModalPlatonWindow modalPlatonWindow = new ModalPlatonWindow();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        toUpBalancePage.getSumInput().sendKeys("1");
        toUpBalancePage.getActiveButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalPlatonWindow.getPlatonWindow()));
        Assert.assertTrue(modalPlatonWindow.getPlatonWindow().isDisplayed());
    }

    @Description("Проверка максимального кол-ва символов в поле ввода суммы")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyMaxSumLength() {
        HomePage homePage = new HomePage();
        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        ModalPlatonWindow modalPlatonWindow = new ModalPlatonWindow();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        toUpBalancePage.getSumInput().sendKeys("999999999");
        toUpBalancePage.getActiveButton().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalPlatonWindow.getMaxSum()));
        Assert.assertTrue(modalPlatonWindow.getMaxSum().isDisplayed());
    }

    @Description("Проверка на запрет ввода символов в поле суммы оплаты")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyNoValidateEnterCharactersInFiledPay() {
        HomePage homePage = new HomePage();
        ModalToUpBalancePage toUpBalancePage = new ModalToUpBalancePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getBurgerMenuButton()));
        new Actions(DriverProvider.getDriver()).moveToElement(homePage.getBurgerMenuButton()).perform();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(homePage.getPayButtonInTheMenu()));
        homePage.getPayButtonInTheMenu().click();
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(toUpBalancePage.getToUpBalanceText()));
        toUpBalancePage.getSumInput().sendKeys("abc+-/");
        Assert.assertTrue(toUpBalancePage.getNoActiveButton().isDisplayed());
        toUpBalancePage.getSumInput().sendKeys("*.,`=-");
        Assert.assertTrue(toUpBalancePage.getNoActiveButton().isDisplayed());
        toUpBalancePage.getSumInput().sendKeys("ыі}]:;");
        Assert.assertTrue(toUpBalancePage.getNoActiveButton().isDisplayed());
    }

    @Description("Проверка всех елементов на странице промокод украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageUkraine() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_UKRAINE);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageRussia() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_RUSSIA);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка всех елементов на странице промокод английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForPromoCodePageEnglish() {
        AllElementsForPromoCodePage allElementsForPromoCodePage = new AllElementsForPromoCodePage();
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_PROMO_CODE_PAGE_ENGLISH);
        allElementsForPromoCodePage.allElementsForPromoCodePage();
    }

    @Description("Проверка все елементов на баннере главной страницы украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInBannerForHomePageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsInBannerForHomePage allElementsInBannerForHomePage = new AllElementsInBannerForHomePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        allElementsInBannerForHomePage.AllElementsInBannerForHomePage();
    }

    @Description("Проверка все елементов на баннере главной страницы руссикй язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInBannerForHomePageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsInBannerForHomePage allElementsInBannerForHomePage = new AllElementsInBannerForHomePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        allElementsInBannerForHomePage.AllElementsInBannerForHomePage();
    }

    @Description("Проверка все елементов на баннере главной страницы английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInBannerForHomePageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsInBannerForHomePage allElementsInBannerForHomePage = new AllElementsInBannerForHomePage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        allElementsInBannerForHomePage.AllElementsInBannerForHomePage();
    }

//    @Description("Проверка добавления и удаление фильма в досмотреть позже на главной")
//    @Test(timeOut = 120000, retryAnalyzer = Retry.class)
//    public void verifyAddFilmsInContinueWatching() throws InterruptedException {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        GetWatchList getWatchList = new GetWatchList();
//        AuthHomePage authHomePage = new AuthHomePage();
//        AuthCinemaPage authCinemaPage = new AuthCinemaPage();
//        HomePage homePage = new HomePage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        List getWatch1 = getWatchList.getWatchList();
//        if (getWatch1 == null){
//
//        }else {
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                    .until(ExpectedConditions.visibilityOf(authHomePage.getContinueWatchingCollection()));
//            new Actions(DriverProvider.getDriver()).moveToElement(authHomePage.getContinueWatchingCollection()).perform();
//            for (int i = 0; i < getWatch1.size(); i++){
//                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                        .until(ExpectedConditions.visibilityOf(authHomePage.getBlockDeleteFromContinueWatching()));
//                new Actions(DriverProvider.getDriver()).moveToElement(authHomePage.getBlockDeleteFromContinueWatching()).perform();
//                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                        .until(ExpectedConditions.visibilityOf(authHomePage.getDeleteFromContinueWatching()));
//                authHomePage.getDeleteFromContinueWatching().click();
//                Thread.sleep(Duration.ofSeconds(10)00);
//            }
//        }
//        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authCinemaPage.getPlayButton()));
//        authCinemaPage.getPlayButton().click();
//        Thread.sleep(70000);
//        homePage.getLogoImageInMenu().click();
//
//        List getWatch2 = getWatchList.getWatchList();
//        Assert.assertEquals(getWatch2.size(), 1);
//
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getContinueWatchingCollection()));
//        new Actions(DriverProvider.getDriver()).moveToElement(authHomePage.getContinueWatchingCollection()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getBlockDeleteFromContinueWatching()));
//        new Actions(DriverProvider.getDriver()).moveToElement(authHomePage.getBlockDeleteFromContinueWatching()).perform();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getDeleteFromContinueWatching()));
//        authHomePage.getDeleteFromContinueWatching().click();
//        DriverProvider.getDriver().navigate().refresh();
//        Thread.sleep(Duration.ofSeconds(10)00);
//        List getWatch3 = getWatchList.getWatchList();
//        Assert.assertEquals(getWatch3, null);
//    }

//    @Description("Проверка добавления и удаление фильма в избранное в личном кабинете")
//    @Test(timeOut = 45000)
//    public void verifyAddFilmsInFavoriteForCabinet() throws InterruptedException {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        GetFavoriteMovies getFavoriteMovies = new GetFavoriteMovies();
//        AuthHomePage authHomePage = new AuthHomePage();
//        CabinetPage cabinetPage = new CabinetPage();
//        AuthMovieInfoPage authMovieInfo = new AuthMovieInfoPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseRu();
//
//        authorizationWithToken.authorizationWithTokenRussia();
//        authHomePage.getCabinetButton().click();
//        List getFavoriteMovies1 = getFavoriteMovies.getFavoriteMovies();
//        if (getFavoriteMovies1 == null){
//
//        }else {
//            new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                    .until(ExpectedConditions.visibilityOf(cabinetPage.getDeleteFilmFromFavorite()));
//            new Actions(DriverProvider.getDriver()).moveToElement(cabinetPage.getDeleteFilmFromFavorite()).perform();
//            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
//            for (int i = 0; i < getFavoriteMovies1.size(); i++){
//                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                        .until(ExpectedConditions.visibilityOf(cabinetPage.getDeleteFilmFromFavorite()));
//                cabinetPage.getDeleteFilmFromFavorite().click();
//            }
//        }
//        DriverProvider.getDriver().get(URL_RANDOM_MOVIE_UKRAINIAN);
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authMovieInfo.getAddOrDeleteFromFavorite()));
//        authMovieInfo.getAddOrDeleteFromFavorite().click();
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(authHomePage.getCabinetButton()));
//        authHomePage.getCabinetButton().click();
//
//        List getFavoriteMovies2 = getFavoriteMovies.getFavoriteMovies();
//        Assert.assertEquals(getFavoriteMovies2.size(), 1);
//
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(cabinetPage.getDeleteFilmFromFavorite()));
//        new Actions(DriverProvider.getDriver()).moveToElement(cabinetPage.getDeleteFilmFromFavorite()).perform();
//        Thread.sleep(400);
//        ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)");
//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(cabinetPage.getDeleteFilmFromFavorite()));
//        cabinetPage.getDeleteFilmFromFavorite().click();
//        DriverProvider.getDriver().navigate().refresh();
//        Thread.sleep(Duration.ofSeconds(10)00);
//        List getFavoriteMovies3 = getFavoriteMovies.getFavoriteMovies();
//        Assert.assertEquals(getFavoriteMovies3, null);
//    }

    @Description("Проверка главной страницы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageUk(){
        AuthGet200ResponseHomePage AuthGet200ResponseHomePage = new AuthGet200ResponseHomePage();
        AuthGet200ResponseHomePage.get200ResponseHomePageUkraine();
    }

    @Description("Проверка главной страницы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageRu(){
        AuthGet200ResponseHomePage AuthGet200ResponseHomePage = new AuthGet200ResponseHomePage();
        AuthGet200ResponseHomePage.get200ResponseHomePageRussia();
    }

    @Description("Проверка главной страницы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHomePageEn(){
        AuthGet200ResponseHomePage AuthGet200ResponseHomePage = new AuthGet200ResponseHomePage();
        AuthGet200ResponseHomePage.get200ResponseHomePageEnglish();
    }

    @Description("Проверка страницы ТВ на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageUk() {
        AuthGet200ResponseTv get200ResponseTv = new AuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvUkraine();
    }

    @Description("Проверка страницы ТВ на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageRu() {
        AuthGet200ResponseTv get200ResponseTv = new AuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvRussia();
    }

    @Description("Проверка страницы ТВ на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTvPageEn() {
        AuthGet200ResponseTv get200ResponseTv = new AuthGet200ResponseTv();
        get200ResponseTv.get200ResponseTvEnglish();
    }

    @Description("Проверка страницы фильмы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageUk() {
        AuthGet200ResponseMovie get200ResponseMovie = new AuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieUkraine();
    }

    @Description("Проверка страницы фильмы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageRu() {
        AuthGet200ResponseMovie get200ResponseMovie = new AuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieRussia();
    }

    @Description("Проверка страницы фильмы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForMoviePageEn() {
        AuthGet200ResponseMovie get200ResponseMovie = new AuthGet200ResponseMovie();
        get200ResponseMovie.get200ResponseMovieUkraine();
    }

    @Description("Проверка страницы сериалы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageUk() {
        AuthGet200ResponseSeries get200ResponseSeries = new AuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesUkraine();
    }

    @Description("Проверка страницы сериалы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageRu() {
        AuthGet200ResponseSeries get200ResponseSeries = new AuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesRussia();
    }

    @Description("Проверка страницы сериалы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSeriesPageEn() {
        AuthGet200ResponseSeries get200ResponseSeries = new AuthGet200ResponseSeries();
        get200ResponseSeries.get200ResponseSeriesEnglish();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageUk() {
        AuthGet200ResponseCartoons get200ResponseCartoons = new AuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsUkraine();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageRu() {
        AuthGet200ResponseCartoons get200ResponseCartoons = new AuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsRussia();
    }

    @Description("Проверка страницы мультфильмы на статус 200 Английски язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForCartoonsPageEn() {
        AuthGet200ResponseCartoons get200ResponseCartoons = new AuthGet200ResponseCartoons();
        get200ResponseCartoons.get200ResponseCartoonsEnglish();
    }

    @Description("Проверка страницы новости на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForNewsPageUk() {
        AuthGet200ResponseNews get200ResponseNews = new AuthGet200ResponseNews();
        get200ResponseNews.get200ResponseNewsUkraine();
    }

    @Description("Проверка страницы новости на статус 200 Руссикй язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForNewsPageRu() {
        AuthGet200ResponseNews get200ResponseNews = new AuthGet200ResponseNews();
        get200ResponseNews.get200ResponseNewsRussia();
    }

    @Description("Проверка страницы как подключить на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageUa() {
        AuthGet200ResponseHowConnect get200ResponseHowConnect = new AuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectUkraine();
    }

    @Description("Проверка страницы как подключить на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageRu() {
        AuthGet200ResponseHowConnect get200ResponseHowConnect = new AuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectRussia();
    }

    @Description("Проверка страницы как подключить на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHowConnectPageEn() {
        AuthGet200ResponseHowConnect get200ResponseHowConnect = new AuthGet200ResponseHowConnect();
        get200ResponseHowConnect.get200ResponseHowConnectEnglish();
    }

    @Description("Проверка страницы тарифы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageUk() {
        AuthGet200ResponseTariffs get200ResponseTariffs = new AuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsUkraine();
    }

    @Description("Проверка страницы тарифы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageRu() {
        AuthGet200ResponseTariffs get200ResponseTariffs = new AuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsRussia();
    }

    @Description("Проверка страницы тарифы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForTariffsPageEn() {
        AuthGet200ResponseTariffs get200ResponseTariffs = new AuthGet200ResponseTariffs();
        get200ResponseTariffs.get200ResponseTariffsEnglish();
    }

    @Description("Проверка страницы промо код на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageUk() {
        AuthGet200ResponsePromoCode get200ResponsePromoCode = new AuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeUkraine();
    }

    @Description("Проверка страницы промо код на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageRu() {
        AuthGet200ResponsePromoCode get200ResponsePromoCode = new AuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeRussia();
    }

    @Description("Проверка страницы промо код на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPromoCodePageEn() {
        AuthGet200ResponsePromoCode get200ResponsePromoCode = new AuthGet200ResponsePromoCode();
        get200ResponsePromoCode.get200ResponsePromoCodeEnglish();
    }

    @Description("Проверка страницы про нас на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageUk() {
        AuthGet200ResponseAboutUs get200ResponseAboutUs = new AuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsUkraine();
    }

    @Description("Проверка страницы про нас на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageRu() {
        AuthGet200ResponseAboutUs get200ResponseAboutUs = new AuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsRussia();
    }

    @Description("Проверка страницы про нас на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForAboutUsPageEn() {
        AuthGet200ResponseAboutUs get200ResponseAboutUs = new AuthGet200ResponseAboutUs();
        get200ResponseAboutUs.get200ResponseAboutUsEnglish();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageUk() {
        AuthGet200ResponseHollywood get200ResponseHollywood = new AuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodUkraine();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageRu() {
        AuthGet200ResponseHollywood get200ResponseHollywood = new AuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodRussia();
    }

    @Description("Проверка страницы голливуд укранским на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForHollywoodPageEn() {
        AuthGet200ResponseHollywood get200ResponseHollywood = new AuthGet200ResponseHollywood();
        get200ResponseHollywood.get200ResponseHollywoodEnglish();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageUk() {
        AuthGet200ResponseSupportIt get200ResponseSupportIt = new AuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItUkraine();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageRu() {
        AuthGet200ResponseSupportIt get200ResponseSupportIt = new AuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItRussia();
    }

    @Description("Проверка страницы поддержка айти на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForSupportItPageEn() {
        AuthGet200ResponseSupportIt get200ResponseSupportIt = new AuthGet200ResponseSupportIt();
        get200ResponseSupportIt.get200ResponseSupportItEnglish();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageUk() {
        AuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new AuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersUkraine();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageRu() {
        AuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new AuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersRussia();
    }

    @Description("Проверка страницы битва блегеров на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForBattleBloggersPageEn() {
        AuthGet200ResponseBattleBloggers get200ResponseBattleBloggers = new AuthGet200ResponseBattleBloggers();
        get200ResponseBattleBloggers.get200ResponseBattleBloggersEnglish();
    }

    @Description("Проверка страницы фонд кино на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageuk() {
        AuthGet200ResponseFondKino get200ResponseFondKino = new AuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoUkraine();
    }

    @Description("Проверка страницы фонд кино на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageRu() {
        AuthGet200ResponseFondKino get200ResponseFondKino = new AuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoRussia();
    }

    @Description("Проверка страницы фонд кино на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForFondKinoPageEn() {
        AuthGet200ResponseFondKino get200ResponseFondKino = new AuthGet200ResponseFondKino();
        get200ResponseFondKino.get200ResponseFondKinoEnglish();
    }

    @Description("Проверка страницы для прессы на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageUk() {
        AuthGet200ResponseForPress get200ResponseForPress = new AuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressUkraine();
    }

    @Description("Проверка страницы для прессы на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageRu() {
        AuthGet200ResponseForPress get200ResponseForPress = new AuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressRussia();
    }

    @Description("Проверка страницы для прессы на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForForPressPageEn() {
        AuthGet200ResponseForPress get200ResponseForPress = new AuthGet200ResponseForPress();
        get200ResponseForPress.get200ResponseForPressEnglish();
    }

    @Description("Проверка страницы партнеры на статус 200 Украинский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageUk() {
        AuthGet200ResponsePartners get200ResponsePartners = new AuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersUkraine();
    }

    @Description("Проверка страницы партнеры на статус 200 Русский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageRu() {
        AuthGet200ResponsePartners get200ResponsePartners = new AuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersRussia();
    }

    @Description("Проверка страницы партнеры на статус 200 Английский язык")
    @Test(timeOut = 20000, retryAnalyzer = Retry.class)
    public void verifyStatus200ForPartnersPageEn() {
        AuthGet200ResponsePartners get200ResponsePartners = new AuthGet200ResponsePartners();
        get200ResponsePartners.get200ResponsePartnersEnglish();
    }

    @Description("Проверяем сворачивание видео при открытии телепрограммы")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyMinimizingThePlayer() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        HomePage homePage = new HomePage();
        AuthTvPage authTvPage = new AuthTvPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
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

    @Description("Проверка всех элементов на странице Партнеры украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_UKRAINE);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_RUSSIA);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице Партнеры английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInPartnersPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPartnersPage allElementsForPartnersPage = new AllElementsForPartnersPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_PARTNERS_PAGE_ENGLISH);
        allElementsForPartnersPage.allElementsForPartnersPage();
    }

    @Description("Проверка всех элементов на странице для прессы украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_UKRAINE);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_RUSSIA);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице для прессы английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInForPressPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForPressPage allElementsForPressPage = new AllElementsForPressPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_FOR_THE_PRESS_PAGE_ENGLISH);
        allElementsForPressPage.allElementsForPressPage();
    }

    @Description("Проверка всех элементов на странице фонд кино украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_UKRAINE);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_RUSSIA);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

    @Description("Проверка всех элементов на странице фонд кино английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInFondKinoPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForFondKinoPage allElementsForFondKinoPage = new AllElementsForFondKinoPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_FOND_KINO_PAGE_ENGLISH);
        allElementsForFondKinoPage.allElementsForCinemaFondPage();
    }

//    @Description("Проверка всех элементов на странице поддержка айти украинский язык")
//    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
//    public void verifyAllElementsInSupportItPageUkraine() {
//        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
//        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();
//
//        ChangeLanguage changeLanguage = new ChangeLanguage();
//        changeLanguage.chooseUk();
//
//        authorizationWithToken.authorizationWithTokenUkraine();
//        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_UKRAINE);
//        allElementsForSupportItPage.allElementsForSupportItPage();
//    }

    @Description("Проверка всех элементов на странице поддержка айти русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_RUSSIA);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице поддержка айти английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInSupportItPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForSupportItPage allElementsForSupportItPage = new AllElementsForSupportItPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_IT_SUPPORT_PAGE_ENGLISH);
        allElementsForSupportItPage.allElementsForSupportItPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_UKRAINE);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_RUSSIA);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице голливуд украинским английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInHollywoodPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHollywoodPage allElementsForHollywoodPage = new AllElementsForHollywoodPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_HOLLYWOOD_PAGE_ENGLISH);
        allElementsForHollywoodPage.allElementsForHollywoodPage();
    }

    @Description("Проверка всех элементов на странице про нас украинский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_UKRAINE);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_RUSSIA);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех элементов на странице про нас английский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsInAboutUsPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForAboutUs allElementsForAboutUs = new AllElementsForAboutUs();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_ABOUT_US_PAGE_ENGLISH);
        allElementsForAboutUs.allElementsForAboutUs();
    }

    @Description("Проверка всех елементов на странице как подключить украинский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageUkraine() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseUk();

        authorizationWithToken.authorizationWithTokenUkraine();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_UKRAINE);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить русский язык")
    @Test(timeOut = 30000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageRussia() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseRu();

        authorizationWithToken.authorizationWithTokenRussia();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_RUSSIA);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

    @Description("Проверка всех елементов на странице как подключить английский язык")
    @Test(timeOut = 25000, retryAnalyzer = Retry.class)
    public void verifyAllElementsForHowConnectPageEnglish() {
        AuthorizationWithToken authorizationWithToken = new AuthorizationWithToken();
        AllElementsForHowConnectPage allElementsForHowConnectPage = new AllElementsForHowConnectPage();

        ChangeLanguage changeLanguage = new ChangeLanguage();
        changeLanguage.chooseEn();

        authorizationWithToken.authorizationWithTokenEnglish();
        DriverProvider.getDriver().get(URL_HOW_TO_CONNECT_PAGE_ENGLISH);
        allElementsForHowConnectPage.allElementsForHowConnectPage();
    }

}


