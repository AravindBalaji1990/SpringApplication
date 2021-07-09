This is a automation project for PetClinic. The autoamtion project has used the page object model for automation of the functionalities on the application. Below are the fucntionalities covered,

1.Add owner ,edit the owner and view the details of the owner.
2.Check the veterinarians available.
3.Add pet to the existing owner, provide an appointment to visit and check the history of the pet visit.
4.Verificaiton on dashboard for Welcome message and logo has also been implemented.

What are the Technologies used?
The technoloigy used to implement the automation framework are as below,
1.Selenium Webdriver version 3.141.59
2.Cucumber - we went for io.cucumber version 4.8.1
3.Reporting - we used the extent report plugin  in cucumber runner file. Cucumber adapter version 4
4.Maven - Build management tool

The framework is based on Page object model. Where we define the object/elements from each page as a seprate java file and the busisness login for the elements has been handled in separate java file. Finally we integrate the files based on functionality in package "comstepdefinitionpetclinic" where we ahave 3 different java files based on functionality and we have a testRunner File.


How do I execute the Automation Script?

1.Download the zip file
2.Extract the package
3.Import the package in Eclipe
4.Open the terminal navigate to the path of pom.xml
5.Execute the command "mvn clean"
6.Execute the command "mvn test" or "mvn install"
7.if any issue try to do a maven update from the eclipse which we imported in step 3

How to View the Report?
1.After the script Runs 
2.Refresh the project we see a folder "test-output\HtmlReport\ExtentHtml.html" in the project path
3.Open the ExtentHtml.html which will launch the pass/fail results
