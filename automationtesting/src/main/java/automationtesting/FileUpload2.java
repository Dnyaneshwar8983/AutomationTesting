package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement fileupload = driver.findElement(By.name("anyfile"));
		fileupload.sendKeys("C:\\Users\\JAYA VYAWHARE\\Desktop\\practicefileupload123.txt");

	}

}
