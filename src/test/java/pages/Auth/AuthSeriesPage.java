package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthSeriesPage {
    WebDriver driver;

    // Коллекция abc Studio
    @FindBy(xpath = "//a[@data-eventitemid='5193']")
    private WebElement abcStudioCollection;
    // Коллекция пикчерзбокс
    @FindBy(xpath = "//a[@data-eventitemid='5220']")
    private WebElement pictureboxCollection;
    // Главный заголовок страницы
    @FindBy(xpath = "//h1[@class='watch-films ng-binding']")
    private WebElement h1ForSeries;

    public AuthSeriesPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getAbcStudioCollection(){
        return abcStudioCollection;
    }

    public WebElement getPictureboxCollection(){
        return pictureboxCollection;
    }

    public WebElement getH1ForSeries(){
        return h1ForSeries;
    }
}
