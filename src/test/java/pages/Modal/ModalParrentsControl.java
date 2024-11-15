package pages.Modal;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalParrentsControl {
    WebDriver driver;
    // При каждом открытии контента
    @FindBy(xpath = "//span[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_REQ1']")
    private WebElement everyTimeYouOpenContentCheckBox;
    // Один раз при запуске программы
    @FindBy(xpath = "//span[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_REQ2']")
    private WebElement dontEveryTimeYouOpenContentCheckBox;
    // Сохранить настройки
    @FindBy(xpath = "//button[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_SETTING']")
    private WebElement saveSettings;
    // Закрыть окно
    @FindBy(xpath = "//div[@id='parentModal']//button[@class='close']")
    private WebElement closeModalWindow;
    // Изменить пароль
    @FindBy(xpath = "//p[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_CHANGE-PASS']")
    private WebElement changePinCode;
    // Поле введите старый пароль
    @FindBy(xpath = "//input[@ng-model='settings.password_current']")
    private WebElement oldPinCode;
    // Поле введите новый пароль
    @FindBy(xpath = "//div[@class='parent__pass']//input[@ng-model='settings.password_new']")
    private WebElement newPinCode;
    // Кнопка подтвердить смену пароля
    @FindBy(xpath = "//button[@translate='LOGIN.CONFIRM_ORDER_TRUE']")
    private WebElement confirmPinCodeChangeButton;
    // Текст пароль изменен
    @FindBy(xpath = "//p[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_CHANGE-DONE']")
    private WebElement passwordChangedText;

    public ModalParrentsControl() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getEveryTimeYouOpenContentCheckBox(){
        return everyTimeYouOpenContentCheckBox;
    }

    public WebElement getDontEveryTimeYouOpenContentCheckBox(){
        return dontEveryTimeYouOpenContentCheckBox;
    }

    public WebElement getSaveSettings(){
        return saveSettings;
    }

    public WebElement getCloseModalWindow(){
        return closeModalWindow;
    }

    public WebElement getChangePinCode(){
        return changePinCode;
    }

    public WebElement getOldPinCode(){
        return oldPinCode;
    }

    public WebElement getNewPinCode(){
        return newPinCode;
    }

    public WebElement getConfirmPinCodeChangeButton(){
        return confirmPinCodeChangeButton;
    }

    public WebElement getPasswordChangedText(){
        return passwordChangedText;
    }
}
