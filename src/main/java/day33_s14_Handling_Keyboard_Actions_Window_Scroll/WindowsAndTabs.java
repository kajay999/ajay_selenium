package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAndTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://youtube.com/");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.in/");
		
		
	}

}
