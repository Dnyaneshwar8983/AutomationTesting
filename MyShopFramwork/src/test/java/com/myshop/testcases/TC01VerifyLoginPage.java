package com.myshop.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myshop.base.Base;
import com.myshop.dataprovider.DataProviders;
import com.myshop.pageobject.HomePage;
import com.myshop.pageobject.LogInPage;


import jdk.internal.org.jline.utils.Log;



public class TC01VerifyLoginPage extends Base{
	
	
	LogInPage login = new LogInPage();
	private HomePage homePage = new HomePage();
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser); 
	}
		
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	
	@Test(groups = "Smoke",dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String username, String password) throws Throwable {
		
	
		login.LogInPage();
		login.login2(username, password);
	
		
	}

}
