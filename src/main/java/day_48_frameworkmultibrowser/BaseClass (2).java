package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver ;// driver initialization 
	public static Logger logger; //logging
	public static ResourceBundle rb;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		rb = ResourceBundle.getBundle("config");//its load the config.properties
		logger = LogManager.getLogger(this.getClass()); //for logging
//		driver = new ChromeDriver();
		switch (br) {
		// Using String Literal in Switch case
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default: System.out.println("Browser perameter value is invalid");;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rb.getString("appURL"));//get url from config.properties file;
//		driver.get("http://localhost/opencart/");

//	public WebDriver getDriver() {
//	return driver;

	@AfterClass
	public void quitBrowser() {
		driver.quit();
