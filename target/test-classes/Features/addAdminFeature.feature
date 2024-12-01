Feature: Add admin user
Scenario Outline: Add a new admin user with valid credentials

Given User login with <loginUserName> and <LoginPassWord>
When user on dashboard screen
And User clicks on admin button at side bar menu
And User clicks on add button
And User enter <EmployeeName> and <UserName> and <PASSWORD> and <CONFIRMPASSWORD>
And user clicks on save button


Examples:
|loginUserName|LoginPassWord|EmployeeName|UserName|PASSWORD|CONFIRMPASSWORD|
<<<<<<< HEAD
|Admin|admin123|manda akhil user|Madboly|510520@Mm|510520@Mm|
=======
|Admin|admin123|Orange  Test|Madboly|510520@Mm|510520@Mm|
>>>>>>> 38c31ebd15f3914b0373ef2902f4b2a87981f39b
