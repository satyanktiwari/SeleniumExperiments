package CucumberExamples.SecondCucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html-reports"},
        features="E:\\gitrepo\\SeleniumExperiments\\src\\test\\java\\CucumberExamples\\SecondCucumberTest\\BackgroundSample.feature",
        glue = {"CucumberExamples/SecondCucumberTest"}//,
//        monochrome = false
)
public class BackGroundSampleRunner {

}
