package CucumberExamples.FirstCucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html-reports"},
        features="E:\\gitrepo\\SeleniumExperiments\\src\\test\\java\\CucumberExamples\\FirstCucumberTest\\FirstcucumberTest.feature",
        glue = {"CucumberExamples/FirstCucumberTest"}//,
//        monochrome = false
)
public class GoogleInRunnerTest {

}
