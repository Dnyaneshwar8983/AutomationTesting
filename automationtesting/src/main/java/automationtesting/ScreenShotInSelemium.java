package automationtesting;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotInSelemium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();
		
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
	File sc=screenshot.getScreenshotAs(OutputType.FILE);
	
	
	
	
		
		
		
	}

}
