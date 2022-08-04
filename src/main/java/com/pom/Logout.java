package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	public  Logout (WebDriver driver) {
		//TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	WebElement logout;
}
