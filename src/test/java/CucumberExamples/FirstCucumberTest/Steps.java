package CucumberExamples.FirstCucumberTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
        private WebDriver driver = null;
        ExtentReports report;
        ExtentTest test;

        @Before
        public void setUp(){
            report = new ExtentReports(Constants.CucumberHtmlReportName,false);
            test = report.startTest("Running 2 scenarios");
            System.setProperty("webdriver.chrome.driver", Constants.chromeDriverpath);
            driver = new ChromeDriver();
        }


    @Given("^chrome driver is open$")
    public void chrome_driver_is_open()throws Throwable	{

        test.log(LogStatus.INFO,"Browser launched");
    }

    @When("^url is entered$")
    public void url_is_entered()throws Throwable	{
        driver.get("https://google.co.in");
        test.log(LogStatus.INFO,"Url entered");

    }

    @Then("^title contains google$")
    public void title_contains_google()throws Throwable	{
        driver.get("https://google.co.in");
        String title = driver.getTitle();
        if (title.contains("Google")){
            System.out.println("PASSSSSSSSSSSS");
            test.log(LogStatus.INFO,"Title is " + title);
            test.log(LogStatus.PASS, "Title contains "+ title);
        }else {
            System.out.println("Failllllllll");
            test.log(LogStatus.INFO,"Title is " + title);
            test.log(LogStatus.PASS, "Title does not contains "+ title);
        }


    }


    @Then("^title contains googleIndia$")
    public void title_contains_gmail() throws Throwable{
        driver.get("https://google.com");
        String title = driver.getTitle();
        if (title.contains("googleIndia")){
            test.log(LogStatus.INFO,"Title is " + title);
            test.log(LogStatus.PASS, "Title contains "+ title);
        }else{
            test.log(LogStatus.INFO,"Title is " + title);
            test.log(LogStatus.FAIL, "Title does not contains "+ title);
        }

    }

    @After
    public void tearDown(){
            report.endTest(test);
            report.flush();
        driver.close();
    }
}
