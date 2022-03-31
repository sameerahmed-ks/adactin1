package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page {

public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="hotels")
	private WebElement hotels;

	@FindBy(name="room_nos")
	private WebElement roomNums;
	
	@FindBy(name="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(name="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(name="adult_room")
	private WebElement adultRoom;
	
	@FindBy(name="child_room")
	private WebElement childRoom;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	@FindBy(name="Reset")
	private WebElement reset;

	public WebElement getReset() {
		return reset;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getChildroom() {
		return childRoom;
	}
	
	public WebElement getAdultroom() {
		return adultRoom;
	}
	
	public WebElement getCheckoutDate() {
		return checkOutDate;
	}
	
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	
	public WebElement getRoomnums() {
		return roomNums;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}
	
	public SearchHotel_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
