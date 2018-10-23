# SeleniumExperiments


Project for creating an experimental framework to try out various features available for implementaion using webdriver 3
 
This project implements

`BDD using Cucumber`

`ExtentReports`

`Selemium Grid`

`TestNg framework`

commands for invoking grid:

**Steps for starting server**

Go to the directory containing server-standaolone file and launch cmd
run the following command to bring up the hub

    java -jar selenium-server-standalone-<version Nmumber>.jar -role hub

**Steps for starting Hub**

Then either on machine B or same machine Go to the directory containing server-standaolone file, and launch cmd
Run the following command


    
   **Interesting read
    https://rationaleemotions.wordpress.com/2012/01/23/setting-up-grid2-and-working-with-it/**

    java -Dwebdriver.gecko.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\geckodriver.exe" -jar selenium-server-standalone-<version number>.jar -role webdriver -hub http://<Ip address of the hub obtained from the 1st step>:4444/grid/register -port 5566

This is for chrome
`java -Dwebdriver.chrome.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\chromedriver.exe" -jar selenium-server-standalone-3.14.0.jar -role webdriver -hub http://192.168.56.1:4444/grid/register -port 5566`
