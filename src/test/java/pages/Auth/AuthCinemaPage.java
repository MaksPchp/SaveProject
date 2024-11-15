package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthCinemaPage {
    WebDriver driver;

    // Кнопка смотреть
    @FindBy(xpath = "//div[@data-movie-el='30']")
    private WebElement playButton;
    // Коллекция дисней
    @FindBy(xpath = "//a[@data-eventitemid='5166']")
    private WebElement disneyCollection;
    // Коллекция пикчерзбокс
    @FindBy(xpath = "//a[@data-eventitemid='5167']")
    private WebElement pictureboxCollection;
    // Коллекция парамаонт
    @FindBy(xpath = "//a[@data-eventitemid='5168']")
    private WebElement paramountCollection;
    // Коллекция сони
    @FindBy(xpath = "//a[@data-eventitemid='5218']")
    private WebElement sonyCollection;
    // Коллекция mgm
    @FindBy(xpath = "//a[@data-eventitemid='5252']")
    private WebElement mgmCollection;
    // Заголовок коллекций сони парамаунт и т.д.
    @FindBy(xpath = "//h1[@class='watch-films ng-binding']")
    private WebElement h1Collection;
    // Главный заголовок страницы
    @FindBy(xpath = "//h1[@translate='V2.PREMIERE.WATCH-FILM']")
    private WebElement h1ForCinema;

    public AuthCinemaPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getPlayButton() {
        return playButton;
    }

    public WebElement getDisneyCollection(){
        return disneyCollection;
    }

    public WebElement getPictureboxCollection(){
        return pictureboxCollection;
    }

    public WebElement getParamountCollection(){
        return paramountCollection;
    }

    public WebElement getSonyCollection(){
        return sonyCollection;
    }

    public WebElement getMgmCollection(){
        return mgmCollection;
    }

    public WebElement getH1Collection(){
        return h1Collection;
    }

    public WebElement getH1ForCinema(){
        return h1ForCinema;
    }

}
