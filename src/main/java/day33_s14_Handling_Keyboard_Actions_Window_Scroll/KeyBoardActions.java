package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		input1.sendKeys("WELCOME TO SELENIUM AUTOMATION");
		
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		
		//Ctrl+a selects all input text
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		//Ctrl+c -- coping selected text
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		
		
		//tab -- clicking tab
//		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		
		//Ctrl+v -- pasting selected text in input2
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
	}

}
