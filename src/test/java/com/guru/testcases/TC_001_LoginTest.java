package com.guru.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.guru.pages.LoginPage;
import com.guru.utilities.BaseClass;

public class TC_001_LoginTest extends BaseClass{

	@Test
	public void loginApp() {
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.loginToGuru(excel.getStringData("LoginSheet", 0, 0), excel.getStringData("LoginSheet", 0, 1));
	}
}
