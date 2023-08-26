package day39_TestNG3_DataPrivders_Grouping;

import org.testng.annotations.Test;

public class Facebook {

	@Test(priority = 1, groups= {"Regression","Facebook"})
	void navigateFacebookUrl() {
		System.out.println("Navigated to Facebook URL___Involved groups(Regression,Facebook)");
	}
	
	@Test(priority = 2, groups= {"Sanity","Regression","Facebook"})
	void loginToFacebook() {
		System.out.println("login to Facebook___Involved groups(Sanity,Regression,Facebook)");
	}
	
	@Test(priority = 1, groups= {"Sanity","Facebook"})
	void viewProfile() {
		System.out.println("Facebook profile viewed___Involved groups(Sanity,Facebook)");
	}
	
	@Test(priority = 1, groups= {"Facebook"})
	void logout() {
		System.out.println("logout from Facebook___Involved groups(Facebook)");
	}
}
