package day34_s15_TakeScreenShots_CheckBrokenLinks_HeadLess;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//capture full screen shot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source =ts.getScreenshotAs(OutputType.FILE);
////		File target = new File("C:/Users/surth/eclipse-workspace/SeleniumProject/ScreenShots/fullscreenShot.png");
////		File target = new File(System.getProperty("user.dir")+"/ScreenShots/fullscreenShot.png");
//		System.out.println(System.getProperty("user.dir"));
//		File target = new File("./ScreenShots/fullscreenShot.png");
//		FileUtils.copyFile(source, target);
		
		
		//capture particular web element
//		WebElement slider = driver.findElement(By.xpath("//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='slider-wrapper theme-custom']/div[@id='nivo-slider']/a[1]"));
//		File source1 = slider.getScreenshotAs(OutputType.FILE);
//		File target1 = new File("./ScreenShots/slider.jpg");
//		FileUtils.copyFile(source1, target1);
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source2 = logo.getScreenshotAs(OutputType.FILE);
		File target2 = new File("./ScreenShots/logo.jpg");
		FileUtils.copyFile(source2, target2);
	}

}
