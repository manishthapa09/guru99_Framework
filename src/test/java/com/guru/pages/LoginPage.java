package com.guru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//input[@name='uid']") WebElement useridTxt_XPATH;
	@FindBy(xpath="//input[@name='password']") WebElement passwordTxt_XPATH;
	@FindBy(xpath="//input[@value='LOGIN']") WebElement loginBtn_XPATH;
	@FindBy(xpath="//input[@value='RESET']") WebElement resetBtn_XPATH;
	
	public void loginToGuru(String userid, String password) {
		useridTxt_XPATH.sendKeys(userid);
		passwordTxt_XPATH.sendKeys(password);
		loginBtn_XPATH.click();
	}
}
