Feature: Add admin user
Scenario Outline: Add a new admin user with valid credentials

Given User login with <loginUserName> and <LoginPassWord>
When user on dashboard screen
And User clicks on admin button at side bar menu
And User clicks on add button
And User enter <EmployeeName> and <UserName> and <PASSWORD> and <CONFIRMPASSWORD>
And user clicks on save button


Examples:
|loginUserName|LoginPassWord|EmployeeName|UserName |PASSWORD|CONFIRMPASSWORD|

|admin|admin123|Eunice Fleming|Madboly     |510520@Mm|510520@Mm  |
