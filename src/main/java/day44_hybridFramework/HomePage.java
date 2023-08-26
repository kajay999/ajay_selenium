package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//span[contains(.,'My Account')]/ancestor::div[@class='dropdown']")
	WebElement myAccDD;
	
	@FindBy (xpath = "//a[contains(.,'Register')]")
	WebElement register;
	
	
	public void clickOnMyAccDD() {
		myAccDD.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
}
