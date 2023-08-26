package day34_s15_TakeScreenShots_CheckBrokenLinks_HeadLess;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {
	public static void main(String[] args) throws Throwable {

		// 1) Launch browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.setHeadless(false);
		WebDriver driver = new ChromeDriver(options);

		// 2) open url https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		// 3) Provide username - Admin
//		driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

		// 4) Provide password - admin123
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		// 5) Click on Login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		Thread.sleep(5000);
		// 6) Verify the dashboard page
		String text = "";
		try {
			WebElement dashboardElement = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
			text = dashboardElement.getText();
		} catch (NoSuchElementException e) {
			System.out.println("dashboard element not visible");
		}

		if (text.equals("Dashboard")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		// 7) close browser

		driver.close();// closes driver active tab
//		driver.quit();// closes entire browser
	}
}
