package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthForPressPage {
    WebDriver driver;

    // Блок Для перссы
    @FindBy(xpath = "//div[@class='hero__info']")
    private WebElement forPressBlock;

    // Картинка для прессы
    @FindBy(xpath = "//div[@class='hero__img']//img")
    private WebElement forPressImage;

    // текст с информацией
    @FindBy(xpath = "//div[@class='info__text']")
    private WebElement infoText;

    // Картинка информации
    @FindBy(xpath = "//div[@class='info__img']")
    private WebElement infoImage;

    // Блок контакты
    @FindBy(xpath = "//div[@class='contacts-info']")
    private WebElement contactsBlock;

    // Блок медиа
    @FindBy(xpath = "//div[@class='media d-flex flex-column']")
    private WebElement mediaBlock;


    public NoAuthForPressPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getForPressBlock(){
        return forPressBlock;
    }

    public WebElement getForPressImage(){
        return forPressImage;
    }

    public WebElement getInfoText(){
        return infoText;
    }

    public WebElement getInfoImage(){
        return infoImage;
    }

    public WebElement getContactsBlock(){
        return contactsBlock;
    }

    public WebElement getMediaBlock(){
        return mediaBlock;
    }
}
