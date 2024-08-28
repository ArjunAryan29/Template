
package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static pages.CWS_Login.*;
import static utility.BrowserDriver.driver;

public class CWSSteps {
    @Given("I enter the URL using <{string}>")
    public void openBrowser(String browser)  throws Throwable  {
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            case "edge":
//                driver = new EdgeDriver();
//                break;
//        }
        BrowserDriver.openBrowser(browser);
        driver.get("https://7a601devcwsiis1.cymru.nhs.uk:2048/ABUHB.CWS");
        driver.manage().window().maximize();
        System.out.println("Title of the page:" + driver.getTitle());
    }


    @When("I enter the username and password and click on login")
    public void iEnterCreds() throws Throwable  {
        Login_CWS();
    }

    @Then("I enter the {string} number in homepage")
    public void EnterCRN(String CRN) throws Throwable  {
        Enter_CRN(CRN);
    }

    @Then("click on Blood bank button")
    public void ClickBB() throws Throwable  {
        Click_BB();
    }

    @Then("I am successfully logged in")
    public void CWS_HomePage() throws Throwable  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }
}
