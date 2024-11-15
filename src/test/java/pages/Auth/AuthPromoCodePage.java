package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPromoCodePage {
    WebDriver driver;

    // Текст активация промо кода
    @FindBy(xpath = "//h3[@translate='V2.PROMOCODE.TITLE']")
    private WebElement textActivationPromoCode;
    // Текст введите промокод
    @FindBy(xpath = "//p[@translate='V2.PROMOCODE.INFO']")
    private WebElement textAbout;
    // Поле ввода промокода
    @FindBy(xpath = "//div[@class='activation__input-wrapper']")
    private WebElement promoCodeInput;
    // Не активная кнопка
    @FindBy(xpath = "//form[@class='activation ng-pristine ng-valid']//button[@disabled='disabled']")
    private WebElement noActiveButton;
    // Активная кнопка
    @FindBy(xpath = "//button[@class='activation__btn ng-binding']")
    private WebElement activeButton;
    // Картинка
    @FindBy(xpath = "//img[@class='promo__code-image']")
    private WebElement image;
    // Ошибка при вводе не правльного промокода украинский



    public AuthPromoCodePage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getTextActivationPromoCode(){
        return textActivationPromoCode;
    }

    public WebElement getTextAbout(){
        return textAbout;
    }

    public WebElement getPromoCodeInput(){return promoCodeInput; }

    public WebElement getNoActiveButton(){
        return noActiveButton;
    }

    public WebElement getActiveButton(){
        return activeButton;
    }

    public WebElement getImage(){
        return image;
    }

}
