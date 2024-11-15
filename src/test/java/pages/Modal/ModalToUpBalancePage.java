package pages.Modal;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalToUpBalancePage {
    WebDriver driver;

    // текст пополнение счета
    @FindBy(xpath = "//h1[@translate='PLATON.TITLE']")
    private WebElement toUpBalanceText;
    // поле сумма
    @FindBy(xpath = "//input[@ng-model='sumpay']")
    private WebElement sumInput;
    // Текст минимальная сумма
    @FindBy(xpath = "//p[@translate='PLATON.ERR_MIN_SUM_PAY']")
    private WebElement textMinSum;
    // Кнопка пополнить не активна
    @FindBy(xpath = "//form[@id='userpay']//button[@disabled]")
    private WebElement noActiveButton;
    // Кнопка закрыть
    @FindBy(xpath = "//span[@class='close-modal']")
    private WebElement closeButton;
    // Активная кнопка пополнить
    @FindBy(xpath = "//button[@translate='PLATON.STEP_BUTTON']")
    private WebElement activeButton;
    // Ошибка при вводе 0 текст на украинский
    @FindBy(xpath = "//*[text()='Мінімальна сума поповнення 1 грн']")
    private WebElement errorNullSumTextUkraine;
    // Ошибка при вводе 0 текст на русском
    @FindBy(xpath = "//*[text()='Минимальная сумма пополнения 1 грн']")
    private WebElement errorNullSumTextRussia;
    // Ошибка при вводе 0 текст на английский
    @FindBy(xpath = "//*[text()='The minimum amount of replenishment is 1 UAH']")
    private WebElement errorNullSumTextEnglish;
    // Кнопка добавить карту
    @FindBy(xpath = "//li[@class='prem-player__block__1 credit_new d-block']")
    private WebElement addCartButton;


    public ModalToUpBalancePage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getToUpBalanceText(){
        return toUpBalanceText;
    }

    public WebElement getSumInput(){
        return sumInput;
    }

    public WebElement getTextMinSum(){
        return textMinSum;
    }

    public WebElement getNoActiveButton(){
        return noActiveButton;
    }

    public WebElement getCloseButton(){
        return closeButton;
    }

    public WebElement getActiveButton(){
        return activeButton;
    }

    public WebElement getErrorNullSumTextUkraine(){
        return errorNullSumTextUkraine;
    }

    public WebElement getErrorNullSumTextRussia(){
        return errorNullSumTextRussia;
    }

    public WebElement getErrorNullSumTextEnglish(){
        return errorNullSumTextEnglish;
    }

    public WebElement getAddCartButton(){
        return addCartButton;
    }

}
