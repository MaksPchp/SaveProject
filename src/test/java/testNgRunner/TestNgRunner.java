package testNgRunner;

import driver.DriverProvider;
import io.qameta.allure.Attachment;
import methods.CookieForVpn;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNgRunner {


    @BeforeMethod
    public void beforeTest(){
        DriverProvider.getDriver();
        DriverProvider.getDriver().manage().window().maximize();
//        CookieForVpn cookieForVpn = new CookieForVpn();
//        cookieForVpn.cookieForVpn();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result) {
        if (!result.isSuccess()){
            makeScreenshot();
        }
            DriverProvider.getDriver().close();
            DriverProvider.getDriver().quit();
            DriverProvider.removeDriver();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot(){
        return ((TakesScreenshot) DriverProvider.getDriver()).getScreenshotAs(OutputType.BYTES);
    }


}
