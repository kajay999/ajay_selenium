package day39_TestNG3_DataPrivders_Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(act_title, exp_title);
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name = "dp" , indices= {0,2,4})
	String[][] loginData() {
		String data[][] = { { "abcd@gmail.com", "098765" }, { "lokesh@gmail.com", "123456" },
				{ "ajay@outlook.com", "qwerty" }, { "xyx@rediff.com", "lmnop" }, { "suresh@yahoo.com", "abcdefg" } };
		return data;
	}
}

//abcd@gmail.com-098765
//lokesh@gmail.com-12345
//ajay@outlook.com-qwerty
//xyx@rediff.com-lmnop
//suresh@yahoo.com-abcdefg