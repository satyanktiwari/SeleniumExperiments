package CucumberExamples.SecondCucumberTest;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber/cucumber-html-reports",
                "json:target/cucumber/cucumber.json",
                "junit:target/cucumber/cucumber.xml",
                "rerun:target/cucumber/rerun.txt"
        },
        features = "C:\\Users\\p7105756\\IdeaProjects\\SeleniumExperiments\\src\\test\\java\\CucumberExamples\\SecondCucumberTest\\BackgroundSample.feature",
        glue = {"CucumberExamples/SecondCucumberTest"}//,
//        monochrome = false
)
public class testNgBackGroundRunnerTest extends AbstractTestNGCucumberTests {

}
