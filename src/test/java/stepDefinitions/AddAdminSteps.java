package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddAdminPage;
import pages.DashboardPage;
import pages.LoginPage;
import tests.TestBase;

public class AddAdminSteps {

	WebDriver driver = TestBase.driver;
	DashboardPage DashboardPageObject;
	AddAdminPage AddAdminPageObject;
	LoginPage LoginPageObject;
	

	@Given("^User login with (.*) and (.*)$")
	public void User_login_with_username_and_password(String loginUserName , String LoginPassWord) {
		
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.enterUserName(loginUserName);
		LoginPageObject.enterpassword(LoginPassWord);
		LoginPageObject.clickLogin();
	}
	
	@When("user on dashboard screen")
	public void user_on_dashboard_screen() {
		driver.getTitle().contains("Dashboard");
	}

	@And("User clicks on admin button at side bar menu")
	public void User_clicks_on_admin_button_at_side_bar_menu() {

		DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.clickOnAdminButton();
	}

	@And("User clicks on add button")
	public void User_clicks_on_add_button() {
		
		AddAdminPageObject = new AddAdminPage(driver);
		AddAdminPageObject.clickOnAddUserButton();
	}
	
	@And("^User enter (.*) and (.*) and (.*) and (.*)$")
	public void User_enter_user_info(String EmployeeName , String UserName , String PASSWORD , String CONFIRMPASSWORD ) throws InterruptedException{
		
		AddAdminPageObject.setReuiredInfo(EmployeeName, UserName, PASSWORD, CONFIRMPASSWORD);
	}
	
	@And("user clicks on save button")
	public void user_clicks_on_save_button() {
		
		AddAdminPageObject.userClicksOnSaveButton(); 
	}
}