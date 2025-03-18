package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.PageObjects.LogoutPage;
import com.PageObjects.createGroupPage;

public class signInTest {
	private WebDriver driver;
//	private signUpPage signIn;
	private LoginPage loginpage;
	private createGroupPage creategroup;
	private LogoutPage logoutpage;
	
	@BeforeTest
	public void setup() {
		driver = com.Utils.DriverManager.getDriver();
		driver.get("https://chatpp-sigma.vercel.app/signin");
		loginpage = new LoginPage(driver);
		creategroup = new createGroupPage(driver);
		logoutpage = new LogoutPage(driver);
		
//		signIn = new signUpPage(driver);
	}
	
	@Test(priority = 1)
	public void signInSuccessful() throws InterruptedException {
		
		loginpage.enterUserName("kartiksharma@gmail.com");
		Thread.sleep(2000);
		loginpage.enterPassWord("Kartik1234");
		Thread.sleep(2000);
		loginpage.clickSignInBtn();
		Thread.sleep(4000);
		String accUrl = driver.getCurrentUrl();
		String expUrl = "https://chatpp-sigma.vercel.app/";
		if(accUrl.equals(expUrl)) {
			System.out.println("<--------Successful Login---------->");
		}else {
			System.out.println("<--------Login Failed---------->");
		}
		
	}
	
	@Test
	public void logout() throws InterruptedException {
		
		logoutpage.clickOnProfile();
		Thread.sleep(3000);
		logoutpage.clickOnLogout();
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://chatpp-sigma.vercel.app/signup";
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("<-----------Successful Logout----------->");
		}else {
			System.out.println("<-----------Logout Failed---------->");
		}
	}
	
//	@Test(priority = 2, dependsOnMethods = {"signInSuccessful"})
//	public void createGroup() throws InterruptedException {
//		creategroup.clickOnTheCreateGroup();
//		creategroup.verifytheCreateGroupIsVisible();
//		Thread.sleep(3000);
//		creategroup.groupName("New Group");
//		creategroup.addUserName("K");
//		Thread.sleep(2000);
//		creategroup.addName();
//		creategroup.finalCreateGroup();	
//	}
	
	
	@AfterTest
	public void teardown() {
		com.Utils.DriverManager.closeDriver();
	}

}
