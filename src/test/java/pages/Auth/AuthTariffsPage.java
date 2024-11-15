package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthTariffsPage {
    WebDriver driver;

    // Текст ваш тарифный план
    @FindBy(xpath = "//h2[@translate='V2.TARIFFS.TARIFF-YOUR']")
    private WebElement yourTariffPlanText;
    // Блок информации о текущем тарифе
    @FindBy(xpath = "//div[@class='selected-tariff__about d-flex align-items-start']")
    private WebElement myTariffBlock;
    // Текст наши тарифные планы
    @FindBy(xpath = "//h2[@translate='V2.TARIFFS.TARIFF-OUR-PLANS']")
    private WebElement ourTariffPlansText;
    // Картинка 1
    @FindBy(xpath = "//img[@src='https://sweet-tv-static.sweet.tv/web/img/site/tariffs/advertis.png']")
    private WebElement image1;
    // Картинка 2
    @FindBy(xpath = "//img[@src='https://sweet-tv-static.sweet.tv/web/img/site/tariffs/camera.png']")
    private WebElement image2;
    // Картинка 3
    @FindBy(xpath = "//img[@src='https://sweet-tv-static.sweet.tv/web/img/site/tariffs/tv.png']")
    private WebElement image3;
    // Картинка 4
    @FindBy(xpath = "//img[@src='https://sweet-tv-static.sweet.tv/web/img/site/tariffs/record.png']")
    private WebElement image4;
    // Тест Реклами у фільмах немає і не буде
    @FindBy(xpath = "//h6[@translate='V2.TARIFFS.NOT-ADVERTISEMENT']")
    private WebElement advertisementsForFilmsAreNotText;
    // Текст Доступно на смартфоні, Smart TV і ПК
    @FindBy(xpath = "//h6[@translate='V2.TARIFFS.ACCESS-DEVICE']")
    private WebElement availableOnSmartphonesText;
    // Текст до 5 устройств
    @FindBy(xpath = "//p[@translate='V2.TARIFFS.ACCESS-DEVICE_2']")
    private WebElement upto5DevicesText;
    // Текст большой каталог фильмов
    @FindBy(xpath = "//h6[@translate='V2.TARIFFS.CATALOG-FILMS']")
    private WebElement largeCatalogFfFilmstext;
    // Текст в качестве фулл и 4к
    @FindBy(xpath = "//p[@translate='V2.TARIFFS.CATALOG-FILMS_2']")
    private WebElement fullAnd4KText;
    // Текст возможность просмотра тв в записи
    @FindBy(xpath = "//h6[@translate='V2.TARIFFS.RECORDING_TEXT']")
    private WebElement tvInRecordText;
    // текст контент сохраняется в записи
    @FindBy(xpath = "//p[@translate='V2.TARIFFS.RECORDING_TEXT_2']")
    private WebElement contentSaveInRecordText;
    // Текст Способ оплаты
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.WAYS_PAYMENT']")
    private WebElement paymentMethodText;
    // Блок иконо платежных сетей
    @FindBy(xpath = "//div[@class='payment__wrapper d-flex']")
    private WebElement paySystemBlock;
    // Текст частые вопросы
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.TITLE-QUESTIONS']")
    private WebElement faqText;
    // текст преимущество подписки
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_ONE']")
    private WebElement subscriptionAdvantageText;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_ONE']")
    private WebElement subscriptionAdvantageTextPlus;
    // Текст как подключить
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_TWO']")
    private WebElement howToConnectText;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_TWO']")
    private WebElement howToConnectTextPlus;
    // Текст продолжение тарифа
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_THREE']")
    private WebElement continuationOfTheTarifftext;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_THREE']")
    private WebElement continuationOfTheTarifftextPlus;
    // Текст тестовый период
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_FOUR']")
    private WebElement testPeriodText;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_FOUR']")
    private WebElement testPeriodTextPlus;
    // Управление прямым эфиром текст
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_FIVE']")
    private WebElement liveText;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_FIVE']")
    private WebElement liveTextPlus;
    // Текст 5 устройств
    @FindBy(xpath = "//h4[@translate='V2.TARIFFS.QUESTIONS_SIX']")
    private WebElement fiveDevicesText;
    // Вложеный текст
    @FindBy(xpath = "//div[@translate='V2.TARIFFS.ANSWER_SIX']")
    private WebElement fiveDevicesTextPlus;



    public AuthTariffsPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getYourTariffPlanText(){
        return yourTariffPlanText;
    }

    public WebElement getMyTariffBlock(){
        return myTariffBlock;
    }

    public WebElement getOurTariffPlansText(){
        return ourTariffPlansText;
    }

    public WebElement getImage1(){
        return image1;
    }

    public WebElement getImage2(){
        return image2;
    }

    public WebElement getImage3(){
        return image3;
    }

    public WebElement getImage4(){
        return image4;
    }

    public WebElement getAdvertisementsForFilmsAreNotText(){
        return advertisementsForFilmsAreNotText;
    }

    public WebElement getAvailableOnSmartphonesText(){
        return availableOnSmartphonesText;
    }

    public WebElement getUpto5DevicesText(){
        return upto5DevicesText;
    }

    public WebElement getLargeCatalogFfFilmstext(){
        return largeCatalogFfFilmstext;
    }

    public WebElement getFullAnd4KText(){
        return fullAnd4KText;
    }

    public WebElement getTvInRecordText(){
        return tvInRecordText;
    }

    public WebElement getContentSaveInRecordText(){
        return contentSaveInRecordText;
    }

    public WebElement getPaymentMethodText(){
        return paymentMethodText;
    }

    public WebElement getPaySystemBlock(){
        return paySystemBlock;
    }

    public WebElement getFaqText(){
        return faqText;
    }

    public WebElement getSubscriptionAdvantageText(){
        return subscriptionAdvantageText;
    }

    public WebElement getSubscriptionAdvantageTextPlus(){
        return subscriptionAdvantageTextPlus;
    }

    public WebElement getHowToConnectText(){
        return howToConnectText;
    }

    public WebElement getHowToConnectTextPlus(){
        return howToConnectTextPlus;
    }

    public WebElement getContinuationOfTheTarifftext(){
        return continuationOfTheTarifftext;
    }

    public WebElement getContinuationOfTheTarifftextPlus(){
        return continuationOfTheTarifftextPlus;
    }

    public WebElement getTestPeriodText(){
        return testPeriodText;
    }

    public WebElement getTestPeriodTextPlus(){
        return testPeriodTextPlus;
    }

    public WebElement getLiveText(){
        return liveText;
    }

    public WebElement getLiveTextPlus(){
        return liveTextPlus;
    }

    public WebElement getFiveDevicesText(){
        return fiveDevicesText;
    }

    public WebElement getFiveDevicesTextPlus(){
        return fiveDevicesTextPlus;
    }


}
