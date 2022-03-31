package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {

public WebDriver driver;
	
	@FindBy(name="radiobutton_0")
	private WebElement radio;
	
	@FindBy(name="continue")
	private WebElement continueBtn;
	

	public WebElement getRadioBtn() {
		return radio;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	
	public SelectHotel_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
