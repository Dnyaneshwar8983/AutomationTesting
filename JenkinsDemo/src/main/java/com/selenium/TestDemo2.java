package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo2 {
	WebDriver driver;
@BeforeMethod
	public void setup() {

	if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	
	}
	else if(System.getProperty("browser").equalsIgnoreCase("fireFox")) {
	
	driver=new FirefoxDriver();
	}
	
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		

	}
@AfterMethod
public void closeBrowser() {
	
	driver.quit();
}
}
