package methods;

import driver.DriverProvider;
import org.openqa.selenium.By;

public class CloseStgPanel {

    public void closeStgPanel(){
        if (DriverProvider.getDriver().findElement(By.xpath("//a[@class='phpdebugbar-close-btn']")).isDisplayed() == true){
            DriverProvider.getDriver().findElement(By.xpath("//a[@class='phpdebugbar-close-btn']")).click();
        }
    }
}
