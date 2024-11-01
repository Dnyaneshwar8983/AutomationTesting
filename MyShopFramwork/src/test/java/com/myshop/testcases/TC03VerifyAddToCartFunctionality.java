package com.myshop.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myshop.base.Base;
import com.myshop.dataprovider.DataProviders;
import com.myshop.pageobject.HomePage2;
import com.myshop.pageobject.LogInPage;

public class TC03VerifyAddToCartFunctionality extends Base{

	LogInPage login = new LogInPage();
	HomePage2 hm2 = new HomePage2();
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	
	
	@Test(groups = "Smoke",dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void  endToEnd(String username, String password) throws InterruptedException {
		
		login.LogInPage();
		login.login2(username, password);
		hm2.HomePage2();
		hm2.clickOnButtonAddTocart();
		
	}
	
	
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
}
