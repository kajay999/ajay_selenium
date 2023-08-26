package day42_PageObjectModel.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import day42_PageObjectModel.utils.BaseDriver;

public class OrangeHRM_LoginPageObject2 extends BaseDriver {

	public WebDriver driver;

	// constuctor

	public OrangeHRM_LoginPageObject2() {
		this.driver = getDriver();
		PageFactory.initElements(driver, this);
	}
	// Locators

	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement loginPageButton;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailInput;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwordInput;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement loginButton;

	// action methods

	public void loginPageButtonClick() {
		loginPageButton.click();
	}

	public void enterUserCreds() {
		emailInput.sendKeys("xyx@gmail.com");
		passwordInput.sendKeys("123456");
	}

	public void clickOnLogin() {
		loginButton.click();

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void quitDriver() {
		driver.quit();
	}
}
