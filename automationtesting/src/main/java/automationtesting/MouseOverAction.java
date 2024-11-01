package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	   WebElement blogs=  driver.findElement(By.id("blogsmenu"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(blogs).build().perform();
		
		Thread.sleep(2000);
		WebElement seleniumByarun=	driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		seleniumByarun.click();
		
		String titlename=driver.findElement(By.xpath("//h1[text()[normalize-space()='Selenium-By-Arun']]")).getText();
		
		System.out.println(titlename);
	}

}
