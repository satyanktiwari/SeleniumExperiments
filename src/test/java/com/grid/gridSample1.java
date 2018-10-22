package com.grid;

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

public class gridSample1 {

    WebDriver driver;
    String baseUrl, nodeUrl;
    @BeforeTest

    public void setUP() throws MalformedURLException{
        baseUrl = "https://google.co.in";
        nodeUrl = "http://192.168.56.1:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
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
        Assert.assertEquals("google",driver.getTitle());
    }
}
