package com.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.BaseClass;
import com.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsingBaseClass extends BaseClass {



    @Test
    public void firstTest()throws Exception {
        driver.get("https://google.co.in");
        String title = driver.getTitle();
        if (title.contains("Google")){
            test.log(LogStatus.PASS,"verify Title of the page contains " + title);
        }else {
            test.log(LogStatus.FAIL, "verify Title of the page");
        }
    }


}
