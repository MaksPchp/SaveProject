package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NoAuth.NoAuthMovieInfoPage;
import pages.NoAuth.NoAuthMovieInfoPageMobile;

import java.time.Duration;

public class AllElementsForMovieInfoPage {
    NoAuthMovieInfoPage noAuthMovieInfoPage = new NoAuthMovieInfoPage();
    NoAuthMovieInfoPageMobile noAuthMovieInfoPageMobile = new NoAuthMovieInfoPageMobile();

    public void AllElementsForMovieInfoPageForMovie(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getBreadcrumbs()));
        Assert.assertTrue(noAuthMovieInfoPage.getBreadcrumbs().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getNameMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getNameMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAboutMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getAboutMovieBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getImageForTrailer()));
        Assert.assertTrue(noAuthMovieInfoPage.getImageForTrailer().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getPlayButton()));
        Assert.assertTrue(noAuthMovieInfoPage.getPlayButton().isDisplayed());

//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getTrailerButton()));
//        Assert.assertTrue(noAuthMovieInfoPage.getTrailerButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAdvantageSubscriptions()));
        Assert.assertTrue(noAuthMovieInfoPage.getAdvantageSubscriptions().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getDescription()));
        Assert.assertTrue(noAuthMovieInfoPage.getDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSoundSubtitles()));
        Assert.assertTrue(noAuthMovieInfoPage.getSoundSubtitles().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getActorsTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getActorsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getActorsBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getActorsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getCommentsTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getCommentsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getCommentsBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getCommentsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSimilarMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getSimilarMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSimilarMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getSimilarMovieBlock().isDisplayed());
    }


    public void AllElementsForMovieInfoPageForMovieMobile(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getNameMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getNameMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getPlayButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getPlayButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getAboutMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getAboutMovieBlock().isDisplayed());

//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getImageForTrailer()));
//        Assert.assertTrue(noAuthMovieInfoPageMobile.getImageForTrailer().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getAdvantageSubscriptions()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getAdvantageSubscriptions().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSimilarMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSimilarMovieBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSimilarMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSimilarMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentsBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentsTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getActorsBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getActorsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getActorsTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getActorsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getDescription()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getTrailerButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getTrailerButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSoundSubtitles()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSoundSubtitles().isDisplayed());

    }

    public void AllElementsForMovieInfoPageForSeries(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getBreadcrumbs()));
        Assert.assertTrue(noAuthMovieInfoPage.getBreadcrumbs().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getNameMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getNameMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAboutMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getAboutMovieBlock().isDisplayed());

//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getImageForTrailer()));
//        Assert.assertTrue(noAuthMovieInfoPage.getImageForTrailer().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getPlayButton()));
        Assert.assertTrue(noAuthMovieInfoPage.getPlayButton().isDisplayed());

//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getTrailerButton()));
//        Assert.assertTrue(noAuthMovieInfoPage.getTrailerButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getAdvantageSubscriptions()));
        Assert.assertTrue(noAuthMovieInfoPage.getAdvantageSubscriptions().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getDescription()));
        Assert.assertTrue(noAuthMovieInfoPage.getDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSoundSubtitles()));
        Assert.assertTrue(noAuthMovieInfoPage.getSoundSubtitles().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getActorsTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getActorsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getActorsBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getActorsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getCommentsTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getCommentsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getCommentsBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getCommentsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSimilarMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPage.getSimilarMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSimilarMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPage.getSimilarMovieBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSeasonNumber()));
        Assert.assertTrue(noAuthMovieInfoPage.getSeasonNumber().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPage.getSeriesNumber()));
        Assert.assertTrue(noAuthMovieInfoPage.getSeriesNumber().isDisplayed());
    }

    public void AllElementsForMovieInfoPageForSeriesMobile(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSeriesNumber()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSeriesNumber().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSeasonNumber()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSeasonNumber().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getNameMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getNameMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getPlayButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getPlayButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getAboutMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getAboutMovieBlock().isDisplayed());

//        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getImageForTrailer()));
//        Assert.assertTrue(noAuthMovieInfoPageMobile.getImageForTrailer().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getAdvantageSubscriptions()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getAdvantageSubscriptions().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSimilarMovieBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSimilarMovieBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSimilarMovieTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSimilarMovieTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentsBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentsTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getActorsBlock()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getActorsBlock().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getActorsTitle()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getActorsTitle().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getDescription()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getDescription().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getCommentButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getCommentButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getTrailerButton()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getTrailerButton().isDisplayed());

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(noAuthMovieInfoPageMobile.getSoundSubtitles()));
        Assert.assertTrue(noAuthMovieInfoPageMobile.getSoundSubtitles().isDisplayed());

    }
}
