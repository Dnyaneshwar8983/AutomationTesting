package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditions1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		/*
		 * WebElement tilte = driver.findElement(By.xpath("//h1[@class='title']"));
		 * tilte.isDisplayed();
		 * 
		 * System.out.println(tilte.isDisplayed());
		 * 
		 * System.out.println(tilte.getText()); WebElement checkBox =
		 * driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		 * checkBox.click(); System.out.println(checkBox.isSelected());
		 */

		WebElement button = driver.findElement(By.id("but1"));

		button.isEnabled();
		System.out.println(button.isEnabled());

		WebElement button2 = driver.findElement(By.id("but2"));

		button2.isEnabled();
		System.out.println(button2.isEnabled());
		
		System.out.println("calss completed");

	}

}
