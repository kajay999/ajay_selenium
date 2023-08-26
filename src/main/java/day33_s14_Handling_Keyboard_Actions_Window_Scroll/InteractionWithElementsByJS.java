package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionWithElementsByJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='male']"));
		
//		JavascriptExecutor js = driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", maleRadio);
		
		
		//First name - inputbox
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
