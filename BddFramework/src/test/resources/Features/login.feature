Feature: Login page automaation of sauce demo app
Scenario Outline: Check login is successful with valid creds
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page
And Close the browser

Examples:
|	username |	password	|
|	standard_user |	secret_sauce	|