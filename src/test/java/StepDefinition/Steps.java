package StepDefinition;

import com.relevantcodes.extentreports.LogStatus;
import com.utils.Constatnts;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver = null;
    @Given("^chrome driver is open$")
    public void chrome_driver_is_open()throws Throwable	{
        System.setProperty("webdriver.chrome.driver", Constatnts.chromeDriverpath);
        driver = new ChromeDriver();
    }

    @When("^url is entered$")
    public void url_is_entered()throws Throwable	{
        driver.get("https://google.co.in");

    }

    @Then("^title contains google$")
    public void title_contains_google()throws Throwable	{
        driver.get("https://google.co.in");
        String title = driver.getTitle();
        System.out.println(title+ " *******************");
        if (title.contains("Google")){
            System.out.println("PASSSSSSSSSSSS");
        }else {
            System.out.println("Failllllllll");
        }

        driver.close();
    }
}
