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

    java -Dwebdriver.gecko.driver="path to gecko driver\geckodriver.exe" -jar selenium-server-standalone-<version number>.jar -role webdriver -hub http://<Ip address of the hub obtained from the 1st step>:4444/grid/register -port <5566 or any port which is free>