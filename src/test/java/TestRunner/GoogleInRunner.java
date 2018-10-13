package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:CucumberReports"},
        features="Features",
        glue = {"StepDefinition"},
        monochrome = false
)
public class GoogleInRunner {

}
