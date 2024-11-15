package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CabinetPage {
    WebDriver driver;

    // Кнопка настроить родительский контроль
    @FindBy(xpath = "//a[@class='lk-bill-pay lk-parent__btn ng-scope']")
    private WebElement settingParentalControlsButton;
    // Кнопка выйти из кабинета
    @FindBy(xpath = "//div[@class='person-logOut']")
    private WebElement logOutButton;
    // Текст пополнение счета в модальном окне Оплата
    @FindBy(xpath = "//h1[@translate='PLATON.TITLE']")
    private WebElement textPopolnenieSchetaModalPay;
    // Кнопка удалить фильм из избранного
    @FindBy(xpath = "//section[@id='favoriteM_desktop']//a[@class='delete']")
    private WebElement deleteFilmFromFavorite;

    public CabinetPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getSettingParentalControlsButton(){
        return settingParentalControlsButton;
    }

    public WebElement getLogOutButton(){
        return logOutButton;
    }

    public WebElement getTextPopolnenieSchetaModalPay(){
        return textPopolnenieSchetaModalPay;
    }

    public WebElement getDeleteFilmFromFavorite(){
        return deleteFilmFromFavorite;
    }
}
