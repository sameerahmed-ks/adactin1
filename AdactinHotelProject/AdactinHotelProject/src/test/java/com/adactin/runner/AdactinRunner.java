package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.com.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactinfeature\\com\\AdactinFeature.feature", glue="com.adactin.stepdefinition",plugin= {"pretty","html:Report/Cucumber_Html_Report","json:Report/Cucumber_Json_Report.json","com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"})
public class AdactinRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = Base_Class.browserlaunch("chrome");
	}
	
	@AfterClass
	public static void tearDown() throws IOException {
		//Base_Class.printscreen();
		//Base_Class.printscreen();
	}
}
