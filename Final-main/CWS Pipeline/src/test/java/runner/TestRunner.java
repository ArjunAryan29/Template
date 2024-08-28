package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import utility.BrowserDriver;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,features= "src/test/java/features/CWSLogin.feature",
        glue={"StepDefinition","hooks"},
        plugin={"pretty","html:target/cucumber-html-report","json:target/CucumberReports/Report.json",
                "junit:target/cucumberReports/Report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"    },
        monochrome = true
)
public class TestRunner extends BrowserDriver {

}