package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthFondKinoPage {
    WebDriver driver;

    // Баннер картинка
    @FindBy(xpath = "//section[@class='fund__top']")
    private WebElement bannerImage;

    // Блок инфо
    @FindBy(xpath = "//section[@class='fund__info']")
    private WebElement infoBlock;

    // Блок идея
    @FindBy(xpath = "//section[@class='fund__idea']")
    private WebElement ideaBlock;

    // Блок голливуд
    @FindBy(xpath = "//section[@class='fund__hollywood']")
    private WebElement hollywoodBlock;

    // Блок фонд
    @FindBy(xpath = "//section[@class='fund__fruit']")
    private WebElement fundBlock;

    // Блок фокус деятельности
    @FindBy(xpath = "//section[@class='fund__focus']")
    private WebElement focusBlock;

    // Блок поддержка
    @FindBy(xpath = "//section[@class='fund__support']")
    private WebElement supportBlock;


    public NoAuthFondKinoPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getBannerImage(){
        return bannerImage;
    }

    public WebElement getInfoBlock(){
        return infoBlock;
    }

    public WebElement getIdeaBlock(){
        return ideaBlock;
    }

    public WebElement getHollywoodBlock(){
        return hollywoodBlock;
    }

    public WebElement getFundBlock(){
        return fundBlock;
    }

    public WebElement getFocusBlock(){
        return focusBlock;
    }

    public WebElement getSupportBlock(){
        return supportBlock;
    }
}