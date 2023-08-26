package day25_s6_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());//true
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='M']"));
		System.out.println(maleRadio.isSelected());//false
		WebElement femaleRadio = driver.findElement(By.xpath("//span[@class='female']//input[@value='F']"));
		System.out.println(femaleRadio.isSelected());//false
		
		Thread.sleep(2000);
		
		maleRadio.click();
		System.out.println(maleRadio.isSelected());//true
		System.out.println(femaleRadio.isSelected());//false
		
		Thread.sleep(2000);
		
		femaleRadio.click();
		System.out.println(femaleRadio.isSelected());//true
		System.out.println(maleRadio.isSelected());//false
		Thread.sleep(2000);
		
		WebElement searchInput = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		if (searchInput.isEnabled()) {
			System.out.println(searchInput.isEnabled());//true
			searchInput.sendKeys("ABCDEGH");
		}
	}

}
