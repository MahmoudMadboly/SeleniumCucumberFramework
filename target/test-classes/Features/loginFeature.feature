Feature: Login to UMP

Scenario Outline: user login to UMP
Given User on login page
When user enter <username> and <password>
And user press on login button
Then screen should redirect to dashboard

Examples:
|username|password|
|admin|admin123|