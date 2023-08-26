package day39_TestNG3_DataPrivders_Grouping;

import org.testng.annotations.Test;

public class Twitter {

	
	@Test(priority = 1, groups= {"Sanity","Regression","Twitter"})
	void navigateTwitterUrl() {
		System.out.println("Navigated to Twitter URL___Involved groups(Sanity,Regression,Twitter)");
	}
	
	@Test(priority = 2, groups= {"Regression","Twitter"})
	void loginToTwitter() {
		System.out.println("login to Twitter___Involved groups(Regression,Twitter)");
	}
	
	@Test(priority = 3, groups= {"Sanity","Twitter"})
	void viewProfile() {
		System.out.println("Twitter profile viewed___Involved groups(Sanity,Twitter)");
	}
	
	@Test(priority = 4, groups= {"Twitter"})
	void logout() {
		System.out.println("logout from Twitter___Involved groups(Twitter)");
	}
}
