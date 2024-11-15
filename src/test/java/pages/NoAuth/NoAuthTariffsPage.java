package pages.NoAuth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoAuthTariffsPage {
    WebDriver driver;

    //Кнопка подключить на тарифе М
    @FindBy(xpath = "//span[@class='tariff__btn button']")
    private WebElement connectTariffMButton;

    public NoAuthTariffsPage() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getConnectTariffMButton(){
        return connectTariffMButton;
    }

}
