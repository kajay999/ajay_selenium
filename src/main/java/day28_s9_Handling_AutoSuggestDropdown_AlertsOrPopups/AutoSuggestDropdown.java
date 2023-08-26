package day28_s9_Handling_AutoSuggestDropdown_AlertsOrPopups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Java");
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[contains(@class,'wM6W7d')]/span"));
		
		for (WebElement option : list) {
			System.out.println(option.getText());
		}
		
//		javatpoint
//		javascript
//		java
//		java online compiler
//		java interview questions
//		java compiler
//		javascript interview questions
//		javascript online compiler
//		java download
//		java 8 features
		
		
		//select an option from the list
		for (WebElement selectOption : list) {
			String optionValue = selectOption.getText();
			if (optionValue.equalsIgnoreCase("javascript interview questions")) {
				selectOption.click();
				break;
			}
		}

	}

}
