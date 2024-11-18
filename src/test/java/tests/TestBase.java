package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;
import pages.LoginPage;

public class TestBase extends AbstractTestNGCucumberTests{

	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static WebDriver driver;
	
	@Before
	public void OpenBrowser(){
		String driverName = "webdriver.chrome.driver";
		String driverPath = System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe";
		System.setProperty(driverName, driverPath);
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		System.out.println("Navigating to: " + URL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.username));
	}
	/*
	@After
	public void closeBrowser() {
		
		driver.close();
	}*/
}