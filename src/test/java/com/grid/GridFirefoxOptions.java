package com.grid;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridFirefoxOptions {

     static WebDriver driver;



    @BeforeClass

    public static void setUP()throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setPlatform(Platform.ANY);
        capability.setBrowserName("chrome");

        FirefoxOptions options = new FirefoxOptions();
        options.merge(capability);
        String hubUrl;
            hubUrl = "http://localhost:4444/wd/hub";

            driver = new RemoteWebDriver(new URL(hubUrl), options);
    }

    @Test
    public  void test(){
        driver.get("https://www.freecrm.com/features.html");
        driver.getTitle();
    }
@AfterClass
    public static void tearDown(){
        driver.quit();
}

}
