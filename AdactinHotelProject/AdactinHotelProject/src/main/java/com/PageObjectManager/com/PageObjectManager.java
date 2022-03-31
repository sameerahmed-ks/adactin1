package com.PageObjectManager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.BookHotel_page;
import com.pom.com.LoginPage;
import com.pom.com.SearchHotel_Page;
import com.pom.com.SelectHotel_Page;

public class PageObjectManager {

	public WebDriver driver;
	
	private LoginPage login;
	private SearchHotel_Page searchHotel;

	private SelectHotel_Page selecthotel;

	private BookHotel_page Bookhotel;

	public LoginPage getInstanceLogin() {
		
		login = new LoginPage(driver);
		return login;
	}
	
	public SearchHotel_Page getInstanceSearchPage() {
		
		searchHotel = new SearchHotel_Page(driver);
		return searchHotel;
	}
	public SelectHotel_Page getInstanceSelecthotel() {
		 selecthotel = new SelectHotel_Page(driver);
		return selecthotel;
		
	}
	public BookHotel_page getInstanceBookhotel() {
		Bookhotel = new BookHotel_page(driver);
		return Bookhotel;
		
	}
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
