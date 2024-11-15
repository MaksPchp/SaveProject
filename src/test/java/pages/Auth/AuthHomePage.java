package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthHomePage {
    WebDriver driver;

    // Блок баннера
    @FindBy(xpath = "//div[@class='new-main__page']")
    private WebElement bannersBlock;
    // Кнопка кабинет в меню
    @FindBy(xpath = "//span[@class='tabs-login']")
    private WebElement cabinetButton;
    // Кнопка вправо на баннере
    @FindBy(xpath = "//div[@class='owl-carousel owl-loaded']//button[@class='owl-next']")
    private WebElement rightButtonInBanner;
    // Кнопка влево на баннере
    @FindBy(xpath = "//div[@class='owl-carousel owl-loaded']//button[@class='owl-prev']")
    private WebElement leftButtonInBanner;
    // блок скрола вниз на баннере
    @FindBy(xpath = "//a[@class='main__slider-more']")
    private WebElement goDownBlockInSlider;
    // Коллекция продолжить просмотр
    @FindBy(xpath = "//h2[@translate='CINEMA.CONTINUE_WATCHING_MOVIE']")
    private WebElement continueWatchingCollection;
    // Кнопка удалить из продолжить просмотр
    @FindBy(xpath = "//span[@onclick='hideThisElement(event)']")
    private WebElement deleteFromContinueWatching;
    // Блок продолжить просмотр
    @FindBy(xpath = "//span[@onclick='hideThisElement(event)']/..")
    private WebElement blockDeleteFromContinueWatching;


    public AuthHomePage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getBannersBlock(){
        return bannersBlock;
    }

    public WebElement getCabinetButton(){
        return cabinetButton;
    }

    public WebElement getRightButtonInBanner(){
        return rightButtonInBanner;
    }

    public WebElement getLeftButtonInBanner(){
        return leftButtonInBanner;
    }

    public WebElement getGoDownBlockInSlider(){
        return goDownBlockInSlider;
    }

    public WebElement getContinueWatchingCollection(){
        return continueWatchingCollection;
    }

    public WebElement getDeleteFromContinueWatching(){
        return deleteFromContinueWatching;
    }

    public WebElement getBlockDeleteFromContinueWatching(){
        return blockDeleteFromContinueWatching;
    }


}
