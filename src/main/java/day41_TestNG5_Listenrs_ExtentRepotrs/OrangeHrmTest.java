package day41_TestNG5_Listenrs_ExtentRepotrs;

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

//@Listeners(day41_TestNG5_Listenrs_ExtentRepotrs.ExtentReportGenerator.class)
public class OrangeHrmTest {

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
		String exp_title = "Or";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title, "Titles got mismatched");
	}

	// close browser
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}

}
