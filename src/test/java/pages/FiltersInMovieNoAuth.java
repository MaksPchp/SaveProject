package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersInMovieNoAuth {
    WebDriver driver;

    //Кнопка фильтры в моб версии
    @FindBy(xpath = "//div[@class='l-filter-btn-mobile']")
    private WebElement filtersButtonMobile;
    //Фильтр жанр
    @FindBy(xpath = "//div[@data-filter='0']")
    private WebElement genreFilter;
    //Фильтр страна
    @FindBy(xpath = "//div[@data-filter='1']")
    private WebElement countryFilter;
    //Фильтр год
    @FindBy(xpath = "//div[@data-filter='2']")
    private WebElement yearFilter;
    //Фильтр аудио
    @FindBy(xpath = "//div[@data-filter='3']")
    private WebElement audioFilter;
    // Жанр комедии
    @FindBy(xpath = "//input[@data-filters-el='genre-4']/../..")
    private WebElement komedyGenre;
    // Жанр боевики
    @FindBy(xpath = "//input[@data-filters-el='genre-5']/../..")
    private WebElement boevikiGenre;
    // Жанр детективы
    @FindBy(xpath = "//input[@data-filters-el='genre-9']/../..")
    private WebElement detektivyGenre;
    // Жанр фентастика
    @FindBy(xpath = "//input[@data-filters-el='genre-8']/../..")
    private WebElement fantastikaGenre;
    // Жанр драмы
    @FindBy(xpath = "//input[@data-filters-el='genre-6']/../..")
    private WebElement dramyGenre;
    // Жанр семейные
    @FindBy(xpath = "//input[@data-filters-el='genre-22']/../..")
    private WebElement semeynyeGenre;
    // Жанр ужасы
    @FindBy(xpath = "//input[@data-filters-el='genre-16']/../..")
    private WebElement uzhasyGenre;
    // Жанр онлайн школа
    @FindBy(xpath = "//input[@data-filters-el='genre-1']/../..")
    private WebElement onlaynShkolaGenre;
    // Жанр сериалы
    @FindBy(xpath = "//input[@data-filters-el='genre-3']/../..")
    private WebElement serialyGenre;
    // Жанр приключения
    @FindBy(xpath = "//input[@data-filters-el='genre-7']/../..")
    private WebElement priklyucheniyaGenre;
    // Жанр триллеры
    @FindBy(xpath = "//input[@data-filters-el='genre-10']/../..")
    private WebElement trilleryGenre;
    // Жанр мелодрамы
    @FindBy(xpath = "//input[@data-filters-el='genre-11']/../..")
    private WebElement melodramyGenre;
    // Жанр криминал
    @FindBy(xpath = "//input[@data-filters-el='genre-12']/../..")
    private WebElement kriminalGenre;
    // Жанр спортивные
    @FindBy(xpath = "//input[@data-filters-el='genre-13']/../..")
    private WebElement sportivnyeGenre;
    // Жанр исторические
    @FindBy(xpath = "//input[@data-filters-el='genre-14']/../..")
    private WebElement istoricheskieGenre;
    // Жанр фентези
    @FindBy(xpath = "//input[@data-filters-el='genre-11']/../..")
    private WebElement fenteziGenre;
    // Жанр биография
    @FindBy(xpath = "//input[@data-filters-el='genre-53']/../..")
    private WebElement biografiyaGenre;
    // Жанр арт хаус
    @FindBy(xpath = "//input[@data-filters-el='genre-35']/../..")
    private WebElement artHausGenre;
    // Жанр детские
    @FindBy(xpath = "//input[@data-filters-el='genre-16']/../..")
    private WebElement detskieGenre;
    // Жанр мультфильмы
    @FindBy(xpath = "//input[@data-filters-el='genre-2']/../..")
    private WebElement multfilmyGenre;
    // Жанр военные
    @FindBy(xpath = "//input[@data-filters-el='genre-14']/../..")
    private WebElement voennyeGenre;
    // Жанр мьюзикл
    @FindBy(xpath = "//input[@data-filters-el='genre-36']/../..")
    private WebElement myuziklyGenre;
    // Жанр передачи и шоу
    @FindBy(xpath = "//input[@data-filters-el='genre-3']/../..")
    private WebElement peredachIShouGenre;
    // Жанр ультра hd
    @FindBy(xpath = "//input[@data-filters-el='genre-57']/../..")
    private WebElement ultraHdGenre;
    // Жанр видео инструкции
    @FindBy(xpath = "//input[@data-filters-el='genre-56']/../..")
    private WebElement videoInstrukciiGenre;
    // Жанр карантин инфо
    @FindBy(xpath = "//input[@data-filters-el='genre-59']/../..")
    private WebElement karantinInfoGenre;
    // Жанр документальные
    @FindBy(xpath = "//input[@data-filters-el='genre-62']/../..")
    private WebElement dokumentalnyyGenre;
    // Жанр спектакль
    @FindBy(xpath = "//input[@data-filters-el='genre-63']/../..")
    private WebElement spektaklGenre;

    // Кнопка больше стран
    @FindBy(xpath = "//a[@id='more__countries']")
    private WebElement moreCountryButton;
    // Страна США
    @FindBy(xpath = "//input[@data-filters-el='country-79']/../..")
    private WebElement usaCountry;
    // Страна Украина
    @FindBy(xpath = "//input[@data-filters-el='country-34']/../..")
    private WebElement ukraineCountry;
    // Страна Россия
    @FindBy(xpath = "//input[@data-filters-el='country-33']/../..")
    private WebElement russiaCountry;
    // Страна Австралия
    @FindBy(xpath = "//input[@data-filters-el='country-35']/../..")
    private WebElement avstraliyaCountry;
    // Страна Австрия
    @FindBy(xpath = "//input[@data-filters-el='country-36']/../..")
    private WebElement avstriyaCountry;
    // Страна Аргентина
    @FindBy(xpath = "//input[@data-filters-el='country-38']/../..")
    private WebElement argentinaCountry;
    // Страна Беларусь
    @FindBy(xpath = "//input[@data-filters-el='country-40']/../..")
    private WebElement belarusCountry;
    // Страна Бельгия
    @FindBy(xpath = "//input[@data-filters-el='country-41']/../..")
    private WebElement belgiyaCountry;
    // Страна Болгария
    @FindBy(xpath = "//input[@data-filters-el='country-42']/../..")
    private WebElement bolgariyaCountry;
    // Страна Бразилия
    @FindBy(xpath = "//input[@data-filters-el='country-43']/../..")
    private WebElement braziliyaCountry;
    // Страна Великобритания
    @FindBy(xpath = "//input[@data-filters-el='country-44']/../..")
    private WebElement velikobritaniyaCountry;
    // Страна Венгрия
    @FindBy(xpath = "//input[@data-filters-el='country-45']/../..")
    private WebElement vengriyaCountry;
    // Страна Германия
    @FindBy(xpath = "//input[@data-filters-el='country-48']/../..")
    private WebElement germaniyaCountry;
    // Страна Гонконг
    @FindBy(xpath = "//input[@data-filters-el='country-49']/../..")
    private WebElement gonkongCountry;
    // Страна Греция
    @FindBy(xpath = "//input[@data-filters-el='country-50']/../..")
    private WebElement greciyaCountry;
    // Страна Дания
    @FindBy(xpath = "//input[@data-filters-el='country-52']/../..")
    private WebElement daniyaCountry;
    // Страна Израиль
    @FindBy(xpath = "//input[@data-filters-el='country-53']/../..")
    private WebElement izrailCountry;
    // Страна Индия
    @FindBy(xpath = "//input[@data-filters-el='country-54']/../..")
    private WebElement indiyaCountry;
    // Страна Иран
    @FindBy(xpath = "//input[@data-filters-el='country-56']/../..")
    private WebElement iranCountry;
    // Страна Ирландия
    @FindBy(xpath = "//input[@data-filters-el='country-57']/../..")
    private WebElement irlandiyaCountry;
    // Страна Исландия
    @FindBy(xpath = "//input[@data-filters-el='country-58']/../..")
    private WebElement islandiyaCountry;
    // Страна Испания
    @FindBy(xpath = "//input[@data-filters-el='country-59']/../..")
    private WebElement ispaniyaCountry;
    // Страна Италия
    @FindBy(xpath = "//input[@data-filters-el='country-60']/../..")
    private WebElement italiyaCountry;
    // Страна Казахстан
    @FindBy(xpath = "//input[@data-filters-el='country-61']/../..")
    private WebElement kazahstanCountry;
    // Страна Канада
    @FindBy(xpath = "//input[@data-filters-el='country-62']/../..")
    private WebElement kanadaCountry;
    // Страна Китай
    @FindBy(xpath = "//input[@data-filters-el='country-64']/../..")
    private WebElement kitayCountry;
    // Страна Латвия
    @FindBy(xpath = "//input[@data-filters-el='country-67']/../..")
    private WebElement latviyaCountry;
    // Страна Литва
    @FindBy(xpath = "//input[@data-filters-el='country-68']/../..")
    private WebElement litvaCountry;
    // Страна Люксембург
    @FindBy(xpath = "//input[@data-filters-el='country-69']/../..")
    private WebElement lyuksemburgCountry;
    // Страна Мексика
    @FindBy(xpath = "//input[@data-filters-el='country-71']/../..")
    private WebElement meksikaCountry;
    // Страна Новая Зеландия
    @FindBy(xpath = "//input[@data-filters-el='country-73']/../..")
    private WebElement novayaZelandiyaCountry;
    // Страна Норвегия
    @FindBy(xpath = "//input[@data-filters-el='country-74']/../..")
    private WebElement norvegiyaCountry;
    // Страна Перу
    @FindBy(xpath = "//input[@data-filters-el='country-75']/../..")
    private WebElement peruCountry;
    // Страна Польша
    @FindBy(xpath = "//input[@data-filters-el='country-76']/../..")
    private WebElement polshaCountry;
    // Страна Румыния
    @FindBy(xpath = "//input[@data-filters-el='country-78']/../..")
    private WebElement rumyniyaCountry;
    // Страна Сингапур
    @FindBy(xpath = "//input[@data-filters-el='country-81']/../..")
    private WebElement singapurCountry;
    // Страна Тайвань
    @FindBy(xpath = "//input[@data-filters-el='country-82']/../..")
    private WebElement tayvanCountry;
    // Страна Таиланд
    @FindBy(xpath = "//input[@data-filters-el='country-83']/../..")
    private WebElement tailandCountry;
    // Страна Тунис
    @FindBy(xpath = "//input[@data-filters-el='country-84']/../..")
    private WebElement tunisCountry;
    // Страна Турция
    @FindBy(xpath = "//input[@data-filters-el='country-85']/../..")
    private WebElement turciyaCountry;
    // Страна Уругвай
    @FindBy(xpath = "//input[@data-filters-el='country-87']/../..")
    private WebElement urugvayCountry;
    // Страна Филиппины
    @FindBy(xpath = "//input[@data-filters-el='country-88']/../..")
    private WebElement filippinyCountry;
    // Страна Финляндия
    @FindBy(xpath = "//input[@data-filters-el='country-89']/../..")
    private WebElement finlyandiyaCountry;
    // Страна Франция
    @FindBy(xpath = "//input[@data-filters-el='country-90']/../..")
    private WebElement franciyaCountry;
    // Страна Чехия
    @FindBy(xpath = "//input[@data-filters-el='country-92']/../..")
    private WebElement chehiyaCountry;
    // Страна Чили
    @FindBy(xpath = "//input[@data-filters-el='country-93']/../..")
    private WebElement chiliCountry;
    // Страна Швейцария
    @FindBy(xpath = "//input[@data-filters-el='country-94']/../..")
    private WebElement shveycariyaCountry;
    // Страна Швеция
    @FindBy(xpath = "//input[@data-filters-el='country-95']/../..")
    private WebElement shveciyaCountry;
    // Страна Южная Корея
    @FindBy(xpath = "//input[@data-filters-el='country-97']/../..")
    private WebElement yuzhnayaKoreyaCountry;
    // Страна Япония
    @FindBy(xpath = "//input[@data-filters-el='country-98']/../..")
    private WebElement yaponiyaCountry;
    // Страна СССР
    @FindBy(xpath = "//input[@data-filters-el='country-99']/../..")
    private WebElement sssrCountry;
    // Страна Нидерланды
    @FindBy(xpath = "//input[@data-filters-el='country-100']/../..")
    private WebElement niderlandyCountry;
    // Страна ОАЭ
    @FindBy(xpath = "//input[@data-filters-el='country-101']/../..")
    private WebElement oaeCountry;
    // Страна ЮАР
    @FindBy(xpath = "//input[@data-filters-el='country-102']/../..")
    private WebElement yuarCountry;
    // Страна Словакия
    @FindBy(xpath = "//input[@data-filters-el='country-108']/../..")
    private WebElement slovakiyaCountry;

    // Год 18-21
    @FindBy(xpath = "//input[@data-filters-el='year-29']/../..")
    private WebElement year18_20;
    // Год 14-18
    @FindBy(xpath = "//input[@data-filters-el='year-30']/../..")
    private WebElement year14_18;
    // Год 2000-14
    @FindBy(xpath = "//input[@data-filters-el='year-31']/../..")
    private WebElement year2000_14;
    // Год 2000
    @FindBy(xpath = "//input[@data-filters-el='year-32']/../..")
    private WebElement year2000;

    // Аудио Українська
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-282']/../..")
    private WebElement ukrajinskaAudio;
    // Аудио Русский
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-281']/../..")
    private WebElement russkiyAudio;
    // Аудио English
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-283']/../..")
    private WebElement englishAudio;
    // Аудио Français
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-285']/../..")
    private WebElement francaisAudio;
    // Аудио Español
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-286']/../..")
    private WebElement espanolAudio;
    // Аудио Nihongo
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-288']/../..")
    private WebElement nihongoAudio;
    // Аудио Italiano
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-289']/../..")
    private WebElement italianoAudio;
    // Аудио Deutsch
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-290']/../..")
    private WebElement deutschAudio;
    // Аудио Zhōngwén
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-292']/../..")
    private WebElement zhongwenAudio;
    // Аудио Svenska
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-294']/../..")
    private WebElement svenskaAudio;
    // Аудио Korean
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-298']/../..")
    private WebElement koreanAudio;
    // Аудио Norsk
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-299']/../..")
    private WebElement norskAudio;
    // Аудио Українська (Тифлокоментар)
    @FindBy(xpath = "//input[@data-filters-el='audiotrack-303']/../..")
    private WebElement ukrajinskaTyphloAudio;



    public FiltersInMovieNoAuth() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }


    public WebElement getFiltersButtonMobile(){
        return filtersButtonMobile;
    }

    public WebElement getGenreFilter(){
        return genreFilter;
    }

    public WebElement getCountryFilter(){
        return countryFilter;
    }

    public WebElement getYearFilter(){
        return yearFilter;
    }

    public WebElement getAudioFilter(){
        return audioFilter;
    }

    public WebElement getKomedyGenre(){
        return komedyGenre;
    }

    public WebElement getBoevikiGenre(){
        return boevikiGenre;
    }

    public WebElement getDetektivyGenre(){
        return detektivyGenre;
    }

    public WebElement getFantastikaGenre(){
        return fantastikaGenre;
    }

    public WebElement getDramyGenre(){
        return dramyGenre;
    }

    public WebElement getSemeynyeGenre(){
        return semeynyeGenre;
    }

    public WebElement getUzhasyGenre(){
        return uzhasyGenre;
    }

    public WebElement getOnlaynShkolaGenre(){
        return onlaynShkolaGenre;
    }

    public WebElement getSerialyGenre(){
        return serialyGenre;
    }

    public WebElement getPriklyucheniyaGenre(){
        return priklyucheniyaGenre;
    }

    public WebElement getTrilleryGenre(){
        return trilleryGenre;
    }

    public WebElement getMelodramyGenre(){
        return melodramyGenre;
    }

    public WebElement getKriminalGenre(){
        return kriminalGenre;
    }

    public WebElement getFenteziGenre(){
        return fenteziGenre;
    }

    public WebElement getSportivnyeGenre(){
        return sportivnyeGenre;
    }

    public WebElement getIstoricheskieGenre(){
        return istoricheskieGenre;
    }

    public WebElement getBiografiyaGenre(){
        return biografiyaGenre;
    }

    public WebElement getArtHausGenre(){
        return artHausGenre;
    }

    public WebElement getDetskieGenre(){
        return detskieGenre;
    }

    public WebElement getMultfilmyGenre(){
        return multfilmyGenre;
    }

    public WebElement getVoennyeGenre(){
        return voennyeGenre;
    }

    public WebElement getPeredachIShouGenre() {
        return peredachIShouGenre;
    }

    public WebElement getUltraHdGenre() {
        return ultraHdGenre;
    }

    public WebElement getVideoInstrukciiGenre() {
        return videoInstrukciiGenre;
    }

    public WebElement getKarantinInfoGenre() {
        return karantinInfoGenre;
    }

    public WebElement getDokumentalnyyGenre() {
        return dokumentalnyyGenre;
    }

    public WebElement getSpektaklGenre() {
        return spektaklGenre;
    }

    public WebElement getMyuziklyGenre(){
        return myuziklyGenre;
    }

    public WebElement getMoreCountryButton() {
        return moreCountryButton;
    }

    public WebElement getUsaCountry() {
        return usaCountry;
    }

    public WebElement getUkraineCountry() {
        return ukraineCountry;
    }

    public WebElement getRussiaCountry() {
        return russiaCountry;
    }

    public WebElement getAvstraliyaCountry() {
        return avstraliyaCountry;
    }

    public WebElement getAvstriyaCountry() {
        return avstriyaCountry;
    }

    public WebElement getArgentinaCountry() {
        return argentinaCountry;
    }

    public WebElement getBelarusCountry() {
        return belarusCountry;
    }

    public WebElement getBelgiyaCountry() {
        return belgiyaCountry;
    }

    public WebElement getBolgariyaCountry() {
        return bolgariyaCountry;
    }

    public WebElement getBraziliyaCountry() {
        return braziliyaCountry;
    }

    public WebElement getVelikobritaniyaCountry() {
        return velikobritaniyaCountry;
    }

    public WebElement getVengriyaCountry() {
        return vengriyaCountry;
    }

    public WebElement getGermaniyaCountry() {
        return germaniyaCountry;
    }

    public WebElement getGonkongCountry() {
        return gonkongCountry;
    }

    public WebElement getGreciyaCountry() {
        return greciyaCountry;
    }

    public WebElement getDaniyaCountry() {
        return daniyaCountry;
    }

    public WebElement getIzrailCountry() {
        return izrailCountry;
    }

    public WebElement getIndiyaCountry() {
        return indiyaCountry;
    }

    public WebElement getIranCountry() {
        return iranCountry;
    }

    public WebElement getIrlandiyaCountry() {
        return irlandiyaCountry;
    }

    public WebElement getIslandiyaCountry() {
        return islandiyaCountry;
    }

    public WebElement getIspaniyaCountry() {
        return ispaniyaCountry;
    }

    public WebElement getItaliyaCountry() {
        return italiyaCountry;
    }

    public WebElement getKazahstanCountry() {
        return kazahstanCountry;
    }

    public WebElement getKanadaCountry() {
        return kanadaCountry;
    }

    public WebElement getKitayCountry() {
        return kitayCountry;
    }

    public WebElement getLatviyaCountry() {
        return latviyaCountry;
    }

    public WebElement getLitvaCountry() {
        return litvaCountry;
    }

    public WebElement getLyuksemburgCountry() {
        return lyuksemburgCountry;
    }

    public WebElement getMeksikaCountry() {
        return meksikaCountry;
    }

    public WebElement getNovayaZelandiyaCountry() {
        return novayaZelandiyaCountry;
    }

    public WebElement getNorvegiyaCountry() {
        return norvegiyaCountry;
    }

    public WebElement getPeruCountry() {
        return peruCountry;
    }

    public WebElement getPolshaCountry() {
        return polshaCountry;
    }

    public WebElement getRumyniyaCountry() {
        return rumyniyaCountry;
    }

    public WebElement getSingapurCountry() {
        return singapurCountry;
    }

    public WebElement getTayvanCountry() {
        return tayvanCountry;
    }

    public WebElement getTailandCountry() {
        return tailandCountry;
    }

    public WebElement getTunisCountry() {
        return tunisCountry;
    }

    public WebElement getTurciyaCountry() {
        return turciyaCountry;
    }

    public WebElement getUrugvayCountry() {
        return urugvayCountry;
    }

    public WebElement getFilippinyCountry() {
        return filippinyCountry;
    }

    public WebElement getFinlyandiyaCountry() {
        return finlyandiyaCountry;
    }

    public WebElement getFranciyaCountry() {
        return franciyaCountry;
    }

    public WebElement getChehiyaCountry() {
        return chehiyaCountry;
    }

    public WebElement getChiliCountry() {
        return chiliCountry;
    }

    public WebElement getShveycariyaCountry() {
        return shveycariyaCountry;
    }

    public WebElement getYuzhnayaKoreyaCountry() {
        return yuzhnayaKoreyaCountry;
    }

    public WebElement getYaponiyaCountry() {
        return yaponiyaCountry;
    }

    public WebElement getSssrCountry() {
        return sssrCountry;
    }

    public WebElement getNiderlandyCountry() {
        return niderlandyCountry;
    }

    public WebElement getOaeCountry() {
        return oaeCountry;
    }

    public WebElement getYuarCountry() {
        return yuarCountry;
    }

    public WebElement getSlovakiyaCountry() {
        return slovakiyaCountry;
    }

    public WebElement getShveciyaCountry(){
        return shveciyaCountry;
    }

    public WebElement getYear18_20() {
        return year18_20;
    }

    public WebElement getYear14_18() {
        return year14_18;
    }

    public WebElement getYear2000_14() {
        return year2000_14;
    }

    public WebElement getYear2000() {
        return year2000;
    }

    public WebElement getUkrajinskaAudio() {
        return ukrajinskaAudio;
    }

    public WebElement getRusskiyAudio() {
        return russkiyAudio;
    }

    public WebElement getEnglishAudio() {
        return englishAudio;
    }

    public WebElement getFrancaisAudio() {
        return francaisAudio;
    }

    public WebElement getEspanolAudio() {
        return espanolAudio;
    }

    public WebElement getNihongoAudio() {
        return nihongoAudio;
    }

    public WebElement getItalianoAudio() {
        return italianoAudio;
    }

    public WebElement getDeutschAudio() {
        return deutschAudio;
    }

    public WebElement getZhongwenAudio() {
        return zhongwenAudio;
    }

    public WebElement getSvenskaAudio() {
        return svenskaAudio;
    }

    public WebElement getKoreanAudio() {
        return koreanAudio;
    }

    public WebElement getNorskAudio() {
        return norskAudio;
    }

    public WebElement getUkrajinskaTyphloAudio() {
        return ukrajinskaTyphloAudio;
    }
}
