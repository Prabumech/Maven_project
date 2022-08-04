package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	public Select_hotel (WebDriver driver) {
		//TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath="//*[@id='radiobutton_0']")
	WebElement click;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getContinuee() {
		return continuee;
	}
	@FindBy(name="continue")
	WebElement continuee;
}
