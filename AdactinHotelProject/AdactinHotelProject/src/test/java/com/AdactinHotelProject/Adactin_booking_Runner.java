package com.AdactinHotelProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.com.PageObjectManager;
import com.base.com.Base_Class;
import com.reader.com.FileReaderManager;

public class Adactin_booking_Runner extends Base_Class{

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		driver = browserlaunch("chrome");
		
		launchURL(FileReaderManager.getInstanceFR().getInstanceCR().getURL());
		
		PageObjectManager pom = new PageObjectManager(driver);
		
		sendValues(pom.getInstanceLogin().getUser(), FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
		
		sendValues(pom.getInstanceLogin().getPassword(), FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
		
		clickOnElement(pom.getInstanceLogin().getLogin());
		
		
	}
	
}
