package day34_s15_TakeScreenShots_CheckBrokenLinks_HeadLess;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links: "+links.size());
		int brokenlinks = 0;
		int emptyHrefs = 0;
		int workingLinks = 0;
		
		for (WebElement link : links) {
			String hrefValue = link.getAttribute("href");
			
			//link text checking
			if (hrefValue==null || hrefValue.isEmpty()) {
				System.out.println("href value is empty");
				emptyHrefs++;
				continue;
			}
			
			//checking link is broken or working
			URL urlLink = new URL(hrefValue);
//			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("webcache.example.com", 8080));
//			HttpURLConnection connection =(HttpURLConnection)urlLink.openConnection(proxy);
			HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
			connection.connect();
//			System.out.println(connection.getResponseMessage());
			if (connection.getResponseCode()>=400) {
				System.out.println(hrefValue+" is broken link");
				brokenlinks++;
			} else {
				System.out.println(hrefValue+" is not a broken link");
				workingLinks++;
			}
			connection.disconnect();
		}
		System.out.println("Number of Empty Hrefs: "+emptyHrefs);
		System.out.println("Number of broken links: "+brokenlinks);
		System.out.println("Number of working links: "+workingLinks);
		
	}
}
