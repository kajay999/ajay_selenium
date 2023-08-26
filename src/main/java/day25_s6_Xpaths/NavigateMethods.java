package day26_s7_Web_DriverMethods_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
driver.navigate().to("https://www.google.com/");
driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@value='Google Search']")).click();
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();

	
	}

}
