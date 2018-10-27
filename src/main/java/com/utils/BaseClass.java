package com.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
    public WebDriver driver = null;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeClass
    public void setUP() {
        report = new ExtentReports(Constants.htmlReportName, true);

        test = report.startTest("Go to google.in");

        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverpath);
        driver = new ChromeDriver();
        test.log(LogStatus.INFO, "Chrome started");
        driver.get("https://google.co.in");
    }
    @AfterClass

    public void tearDown(){
        report.endTest(test);
        report.flush();
        driver.close();
    }

}
