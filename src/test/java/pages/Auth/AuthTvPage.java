package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthTvPage {
    WebDriver driver;

    // Превый канал без лайка
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-heart-empty favorite'][1]/..")
    private WebElement firstNoLikedChanel;
    // Первая икона канала без лайка
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-heart-empty favorite'][1]")
    private WebElement firstNoLikedIconChanel;
    // Превый канал с лайком
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-heart favorite'][1]/..")
    private WebElement firstLikedChanel;
    // Первая икона канала с лайком
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-heart favorite'][1]")
    private WebElement firstLikedIconChanel;
    // Канал никелодеон ашди в списке каналов
    @FindBy(xpath = "//span[text()='Nickelodeon HD']")
    private WebElement nickelodeonHdChanel;
    // Кнопка поиска в тв
    @FindBy(xpath = "//div[@class='open-search-block']")
    private WebElement searchButtonInTheTvPage;
    // Поле поиска в тв
    @FindBy(xpath = "//input[@name='q_tv']")
    private WebElement searchFiled;
    // Кнопка категорий в тв
    @FindBy(xpath = "//label[@class='filterCategory__label']")
    private WebElement categoryButton;
    // Кнопка открытия фуллскрин
    @FindBy(xpath = "//div[@class='icon--enter--fullscreen']")
    private WebElement enterFullScreenButton;
    // Кнопка закрытия фуллскрин
    @FindBy(xpath = "//div[@class='icon--exit--fullscreen']")
    private WebElement exitFullScreenButton;
    // Категория 18+ в ТВ
    @FindBy(xpath = "//*[text()='18+']")
    private WebElement category18plus;
    // Текст введите пин код
    @FindBy(xpath = "//h3[@translate='V2.PARENT-CONTROL.PARENT-CONTROL_TV-INPUT']")
    private WebElement textEnterPinCode18;
    // Первый канал в списке
    @FindBy(xpath = "//li[@channel='channel'][1]")
    private WebElement firstChannelInTheList;
    // Поле ввода кода на канале 18+
    @FindBy(xpath = "//input[@placeholder='XXXX'][1]")
    private WebElement codeEntryFieldOnChannel18;
    // Эфир в плеере
    @FindBy(xpath = "//span[@class='epg-status epg-status--stream']")
    private WebElement efirInThePlayer;
    // Кнопка Вначало
    @FindBy(xpath = "//div[text()='На початок']")
    private WebElement toStartButton;
    // Кнопка в эфир
    @FindBy(xpath = "//div[text()='В ефір']")
    private WebElement toEfirButton;
    // Качество авто
    @FindBy(xpath = "//div[text()='Якість (Авто)']")
    private WebElement qualityAuto;
    // Выбрать качество 360
    @FindBy(xpath = "//button[@value='0']")
    private WebElement chooseQuality360;
    // Выбрать качество 720
    @FindBy(xpath = "//button[@value='0']")
    private WebElement chooseQuality720;
    // Выбрать качество 1080
    @FindBy(xpath = "//button[@value='0']")
    private WebElement chooseQuality1080;
    // Кнопка выбора качеста
    @FindBy(xpath = "//div[@class='default_quality']")
    private WebElement changeQualityButton;
    // Телеканал запретил перемотку
    @FindBy(xpath = "//span[@class='tooltip_message_bar']")
    private WebElement channelForbadeRewinding;
    // Канал Украина
    @FindBy(xpath = "//span[text()='Україна HD'][1]")
    private WebElement ukraineHdChannel;
    // Прогресс бар
    @FindBy(xpath = "//div[@class='life_progress_color']")
    private WebElement progressBar;
    // Плеер развернут
    @FindBy(xpath = "//div[@class='video d-flex']")
    private WebElement playerNotMinimizing;
    // Плеер свернут
    @FindBy(xpath = "//div[@class='video d-flex programmTop']")
    private WebElement playerMinimizing;
    // Кнопка открыть телепрограмму
    @FindBy(xpath = "//span[@class='programm__title ng-scope']")
    private WebElement openTvProgram;
    // Закрыть программу
    @FindBy(xpath = "//div[@class='resizeButton']")
    private WebElement closeRvProgram;
    // Кнопка пауза
    @FindBy(xpath = "//div[@data-test-value='pause']")
    private WebElement pauseButton;
    // Кнопка плей
    @FindBy(xpath = "//div[@data-test-value='play']")
    private WebElement playButton;
    // таймер
    @FindBy(xpath = "//div[@data-test-value='timer']")
    private WebElement timer;



    public AuthTvPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getFirstNoLikedChanel(){
        return firstNoLikedChanel;
    }

    public WebElement getFirstNoLikedIconChanel(){
        return firstNoLikedIconChanel;
    }

    public WebElement getNickelodeonHdChanel(){
        return nickelodeonHdChanel;
    }

    public WebElement getSearchButtonInTheTvPage(){
        return searchButtonInTheTvPage;
    }

    public WebElement getSearchFiled(){
        return searchFiled;
    }

    public WebElement getCategoryButton(){
        return categoryButton;
    }

    public WebElement getEnterFullScreenButton(){
        return enterFullScreenButton;
    }

    public WebElement getExitFullScreenButton(){
        return exitFullScreenButton;
    }

    public WebElement getCategory18plus(){
        return category18plus;
    }

    public WebElement getTextEnterPinCode18(){
        return textEnterPinCode18;
    }

    public WebElement getFirstChannelInTheList(){
        return firstChannelInTheList;
    }

    public WebElement getCodeEntryFieldOnChannel18(){
        return codeEntryFieldOnChannel18;
    }

    public WebElement getEfirInThePlayer(){
        return efirInThePlayer;
    }

    public WebElement getFirstLikedChanel(){
        return firstLikedChanel;
    }

    public WebElement getFirstLikedIconChanel(){
        return firstLikedIconChanel;
    }

    public WebElement getToStartButton(){
        return toStartButton;
    }

    public WebElement getToEfirButton(){
        return toEfirButton;
    }

    public WebElement getQualityAuto(){
        return qualityAuto;
    }

    public WebElement getChooseQuality360(){
        return chooseQuality360;
    }

    public WebElement getChooseQuality720(){
        return chooseQuality720;
    }

    public WebElement getChooseQuality1080(){
        return chooseQuality1080;
    }

    public WebElement getChangeQualityButton(){
        return changeQualityButton;
    }

    public WebElement getChannelForbadeRewinding(){
        return channelForbadeRewinding;
    }

    public WebElement getUkraineHdChannel(){
        return ukraineHdChannel;
    }

    public WebElement getProgressBar(){
        return progressBar;
    }

    public WebElement getPlayerNotMinimizing(){
        return playerNotMinimizing;
    }

    public WebElement getPlayerMinimizing(){
        return playerMinimizing;
    }

    public WebElement getOpenTvProgram(){
        return openTvProgram;
    }

    public WebElement getCloseRvProgram(){
        return closeRvProgram;
    }

    public WebElement getPauseButton(){
        return pauseButton;
    }

    public WebElement getPlayButton(){
        return playButton;
    }

    public WebElement getTimer(){
        return timer;
    }

}
