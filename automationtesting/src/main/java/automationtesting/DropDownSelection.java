package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement dropDownButton=driver.findElement(By.id("drop1"));
	
	Select s= new Select(dropDownButton);
//	s.selectByIndex(4);
//	s.selectByValue("def");
	s.selectByVisibleText("doc 3");
	
	driver.findElement(By.id("radio2")).click();
	
	}

}
