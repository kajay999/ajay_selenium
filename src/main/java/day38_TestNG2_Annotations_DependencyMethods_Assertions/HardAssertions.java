package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {
		int act = 100;
		int exp = 200;
		
//		if (act==exp) {
//			System.out.println("Test Passed");
//		}else {
//			System.out.println("Test Failed");
//		}
		
//		Assert.assertEquals(act, exp);
//		Assert.assertTrue(act==exp,"Expected value is mistched with actual value");
		
		
		String str1 = "abcd";
		String str2 = "abcd1";
		
//		Assert.assertEquals(str1, str2,"Expected value is mistched with actual value");
//		Assert.assertNotEquals(str1, str2,"Expected value is matched with actual value so test failed");
		
		
		if(str1.equalsIgnoreCase(str2)) {
			Assert.assertTrue(true);
		}else {
//			Assert.assertTrue(false,"test failed");
			Assert.fail("test Failed");
		}
		
	}
	
}
