package testNgRunner;

import driver.DriverProvider;
import io.qameta.allure.Attachment;
import methods.CookieForVpn;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgRunnerMobile {

    @BeforeMethod
    public void beforeTest(){
        DriverProvider.getDriverMobile();
        DriverProvider.getDriverMobile().manage().window().setSize(new org.openqa.selenium.Dimension(375, 900));
        CookieForVpn cookieForVpn = new CookieForVpn();
        cookieForVpn.cookieForVpnMobile();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result) {
        if (!result.isSuccess()){
            makeScreenshot();
        }
//        DriverProvider.getDriverMobile().quit();
//        DriverProvider.removeDriver();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot(){
        return ((TakesScreenshot) DriverProvider.getDriverMobile()).getScreenshotAs(OutputType.BYTES);
    }

}

