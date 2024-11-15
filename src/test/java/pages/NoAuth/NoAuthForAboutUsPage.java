package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthForAboutUsPage {
    WebDriver driver;

    // Блок баннера
    @FindBy(xpath = "//section[@class='about-banner lozad']")
    private WebElement bannerBlock;

    // Блок мы одни из лидеров
    @FindBy(xpath = "//section[@class='about-we']")
    private WebElement weLidersBlock;

    // Блок почему мы
    @FindBy(xpath = "//section[@class='why']")
    private WebElement whyMeBlock;

    // Блок каналы
    @FindBy(xpath = "//section[@class='channels channel_online about-channels lozad']")
    private WebElement channelsBlock;

    // Блок премиальные каналы
    @FindBy(xpath = "//section[@class='channels2 channel_online']")
    private WebElement premiumBlock;

    // Блок библиотека
    @FindBy(xpath = "//section[@class='library lozad']")
    private WebElement libraryBlock;

    // Блок лучшие фильмы
    @FindBy(xpath = "//section[@class='quality topfilm lozad slide-l active']")
    private WebElement bestCinemaBlock;

    // Блок тарифы
    @FindBy(xpath = "//section[@class='tarifs']")
    private WebElement tariffsBlock;


    public NoAuthForAboutUsPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }


    public WebElement getBannerBlock() {
        return bannerBlock;
    }

    public WebElement getWeLidersBlock() {
        return weLidersBlock;
    }

    public WebElement getWhyMeBlock() {
        return whyMeBlock;
    }

    public WebElement getChannelsBlock() {
        return channelsBlock;
    }

    public WebElement getPremiumBlock() {
        return premiumBlock;
    }

    public WebElement getLibraryBlock() {
        return libraryBlock;
    }

    public WebElement getBestCinemaBlock() {
        return bestCinemaBlock;
    }

    public WebElement getTariffsBlock() {
        return tariffsBlock;
    }
}
