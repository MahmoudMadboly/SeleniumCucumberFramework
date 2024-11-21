package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public static By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//button [text() = ' Login ']");

	
	public void enterUserName(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	public void enterpassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
		waitSomeTime(ExpectedConditions.presenceOfElementLocated(DashboardPage.dashboard), 5);
	}
}