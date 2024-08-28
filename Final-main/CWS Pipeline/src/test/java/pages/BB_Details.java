package pages;

import utility.BrowserDriver;
import utility.TestData;
import utility.XPathConstants;

import java.io.IOException;
import java.time.Duration;

public class BB_Details extends BrowserDriver {

    public static void  BB_Details_Validation()throws IOException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.BB_First_Row);
    }
}