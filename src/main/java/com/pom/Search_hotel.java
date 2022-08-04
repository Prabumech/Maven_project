package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;
	public Search_hotel (WebDriver driver) {
		//TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(name="location")
	WebElement location;
	public WebDriver getDriver() {
		return driver;
	}
    public WebElement getLocation() {
		return location;
	}
    public WebElement getHotels() {
		return hotels;
	}
    public WebElement getRoomtype() {
		return roomtype;
	}
    public WebElement getRoomnos() {
		return roomnos;
	}
    public WebElement getPickin() {
		return pickin;
	}
    public WebElement getPickout() {
		return pickout;
	}
    public WebElement getAdult() {
		return adult;
	}
    public WebElement getChild() {
		return child;
	}
    public WebElement getSearch() {
		return search;
	}
	@FindBy(name="hotels")
	WebElement hotels;
	 
	@FindBy(name="room_type")
    WebElement roomtype;
	
	@FindBy(xpath="//*[@id='room_nos']")
	WebElement roomnos;
	
	@FindBy(name="datepick_in")
	WebElement pickin;
	
	@FindBy(name="datepick_out")
	WebElement pickout;
	
	@FindBy(name="adult_room")
	WebElement adult;
	
	@FindBy(name="child_room")
	WebElement child;
	
	@FindBy(id="Submit")
	WebElement search;
}
