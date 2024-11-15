package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthSupportItPage {
    WebDriver driver;


    // Логотип
    @FindBy(xpath = "//img[@class='lozad it-banner-logo']")
    private WebElement logo;

    // Текст описание
    @FindBy(xpath = "//div[@class='it__banner-box']//h1")
    private WebElement textDescription;

    // Картинка телевизора
    @FindBy(xpath = "//img[@class='lozad it-banner-img']")
    private WebElement tvImage;

    // Преимущества блок
    @FindBy(xpath = "//section[@class='it__advantages']")
    private WebElement advantagesBlock;

    // Блок как мы этого добились
    @FindBy(xpath = "//section[@class='it__goal']")
    private WebElement goalBlock;

    // Блок цель
    @FindBy(xpath = "//section[@class='it__target']")
    private WebElement targetBlock;

    // Блок идея
    @FindBy(xpath = "//section[@class='it__idea']")
    private WebElement ideaBlock;

    @FindBy(xpath = "//section[@class='it__hackaton']")
    private WebElement hackathonBlock;

    @FindBy(xpath = "//section[@class='it__dev']")
    private WebElement devBlock;

    @FindBy(xpath = "//section[@class='it__fwdays']")
    private WebElement fwdaysBlock;

    @FindBy(xpath = "//section[@class='it__reactor']")
    private WebElement reactorBlock;


    public NoAuthSupportItPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }


    public WebElement getLogo() {
        return logo;
    }

    public WebElement getTextDescription() {
        return textDescription;
    }

    public WebElement getTvImage() {
        return tvImage;
    }

    public WebElement getAdvantagesBlock() {
        return advantagesBlock;
    }

    public WebElement getGoalBlock() {
        return goalBlock;
    }

    public WebElement getTargetBlock() {
        return targetBlock;
    }

    public WebElement getIdeaBlock() {
        return ideaBlock;
    }

    public WebElement getHackathonBlock() {
        return hackathonBlock;
    }

    public WebElement getDevBlock() {
        return devBlock;
    }

    public WebElement getFwdaysBlock() {
        return fwdaysBlock;
    }

    public WebElement getReactorBlock() {
        return reactorBlock;
    }

}
