package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.PageObjects.signUpPage;

public class signUpTest {
	private WebDriver driver;
	private LoginPage loginpage;
	private signUpPage signup;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = com.Utils.DriverManager.getDriver();
		driver.get("https://chatpp-sigma.vercel.app/signup");
		loginpage = new LoginPage(driver);
		signup = new signUpPage(driver);
	}
	
	@Test(priority = 1)
	public void signUpSuccessful() throws InterruptedException {
		signup.enterName("Kartik Sharma");
		Thread.sleep(2000);
		signup.enterEmail("kartiksharma@gmail.com");
		Thread.sleep(2000);
		signup.enterPassword("Kartik1234");
		Thread.sleep(2000);
		signup.enterConfirmPassword("Kartik1234");
		Thread.sleep(2000);
		signup.submitBtn();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void signInSuccessful() throws InterruptedException {
		loginpage.enterUserName("Kartik Sharma");
		Thread.sleep(2000);
		loginpage.enterPassWord("Kartik1234");
		Thread.sleep(2000);
		loginpage.clickSignInBtn();
	}
	@AfterMethod(alwaysRun = true)
	public void closebrowser() {
		com.Utils.DriverManager.closeDriver();;
	}

}
