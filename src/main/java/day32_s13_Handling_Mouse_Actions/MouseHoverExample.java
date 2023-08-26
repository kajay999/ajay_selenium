package day32_s13_Handling_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");

		WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac1 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(desktops).perform();
		action.moveToElement(mac1).click().perform();
	
//		Action moveToDesktops = action.moveToElement(desktops).build();
//		Action moveToMac1AndClick = action.moveToElement(mac1).click().build();
//		
//		moveToDesktops.perform();
//		moveToMac1AndClick.perform();
		
		
	}

}
