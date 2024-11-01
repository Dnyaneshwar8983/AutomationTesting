package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textbox=driver.findElement(By.xpath("//form[@name='form1']//input[1]"));
		
		//This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", textbox);
		
	}

}
