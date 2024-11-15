package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class HomePage {
    WebDriver driver;

    // Логотип в меню сайта
    @FindBy(xpath = "//div[@data-header-el='0']")
    private WebElement logoImageInMenu;
    // Кнопка ТВ в меню
    @FindBy(xpath = "//a[@data-header-el='1']")
    private WebElement tvButtonInMenu;
    // Кнопка фильмы в меню
    @FindBy(xpath = "//a[@data-header-el='2']")
    private WebElement cinemaButtonInMenu;
    // Кнопка сериалы в меню
    @FindBy(xpath = "//a[@data-header-el='3']")
    private WebElement seriesButtonInMenu;
    // Кнопка мутлфильмы в меню
    @FindBy(xpath = "//a[@data-header-el='4']")
    private WebElement multfilmeButtonInMenu;
    // Кнопка новости в меню
    @FindBy(xpath = "//a[@data-header-el='6']")
    private  WebElement newsButtonInMenu;
    // Кнопка Как подключить в меню
    @FindBy(xpath = "//a[@data-header-el='7']")
    private WebElement howToConnectInTheMenu;
    // Кнопка Тарифы в меню
    @FindBy(xpath = "//a[@data-header-el='8']")
    private WebElement tariffsButtonInTheMenu;
    // Кнопка Промокод в меню
    @FindBy(xpath = "//a[@data-header-el='9']")
    private WebElement promoCodeButtonInTheMenu;
    // Кнопка Олпата в меню
    @FindBy(xpath = "//a[@data-header-el='10']")
    private WebElement payButtonInTheMenu;
    // Кнопка Про нас в меню
    @FindBy(xpath = "//a[@data-header-el='11']")
    private WebElement aboutUsButtonInTheMenu;
    // Кнопка Голливуд украинским
    @FindBy(xpath = "//a[@data-header-el='12']")
    private WebElement hollywoodButtonInTheMenu;
    // Кнопка Поддержка Айти в меню
    @FindBy(xpath = "//a[@data-header-el='13']")
    private WebElement itSupportButtonInTheMenu;
    // Кнопка Битва блогеров в меню
    @FindBy(xpath = "//a[@data-header-el='14']")
    private WebElement battleOfBloggersButtonInTheMenu;
    // Кнопка Фонд кино в меню
    @FindBy(xpath = "//a[@data-header-el='15']")
    private WebElement fondKinoButtonInTheMenu;
    // Кнопка Для прессы в меню
    @FindBy(xpath = "//a[@data-header-el='16']")
    private WebElement forThePressButtonUnTheMenu;
    // Кнопка Партнеры в меню
    @FindBy(xpath = "//a[@data-header-el='17']")
    private WebElement partnersButtonInTheMenu;
    // Бурег меню в шапке
    @FindBy(xpath = "//div[@class='burger-menu']")
    private WebElement burgerMenuButton;
    // Кнопка попробовать бесплатно в меню
    @FindBy(xpath = "//div[@class='tabs-btn ']")
    private WebElement tryToFreeButton;
    // Кнопка смены языка
    @FindBy(xpath = "//div[@class='toggleLang ml-out o-hover']")
    private WebElement changeLanguageButton;
    // Кнопка войти в меню
    @FindBy(xpath = "//a[@data-header-el='40']")
    private WebElement loginButtonOnTheMenu;
    // Активная кнопка вверх
    @FindBy(xpath = "//div[@style='display: block;']")
    private WebElement activeToTopButton;
    // Текст стань абонентом и получи приставку
    @FindBy(xpath = "//div[@class='m2__inext_text']")
    private WebElement textGetFreeTv;
    // Кнопка поиска
    @FindBy(xpath = "//div[@class='search_v2 d-flex align-items-center justify-content-center sv2']")
    private WebElement searchButtonInTheMenu;
    // Поле ввода поиска в шапке
    @FindBy(xpath = "//input[@class='search-input-block col-md-10']")
    private WebElement searchInputFieldInHeader;
    // Кнопка подключить на баннере
    @FindBy(xpath = "//a[@class='m2__btn-7 button_free_index']")
    private WebElement connectToTheOneMinutesButtonOnBanner;
    // Кнопка переключения на светлую тему
    @FindBy(xpath = "//div[@class='theme black-skins']")
    private WebElement changeWhiteSkinsButton;
    // Кнопка Подключить бесплатно в шапке
    @FindBy(xpath = "//a[@class='all-f-btn tabs-button try-free-btn_new-header']")
    private WebElement connectFreeButtonInHeader;
    // Кнопка логотипа на баннере
    @FindBy(xpath = "//img[@class='m2__logo img_wauto_hauto']")
    private WebElement logoImageButtonInBanner;
    // Картинка телевизора на главной странице
    @FindBy(xpath = "//div[@class='m2__what-img']")
    private WebElement tvImageInHomePage;
    // Вторая картинка телевизора на главной
    @FindBy(xpath = "//div[@class='m2__what-football']//img[@class='img_wauto_hauto lozad']")
    private WebElement twoTvImageInHomePage;
    // Кнопка Детальней на баннере с машиной на главной
    @FindBy(xpath = "//a[@class='promo_auto-btn']")
    private WebElement moreButtonInAutoBannerInHomePage;
    // Тариф S на главной
    @FindBy(xpath = "//a[@id='2063']")
    private WebElement tariffSInHomePage;
    // Тариф M на главной
    @FindBy(xpath = "//span[@class='m2__connect-try index_free_button_two']")
    private WebElement tariffMInHomePage;
    // Тариф Л на главной
    @FindBy(xpath = "//a[@data-id='2007']")
    private WebElement tariffLInHomePage;
    // Украинский язык в хедере
    @FindBy(xpath = "//a[@data-header-el='38_uk']")
    private WebElement languageUa;
    // Английский язык в хедере
    @FindBy(xpath = "//a[@data-header-el='38_en']")
    private WebElement languageEn;
    // Русский язык в хедере
    @FindBy(xpath = "//a[@data-header-el='38_ru']")
    private WebElement languageRu;

    public HomePage() {
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

    public WebElement getActiveToTopButton(){
        return activeToTopButton;
    }

    public WebElement getTextGetFreeTv(){
        return textGetFreeTv;
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

    public WebElement getChangeWhiteSkinsButton(){
        return changeWhiteSkinsButton;
    }

    public WebElement getConnectFreeButtonInHeader(){
        return connectFreeButtonInHeader;
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

    public WebElement getTariffSInHomePage(){
        return tariffSInHomePage;
    }

    public WebElement getTariffMInHomePage(){
        return tariffMInHomePage;
    }

    public WebElement getTariffLInHomePage(){
        return tariffLInHomePage;
    }

    public WebElement getLanguageUa(){
        return languageUa;
    }

    public WebElement getLanguageEn(){
        return languageEn;
    }

    public WebElement getLanguageRu(){
        return languageRu;
    }

}
