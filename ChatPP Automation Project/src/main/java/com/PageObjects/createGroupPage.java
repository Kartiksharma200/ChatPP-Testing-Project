package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createGroupPage {
	
	private WebDriver driver;
	
	//Locator
	private By createGroupBtn = By.xpath("//div[@class='w-full h-full lg:w-1/4 bg-primary-400 hidden lg:block']//button[@type='button'][normalize-space()='Create Group']");
	private By groupName = By.xpath("//div[@class='w-full h-full lg:w-1/4 bg-primary-400 hidden lg:block']//input[@id='groupName']");
	private By addUser = By.xpath("//div[@class='w-full h-full lg:w-1/4 bg-primary-400 hidden lg:block']//input[@id='searchUser']");
	private By createBtn = By.xpath("//div[@class='w-full h-full lg:w-1/4 bg-primary-400 hidden lg:block']//div[@class='fixed top-0 left-0 right-0 bottom-0 flex items-center justify-center z-50 backdrop-filter backdrop-blur-sm']//button[@type='button'][normalize-space()='Create Group']");
	private By verifyGroupCreatePop = By.xpath("(//h3[@class='mb-5 text-lg font-normal'])[1]");
	private By firstName = By.xpath("//p[@class='text-xs text-gray-500 truncate '][normalize-space()='citylight@gmail.com']");
	private By secondName = By.xpath("//p[contains(@class,'text-xs font-medium text-gray-900 truncate')][normalize-space()='Mohammad Kaif Shaikh']");
	//Constructor
	public createGroupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method
	public void clickOnTheCreateGroup() {
		driver.findElement(createGroupBtn).click();
	}
	public void verifytheCreateGroupIsVisible() {
		driver.findElement(verifyGroupCreatePop).isDisplayed();
	}
	public void groupName(String Groupname ) {
		driver.findElement(groupName).sendKeys(Groupname);	
	}
	public void addUserName(String addUsername) {
		driver.findElement(addUser).sendKeys(addUsername);
	}
	public void addName() throws InterruptedException {
		driver.findElement(firstName).click();
		Thread.sleep(2000);
		driver.findElement(secondName).click();
	}
	public void finalCreateGroup() {
		driver.findElement(createBtn).click();
	}

}
