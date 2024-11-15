package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static constants.Constants.*;

public class DriverProvider {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage");
            System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
//            System.setProperty(SYSTEM_PROPERTY_FIREFOX_DRIVER, PATH_TO_FIREFOX_DRIVER);
            driver = new ChromeDriver(options);
//              driver = new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriver getDriverMobile(){
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("user-agent=\"Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1\"");
            System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
//            System.setProperty(SYSTEM_PROPERTY_FIREFOX_DRIVER, PATH_TO_FIREFOX_DRIVER);
            driver = new ChromeDriver(options);
//              driver = new FirefoxDriver();
        }
        return driver;
    }



    public static void removeDriver(){
        driver = null;
    }

}
