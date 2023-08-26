package day26_s7_Web_DriverMethods_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(15));


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

		WebDriverWait myWait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		myWait2.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("Admin");

		myWait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")))
				.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		myWait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("admin123");

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		myWait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

	}

}
