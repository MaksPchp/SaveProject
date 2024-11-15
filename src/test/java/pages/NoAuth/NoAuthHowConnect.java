package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthHowConnect {
    WebDriver driver;

    // Заголовок текст
    @FindBy(xpath = "//h1[@class='device-title']")
    private WebElement h1Text;
    // Описание заголовка
    @FindBy(xpath = "//div[@class='col-md-6']")
    private WebElement descriptionH1;
    // Смарт телевизоры
    @FindBy(xpath = "//a[@data-bmenu='device_0']")
    private WebElement smartTvDevices;
    // Любой телевизор
    @FindBy(xpath = "//a[@data-bmenu='device_1']")
    private WebElement anyTvDevices;
    // Смартфоны
    @FindBy(xpath = "//a[@data-bmenu='device_2']")
    private WebElement smartphone;
    // Кмпьютер
    @FindBy(xpath = "//a[@data-bmenu='device_3']")
    private WebElement pc;
    // Оплата
    @FindBy(xpath = "//a[@data-bmenu='device_4']")
    private WebElement pay;
    //Другое
    @FindBy(xpath = "//a[@data-bmenu='device_5']")
    private WebElement another;
    // Иконка лджи
    @FindBy(xpath = "//img[@id='dvwebos-3-0']")
    private WebElement lgIcon;
    // Иконка самсунг
    @FindBy(xpath = "//img[@id='dvtizen-4']")
    private WebElement samsungIcon;
    // Иконка андроид тв
    @FindBy(xpath = "//img[@id='dvandroid-tv']")
    private WebElement androidTvIcon;
    // Плеер
    @FindBy(xpath = "//iframe[@class='video-frame-2 lozad']")
    private WebElement player;
    // Инструкция
    @FindBy(xpath = "//div[@class='col-md-5 mb-3 mt-4 mt-md-0 device_text-col toggle-content']")
    private WebElement instruction;


    public NoAuthHowConnect() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getH1Text() {
        return h1Text;
    }

    public WebElement getDescriptionH1() {
        return descriptionH1;
    }

    public WebElement getSmartTvDevices() {
        return smartTvDevices;
    }

    public WebElement getAnyTvDevices() {
        return anyTvDevices;
    }

    public WebElement getSmartphone() {
        return smartphone;
    }

    public WebElement getPc() {
        return pc;
    }

    public WebElement getPay() {
        return pay;
    }

    public WebElement getAnother() {
        return another;
    }

    public WebElement getLgIcon() {
        return lgIcon;
    }

    public WebElement getSamsungIcon() {
        return samsungIcon;
    }

    public WebElement getAndroidTvIcon() {
        return androidTvIcon;
    }

    public WebElement getPlayer() {
        return player;
    }

    public WebElement getInstruction() {
        return instruction;
    }
}
