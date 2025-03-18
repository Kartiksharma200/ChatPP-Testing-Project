package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	private WebDriver driver;
	 
	//Locators
	private By name_Field = By.xpath("//input[@id='name']");
	private By email_Field = By.xpath("//input[@id='email']");
	private By pass_Field = By.xpath("//input[@id='password']");
	private By confirm_pass_Field = By.xpath("//input[@id='confirmPassword']");
	private By pss_eye = By.xpath("//div[3]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M12 5c-7.6')]");
	private By confirm_pss_eye = By.xpath("//div[4]//div[1]//button[1]//*[name()='svg']");
	private By signUp_btn = By.xpath("//button[@type='submit']");
	 
	 //Constructor
	 public signUpPage(WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 
	 //Method 
	 public void enterName(String name) {
		 driver.findElement(name_Field).sendKeys(name);
	 }
	 public void enterEmail(String email) {
		 driver.findElement(email_Field).sendKeys(email);
	 }
	 public void enterPassword(String password) {
		 driver.findElement(pass_Field).sendKeys(password);
	 }
	 public void enterConfirmPassword(String confirmPassword) {
		 driver.findElement(confirm_pass_Field).sendKeys(confirmPassword);
	 }
	 
	 public void verifyPassword() {
		 WebElement mainPass = driver.findElement(pss_eye);
		 WebElement confirmPass = driver.findElement(confirm_pss_eye);
	 }
	 public void submitBtn() {
		 driver.findElement(signUp_btn).click();
	 }
	

}
