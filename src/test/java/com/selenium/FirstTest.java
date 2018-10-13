package com.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.Constatnts;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    private WebDriver driver = null;
    ExtentReports report;
    ExtentTest test;

    @BeforeTest
    public void setUP() {
        report = new ExtentReports(Constatnts.htmlReportName, true);

        test = report.startTest("Go to google.in");

        System.setProperty("webdriver.chrome.driver", Constatnts.chromeDriverpath);
        driver = new ChromeDriver();
        test.log(LogStatus.INFO, "Chrome started");
    }


    @Test (priority = 1, enabled = true)
    public void firstTest() {
            driver.get("https://google.co.in");
            String title = driver.getTitle();
            System.out.println(title+ " *******************");
            if (title.contains("Google")){
                test.log(LogStatus.PASS,"verify Title of the page contains " + title);
            }else {
                test.log(LogStatus.FAIL, "verify Title of the page");
            }



//        System.out.println("test");
    }

    @AfterTest

    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.close();
    }
}
