package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {

//	TC2
//	----
//	before suite
//	before test
//	before class
//	Before method
//	test
//	After method
//	After class
//	After test
//	After suite
	
	
	
//	1) open browser
//	2) Login - @BeforeMethod
//	3) Search  -   @Test
//	4) Logout - @AfterMethod
//	5) Login
//	6) Advanced search  -- @Test
//	7) Logout
//	8)close browser
	
	
	@BeforeSuite
	void bs() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}
	
	
	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}
	@AfterTest
	void at() {
		System.out.println("After Test");
	}
	
	
	@BeforeClass
	void bc() {
		System.out.println("Before Class");
	}
	
	
	@AfterClass
	void ac() {
		System.out.println("After Class");
	}
	
	
	@BeforeMethod
	void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	void am() {
		System.out.println("After Method");
	}
	
	@Test
	void test() {
		System.out.println("Test");
	}
	
	
	
	
	
	
	
}
