package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	
	static Logger log = LogManager.getLogger(DemoTest.class);

	public static void main(String[] args) {
		log.info("Info Message!");
	      log.error("Error Message!");
	      log.warn("Warn Message!");
	      log.fatal("Fatal Message!");
		System.out.println("Hello world");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        log.info("driver launch");
        driver.get("https://www.facebook.com/");
        log.info("i am on fb page");
        driver.quit();
       
	}
	
}
