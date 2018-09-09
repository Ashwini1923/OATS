Feature: Login and create lead into leaftap application
#Background:
#Given Launch the browser
#And Maximize the browser
#And set the timeouts
#And enter the URL



Scenario Outline:: Positive flow for login
And enter the username DemoSalesManager
And enter the password crmsfa
When click on the login button 
And click on link 
And click on leads
And click on create lead
And add company name <Companyname>
And add first name <firstname>
And add last name <lastname>
And click on submit
Examples:
|Companyname|firstname|lastname|
|IBM|Tara|Abc|
|CTS|Ash|wini|


Scenario Outline: Negative flow for login
And enter the username <username>
And enter the password <password>
When click on the login button 
But login failed
Examples:
|username|password|
|demo|crmsf|
|demo2|crmsf1|