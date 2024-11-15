package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthPartnersPage {
    WebDriver driver;

    // Текст Наши партнеры
    @FindBy(xpath = "//div[@class='partners__top-text']//h1")
    private WebElement ourPartnersText;

    // Описание блока наши партнеры
    @FindBy(xpath = "//div[@class='partners__top-text']//p")
    private WebElement ourPartnersBlockDescription;

    // Картинка в первом блоке
    @FindBy(xpath = "//div[@class='partners__top-wrapper']//img")
    private WebElement imageFirstBlock;

    // Блок голивуд
    @FindBy(xpath = "//section[@class='partners__list']")
    private WebElement hollywoodBlock;

    // Блок поддержки
    @FindBy(xpath = "//section[@class='partners__support']")
    private WebElement supportBlock;



    public NoAuthPartnersPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }


    public WebElement getOurPartnersText(){
        return ourPartnersText;
    }

    public WebElement getOurPartnersBlockDescription(){
        return ourPartnersBlockDescription;
    }

    public WebElement getImageFirstBlock(){
        return imageFirstBlock;
    }

    public WebElement getHollywoodBlock(){
        return hollywoodBlock;
    }

    public WebElement getSupportBlock(){
        return supportBlock;
    }


}
