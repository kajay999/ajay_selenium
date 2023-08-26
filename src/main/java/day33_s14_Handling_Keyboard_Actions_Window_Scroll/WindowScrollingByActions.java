package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class WindowScrollingByActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		Actions action = new Actions(driver);
		WebElement indiaFlag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
	
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(3000);
		action.scrollByAmount(0, 500).perform();
		
		Thread.sleep(3000);
		
		action.scrollToElement(indiaFlag).perform();
		
		Thread.sleep(3000);
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(indiaFlag);
		action.scrollFromOrigin(scrollOrigin, 0, -3500).perform();
		
		
	}

}
