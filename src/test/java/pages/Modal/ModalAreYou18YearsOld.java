package pages.Modal;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalAreYou18YearsOld {
    WebDriver driver;

    // Кнопка нет
    @FindBy(xpath = "//a[@translate='CABINET.NO']")
    private WebElement noButton;
    // Кнопка да
    @FindBy(xpath = "//a[@translate='CABINET.YES']")
    private WebElement yesButton;
    // Тебе уже есть 18 текст
    @FindBy(xpath = "//h2[@translate='V2.BLOCKED.IS_BLOCKED_MOVIE_TITLE']")
    private WebElement doYouHave18Text;


    public ModalAreYou18YearsOld() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getNoButton(){
        return noButton;
    }

    public WebElement getYesButton(){
        return yesButton;
    }

    public WebElement getDoYouHave18Text(){
        return doYouHave18Text;
    }
}
