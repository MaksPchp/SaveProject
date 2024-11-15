package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthMovieInfoPageMobile {
    WebDriver driver;


    // Кнопка трейлер
    @FindBy(xpath = "//button[@data-film-mob='5']")
    private WebElement trailerButton;
    // Таймер трейлера
    @FindBy(xpath = "//div[@class='plyr__time plyr__time--current']")
    private WebElement timer;
    // Кнопка оставить комментарий
    @FindBy(xpath = "//a[@class='all-f-btn']")
    private WebElement commentButton;
    // Описание фильма
    @FindBy(xpath = "//div[@class='film__descr-wrap mb-0']")
    private WebElement description;
    // Блок аудио, субтитры, доступен на
    @FindBy(xpath = "//div[@class='film-mobile-bottom mt-2']")
    private WebElement soundSubtitles;
    // Заголовок Актеры
    @FindBy(xpath = "//div[@class='film-actors-title title_nw']")
    private WebElement actorsTitle;
    // Блок с актерами
    @FindBy(xpath = "//div[@class='d-flex f-mobile actor-mob']")
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
    @FindBy(xpath = "//div[@class='d-flex f-mobile films-container-mobile']")
    private WebElement similarMovieBlock;
    // Блок преимущества подписки
    @FindBy(xpath = "//div[@class='film-adv']")
    private WebElement advantageSubscriptions;
    // Заглушка трейлера
    @FindBy(xpath = "//img[@class='w-100 h-100 position-absolute']")
    private WebElement imageForTrailer;
    // Блок информация о фильме ( год, страна, рейтинг и т.д.)
    @FindBy(xpath = "//div[@class='about-film-mobile about-film-mobile-unauth position-absolute col-12 mt-2 mb-2']")
    private WebElement aboutMovieBlock;
    // Кнопка смотреть
    @FindBy(xpath = "//div[@class='desk-menu justify-content-center align-items-center d-flex flex-column mb-3']//a")
    private WebElement playButton;
    // Заголовок названия фильма
    @FindBy(xpath = "//h1[@class='mt-2 mb-0']")
    private WebElement nameMovieTitle;
    // Номер сезона
    @FindBy(xpath = "//div[@class='seasons__numbers']")
    private WebElement seasonNumber;
    // Номер серии
    @FindBy(xpath = "//div[@class='seasons__wrap seasones-wrap']")
    private WebElement seriesNumber;


    public NoAuthMovieInfoPageMobile() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }


    public WebElement getSoundSubtitles(){
        return soundSubtitles;
    }

    public WebElement getTrailerButton(){
        return trailerButton;
    }

    public WebElement getTimer(){
        return timer;
    }

    public WebElement getCommentButton(){
        return commentButton;
    }

    public WebElement getDescription(){
        return description;
    }

    public WebElement getActorsTitle(){
        return actorsTitle;
    }

    public WebElement getActorsBlock(){
        return actorsBlock;
    }

    public WebElement getCommentsTitle(){
        return commentsTitle;
    }

    public WebElement getCommentsBlock(){
        return commentsBlock;
    }

    public WebElement getSimilarMovieTitle(){
        return similarMovieTitle;
    }

    public WebElement getSimilarMovieBlock(){
        return similarMovieBlock;
    }

    public WebElement getAdvantageSubscriptions(){
        return advantageSubscriptions;
    }

    public WebElement getImageForTrailer(){
        return imageForTrailer;
    }

    public WebElement getAboutMovieBlock(){
        return aboutMovieBlock;
    }

    public WebElement getPlayButton(){
        return playButton;
    }

    public WebElement getNameMovieTitle(){
        return nameMovieTitle;
    }

    public WebElement getSeasonNumber(){
        return seasonNumber;
    }

    public WebElement getSeriesNumber(){
        return seriesNumber;
    }

}
