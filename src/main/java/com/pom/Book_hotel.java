package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Book_hotel {
	public WebDriver driver;
	public  Book_hotel (WebDriver driver) {
		//TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(name="first_name")
	WebElement firstname;
	@FindBy(name="last_name")
	WebElement lastname;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="cc_num")
	WebElement card_numb;
	
	public WebDriver getDriver() {
		return driver;
	}
    public WebElement getFirstname() {
		return firstname;
	}
    public WebElement getLastname() {
		return lastname;
	}
    public WebElement getAddress() {
		return address;
	}
    public WebElement getCard_numb() {
		return card_numb;
	}
    public WebElement getCard_type() {
		return card_type;
	}
    public WebElement getExp_month() {
		return exp_month;
	}
    public WebElement getExp_year() {
		return exp_year;
	}
    public WebElement getCvv_numb() {
		return cvv_numb;
	}
    public WebElement getBook_now() {
		return book_now;
	}
	@FindBy(name="cc_type")
	WebElement card_type;
	
	@FindBy(name="cc_exp_month")
	WebElement exp_month;
	
	@FindBy(name="cc_exp_year")
	WebElement exp_year;
	
	@FindBy(name="cc_cvv")
    WebElement cvv_numb;
	
	@FindBy(name="book_now")
	WebElement book_now;
}
