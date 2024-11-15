package pages.Modal;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalAutorizationPage {
    WebDriver driver;

    // Кнопка крестик (закрыть)
    @FindBy(xpath = "//div[@class='step-1-modal-gift']//button[@class='l__close']")
    private WebElement closeButton;
    // Логотип
    @FindBy(xpath = "//div[@class='l__logo']")
    private WebElement logo;
    // Текст подключись или войди
    @FindBy(xpath = "//h4[@translate='MULTILOGIN.LOGIN']")
    private WebElement textLoginOrGerestration;
    // Текст  дней бесплатно
    @FindBy(xpath = "//h4[@translate='LOGIN.7_DAYS_FREE']")
    private WebElement orContiniuneAnother;
    // Кнопка гугл
    @FindBy(xpath = "//span[@translate='V2.LOGIN.GOOGLE_ENTER']")
    private WebElement googleButton;
    // Кнопка фейсбук
    @FindBy(xpath = "//span[@translate='V2.LOGIN.FACEBOOK_ENTER']")
    private WebElement facebookButton;
    // Кнопка эпл
    @FindBy(xpath = "//div[@o-auth-apple]")
    private WebElement appleButton;
    // Поле ввода номера телефона
    @FindBy(xpath = "//input[@id='loginInput']")
    private WebElement fieldForEnteringAPhoneNumber;
    // Кнопка получить смс
    @FindBy(xpath = "//button[@translate='MULTILOGIN.GET_SMS']")
    private WebElement getSmsButton;
    // Кнопка войти по номеру телефона
    @FindBy(xpath = "//p[@translate='V2.LOGIN.MULTI_BY_PHONE']")
    private WebElement toNumberTelephoneButton;


    //// Второе окно

    // Поле для ввода смс кода
    @FindBy(xpath = "//input[@id='inputSMS']")
    private WebElement filedForEnteringSmsCode;
    // Кнопка крестик (закрыть)
    @FindBy(xpath = "//div[@class='modal-content modal-content__sms']//button[@class='l__close']")
    private WebElement closeButtonTwo;
    // Текст смс отправлено на номер
    @FindBy(xpath = "//span[@translate='MULTILOGIN.FROM_PHONE']")
    private WebElement textSmsSentToNumberTwo;
    // Кнопка войти
    @FindBy(xpath = "//button[@translate='LOGIN.LOGIN']")
    private WebElement comeButtonTwo;
    // Кнопка изменить номер телефона
    @FindBy(xpath = "//button[@translate='V2.LOGIN.CHANGE_NUMBER_PHONE']")
    private WebElement changeTelephoneNumberButton;
    // Кнопка отправить смс повторно
    @FindBy(xpath = "//button[@translate='MULTILOGIN.RESEND']")
    private WebElement sendSmsAgainButtonTwo;
    // Не верный код
    @FindBy(xpath = "//form[@name='activeauth']//div[@class='l__error-phone']//span[@class='ng-binding']")
    private WebElement noValidCode;
    // Таймер повторной отправки смс
    @FindBy(xpath = "//div[@class='l__login__timer']")
    private WebElement timerReturnSendSmsCode;

    public ModalAutorizationPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getCloseButton(){
        return closeButton;
    }

    public WebElement getLogo(){
        return logo;
    }

    public WebElement getTextLoginOrGerestration(){
        return textLoginOrGerestration;
    }

    public WebElement getOrContiniuneAnother(){
        return orContiniuneAnother;
    }

    public WebElement getGoogleButton(){
        return googleButton;
    }

    public WebElement getFacebookButton(){
        return facebookButton;
    }

    public WebElement getAppleButton(){
        return appleButton;
    }

    public WebElement getFieldForEnteringAPhoneNumber(){
        return fieldForEnteringAPhoneNumber;
    }

    public WebElement getGetSmsButton(){
        return getSmsButton;
    }

    public WebElement getFiledForEnteringSmsCode(){
        return filedForEnteringSmsCode;
    }

    public WebElement getCloseButtonTwo(){
        return closeButtonTwo;
    }
    public WebElement getTextSmsSentToNumberTwo(){
        return textSmsSentToNumberTwo;
    }

    public WebElement getComeButtonTwo(){
        return comeButtonTwo;
    }

    public WebElement getChangeTelephoneNumberButton(){
        return changeTelephoneNumberButton;
    }

    public WebElement getSendSmsAgainButtonTwo(){
        return sendSmsAgainButtonTwo;
    }

    public WebElement getNoValidCode(){
        return noValidCode;
    }

    public WebElement getTimerReturnSendSmsCode(){
        return timerReturnSendSmsCode;
    }

    public WebElement getToNumberTelephoneButton(){
        return toNumberTelephoneButton;
    }
}
