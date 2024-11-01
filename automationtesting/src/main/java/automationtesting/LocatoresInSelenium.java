package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoresInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		// Locator id
		WebElement textAreaField = driver.findElement(By.id("ta1")); // Locator id
		textAreaField.sendKeys("Testing");

		// Locator name
		WebElement prelodaedText = driver.findElement(By.name("fname"));
		prelodaedText.clear();
		prelodaedText.sendKeys(" For Automation");

		// Locator Linktext
		WebElement linkSeleniumTutorial = driver.findElement(By.linkText("SeleniumTutorial"));
		linkSeleniumTutorial.click();
		
		// Locator PartialLinktext
		WebElement partiallinkSeleniumTutorial=driver.findElement(By.partialLinkText("Selenium"));
		partiallinkSeleniumTutorial.click();
		
		List<WebElement> linkSeleniumTutorial1=driver.findElements(By.id("drop1"));
		for(WebElement l:linkSeleniumTutorial1) {
			
			System.out.println(l.getText());
		}
		
		// Locator tagName
		List<WebElement> tagname=driver.findElements(By.tagName("a"));
         for(WebElement t:tagname) {
        
			System.out.println(t.getText());
			
			WebElement	serachBox=driver.findElement(By.xpath("(//input[@title='search'])[1]"));
			serachBox.sendKeys("Testing");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			
			driver.findElement(By.cssSelector("input[fdprocessedid='hituj']")).sendKeys("Amol1234");
			
		}
		
	}

}
