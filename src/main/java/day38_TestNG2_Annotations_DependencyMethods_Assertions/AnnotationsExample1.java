package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsExample1 {

//	TC1
//	----
//	1) Login - @BeforeMethod
//	2) Search  -   @Test
//	3) Logout - @AfterMethod
//	4) Login
//	5) Advanced search  -- @Test
//	6) Logout
	
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
