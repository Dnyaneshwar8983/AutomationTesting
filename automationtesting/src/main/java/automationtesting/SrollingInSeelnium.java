package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollingInSeelnium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();
		
		WebElement vbScript= driver.findElement(By.xpath("//a[contains(text(),'VBScript')]"));
		
		//This will scroll the page Horizontally till the element is found
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", vbScript);
		

	}

}
