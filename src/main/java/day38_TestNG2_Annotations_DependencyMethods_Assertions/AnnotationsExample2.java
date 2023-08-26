package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsExample2 {

//	TC2
//	----
//	1) open browser
//	2) Login - @BeforeMethod
//	3) Search  -   @Test
//	4) Logout - @AfterMethod
//	5) Login
//	6) Advanced search  -- @Test
//	7) Logout
//	8)close browser
	
	
	@BeforeClass
	void openBrowser() {
		System.out.println("Open Browser");
	}
	
	
	@AfterClass
	void closeBrowser() {
		System.out.println("close Browser");
	}
	
	
	@BeforeMethod
//	@Test(priority = 1)
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 2)
	void search() {
		System.out.println("search");
	}
	
	@AfterMethod
//	@Test(priority = 4)
	void logout() {
		System.out.println("logout");
	}
	
	
	@Test(priority = 3)
	void advSearch() {
		System.out.println("advSearch");
	}
	
	
	
	
}
