package day25_s6_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement incLink = driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']"));
		incLink.click();
		
		Thread.sleep(3000);
		
//		driver.close();
		driver.quit();
	}

}
