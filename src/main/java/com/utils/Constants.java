package com.utils;

import java.io.File;

public class Constants {

    public static final String driverBasePath = new File("").getAbsoluteFile().toString()+ File.separator + "Resources"+ File.separator + "BrowserDriver" + File.separator;
    public static final String chromeDriverpath = driverBasePath + "chromedriver.exe";
    public static final String extentReportPath = new File("").getAbsoluteFile().toString()+ File.separator + "ExtentResult"+ File.separator;
    public static final String htmlReportName = extentReportPath + "automationreport.html";
}
