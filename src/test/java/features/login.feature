Feature: Login into Application

Scenario Outline: Positive test validating login
Given Nitialiaze the Browser with Chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on Login link in home page to land on Secure sing in Page
When User enters <username> and <password> and logs in
Then Verify that user successfully logged in
And close browser

Examples:
|username           |password|
|test99@gmail.com   |123456  |
|test123@gmail.com  |12345   |