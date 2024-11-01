package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement buttonChoosefile=	driver.findElement(By.id("uploadfile"));
	
	buttonChoosefile.sendKeys("C:\\Users\\JAYA VYAWHARE\\eclipse-workspace\\automationtesting\\src\\main\\resources\\testdata\\demofile.txt");


	}

}
