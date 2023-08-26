package day40_TestNG4_InvocationCount_ParallelExecution_Perameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	static WebDriver driver;

	// open browser
	@BeforeClass
	@Parameters({ "browser" , "url"})
	void openBrowser(String br, String url) {
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

//		if (br.equals("chrome")) {
//			driver = new ChromeDriver();
//		}else if (br.equals("edge")) {
//			driver = new EdgeDriver();
//		}else if (br.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}

	// validate a logo
	@Test(priority = 1)
	void validateLogo() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		boolean logoIsdisplayed = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(logo));
			logoIsdisplayed = logo.isDisplayed();
			Assert.assertTrue(logoIsdisplayed, "Logo not displayed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// validate title
	@Test(priority = 2)
	void validateTitile() {
		String exp_title = "OrangeHRM";
		String act_title = driver.getTitle();
		Assert.assertEquals(act_title, exp_title, "Titles got mismatched");
	}

	// close browser
	@AfterClass
	void closeBrowser() {
//		driver.quit();
	}

}
