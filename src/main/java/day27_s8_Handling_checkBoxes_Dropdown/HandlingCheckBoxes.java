package day27_s8_Handling_checkBoxes_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		
		//Select specific one checkbox
		
//		WebElement monday = driver.findElement(By.xpath("//input[@id='monday']"));
//		monday.click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='form-check']//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes: "+checkboxes.size());
		
		//select all checkboxes
//		for (int i = 0; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//			Thread.sleep(1000);
//		}
		
//		for (WebElement checkbox : checkboxes) {
//			checkbox.click();
//		}
		
		
		//select last 2 checkboxes
//		for (int i = checkboxes.size()-4; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//			Thread.sleep(1000);
//		}
		
		
		
		//select first 2 checkboxes
//		for (int i = 0; i < 4; i++) {
//			checkboxes.get(i).click();
//			Thread.sleep(1000);
//		}
		
		for (int i = 0; i < checkboxes.size(); i++) {
			if(i<3) {
			checkboxes.get(i).click();
			}
		}
		
		Thread.sleep(4000);
		
//		for (int i = 0; i < checkboxes.size(); i++) {
//			if(checkboxes.get(i).isSelected())
//				checkboxes.get(i).click();
//			}
		
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
		
		
		
		
		
	}

}
