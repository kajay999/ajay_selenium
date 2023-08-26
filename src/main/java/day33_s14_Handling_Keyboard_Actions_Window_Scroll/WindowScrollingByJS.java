package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowScrollingByJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		
		
//		JavascriptExecutor js = driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//scroll down page by pixels
//		js.executeScript("window.scrollBy(0,1000)", "");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement indiaFlag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", indiaFlag);
		
		System.out.println(js.executeScript("return window.pageYOffset;")); 
		
		//3) scroll down till end of the page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		// go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
