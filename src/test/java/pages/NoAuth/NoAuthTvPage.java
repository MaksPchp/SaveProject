package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthTvPage {
    WebDriver driver;

    // Канал 1+1 в списке
    @FindBy(xpath = "//li[@data-channel-id='240']")
    private WebElement channel240;
    // Кнопка смотреть 7 дней бесплатно
    @FindBy(xpath = "//a[@data-tv-el='2']")
    private WebElement watchToFree;
    // Плеер развернут
    @FindBy(xpath = "//div[@class='video']")
    private WebElement playerNotMinimizingNoAuth;
    // Открыть телепрограмму
    @FindBy(xpath = "//div[@data-channel-id='240']")
    private WebElement openTvProgramNoAuth;
    // Плеер свернут
    @FindBy(xpath = "//div[@class='video programmTop']")
    private WebElement playerMinimizingNoAuth;
    // Кнопка категорий в тв
    @FindBy(xpath = "//label[@class='filterCategory__label']")
    private WebElement categoryButton;
    // Кнопка подключения через гугл
    @FindBy(xpath = "//a[@data-channel-el='02']")
    private WebElement googlePlayButton;
    // Кнопка подключения через эпсторе
    @FindBy(xpath = "//a[@data-channel-el='03']")
    private WebElement appStoreButton;
    // нопка подключения через смарт тв
    @FindBy(xpath = "//a[@data-channel-el='04']")
    private WebElement smartTvButton;
    // название канала
    @FindBy(xpath = "//div[@class='about__channel__info--description seostyle']//h1")
    private WebElement nameChannel;
    // Описание канала
    @FindBy(xpath = "//div[@class='descriptionChannel']")
    private WebElement descriptionChannel;
    // Текст смотри на любом устройстве
    @FindBy(xpath = "//h6[@data-channel-el='01']")
    private WebElement textLookOnAnyDevices;
    // трейлер
    @FindBy(xpath = "//h6[@data-channel-el='05']")
    private WebElement trailer;
    // Текст популярные актеры
    @FindBy(xpath = "//h6[@data-channel-el='06']")
    private WebElement textPopularActor;
    // Блок популярные актеры
    @FindBy(xpath = "//div[@data-channel-el='08']")
    private WebElement blockPopularActor;
    // Текст популярные передачи
    @FindBy(xpath = "//h6[@data-channel-el='07']")
    private WebElement textPopularTv;
    // Блок популярные передачи
    @FindBy(xpath = "//div[@data-channel-el='09']")
    private WebElement blockPopularTv;
    // Блок 1
    @FindBy(xpath = "//div[@data-channel-el='0']")
    private WebElement block1;
    // описание 1
    @FindBy(xpath = "//div[@data-channel-el='0']//p")
    private WebElement description1;
    // Блок 2
    @FindBy(xpath = "//div[@data-channel-el='1']")
    private WebElement block2;
    // описание 2
    @FindBy(xpath = "//div[@data-channel-el='1']//p")
    private WebElement description2;
    // Блок 3
    @FindBy(xpath = "//div[@data-channel-el='2']")
    private WebElement block3;
    // описание 3
    @FindBy(xpath = "//div[@data-channel-el='2']//p")
    private WebElement description3;
    // Блок 4
    @FindBy(xpath = "//div[@data-channel-el='3']")
    private WebElement block4;
    // описание 4
    @FindBy(xpath = "//div[@data-channel-el='3']//p")
    private WebElement description4;





    public NoAuthTvPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getChannel240(){
        return channel240;
    }

    public WebElement getWatchToFree(){
        return watchToFree;
    }

    public WebElement getPlayerNotMinimizingNoAuth(){
        return playerNotMinimizingNoAuth;
    }

    public WebElement getOpenTvProgramNoAuth(){
        return openTvProgramNoAuth;
    }

    public WebElement getPlayerMinimizingNoAuth(){
        return playerMinimizingNoAuth;
    }

    public WebElement getCategoryButton(){
        return categoryButton;
    }

    public WebElement getGooglePlayButton() {
        return googlePlayButton;
    }

    public WebElement getAppStoreButton() {
        return appStoreButton;
    }

    public WebElement getSmartTvButton() {
        return smartTvButton;
    }

    public WebElement getNameChannel() {
        return nameChannel;
    }

    public WebElement getDescriptionChannel() {
        return descriptionChannel;
    }

    public WebElement getTextLookOnAnyDevices() {
        return textLookOnAnyDevices;
    }

    public WebElement getTrailer() {
        return trailer;
    }

    public WebElement getTextPopularActor() {
        return textPopularActor;
    }

    public WebElement getBlockPopularActor() {
        return blockPopularActor;
    }

    public WebElement getTextPopularTv() {
        return textPopularTv;
    }

    public WebElement getBlockPopularTv() {
        return blockPopularTv;
    }

    public WebElement getBlock1() {
        return block1;
    }

    public WebElement getDescription1() {
        return description1;
    }

    public WebElement getBlock2() {
        return block2;
    }

    public WebElement getDescription2() {
        return description2;
    }

    public WebElement getBlock3() {
        return block3;
    }

    public WebElement getDescription3() {
        return description3;
    }

    public WebElement getBlock4() {
        return block4;
    }

    public WebElement getDescription4() {
        return description4;
    }
}
