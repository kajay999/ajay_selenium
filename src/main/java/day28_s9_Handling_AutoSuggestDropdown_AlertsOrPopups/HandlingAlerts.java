package day28_s9_Handling_AutoSuggestDropdown_AlertsOrPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		//1st alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
//		Alert alertWindow = driver.switchTo().alert();
//		alertWindow.accept();//ok
		
//		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		String alertBoxData = driver.switchTo().alert().getText();
		System.out.println(alertBoxData);
		driver.switchTo().alert().accept();
		//2nd alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//3nd alert
		
		String alertInput = "Java";
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Selenium");
//		driver.switchTo().alert().accept();
		Alert alertWindow = driver.switchTo().alert();
		alertWindow.sendKeys(alertInput);
		alertWindow.accept();
		
		//Validation
		
		String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expect = "You entered: "+alertInput;
		
		if (actual.equals(expect)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
	}

}
