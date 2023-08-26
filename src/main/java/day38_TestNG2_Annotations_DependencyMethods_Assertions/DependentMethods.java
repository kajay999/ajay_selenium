package day38_TestNG2_Annotations_DependencyMethods_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {

	//Open Browser
	//Login
	//search
	//advanced search
	//logout
	//close browser
	
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=6)
	void closeApp()
	{
		Assert.assertTrue(true);
	}
	
	
}
