package day27_s8_Handling_checkBoxes_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownWithoutSelectTag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
		WebElement multiDrpDwn = driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));

		multiDrpDwn.click();
	
	
		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//ul/li//input[@type='checkbox']"));
		
		//total number of options
		System.out.println("No of options: "+dropDownOptions.size());
	
		//Print all options
		for (WebElement option : dropDownOptions) {
			System.out.println(option.getText());
		}
//		jQuery
//		Bootstrap
//		HTML
//		CSS
//		Angular
//		Java
//		C#
//		Python
//		MySQL
//		Oracle
//		MS SQL Server

		for (WebElement selectOPtion : dropDownOptions) {
			if (selectOPtion.getText().equals("Python")||selectOPtion.getText().equals("Java")||selectOPtion.getText().equals("Oracle")) {
				selectOPtion.click();
			}
		}
		
		for (WebElement selectOPtion : dropDownOptions) {
			if (selectOPtion.isSelected()) {
				selectOPtion.click();
			}
		}
	}

}
