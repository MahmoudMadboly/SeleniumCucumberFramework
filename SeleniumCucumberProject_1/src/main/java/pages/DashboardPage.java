package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class DashboardPage extends PageBase{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public static By dashboard = By.xpath("//button [text() = ' Login ']");
}