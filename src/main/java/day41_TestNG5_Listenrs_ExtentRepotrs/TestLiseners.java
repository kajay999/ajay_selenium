package day41_TestNG5_Listenrs_ExtentRepotrs;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(day41_TestNG5_Listenrs_ExtentRepotrs.ListenersMethods.class)
public class TestLiseners {

	
	@Test
	void test1() {
		System.out.println("I am from test1");
		Assert.assertEquals(1, 1);
	}
	
	@Test
	void test2() {
		System.out.println("I am from test2");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test2"})
	void test3() {
		System.out.println("I am from test3");
		Assert.assertTrue(true);
	}

	@Test
	void test4() {
		System.out.println("I am from test4");
		Assert.assertTrue(true);
	}
	
	
}
