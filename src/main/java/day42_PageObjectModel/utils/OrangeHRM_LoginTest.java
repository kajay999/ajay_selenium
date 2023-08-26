package day42_PageObjectModel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import day42_PageObjectModel.pageObjects.OrangeHRM_LoginPageObject2;

public class OrangeHRM_LoginTest {

	
//	OrangeHRM_LoginPageObject loginPage = new OrangeHRM_LoginPageObject();
	OrangeHRM_LoginPageObject2 loginPage = new OrangeHRM_LoginPageObject2();
	
	@Test
	void loginTest() {
		loginPage.loginPageButtonClick();
		loginPage.enterUserCreds();
		loginPage.clickOnLogin();
		String exp_title="nopCommerce demo store. Computers";
		Assert.assertEquals(loginPage.getTitle(), exp_title, "test failed due to titles mismatched ");
		loginPage.quitDriver();
	}
	
	
	
}
