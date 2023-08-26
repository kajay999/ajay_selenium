package day27_s8_Handling_checkBoxes_Dropdown;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithSelectTag {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement eleDropDown = driver.findElement(By.xpath("//select[@name='country']"));
		Select dropDown = new Select(eleDropDown);
		dropDown.selectByIndex(1);
		Thread.sleep(2000);
		
		dropDown.selectByValue("2");
		Thread.sleep(2000);
		
		dropDown.selectByVisibleText("India");
		
		}
		
	}


