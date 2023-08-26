package day25_s6_Xpaths;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);//593178F6B475CED28C7D462D2EED2895
										//29923BF7271335AB44F01B70D5E04D39
		WebElement incLink = driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']"));
		incLink.click();
		
		Thread.sleep(2000);
		Set<String>windowHandles = driver.getWindowHandles();
		for (String wHandle : windowHandles) {
			System.out.println(wHandle);
		}
	}

}
