
package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static pages.BB_Details.BB_Details_Validation;
import static pages.CWS_Login.*;
import static utility.BrowserDriver.driver;

public class BBSteps {

    @Then("Check the Blood bank details are available for the entered crn number")
    public void CheckBBDetails() throws Throwable  {
        BB_Details_Validation();
    }


}
