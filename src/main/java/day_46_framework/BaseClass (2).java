package testBase;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver ;// driver initialization 
	public static Logger logger; //logging
	@BeforeClass
	public void setup() {
		logger = LogManager.getLogger(this.getClass()); //for logging
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/");

	}

//	public WebDriver getDriver() {
//		return driver;
//	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
