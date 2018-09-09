Feature: Login into leaftap application
Scenario: Positive flow for login
Given Launch the browser
And Maximize the browser
And set the timeouts
And enter the URL
And enter the username DemoSalesManager
And enter the password crmsfa
When click on the login button 
Then verify login is successful
And click on link 
And click on create lead
And add company name CTS
And add first name Ash
And add last name wini
And click on submit