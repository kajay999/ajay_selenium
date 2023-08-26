package day32_s13_Handling_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
//		action.contextClick(rightClickButton).build().perform();
		Action rightClick = action.contextClick(rightClickButton).build();
		rightClick.perform();
		Thread.sleep(2000);
		
		WebElement delete = driver.findElement(By.xpath("//span[normalize-space()='Delete']"));
		delete.click();
		Thread.sleep(2000);
		
		 
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		rightClick.perform();
		Thread.sleep(2000);
		WebElement quit = driver.findElement(By.xpath("//span[normalize-space()='Quit']"));
		quit.click();
		Thread.sleep(2000);
		alert.accept();		
	}

}
