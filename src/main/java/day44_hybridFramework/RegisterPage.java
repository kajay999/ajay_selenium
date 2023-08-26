package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.BaseClass;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyPolicy;

	@FindBy(xpath = "//button[contains(.,'Continue')]")
	WebElement continueButton;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement contentMsg;

	public void setFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickOnPolicyCB() {
		privacyPolicy.click();
	}

	public void clickOnContinue() {
		continueButton.click();
	}

	public void validateIsAccountRegisterd(String expContent) {
		String actMsg = contentMsg.getText();
		Assert.assertEquals(actMsg, expContent, "Registration failed due to content msg mismatched");
//		Assert.assertTrue(actMsg.contains("created"), "Registration failed");
	}
}
