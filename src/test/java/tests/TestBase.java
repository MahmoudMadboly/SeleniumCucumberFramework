package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.LoginPage;

public class TestBase extends AbstractTestNGCucumberTests{

	public static WebDriver driver;
	public static Properties probs = new Properties();

	@Before(order = 1)
	public void loadConfigFile() {
		try {

			File file = new File("src//main//java//properties//config.properties");
			FileInputStream fileStream = new FileInputStream(file);
			probs.load(fileStream);

		}catch(FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
		}catch (IOException er) {
			System.out.println("The config file didn`t loaded");
			er.printStackTrace();
			throw new RuntimeException("Configuration file error.");
		}
	}

	@Before(order = 2)
	public void OpenBrowser(){

		String browser = probs.getProperty("Browser");
		if(browser == null || browser.isEmpty()) {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}else {

			if(probs.getProperty("Browser").equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}else if (probs.getProperty("Browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}			
		}
		driver.manage().window().maximize();
		driver.get(probs.getProperty("URL"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.username));
	}
	
	
	/*
	@After
	public void closeBrowser() {

		driver.close();
	}*/
}