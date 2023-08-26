package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	@Test
	void hardAssertion_Test() {
		System.out.println("Line 1........");
		System.out.println("Line 2........");
		System.out.println("Line 3........");
		System.out.println("Line 4........");
		System.out.println("Line 5........");

		Assert.assertEquals(1, 2, "assertion failed");// fail
		System.out.println("Completed hard assertion_1.");

		Assert.assertEquals(1, 1);
		System.out.println("Completed hard assertion_2.");

	}

	@Test
	void softAssertion_Test() {
		System.out.println("-----------------------------------");
		
		System.out.println("Line 1........");
		System.out.println("Line 2........");
		System.out.println("Line 3........");
		System.out.println("Line 4........");
		System.out.println("Line 5........");
		
		SoftAssert sfa = new SoftAssert();
		sfa.assertEquals(1, 2,"assertion failed");
		System.out.println("Completed Soft assertion_1 ");
		
		sfa.assertEquals(1, 1,"assertion failed");
		System.out.println("Completed Soft assertion_2 ");
		
		
		sfa.assertAll();//Mandatory
	}

}
