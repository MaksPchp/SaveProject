package methods;

import driver.DriverProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.FiltersInMovieNoAuth;

import java.time.Duration;

public class AllElementsForFiltersInMovie {
    FiltersInMovieNoAuth filtersInMovieNoAuth = new FiltersInMovieNoAuth();


    public void allElementsForFiltersInMovieGenre(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getKomedyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getKomedyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getBoevikiGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getBoevikiGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getDetektivyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getDetektivyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getFantastikaGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getFantastikaGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getDramyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getDramyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getSemeynyeGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getSemeynyeGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getUzhasyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getUzhasyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getOnlaynShkolaGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getOnlaynShkolaGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getSerialyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getSerialyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getPriklyucheniyaGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getPriklyucheniyaGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getTrilleryGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getTrilleryGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMelodramyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getMelodramyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getKriminalGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getKriminalGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getSportivnyeGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getSportivnyeGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getIstoricheskieGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getIstoricheskieGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getFenteziGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getFenteziGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getBiografiyaGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getBiografiyaGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getArtHausGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getArtHausGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getDetskieGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getDetskieGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMultfilmyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getMultfilmyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getVoennyeGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getVoennyeGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getMyuziklyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getMyuziklyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getPeredachIShouGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getPeredachIShouGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getUltraHdGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getUltraHdGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getVideoInstrukciiGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getVideoInstrukciiGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getKarantinInfoGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getKarantinInfoGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getDokumentalnyyGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getDokumentalnyyGenre().isDisplayed());
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getSpektaklGenre()));
        Assert.assertTrue(filtersInMovieNoAuth.getSpektaklGenre().isDisplayed());

    }

    public void allElementsForFiltersInMovieCountry(){

        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getUsaCountry()));
        Assert.assertTrue(filtersInMovieNoAuth.getUsaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getUkraineCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getRussiaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getAvstraliyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getAvstriyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getArgentinaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getBelarusCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getBelgiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getBolgariyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getBraziliyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getVelikobritaniyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getVengriyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getGermaniyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getGonkongCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getGreciyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getDaniyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIzrailCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIndiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIranCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIrlandiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIslandiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getIspaniyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getItaliyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getKazahstanCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getKanadaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getKitayCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getLatviyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getLitvaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getLyuksemburgCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getMeksikaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getNovayaZelandiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getNorvegiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getPeruCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getPolshaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getRumyniyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getSingapurCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getTayvanCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getTailandCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getTunisCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getTurciyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getUrugvayCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getFilippinyCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getFinlyandiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getFranciyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getChehiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getChiliCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getShveycariyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getShveciyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYuzhnayaKoreyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYaponiyaCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getSssrCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getNiderlandyCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getOaeCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYuarCountry().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getSlovakiyaCountry().isDisplayed());
    }

    public void allElementsForFiltersInMovieYear(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getUsaCountry()));
        Assert.assertTrue(filtersInMovieNoAuth.getYear18_20().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYear14_18().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYear2000_14().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getYear2000().isDisplayed());
    }

    public void allElementsForFiltersInMovieAudio(){
        new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filtersInMovieNoAuth.getUkrajinskaAudio()));
        Assert.assertTrue(filtersInMovieNoAuth.getUkrajinskaAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getRusskiyAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getEnglishAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getFrancaisAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getEspanolAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getNihongoAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getItalianoAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getDeutschAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getZhongwenAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getSvenskaAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getKoreanAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getNorskAudio().isDisplayed());
        Assert.assertTrue(filtersInMovieNoAuth.getUkrajinskaTyphloAudio().isDisplayed());
    }


}
