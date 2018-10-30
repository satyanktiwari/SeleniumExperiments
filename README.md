# SeleniumExperiments


Project for creating an experimental framework to try out various features available for implementaion using webdriver 3
 
This project implements

`BDD using Cucumber`

`ExtentReports`

`Selemium Grid`

`TestNg framework`

Selenium Grid Architecture
![Alt text](Resources/images/GridArchitecture.jpg?raw=true "Selenium Grid Architecture")

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

Following command is required when only geckoDriver is needed

    java -Dwebdriver.gecko.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\geckodriver.exe" -jar selenium-server-standalone-<version number>.jar -role webdriver -hub http://<Ip address of the hub obtained from the 1st step>:4444/grid/register -port 5566

Following command is required when only chromeDriver is needed

_`java -Dwebdriver.chrome.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\chromedriver.exe" -jar selenium-server-standalone-3.14.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5566`_

Use the following for both firefox and chrome

_`java -Dwebdriver.chrome.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\chromedriver.exe" -Dwebdriver.gecko.driver="E:\gitrepo\SeleniumExperiments\Resources\BrowserDriver\geckodriver.exe" -jar selenium-server-standalone-3.14.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5566 `_


**testNg Cucumber Runner:**

Make sure all the cucumber related jars are of the same version
e.g. in the pom all version are 1.2.5
 
Check by running the following command in the Terminal and then search for cucumber in the output

_`mvn dependency:tree`_