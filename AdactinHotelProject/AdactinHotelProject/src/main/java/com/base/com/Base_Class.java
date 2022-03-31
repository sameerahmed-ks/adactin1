package com.base.com;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;               

	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL PC\\eclipse-workspace\\AdactinHotelProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\DELL PC\\eclipse-workspace\\AdactinHotelProject\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Broswer name is invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}

	// ------- launch URL ---------

	public static void launchURL(String url) {
		driver.get(url);
	}

	// ------- SendKeys function -----

	public static void sendValues(WebElement element1, String values) {
		element1.sendKeys(values);
	}

	// ------- Click Method -------

	public static void clickOnElement(WebElement element2) {
		element2.click();
	}

	// ------- driver close -------

	public static void closeWindow() {
		driver.close();
	}

	// ------ driver quit ---------

	public static void quitDriver() {
		driver.quit();
	}
	
	// ------- Implicit  wait ---------
	
	public static void implicitWait(int timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}
	
	// ------- get current URL ------------
	public static String getCurrentURL() {
		String i = driver.getCurrentUrl();
		return i;
	}
	
	// ------- get title URL -------------
	public static String getPageTitle() {
		String i = driver.getTitle();
		return i;
	}
	

	// ----- navigate to  ----------
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	// ----- navigate Back  ----------
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	// ----- navigate forward  ----------
	public static void navigateForward() {
		driver.navigate().forward();
	}	
	
	// ----- navigate Refresh  ----------
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	// ------ Get method  --------------
	public static void getToURL(String url) {
		driver.get(url);
	}

	// ------- Simple Alert -------------
	public static void simpleAlert() {
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();	
	}
	
	// ------- Action Move to element Click --------
	public static void moveToElementClick(WebElement text) {
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(text).click().build();
		seriesOfActions.perform();
	}
	
	// ------- Double click on element --------
	public static void doubleClickOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	// ------- Context click on element(Right click) -----
	public static void rightClickOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}
	
	// -------- Action Mouse Click ------------
	public static void mouseClick(WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.click(elementToClick).build().perform();
	}
	
	// -------- drag and drop --------------
	public static void dragAndDrop(WebElement source,WebElement destination) {
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(destination).release().build().perform();
	}
	
	//---------SendKeys and  Click enter --------------
	public static void mouseClick(WebElement searchtextbox,String valuesToSend) {
		Actions action = new Actions(driver);
		action.sendKeys(searchtextbox, valuesToSend).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	// ---------- converts text to uppercase ----------
	public static void textToUppercase(WebElement element,String upperCaseValues) {
		Actions action = new Actions(driver);
		action.keyDown(element,Keys.SHIFT).sendKeys(upperCaseValues).build().perform();
	}
	
	// --------Move to frame using webelement ------------
	public static void frameUsingWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		}
	
	// --------Move to frame using index ------------
	public static void frameUsingIndex(int indexIsInt) {
		driver.switchTo().frame(indexIsInt);
	}
	
	// --------Move to frame using id ------------
	public static void frameUsingNameOrID(String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}	
	
	// --------Select class using visible text ------------
	public static void selectByVisibleTest(WebElement element,String visibleText) {
		Select objSelect =new Select(element);
		objSelect.selectByVisibleText(visibleText);
	}
	
	// --------Select class using index ------------
	public static void selectByIndex(WebElement element,int index) {
		Select objSelect =new Select(element);
		objSelect.selectByIndex(index);
	}
	
	// --------Select class using value ------------
	public static void selectByValue(WebElement element,String value) {
		Select objSelect =new Select(element);
		objSelect.selectByValue(value);
	}
	
	// -------- DeSelect class using visible text ------------
	public static void deselectByVisibleTest(WebElement element,String visibleText) {
		Select objSelect =new Select(element);
		objSelect.deselectByVisibleText(visibleText);
		}
		
	// -------- DeSelect class using index ------------
	public static void deselectByIndex(WebElement element,int index) {
		Select objSelect =new Select(element);
		objSelect.deselectByIndex(index);
	}
		
	// -------- DeSelect class using value ------------
	public static void deselectByValue(WebElement element,String value) {
		Select objSelect =new Select(element);
		objSelect.deselectByValue(value);
	}
	
	// ------- isSelected method -----------------------
	public static Boolean isSelectedMethod(WebElement element) {
		Boolean Select = element.isSelected();
		return Select;
	}
		
	// ------- isEnabled method -----------------------
	public static Boolean isEnabledMethod(WebElement element) {
	Boolean Select = element.isEnabled();
	return Select;
	}	
		
	// ------ Screenshot method --------
	public static void printscreen() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL PC\\eclipse-workspace\\AdactinHotelProject\\Screenshot\\ScreenshotImage - "+dateFormat.format(date)+".png");
		FileUtils.copyFile(source, dest);

	}
}
