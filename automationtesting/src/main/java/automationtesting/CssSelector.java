package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("Amol1234Testbgtdbvxgcbb");
		
		WebElement text=driver.findElement(By.cssSelector("input#textbox1"));
		
		text.clear();
		text.sendKeys("After clear text");
		
		driver.findElement(By.className("gsc-input")).sendKeys("hello");
		
		WebElement	serachBox=driver.findElement(By.xpath("(//input[@title='search'])[1]"));
		serachBox.sendKeys("Testing");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.cssSelector("input[fdprocessedid='hituj']")).sendKeys("Amol1234");
		

	}

}
