package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NoAuthForTvPristavkaPage {
    WebDriver driver;


    // Блок тв приставка
    @FindBy(xpath = "//section[@class='inxttv4-home inxttv4-home--new']")
    private WebElement tvPristavkaBlock;
    // Блок как получить
    @FindBy(xpath = "//section[@class='how-get']")
    private WebElement howGetBlock;
    // Преимущества блок
    @FindBy(xpath = "//section[@class='block-sec_pult block-sec_pult--new']")
    private WebElement advantagesBlock;
    // Андроид тв блок
    @FindBy(xpath = "//section[@class='block-sec_tv']")
    private WebElement androidTvBlock;
    // Блок спеши
    @FindBy(xpath = "//section[@class='hurry_up hurry_up--new']")
    private WebElement hurryUpBlock;



    public NoAuthForTvPristavkaPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getTvPristavkaBlock() {
        return tvPristavkaBlock;
    }

    public WebElement getHowGetBlock() {
        return howGetBlock;
    }

    public WebElement getAdvantagesBlock() {
        return advantagesBlock;
    }

    public WebElement getAndroidTvBlock() {
        return androidTvBlock;
    }

    public WebElement getHurryUpBlock() {
        return hurryUpBlock;
    }
}