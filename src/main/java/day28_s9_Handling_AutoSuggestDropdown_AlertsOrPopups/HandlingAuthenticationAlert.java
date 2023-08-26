package day28_s9_Handling_AutoSuggestDropdown_AlertsOrPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://Admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//validation
		String text ="";
		try {
			text = driver.findElement(By.xpath("//p[contains(.,'Congratulations!')]")).getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (text.contains("Congratulations!")) {
			System.out.println("Successful Login");
		}else {
			System.out.println("Login failed");
			
		}
		
	}

}
