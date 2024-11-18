Feature: Add admin user
Scenario Outline: Add a new admin user with valid credentials

Given User on dashboard screen
When User clicks on admin button at side bar menu
And User clicks on add button
And User enter <EmployeeName> and <UserName> and <PASSWORD> and <CONFIRMPASSWORD>
And user clicks on save button
Then New admin added

Examples:
|EmployeeName|UserName|PASSWORD|CONFIRMPASSWORD|
|Mahmoud Elsayed|Madboly|510520@Mm|510520@Mm|
 