package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;
import utilities.String_Utils;

public class TC_001_AccountRegistrationTest extends BaseClass{

	String_Utils strUtils = new String_Utils();
	
	@Test
	public void registraionTest() {
		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		try {
		logger.info("---Starting TC_001_AccountRegistrationTest---");
		hp.clickOnMyAccDD();
		hp.clickOnRegister();
		rp.setFirstName(strUtils.randomName());
		rp.setLastName(strUtils.randomName());
		rp.setEmail(strUtils.randomMailGenerator());
		rp.setPassword(strUtils.randomPasswordGenerator());
		rp.clickOnPolicyCB();
		rp.clickOnContinue();
		rp.validateIsAccountRegisterd("Your Account Has Been Created!");
		logger.info("---Ended TC_001_AccountRegistrationTest---");
		} catch (Exception e) {
		logger.error("Test case failed got error.");
		}
	}
}
