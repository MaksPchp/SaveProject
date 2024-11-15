package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthMovieInfoPage {
    WebDriver driver;

    //Поле имя в комментарии
    @FindBy(xpath = "//input[@ng-model='nickname.text']")
    private WebElement nameInputInComment;
    // Поле ввода комментария
    @FindBy(xpath = "//textarea[@ng-model='comment_.text']")
    private WebElement commentTextInput;
    // кнопка оставить комментарий
    @FindBy(xpath = "//button[@translate='V2.MOVIE.COMMENT_MAKE']")
    private WebElement writeCommentButton;
    // Редактировать комментарий
    @FindBy(xpath = "//span[@ng-click='editComments(true, comment.id)'][1]")
    private WebElement changeCommentButton;
    // Удалить комментарий
    @FindBy(xpath = "//span[@ng-click='removeMassage(comment.id)'][1]")
    private WebElement deleteCommentButton;
    // Поле изменения комментария
    @FindBy(xpath = "//textarea[@ng-model='comment.text'][1]")
    private WebElement changeCommentInput;
    // Кнопка сохранить измененный комментарий
    @FindBy(xpath = "//div[@class='all-f-btn mt-3']")
    private WebElement saveChangedCommentButton;
    // Кнопка добавить удалить из избранного
    @FindBy(xpath = "//span[contains(@class,'add_to_fav')]")
    private WebElement addOrDeleteFromFavorite;
    // Кнопка трейлер
    @FindBy(xpath = "//button[@class='get_trailer all-f-btn favorites-btn trailer_button new-tr-btn ml-3']")
    private WebElement trailerButton;
    // Таймер трейлера
    @FindBy(xpath = "//div[@class='plyr__time plyr__time--current']")
    private WebElement timer;
    // Кнопка оставить комментарий
    @FindBy(xpath = "//a[@class='all-f-btn']")
    private WebElement commentButton;
    // Описание фильма
    @FindBy(xpath = "//p[@itemprop='description']")
    private WebElement description;
    // Звуковые дорожки
    @FindBy(xpath = "//div[@class='film__sounds']")
    private WebElement sounds;
    // Субтитры
    @FindBy(xpath = "//div[@class='film__subtitles']")
    private WebElement subtitles;
    // Заголовок Актеры
    @FindBy(xpath = "//div[@class='film-actors-title title_nw']")
    private WebElement actorsTitle;
    // Блок с актерами
    @FindBy(xpath = "//section[@class='actors__film mb-3']//div[@class='owl-stage']")
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
    @FindBy(xpath = "//section[@class='topfilm topfilm--film']//div[@class='owl-stage-outer']")
    private WebElement similarMovieBlock;
    // Блок смотри на устройствах
    @FindBy(xpath = "//div[@class='film__devices']")
    private WebElement devicesBlock;
    // Блок преимущества подписки
    @FindBy(xpath = "//div[@class='film-adv']")
    private WebElement advantageSubscriptions;
    // Заглушка трейлера
    @FindBy(xpath = "//img[@class='w-100 h-100 position-absolute']")
    private WebElement imageForTrailer;
    // Блок информация о фильме ( год, страна, рейтинг и т.д.)
    @FindBy(xpath = "//div[@class='film-about--text']")
    private WebElement aboutMovieBlock;
    // Кнопка смотреть
    @FindBy(xpath = "//div[@class='desk-menu justify-content-center justify-content-lg-start dd']//a")
    private WebElement playButton;
    // Заголовок названия фильма
    @FindBy(xpath = "//h1[@class='mt-2 mb-3']")
    private WebElement nameMovieTitle;
    // Хлебные крошки
    @FindBy(xpath = "//ul[@class='breadcrumb']")
    private WebElement breadcrumbs;
    // Номер сезона
    @FindBy(xpath = "//div[@class='seasons__numbers']")
    private WebElement seasonNumber;
    // Номер серии
    @FindBy(xpath = "//div[@class='seasone-scroll  series_not_auth']")
    private WebElement seriesNumber;


    public AuthMovieInfoPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
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

    public WebElement getSounds(){
        return sounds;
    }

    public WebElement getSubtitles(){
        return subtitles;
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

    public WebElement getDevicesBlock(){
        return devicesBlock;
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

    public WebElement getBreadcrumbs(){
        return breadcrumbs;
    }

    public WebElement getSeasonNumber(){
        return seasonNumber;
    }

    public WebElement getSeriesNumber(){
        return seriesNumber;
    }

    public WebElement getNameInputInComment(){
        return nameInputInComment;
    }

    public WebElement getCommentTextInput(){
        return commentTextInput;
    }

    public WebElement getWriteCommentButton(){
        return writeCommentButton;
    }

    public WebElement getChangeCommentButton(){
        return changeCommentButton;
    }

    public WebElement getDeleteCommentButton(){
        return deleteCommentButton;
    }

    public WebElement getChangeCommentInput(){
        return changeCommentInput;
    }

    public WebElement getSaveChangedCommentButton(){
        return saveChangedCommentButton;
    }

    public WebElement getAddOrDeleteFromFavorite(){
        return addOrDeleteFromFavorite;
    }
}
