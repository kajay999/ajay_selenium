package day33_s14_Handling_Keyboard_Actions_Window_Scroll;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class OpenA_LinkInNewTab {
	   public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      // wait of 4 seconds
	      // Keys.Chord string
	      String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);//open in new tab
//	      String clicklnk = Keys.chord(Keys.SHIFT,Keys.ENTER);//open in new window
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	      driver.findElement(
	      By.xpath("//*[text()='Privacy Policy']")).sendKeys(clicklnk);
	   }
	}

