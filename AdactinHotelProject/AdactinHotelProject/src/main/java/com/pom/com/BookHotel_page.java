package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_page {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
		@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement cc_num;
	@FindBy(name="cc_type")
	private WebElement cc_type;
	@FindBy(name="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(name="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(name="book_now")
	private WebElement booknow;
	@FindBy(name="my_itinerary")
	private WebElement my_itinerary;
	@FindBy(name="logout")
	private WebElement logout;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	public WebElement getlogout() {
		return logout;
		
	}

	public BookHotel_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);





	}
}


