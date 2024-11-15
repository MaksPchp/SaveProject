package pages.Modal;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalPlatonWindow {
    WebDriver driver;

    // окно платона
    @FindBy(xpath = "//div[@class='sweet-platon-infos row']")
    private WebElement platonWindow;
    // максимальная сумма 999999
    @FindBy(xpath = "//span[text()='999999 грн']")
    private WebElement maxSum;

    public ModalPlatonWindow() {
        this.driver = DriverProvider.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebElement getPlatonWindow(){
        return platonWindow;
    }

    public WebElement getMaxSum(){
        return maxSum;
    }

}
