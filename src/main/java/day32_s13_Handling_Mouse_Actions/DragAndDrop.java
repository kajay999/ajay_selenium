package day32_s13_Handling_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement WashingTonSource = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement USA_Target = driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(WashingTonSource, USA_Target).perform();	
		
	}

}
