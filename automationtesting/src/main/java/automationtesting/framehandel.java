package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		int totalFrame = driver.findElements(By.tagName("iframe")).size();

		System.out.println(totalFrame);

		// driver.switchTo().frame(0); // using index

		// driver.switchTo().frame("iframe1"); // Using id or name

		WebElement frameweb = driver.findElement(By.xpath("//iframe[@id='iframe1']"));

		driver.switchTo().frame(frameweb); // using WebElement
		
		driver.findElement(By.linkText("Google+")).click();

		driver.switchTo().parentFrame(); // switch back to current parrent frame

		WebElement frameweb2 = driver.findElement(By.xpath("//iframe[@id='iframe1']/following-sibling::iframe[1]"));

		driver.switchTo().frame(frameweb2);

		String text = driver.findElement(By.linkText("Omayo")).getText();

		System.out.println(text);

		driver.switchTo().defaultContent(); // switch back to parrent of parrent or main Frame
		driver.findElement(By.linkText("SeleniumTutorial")).click();

	}

}
