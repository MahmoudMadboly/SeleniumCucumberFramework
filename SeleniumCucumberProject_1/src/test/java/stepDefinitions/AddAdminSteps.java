package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddAdminPage;
import pages.DashboardPage;
import tests.TestBase;

public class AddAdminSteps {

	WebDriver driver = TestBase.driver;
	DashboardPage DashboardPageObject;
	AddAdminPage AddAdminPageObject;
	

	@Given("User on dashboard screen")
	public void user_on_dashboard_screen() {
		
		driver.getTitle().contains("Dashboard");
	}

	@When("User clicks on admin button at side bar menu")
	public void User_clicks_on_admin_button_at_side_bar_menu() {

		DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.clickOnAdminButton();
	}

	@And("User clicks on add button")
	public void User_clicks_on_add_button() {
		
		AddAdminPageObject = new AddAdminPage(driver);
		AddAdminPageObject.clickOnAddUserButton();
	}
	
	@And("^User enter (.*) and (.*) and (.*) and (.*) $")
	public void User_enter_user_info(String EmployeeName , String UserName , String PASSWORD , String CONFIRMPASSWORD ) {
		
		AddAdminPageObject = new AddAdminPage(driver);
		AddAdminPageObject.setReuiredInfo(EmployeeName, UserName, PASSWORD, CONFIRMPASSWORD);
	}
}

















