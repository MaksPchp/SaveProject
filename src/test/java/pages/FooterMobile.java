package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterMobile {
    WebDriver driver;

    // Кнопка фейсбук
    @FindBy(xpath = "//a[@data-footer-el='37']")
    private WebElement facebookButton;
    // Кнопка инстаграм
    @FindBy(xpath = "//a[@data-footer-el='36']")
    private WebElement instagramButton;
    // Кнопка телеграмм
    @FindBy(xpath = "//a[@data-footer-el='40']")
    private WebElement telegramButton;
    // Кнопка ютуб
    @FindBy(xpath = "//a[@data-footer-el='38']")
    private WebElement youtubeButton;
    // Кнопка пинтерест
    @FindBy(xpath = "//a[@data-footer-el='39']")
    private WebElement pinterestButton;
    // Кнопка подключения через гугл плей
    @FindBy(xpath = "//a[@data-footer-el='31']")
    private WebElement googlePlayConnectButton;
    // Кнопка подключения через апп стор
    @FindBy(xpath = "//a[@data-footer-el='32']")
    private WebElement appStoreConnectButton;
    // Кнопка подключения через смарт тв
    @FindBy(xpath = "//a[@data-footer-el='33']")
    private WebElement smartTvConnectButton;
    // Кнопка подключения апп галери
    @FindBy(xpath = "//a[@data-footer-el='34']")
    private WebElement appGalleryConnectButton;
    // Картинка в футере
    @FindBy(xpath = "//img[@class='axlogo_black img_wauto_hauto']")
    private WebElement imageFromFooter;
    // Текст наши приложения
    @FindBy(xpath = "//p[@data-footer-el='26']")
    private WebElement textOurApps;
    // Текст меню
    @FindBy(xpath = "//p[@data-footer-el='41']")
    private WebElement textMenu;
    // Кнопка главная
    @FindBy(xpath = "//a[@data-footer-el='1']")
    private WebElement mainButton;
    // Кнопка Тв
    @FindBy(xpath = "//a[@data-footer-el='2']")
    private WebElement tvButton;
    // Кнопка фильмы
    @FindBy(xpath = "//a[@data-footer-el='3']")
    private WebElement movieButton;
    // Кнопка мультфильмы
    @FindBy(xpath = "//a[@data-footer-el='4']")
    private WebElement cartoonsButton;
    // Кнопка сериалы
    @FindBy(xpath = "//a[@data-footer-el='5']")
    private WebElement seriesButton;
    // Кнопка тарифы
    @FindBy(xpath = "//a[@data-footer-el='6']")
    private WebElement tariffsButton;
    // Текст мы в соц. сетях
    @FindBy(xpath = "//p[@data-footer-el='35']")
    private WebElement textWeInSocial;
    // Текст про компанию
    @FindBy(xpath = "//p[@data-footer-el='42']")
    private WebElement textAboutCompany;
    // телефон 2121
    @FindBy(xpath = "//a[@href='tel:2121']")
    private WebElement phone2121;
    // Телефон водафон
    @FindBy(xpath = "//a[@href='tel:+380506478888']")
    private WebElement phoneVodafone;
    // Телефон Лайф
    @FindBy(xpath = "//a[@href='tel:+380736478888']")
    private WebElement phoneLife;
    // Телефон киевстар
    @FindBy(xpath = "//a[@href='tel:+380686478888']")
    private WebElement phoneKyivstar;
    // Почта инфо свит тв
    @FindBy(xpath = "//a[@href='mailto:info@sweet.tv']")
    private WebElement mailInfo;
    // Почта копирайт
    @FindBy(xpath = "//a[@href='mailto:sweet.tv-copyright@axghouse.com']")
    private WebElement mailCopyright;
    // Текст адреса
    @FindBy(xpath = "//p[@data-footer-el='45']")
    private WebElement textAddresses;
    // Адресс
    @FindBy(xpath = "//span[@class='footer-address_text']")
    private WebElement addresses;
    // Текст маил
    @FindBy(xpath = "//p[@data-footer-el='44']")
    private WebElement textMail;
    // текст контент защищен
    @FindBy(xpath = "//p[@class='mb-2']")
    private WebElement textContentSecurity;
    // Кнопка контакты
    @FindBy(xpath = "//a[@data-footer-el='7']")
    private WebElement contactsButton;
    // Кнопка договор
    @FindBy(xpath = "//a[@data-footer-el='8']")
    private WebElement dogovorButton;
    // Кнопка новости
    @FindBy(xpath = "//a[@data-footer-el='9']")
    private WebElement newsButton;
    // Кнопка политика
    @FindBy(xpath = "//a[@data-footer-el='10']")
    private WebElement privacy;
    // Кнопка карта сайта
    @FindBy(xpath = "//a[@data-footer-el='11']")
    private WebElement mapButton;
    // Кнопка о нас
    @FindBy(xpath = "//a[@data-footer-el='12']")
    private WebElement aboutUsButton;
    // Кнопка голливуд на украинском
    @FindBy(xpath = "//a[@data-footer-el='13']")
    private WebElement hollywoodButton;
    // Кнопка поддержка айти
    @FindBy(xpath = "//a[@data-footer-el='14']")
    private WebElement itSupportButton;
    // Кнопка блогері
    @FindBy(xpath = "//a[@data-footer-el='15']")
    private WebElement bloggersButton;
    // Кнопка фонд кино
    @FindBy(xpath = "//a[@data-footer-el='16']")
    private WebElement fondKinoButton;
    // Кнопка для прессы
    @FindBy(xpath = "//a[@data-footer-el='17']")
    private WebElement forPressButton;
    // Кнопка партнеры
    @FindBy(xpath = "//a[@data-footer-el='18']")
    private WebElement partnersButton;
    // Текст бесплатно
    @FindBy(xpath = "//p[@data-footer-el='19']")
    private WebElement freeText;
    // Текст водафон
    @FindBy(xpath = "//p[@data-footer-el='20']")
    private WebElement vodafoneText;
    // Текст лайф
    @FindBy(xpath = "//p[@data-footer-el='21']")
    private WebElement lifeText;
    // Текст киевстар
    @FindBy(xpath = "//p[@data-footer-el='22']")
    private WebElement kyivstarText;
    // Текст по вопросам авторских прав
    @FindBy(xpath = "//p[@data-footer-el='25']")
    private WebElement privatePoliticText;


    public FooterMobile() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getFacebookButton(){
        return facebookButton;
    }

    public WebElement getTelegramButton(){
        return telegramButton;
    }

    public WebElement getInstagramButton(){
        return instagramButton;
    }

    public WebElement getGooglePlayConnectButton(){
        return googlePlayConnectButton;
    }

    public WebElement getAppStoreConnectButton(){
        return appStoreConnectButton;
    }

    public WebElement getSmartTvConnectButton(){
        return smartTvConnectButton;
    }

    public WebElement getAppGalleryConnectButton(){
        return appGalleryConnectButton;
    }

    public WebElement getImageFromFooter(){
        return imageFromFooter;
    }

    public WebElement getYoutubeButton(){
        return youtubeButton;
    }

    public WebElement getPinterestButton(){
        return pinterestButton;
    }

    public WebElement getTextOurApps(){
        return textOurApps;
    }

    public WebElement getTextMenu(){
        return textMenu;
    }

    public WebElement getMainButton(){
        return mainButton;
    }

    public WebElement getTvButton(){
        return tvButton;
    }

    public WebElement getMovieButton(){
        return movieButton;
    }

    public WebElement getCartoonsButton(){
        return cartoonsButton;
    }

    public WebElement getSeriesButton(){
        return seriesButton;
    }

    public WebElement getTariffsButton(){
        return tariffsButton;
    }

    public WebElement getTextWeInSocial(){
        return textWeInSocial;
    }

    public WebElement getTextAboutCompany(){
        return textAboutCompany;
    }

    public WebElement getPhone2121(){
        return  phone2121;
    }

    public WebElement getPhoneVodafone(){
        return phoneVodafone;
    }

    public WebElement getPhoneLife(){
        return phoneLife;
    }

    public WebElement getPhoneKyivstar(){
        return phoneKyivstar;
    }

    public WebElement getMailInfo(){
        return mailInfo;
    }

    public WebElement getMailCopyright(){
        return mailCopyright;
    }

    public WebElement getTextAddresses(){
        return textAddresses;
    }

    public WebElement getAddresses(){
        return addresses;
    }

    public WebElement getTextMail(){
        return textMail;
    }

    public WebElement getTextContentSecurity(){
        return textContentSecurity;
    }

    public WebElement getContactsButton(){
        return contactsButton;
    }

    public WebElement getDogovorButton(){
        return dogovorButton;
    }

    public WebElement getNewsButton(){
        return newsButton;
    }

    public WebElement getPrivacy(){
        return privacy;
    }

    public WebElement getMapButton(){
        return mapButton;
    }

    public WebElement getAboutUsButton(){
        return aboutUsButton;
    }

    public WebElement getHollywoodButton(){
        return hollywoodButton;
    }

    public WebElement getItSupportButton(){
        return itSupportButton;
    }

    public WebElement getBloggersButton(){
        return bloggersButton;
    }

    public WebElement getFondKinoButton(){
        return fondKinoButton;
    }

    public WebElement getForPressButton(){
        return forPressButton;
    }

    public WebElement getPartnersButton(){
        return partnersButton;
    }

    public WebElement getFreeText(){
        return freeText;
    }

    public WebElement getVodafoneText(){
        return vodafoneText;
    }

    public WebElement getLifeText(){
        return lifeText;
    }

    public WebElement getKyivstarText(){
        return kyivstarText;
    }

    public WebElement getPrivatePoliticText(){
        return privatePoliticText;
    }


}

