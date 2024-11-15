package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMobile {
    WebDriver driver;

    // Логотип в меню сайта
    @FindBy(xpath = "//div[@class='logo-wrap']")
    private WebElement logoImageInMenu;
    // Кнопка ТВ в меню
    @FindBy(xpath = "//div[@class='bottom-menu-mobile']//a[@data-header-el='1']")
    private WebElement tvButtonInMenu;
    // Кнопка фильмы в меню
    @FindBy(xpath = "//div[@class='bottom-menu-mobile']//a[@data-header-el='2']")
    private WebElement cinemaButtonInMenu;
    // Кнопка сериалы в меню
    @FindBy(xpath = "//div[@class='bottom-menu-mobile']//a[@data-header-el='3']")
    private WebElement seriesButtonInMenu;
    // Кнопка мутлфильмы в меню
    @FindBy(xpath = "//div[@class='bottom-menu-mobile']//a[@data-header-el='4']")
    private WebElement multfilmeButtonInMenu;
    // Кнопка тв-приставка в меню
    @FindBy(xpath = "//a[@data-header-el='23']")
    private WebElement tvPristavkaButtonInMenu;
    // Кнопка новости в меню
    @FindBy(xpath = "//a[@data-header-el='26']")
    private  WebElement newsButtonInMenu;
    // Кнопка Как подключить в меню
    @FindBy(xpath = "//a[@data-header-el='24']")
    private WebElement howToConnectInTheMenu;
    // Кнопка Тарифы в меню
    @FindBy(xpath = "//a[@data-header-el='25']")
    private WebElement tariffsButtonInTheMenu;
    // Кнопка Промокод в меню
    @FindBy(xpath = "//a[@data-header-el='27']")
    private WebElement promoCodeButtonInTheMenu;
    // Кнопка Олпата в меню
    @FindBy(xpath = "//a[@data-header-el='28']")
    private WebElement payButtonInTheMenu;
    // Кнопка Про нас в меню
    @FindBy(xpath = "//a[@data-header-el='29']")
    private WebElement aboutUsButtonInTheMenu;
    // Кнопка Голливуд украинским
    @FindBy(xpath = "//a[@data-header-el='30']")
    private WebElement hollywoodButtonInTheMenu;
    // Кнопка Поддержка Айти в меню
    @FindBy(xpath = "//a[@data-header-el='31']")
    private WebElement itSupportButtonInTheMenu;
    // Кнопка Битва блогеров в меню
    @FindBy(xpath = "//a[@data-header-el='32']")
    private WebElement battleOfBloggersButtonInTheMenu;
    // Кнопка Фонд кино в меню
    @FindBy(xpath = "//a[@data-header-el='33']")
    private WebElement fondKinoButtonInTheMenu;
    // Кнопка Для прессы в меню
    @FindBy(xpath = "//a[@data-header-el='34']")
    private WebElement forThePressButtonUnTheMenu;
    // Кнопка Партнеры в меню
    @FindBy(xpath = "//a[@data-header-el='35']")
    private WebElement partnersButtonInTheMenu;
    // Бурег меню в шапке
    @FindBy(xpath = "//div[@data-header-el='39']")
    private WebElement burgerMenuButton;
    // Кнопка попробовать бесплатно в меню
    @FindBy(xpath = "//a[@class='button_free_header cabinet_login']")
    private WebElement tryToFreeButton;
    // Кнопка смены языка
    @FindBy(xpath = "//div[@data-header-el='36']")
    private WebElement changeLanguageButton;
    // Кнопка войти в меню
    @FindBy(xpath = "//a[@data-header-el='19']")
    private WebElement loginButtonOnTheMenu;
    // Кнопка поиска
    @FindBy(xpath = "//div[@class='search_v2 d-flex align-items-center justify-content-center sv2']")
    private WebElement searchButtonInTheMenu;
    // Поле ввода поиска в шапке
    @FindBy(xpath = "//input[@class='search-input-block col-md-10']")
    private WebElement searchInputFieldInHeader;
    // Кнопка подключить на баннере
    @FindBy(xpath = "//a[@class='m2__btn-7 button_free_index']")
    private WebElement connectToTheOneMinutesButtonOnBanner;
    // Кнопка выиграть авто
    @FindBy(xpath = "//a[@data-header-el='22']")
    private WebElement autoPromoButton;
    // Кнопка логотипа на баннере
    @FindBy(xpath = "//img[@class='m2__logo img_wauto_hauto']")
    private WebElement logoImageButtonInBanner;
    // Картинка телевизора на главной странице
    @FindBy(xpath = "//div[@class='m2__what-img']//img[@class='lozad img_wauto_hauto']")
    private WebElement tvImageInHomePage;
    // Вторая картинка телевизора на главной
    @FindBy(xpath = "//div[@class='m2__what-football']//img[@class='img_wauto_hauto lozad']")
    private WebElement twoTvImageInHomePage;
    // Кнопка Детальней на баннере с машиной на главной
    @FindBy(xpath = "//a[@class='promo_auto-btn']")
    private WebElement moreButtonInAutoBannerInHomePage;
    // Тариф M на главной
    @FindBy(xpath = "//span[@class='m2__connect-try index_free_button_two']")
    private WebElement tariffMInHomePage;
    // Тариф Л на главной
    @FindBy(xpath = "//a[@data-id='2007']")
    private WebElement tariffLInHomePage;
    // Кнопка переключения на светлую тему
    @FindBy(xpath = "//a[@data-header-el='20']")
    private WebElement changeWhiteSkinsButton;


    public HomePageMobile() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getLogoImageInMenu(){
        return logoImageInMenu;
    }

    public WebElement getTvButtonInMenu(){
        return tvButtonInMenu;
    }

    public WebElement getCinemaButtonInMenu(){
        return cinemaButtonInMenu;
    }

    public WebElement getSeriesButtonInMenu(){
        return seriesButtonInMenu;
    }

    public WebElement getMultfilmeButtonInMenu(){
        return multfilmeButtonInMenu;
    }

    public WebElement getTvPristavkaButtonInMenuInMenu(){
        return tvPristavkaButtonInMenu;
    }

    public WebElement getNewsButtonInMenu(){
        return newsButtonInMenu;
    }

    public WebElement getBurgerMenuButton(){
        return burgerMenuButton;
    }

    public WebElement getTryToFreeButton(){
        return tryToFreeButton;
    }

    public WebElement getChangeLanguageButton(){
        return changeLanguageButton;
    }

    public WebElement getLoginButtonOnTheMenu(){
        return loginButtonOnTheMenu;
    }

    public WebElement getHowToConnectInTheMenu(){
        return howToConnectInTheMenu;
    }

    public WebElement getTariffsButtonInTheMenu(){
        return tariffsButtonInTheMenu;
    }

    public WebElement getPromoCodeButtonInTheMenu(){
        return promoCodeButtonInTheMenu;
    }

    public WebElement getPayButtonInTheMenu(){
        return payButtonInTheMenu;
    }

    public WebElement getAboutUsButtonInTheMenu(){
        return aboutUsButtonInTheMenu;
    }

    public WebElement getHollywoodButtonInTheMenu(){
        return hollywoodButtonInTheMenu;
    }

    public WebElement getItSupportButtonInTheMenu(){
        return itSupportButtonInTheMenu;
    }

    public WebElement getBattleOfBloggersButtonInTheMenu(){
        return battleOfBloggersButtonInTheMenu;
    }

    public WebElement getFondKinoButtonInTheMenu(){
        return fondKinoButtonInTheMenu;
    }

    public WebElement getForThePressButtonUnTheMenu(){
        return forThePressButtonUnTheMenu;
    }

    public WebElement getPartnersButtonInTheMenu(){
        return partnersButtonInTheMenu;
    }

    public WebElement getSearchButtonInTheMenu(){
        return searchButtonInTheMenu;
    }

    public WebElement getSearchInputFieldInHeader(){
        return searchInputFieldInHeader;
    }

    public WebElement getConnectToTheOneMinutesButtonOnBanner(){
        return connectToTheOneMinutesButtonOnBanner;
    }

    public WebElement getAutoPromoButton(){
        return autoPromoButton;
    }

    public WebElement getLogoImageButtonInBanner(){
        return logoImageButtonInBanner;
    }

    public WebElement getTvImageInHomePage(){
        return tvImageInHomePage;
    }

    public WebElement getTwoTvImageInHomePage(){
        return twoTvImageInHomePage;
    }

    public WebElement getMoreButtonInAutoBannerInHomePage(){
        return moreButtonInAutoBannerInHomePage;
    }

    public WebElement getTariffMInHomePage(){
        return tariffMInHomePage;
    }

    public WebElement getTariffLInHomePage(){
        return tariffLInHomePage;
    }

    public WebElement getChangeWhiteSkinsButton(){
        return changeWhiteSkinsButton;
    }
}
