package com.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {

    WebDriver driver;
    ExtentReports report;
    ExtentTest test;

    @BeforeTest
    public void setUp() {
        report = new ExtentReports(Constants.htmlReportName, true);
        test = report.startTest("launch gmail");
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverpath);
        driver = new ChromeDriver();
        test.log(LogStatus.INFO, "Browser launched");
    }

    @Test

    public void launchGmail() {
        driver.get("https://gmail.com");
        String Title = driver.getTitle();
        test.log(LogStatus.INFO, "Title is " + Title);
        if (Title.contains("Gmail")) {
            test.log(LogStatus.PASS,"Test passed, Title contains " + Title);
        } else {
            test.log(LogStatus.FAIL,"Test failed, Title does not contain "+ Title);
        }

    }

    @AfterTest

    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.close();
    }
}
