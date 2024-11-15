package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthActorPage {
    WebDriver driver;

    // Хлебные крошки
    @FindBy(xpath = "//ul[@class='breadcrumb d-flex']")
    private WebElement breadcrumb;
    // Фото актера
    @FindBy(xpath = "//div[@class='actor__photo']")
    private WebElement actorPhoto;
    // имя актера
    @FindBy(xpath = "//h1[@class='actor__name']")
    private WebElement nameActor;
    // Роль актера
    @FindBy(xpath = "//div[@class='actor__role']")
    private WebElement roleActor;
    // свернутое описание актера
    @FindBy(xpath = "//div[@class='actor__desc']")
    private WebElement miniDescriptionAboutActor;
    // Кнопка развернуть описание
    @FindBy(xpath = "//a[@class='actor__more-btn']")
    private WebElement openDescription;
    // полное описание катера
    @FindBy(xpath = "//div[@class='actor__desc auto__desc']")
    private WebElement fullDescriptionAboutActor;
    // текст Фильмы с актером
    @FindBy(xpath = "//div[@class='h2__title d-block']")
    private WebElement textFilmsWithActor;
    // блок фильмы с акеторм
    @FindBy(xpath = "//div[@class='movie__items d-flex']")
    private WebElement blockFilmsWithActor;


    public NoAuthActorPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getBreadcrumb(){
        return breadcrumb;
    }

    public WebElement getActorPhoto(){
        return actorPhoto;
    }

    public WebElement getNameActor(){
        return nameActor;
    }

    public WebElement getRoleActor(){
        return roleActor;
    }

    public WebElement getMiniDescriptionAboutActor(){
        return miniDescriptionAboutActor;
    }

    public WebElement getOpenDescription(){
        return openDescription;
    }

    public WebElement getFullDescriptionAboutActor(){
        return fullDescriptionAboutActor;
    }

    public WebElement getTextFilmsWithActor(){
        return textFilmsWithActor;
    }

    public WebElement getBlockFilmsWithActor(){
        return blockFilmsWithActor;
    }
}
