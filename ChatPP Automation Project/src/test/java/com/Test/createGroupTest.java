package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.createGroupPage;

public class createGroupTest {
	
	private WebDriver driver;
	private createGroupPage creategroup;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = com.Utils.DriverManager.getDriver();
		driver.get("https://chatpp-sigma.vercel.app/signin");
		creategroup = new createGroupPage(driver);	
	}
	
	@Test
	public void createGroup() throws InterruptedException {
		creategroup.clickOnTheCreateGroup();
		creategroup.verifytheCreateGroupIsVisible();
		Thread.sleep(3000);
		creategroup.groupName("New Group");
		creategroup.addUserName("K");
		Thread.sleep(2000);
		creategroup.addName();
		creategroup.finalCreateGroup();	
	}

	@AfterMethod(alwaysRun = true)
	public void teardown() {
		com.Utils.DriverManager.closeDriver();
	}

}
