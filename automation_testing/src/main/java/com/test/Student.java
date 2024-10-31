package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {
	
	static Logger log = LogManager.getLogger(Student.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        log.info("waiting for 2 sec");
		driver.get("https://www.facebook.com/");
		log.info("Logged into Myntra");
		try {
			boolean text= driver.findElement(By.id("email25")).isDisplayed();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
		
		
	}
}
