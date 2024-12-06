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

	public String getFirst_Employee_Name() {
		WebElement first_Employee_Name_Element = driver.findElement(firstEmployeeName);
		String first_Employee_Name = first_Employee_Name_Element.getText();
		System.out.println(first_Employee_Name + "just test");
		return first_Employee_Name;
	}

	public void clickOnAddUserButton() {

		driver.findElement(addAdminButton).click();
	}	
}