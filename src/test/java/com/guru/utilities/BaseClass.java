package com.guru.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	
	@BeforeSuite
	public void setUpSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getSiteURL());
	}
	
	@AfterSuite
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
}
