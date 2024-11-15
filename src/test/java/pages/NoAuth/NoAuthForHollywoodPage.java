package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NoAuthForHollywoodPage {
    WebDriver driver;


    // Блок баннера
    @FindBy(xpath = "//section[@class='hw-banner lozad']")
    private WebElement bannerBlock;

    // Блок с текстом
    @FindBy(xpath = "//section[@class='hw-about']")
    private WebElement aboutTextBlock;

    // Блок как родился проект
    @FindBy(xpath = "//section[@class='hw-how lozad']")
    private WebElement howRiseBlock;

    // Блок с нами в проекте
    @FindBy(xpath = "//section[@class='hw-who lozad']")
    private WebElement withOurProjectBlock;

    // Крутой контент
    @FindBy(xpath = "//section[@class='hw-studios lozad']")
    private WebElement bestContentBlock;



    public NoAuthForHollywoodPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getBannerBlock() {
        return bannerBlock;
    }

    public WebElement getAboutTextBlock() {
        return aboutTextBlock;
    }

    public WebElement getHowRiseBlock() {
        return howRiseBlock;
    }

    public WebElement getWithOurProjectBlock() {
        return withOurProjectBlock;
    }

    public WebElement getBestContentBlock() {
        return bestContentBlock;
    }

}