package methods;

import driver.DriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Footer;

public class GoToDownPage {
    Footer footer = new Footer();

    public void goToDownPage(){
        for (int i = 1; footer.getTextContentSecurity().isDisplayed()  == false; i++ ){
            ((JavascriptExecutor) DriverProvider.getDriver()).executeScript("window.scrollBy(0,250)"); }
        new Actions(DriverProvider.getDriver()).moveToElement(footer.getTextContentSecurity()).perform();
    }
}
