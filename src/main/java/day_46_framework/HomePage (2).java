package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HomePage{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(.,'My Account')]/ancestor::div[@class='dropdown']")
	WebElement myAccDD;

	@FindBy(xpath = "//a[contains(.,'Register')]")
	WebElement register;

	public void clickOnMyAccDD() {
		myAccDD.click();
		BaseClass.logger.info("Clicked on MyAccount");
	}

	public void clickOnRegister() {
		register.click();
		BaseClass.logger.info("Clicked on Register");
	}

}
