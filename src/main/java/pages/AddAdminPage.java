package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddAdminPage extends PageBase{


	public AddAdminPage(WebDriver driver) {
		super(driver);
	}

	public static By systemUserTitle = By.xpath("//h5 [text() = 'System Users']");

	By userRoleMenu = By.xpath("//div [text() = '-- Select --'][1]");
	By userRole = By.xpath("//div [span[text()='Admin']]");
	By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
	By employeeNameSuggestion = By.xpath("//div[@class='oxd-autocomplete-option' and @role = 'option']");
	By userName = By.xpath("//input [contains(@class , 'oxd-input oxd-input--active')and contains(@autocomplete , 'off')]");
	By statusMenu = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By status = By.xpath("//span [text() = 'Enabled']");
	By password = By.xpath("//input [@type = 'password'][1]");
	//i used this format to search globally about that element
	By confirmPassword = By.xpath("(//input[@type='password'])[2]");
	By addUsertitle = By.xpath("//h6 [text() = 'Add User']");
	//By addUserSaveButton = By.xpath("//button [text() = ' Save '");
	By addUserSaveButton = By.xpath("//button [@type = 'submit' and @class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");


	public void setReuiredInfo (String employee_Name , String user_name , String pass_word , String confirm_password)throws InterruptedException  {

		waitSomeTime(ExpectedConditions.visibilityOfElementLocated(addUsertitle), 3);
		driver.findElement(employeeName).sendKeys(employee_Name);
		Thread.sleep(2000);
		waitSomeTime(ExpectedConditions.visibilityOfElementLocated(employeeNameSuggestion), 30);
		WebElement employeeNameSuggestionElement = driver.findElement(employeeNameSuggestion);
		employeeNameSuggestionElement.click();
		driver.findElement(userRoleMenu).click();
		waitSomeTime(ExpectedConditions.elementToBeClickable(userRole), 3);
		WebElement userRoleElement = driver.findElement(userRole);
		userRoleElement.click();
		driver.findElement(statusMenu).click();
		waitSomeTime(ExpectedConditions.elementToBeClickable(status), 3);
		WebElement statusElement = driver.findElement(status);
		statusElement.click();
		driver.findElement(userName).sendKeys(user_name);
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(confirmPassword).sendKeys(confirm_password);
	}

	public void userClicksOnSaveButton() {

		driver.findElement(addUserSaveButton).click();
	}
}