package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import pages.PageBase;
import tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoignSteps {

	WebDriver driver = TestBase.driver;
	pages.LoginPage loginObject; 
	
	@Given("User on login page")
	public void verifyLoginScreen() {
		
		driver.getTitle().equals("neoleap");
		System.out.println("i am on login screen");
	}
	
	@When("^user enter (.*) and (.*)$")
	public void user_enter_username(String username , String password) {
		loginObject = new pages.LoginPage(driver);
		loginObject.enterUserName(username);
		loginObject.enterpassword(password);
	}
	
	@And("user press on login button")
	public void user_press_on_login_button() {
		
		loginObject.clickLogin();
	}
	
	@Then("screen should redirect to dashboard")
	public void screen_should_redirect_to_dashboard() {
		
		driver.getTitle().equals("Dashboard");
	}
}