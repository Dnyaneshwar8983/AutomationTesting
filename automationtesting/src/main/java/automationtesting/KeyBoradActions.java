package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();	
		
		WebElement textBox = driver.findElement(By.id("ta1"));
		
	//	textBox.sendKeys("Testing");
		
		Actions action = new Actions(driver);
	
		action.moveToElement(textBox).sendKeys(textBox, "testing").sendKeys(Keys.ENTER).build().perform();
		
	}

}
