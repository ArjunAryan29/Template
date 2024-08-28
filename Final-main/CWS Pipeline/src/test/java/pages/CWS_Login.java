package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import utility.BrowserDriver;
import utility.XPathConstants;
import utility.TestData;

import java.io.IOException;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CWS_Login extends BrowserDriver {

    public static void Login_CWS() throws IOException {
        BrowserDriver.clickByXpath(driver,XPathConstants.Login_ID);
        BrowserDriver.clearText(driver,XPathConstants.Login_ID);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Login_ID,TestData.Username);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Password_CWS);
        BrowserDriver.clearText(driver,XPathConstants.Password_CWS);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Password_CWS,TestData.Password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Login_Btn);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public static void Success_Login_CWS() throws IOException {
        BrowserDriver.Text_Assertion(driver,XPathConstants.Home_Msg,TestData.Home_Msg);
    }

    public static void Enter_CRN(String CRN) throws IOException{
        BrowserDriver.clickByXpath(driver,XPathConstants.Patient_Search);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.CRN_Search);
        BrowserDriver.clearText(driver,XPathConstants.CRN_Search);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.CRN_Search,CRN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public static void Click_BB() throws IOException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Blood_Bank);
    }
}