package com.grid;

import com.utils.Constants;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class gridChromeSample {

    WebDriver driver;
    String baseUrl, nodeUrl;
    @BeforeTest

    public void setUP() throws MalformedURLException{
        baseUrl = "https://google.co.in";
        nodeUrl = "http://192.168.56.1:4444/wd/hub";
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverpath);
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        String platform =  capability.getPlatform().toString();
        System.out.println("paltform is ===========platform"+ platform);
        capability.setPlatform(Platform.ANY);
        driver = new RemoteWebDriver(new URL(nodeUrl), capability);


    }

    @AfterTest

    public void teardown(){
        driver.quit();
    }

    @Test

    public void simpletest(){
        driver.get(baseUrl);
        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
