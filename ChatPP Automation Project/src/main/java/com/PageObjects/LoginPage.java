package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	//Locators
	private By username_field = By.xpath("//input[@id='email']");
	private By password_field = By.xpath("//input[@id='password']");
	private By signin_btn = By.xpath("//button[@type='submit']");
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Method to Perform
	public void enterUserName(String username) {
		driver.findElement(username_field).sendKeys(username);
	}
	public void enterPassWord(String password) {
		driver.findElement(password_field).sendKeys(password);
	}
	public void clickSignInBtn() {
		driver.findElement(signin_btn).click();
	}

}
