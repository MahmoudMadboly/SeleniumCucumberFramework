package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bind.annotation.Super;

public class UserManagementpage extends PageBase{

	public UserManagementpage(WebDriver driver) {
		super(driver);
	}

	protected static By addAdminButton = By.xpath("//button[text()=' Add ']");
	protected static By firstEmployeeName = By.xpath("//div[@role='row']//div[@role='cell'][4]");


	public void clickOnAddUserButton() {

		driver.findElement(addAdminButton).click();
	}	
}