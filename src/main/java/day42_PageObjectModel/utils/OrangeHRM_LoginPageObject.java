package day42_PageObjectModel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day42_PageObjectModel.utils.BaseDriver;

public class OrangeHRM_LoginPageObject extends BaseDriver{

	public WebDriver driver;
	
	//constuctor
	
	public OrangeHRM_LoginPageObject(){
		this.driver = getDriver();
	}
	//Locators
	By loginPageButton = By.xpath("//a[normalize-space()='Log in']");
	By emailInput = By.xpath("//input[@id='Email']");
	By passwordInput = By.xpath("//input[@id='Password']");
	By loginButton = By.xpath("//button[normalize-space()='Log in']");
	
	//action methods
	
	public void loginPageButtonClick() {
		driver.findElement(loginPageButton).click();
	}
	
	public void enterUserCreds() {
		driver.findElement(emailInput).sendKeys("xyx@gmail.com");
		driver.findElement(passwordInput).sendKeys("123456");
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void quitDriver() {
		driver.quit();
	}
}
