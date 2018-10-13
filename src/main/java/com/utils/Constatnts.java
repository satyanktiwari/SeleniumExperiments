package com.utils;

import java.io.File;

public class Constatnts {

    public static final String driverBasePath = new File("").getAbsoluteFile().toString()+ File.separator + "Resources"+ File.separator + "BrowserDriver" + File.separator;
    public static final String chromeDriverpath = driverBasePath + "chromedriver.exe";
    public static final String externtReportPath = new File("").getAbsoluteFile().toString()+ File.separator + "ExtentResult"+ File.separator;
    public static final String htmlReportName = externtReportPath + "automationreport.html";
}
