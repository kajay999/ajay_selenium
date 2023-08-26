package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testBase.BaseClass;
import utilities.JS_Utils;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		;
	}
	
	JS_Utils jsUtils = new JS_Utils();
	WebDriverWait myWait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

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
		BaseClass.logger.info("Entered First name.");
	}

	public void setLastName(String lName) {
		lastName.sendKeys(lName);
		BaseClass.logger.info("Entered last name.");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
		BaseClass.logger.info("Entered Email.");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
		BaseClass.logger.info("Entered password.");
	}

	public void clickOnPolicyCB() {
		jsUtils.onJS_Click(privacyPolicy);
		BaseClass.logger.info("Clicked on check box for accepting terms and conditions");
	}

	public void clickOnContinue() {
		jsUtils.onJS_Click(continueButton);
		BaseClass.logger.info("Clicked on continue button");
	}

	public void validateIsAccountRegisterd(String expContent) {
		myWait.until(ExpectedConditions.invisibilityOf(continueButton));
		String actMsg = contentMsg.getText();
		Assert.assertEquals(actMsg, expContent, "Registration failed due to content msg mismatched");
//		Assert.assertTrue(actMsg.contains("created"), "Registration failed");
		BaseClass.logger.info("Validation done for acccount registration.");
	}
}
