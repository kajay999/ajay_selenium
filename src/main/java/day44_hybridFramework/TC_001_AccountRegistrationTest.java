package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{

	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
	
	@Test
	public void registraionTest() {
		hp.clickOnMyAccDD();
		hp.clickOnRegister();
		rp.setFirstName("Selenium");
		rp.setLastName("Java");
		rp.setEmail("Selenium@gmail.com");
		rp.setPassword("selenium123");
		rp.clickOnPolicyCB();
		rp.clickOnContinue();
	}
}
