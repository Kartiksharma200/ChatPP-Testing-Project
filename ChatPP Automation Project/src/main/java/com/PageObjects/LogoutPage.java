package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	private WebDriver driver;
	private By profileIcon = By.xpath("//img[@alt='Profile']");
	private By logoutBtn = By.xpath("//button[@class='cursor-pointer w-full py-2 px-4 text-sm font-bold hover:bg-primary-800 hover:text-primary-50']");
	
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnProfile() {
		driver.findElement(profileIcon).click();
	}
	
	public void clickOnLogout() {
		driver.findElement(logoutBtn).click();
	}
	

}
