package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;
	public Login_page (WebDriver driver) {
		//TODO Auto-generated constructor stub
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement username;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='login']")
	WebElement login;
	
	}
