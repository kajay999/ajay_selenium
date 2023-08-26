package day39_TestNG3_DataPrivders_Grouping;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Gmail {

	@BeforeSuite
	void openBrowser() {
		System.out.println("browser Opened");
	}
	
	@AfterSuite
	void closeBrowser() {
		System.out.println("browser Closed");
	}
	
	@Test(priority = 1, groups= {"Sanity","Regression","Gmail"})
	void navigateGmailUrl() {
		System.out.println("Navigated to Gmail URL___Involved groups(Sanity,Regression,Gmail)");
	}
	
	@Test(priority = 2, groups= {"Regression","Gmail"})
	void loginToGmail() {
		System.out.println("login to gmail___Involved groups(Regression,Gmail)");
	}
	
	@Test(priority = 3, groups= {"Sanity","Gmail"})
	void viewProfile() {
		System.out.println("gmail profile viewed___Involved groups(Sanity,Gmail)");
	}
	
	@Test(priority = 4, groups= {"Gmail"})
	void logout() {
		System.out.println("logout from gmail___Involved groups(Gmail)");
	}
	
	
}
