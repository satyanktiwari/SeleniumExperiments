package com.grid;

import com.utils.BaseClassGrid;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridChromeOptionsUsingbase extends BaseClassGrid {



    @Test
    public  void test(){
        driver.get("https://www.freecrm.com/features.html");
        driver.getTitle();
    }


}
