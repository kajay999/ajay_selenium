package day32_s13_Handling_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		WebElement minSlider = driver.findElement(By.xpath("//span[1]"));
		WebElement maxSlider = driver.findElement(By.xpath("//span[2]"));
		
		Actions action = new Actions(driver);
		System.out.println(minSlider.getLocation());//(59, 250)x,y
		System.out.println(maxSlider.getLocation());//(612, 250)x,y
		
		Thread.sleep(2000);
		action.dragAndDropBy(minSlider, 100, 250).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(maxSlider, -100, 250).perform();
		
	}

}
