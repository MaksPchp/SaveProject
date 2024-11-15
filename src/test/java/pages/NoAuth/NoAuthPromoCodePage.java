package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthPromoCodePage {
    WebDriver driver;

    //Кнопка войти
    @FindBy(xpath = "//button[@class='promo__code-btn']")
    private WebElement comeButton;

    // Заголовок
    @FindBy(xpath = "//h3[@class='promo__code-title']")
    private WebElement h1;

    // Описание
    @FindBy(xpath = "//p[@class='promo__code-text']")
    private WebElement description;

    // Картинка
    @FindBy(xpath = "//img[@class='promo__code-image']")
    private WebElement image;

    public NoAuthPromoCodePage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getComeButton(){
        return comeButton;
    }

    public WebElement getH1() {
        return h1;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getImage() {
        return image;
    }
}
