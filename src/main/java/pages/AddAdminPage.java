package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddAdminPage extends PageBase{


	public AddAdminPage(WebDriver driver) {
		super(driver);
	}

	public static By systemUserTitle = By.xpath("//h5 [text() = 'System Users']");
	protected static By addAdminButton = By.xpath("//button[text()=' Add ']");	
	By userRoleMenu = By.xpath("//div [text() = '-- Select --'][1]");
	//By userRole = By.xpath("//span [text() = 'Admin']");
	By userRole = By.xpath("//div [class = 'oxd-select-option'][2]");
	By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
	
	
	
	
	By userName = By.xpath("//input [class = 'oxd-input oxd-input--active']");
	By statusMenu = By.xpath("//div [text() = '-- Select --'][2]");
	By status = By.xpath("//span [text() = 'Enabled']");
	By password = By.xpath("//input [@type = 'password'][1]");
	By confirmPassword = By.xpath("//input [@type = 'password'][2]");
	By addUsertitle = By.xpath("//h6 [text() = 'Add User']");
	By addUserSaveButton = By.xpath("//button [text() = ' Save '");

	public void clickOnAddUserButton() {

		driver.findElement(addAdminButton).click();
	}

	public void setReuiredInfo (String employee_Name , String user_name , String pass_word , String confirm_password) {

		waitSomeTime(ExpectedConditions.presenceOfElementLocated(addUsertitle), 3);
		driver.findElement(employeeName).sendKeys(employee_Name);
		driver.findElement(userRoleMenu).click();
		waitSomeTime(ExpectedConditions.elementToBeClickable(userRole), 3);
		driver.findElement(userRole).click();
		driver.findElement(statusMenu).click();
		driver.findElement(status).click();
		driver.findElement(userName).sendKeys(user_name);
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(confirmPassword).sendKeys(confirm_password);
	}

	public void userClicksOnSaveButton() {
		
		driver.findElement(addUserSaveButton).click();
	}
}