package com.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClassGrid {
    public WebDriver driver;



    @BeforeClass
    public  void setUP()throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setPlatform(Platform.ANY);
        capability.setBrowserName("chrome");

        ChromeOptions options = new ChromeOptions();
        options.merge(capability);
        String hubUrl;
        hubUrl = "http://localhost:4444/wd/hub";

        driver = new RemoteWebDriver(new URL(hubUrl), options);
    }

    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
}
