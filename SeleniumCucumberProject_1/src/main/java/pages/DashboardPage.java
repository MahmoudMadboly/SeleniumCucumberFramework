package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class DashboardPage extends PageBase{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public static By dashboard = By.xpath("//h6 [text() = 'Dashboard']");
	public static By adminButton = By.xpath("//span [text() = 'Admin']");
	
	public void clickOnAdminButton() {
		
		driver.findElement(adminButton).click();
		waitSomeTime(ExpectedConditions.presenceOfElementLocated(AddAdminPage.systemUserTitle), 3);
	}
}