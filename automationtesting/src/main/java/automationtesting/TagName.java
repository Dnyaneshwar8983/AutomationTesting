package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List <WebElement> tagnameA = driver.findElements(By.tagName("a"));
		
		for(WebElement link:tagnameA) {
					
		String url=	link.getText();
			System.out.println(link.getText());
			
			
		if("http://www.Selenium143.blogspot.com".equalsIgnoreCase(url)) {
			
			link.click();
		}

			
		}

	}

}
