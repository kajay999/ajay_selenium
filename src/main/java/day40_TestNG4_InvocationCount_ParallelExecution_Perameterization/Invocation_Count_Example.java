package day40_TestNG4_InvocationCount_ParallelExecution_Perameterization;

import org.testng.annotations.Test;

public class Invocation_Count_Example {

//	@Test(priority=1, dataProvider = "dp", dependsOnMethods = "methdname", groups = "groupname")
	@Test(invocationCount = 10)
	void test() {
		System.out.println("Testing..........");
	}

}
