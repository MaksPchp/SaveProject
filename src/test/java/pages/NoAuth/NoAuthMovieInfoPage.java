package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthMovieInfoPage {
    WebDriver driver;

    // Кнопка смотреть
    @FindBy(xpath = "//a[@data-film-el='4']")
    private WebElement playButton;
    // Кнопка трейлер
    @FindBy(xpath = "//button[@data-film-el='10']")
    private WebElement trailerButton;
    // Таймер трейлера
    @FindBy(xpath = "//div[@class='plyr__time plyr__time--current']")
    private WebElement timer;
    // Кнопка оставить комментарий
    @FindBy(xpath = "//a[@class='all-f-btn']")
    private WebElement commentButton;
    // Описание фильма
    @FindBy(xpath = "//div[@class='film__descr-wrap']")
    private WebElement description;
    // Блок аудио, субтитры, доступен на
    @FindBy(xpath = "//div[@class='film__settings d-flex flex-column']")
    private WebElement soundSubtitles;
    // Заголовок Актеры
    @FindBy(xpath = "//div[@class='film-actors-title title_nw']")
    private WebElement actorsTitle;
    // Блок с актерами
    @FindBy(xpath = "//div[@class='owl-carousel owl-theme film-actors owl-loaded owl-drag']")
    private WebElement actorsBlock;
    // Заголовок отзывы
    @FindBy(xpath = "//div[@class='title_nw']")
    private WebElement commentsTitle;
    // Блок комментарии
    @FindBy(xpath = "//div[@class='col-md-8 pt-4']")
    private WebElement commentsBlock;
    // Заголовок Похожие фильмы
    @FindBy(xpath = "//div[@class='h2__style']")
    private WebElement similarMovieTitle;
    // Блок похожие фильмы
    @FindBy(xpath = "//div[@class='owl-carousel owl-theme film__container owl-loaded owl-drag']")
    private WebElement similarMovieBlock;
    // Блок преимущества подписки
    @FindBy(xpath = "//div[@class='film-adv']")
    private WebElement advantageSubscriptions;
    // Заглушка трейлера
    @FindBy(xpath = "//img[@class='w-100 h-100 position-absolute']")
    private WebElement imageForTrailer;
    // Блок информация о фильме ( год, страна, рейтинг и т.д.)
    @FindBy(xpath = "//div[@class='film-about--text']")
    private WebElement aboutMovieBlock;
    // Заголовок названия фильма
    @FindBy(xpath = "//h1[@class='mt-2 mb-3']")
    private WebElement nameMovieTitle;
    // Номер сезона
    @FindBy(xpath = "//div[@class='seasons__numbers']")
    private WebElement seasonNumber;
    // Номер серии
    @FindBy(xpath = "//div[@class='owl-stage-outer']")
    private WebElement seriesNumber;
    // Хлебный крошки
    @FindBy(xpath = "//ul[@class='breadcrumb d-flex']")
    private WebElement breadcrumbs;
    // Подключение через гугл плей
    @FindBy(xpath = "//a[@data-film-el='7']")
    private WebElement googleButton;
    // Подключение через гугл плей
    @FindBy(xpath = "//a[@data-film-el='8']")
    private WebElement appStoreButton;
    // Подключение через гугл плей
    @FindBy(xpath = "//a[@data-film-el='9']")
    private WebElement smartTvButton;





    public NoAuthMovieInfoPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getPlayButton(){
        return playButton;
    }

    public WebElement getTrailerButton() {
        return trailerButton;
    }

    public WebElement getTimer() {
        return timer;
    }

    public WebElement getCommentButton() {
        return commentButton;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getSoundSubtitles() {
        return soundSubtitles;
    }

    public WebElement getActorsTitle() {
        return actorsTitle;
    }

    public WebElement getActorsBlock() {
        return actorsBlock;
    }

    public WebElement getCommentsTitle() {
        return commentsTitle;
    }

    public WebElement getCommentsBlock() {
        return commentsBlock;
    }

    public WebElement getSimilarMovieTitle() {
        return similarMovieTitle;
    }

    public WebElement getSimilarMovieBlock() {
        return similarMovieBlock;
    }

    public WebElement getAdvantageSubscriptions() {
        return advantageSubscriptions;
    }

    public WebElement getImageForTrailer() {
        return imageForTrailer;
    }

    public WebElement getAboutMovieBlock() {
        return aboutMovieBlock;
    }

    public WebElement getNameMovieTitle() {
        return nameMovieTitle;
    }

    public WebElement getSeasonNumber() {
        return seasonNumber;
    }

    public WebElement getSeriesNumber() {
        return seriesNumber;
    }

    public WebElement getBreadcrumbs(){
        return breadcrumbs;
    }

    public WebElement getGoogleButton() {
        return googleButton;
    }

    public WebElement getAppStoreButton() {
        return appStoreButton;
    }

    public WebElement getSmartTvButton() {
        return smartTvButton;
    }
}
