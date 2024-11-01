package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYZ {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://omayo.blogspot.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  driver.findElement(By.className("gsc-input")).sendKeys("amol@123.com");
		  
		  

	}

}
