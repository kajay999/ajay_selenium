package day42_PageObjectModel.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

	static WebDriver driver = null;

	
	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
		return driver;
	}

	


}
