package day39_TestNG3_DataPrivders_Grouping;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {
	
	
	@BeforeGroups("IT Department")
	public void before_it() {
		System.out.println("This method will be executed before the execution of IT Department group");
	}

	@Test
	public void testcase1() {
		System.out.println("HR");
	}


	@Test(groups= {"Network Department"})  
	public void testcase3() {
		System.out.println("QA analyst");
	}

	

	@AfterGroups("Network Department")
	public void after_Nd() {
		System.out.println("This method will be executed after the execution of Network Department group");
	}
	
	
	@Test(groups = { "IT Department" })
	public void testcase2() {
		System.out.println("Software Developer");
	}
}
