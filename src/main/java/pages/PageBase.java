package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	WebDriver driver;


	public PageBase(WebDriver driver) {
		this.driver = driver;
	}

	public <T> T waitSomeTime(ExpectedCondition<T> condition, long timeInSeconds){

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
		return wait.until(condition);
	}
	
	public void waitImplicitelly(long implicitTime) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTime));
	}
}