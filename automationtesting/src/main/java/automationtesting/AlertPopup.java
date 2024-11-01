package automationtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement confirmalert = driver.findElement(By.id("confirm"));
		confirmalert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); 
		// alert.accept(); // clicking on Ok button
		alert.dismiss(); // clicking on cancel button
		
		Thread.sleep(3000);
	//driver.switchTo().frame("iframe1");
	//	driver.findElement(By.id("icon-button")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
	}

}
