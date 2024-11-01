package com.myshop.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myshop.base.Base;
import com.myshop.dataprovider.DataProviders;
import com.myshop.pageobject.HomePage;
import com.myshop.pageobject.LogInPage;

public class HomePageAddToCart extends Base{

	
	
  private LogInPage login = new LogInPage() ;
  private HomePage homePage =new HomePage();
 
  
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
	public void productAddToCart(String username, String password) throws InterruptedException {
		
		login.LogInPage();
		login.login2(username, password);  
		homePage.HomePage();
		homePage.addToCart();
		Thread.sleep(1000);
		homePage.clicklogoAddToCart();
		Thread.sleep(1000);
		homePage.clickCheckOut();
	}
	
}
