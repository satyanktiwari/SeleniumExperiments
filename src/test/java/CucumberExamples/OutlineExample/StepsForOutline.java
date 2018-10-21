package CucumberExamples.OutlineExample;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsForOutline {
    private WebDriver driver;
    ExtentReports report;
    ExtentTest test;
    @Before
    public void setUp(){
        report = new ExtentReports(Constants.extentReportPath, true);
        test = report.startTest("Scenario outline example for cucumber");
        System.setProperty("webdriver.chrome.driver",Constants.chromeDriverpath);
        driver = new ChromeDriver();
        test.log(LogStatus.INFO,"browser launched");
        }



@After
    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.close();
}



}
