package automationtesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ToLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA
		// VYAWHARE\\Desktop\\chromedriver.exe"); // use for old version of selenium

		WebDriver driver = new ChromeDriver(); // To luanch the chrome browser

		driver.get("https://omayo.blogspot.com/"); // eneter the url
		driver.manage().window().maximize(); // maximize the current window/browser

		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		// driver.manage().window().maximize();
		Thread.sleep(3000);

		String title = driver.getTitle();
		System.out.println(title);
		if ("omayo (QAFox.com)".equalsIgnoreCase(title)) {
			System.out.println("Tile is match");

		} else {
			System.out.println("Tile is not match");
		}

		String appUrl = driver.getCurrentUrl(); // return/ find
		System.out.println(appUrl);
		if ("https://omayo.blogspot.com/".equalsIgnoreCase(appUrl)) {
			System.out.println("url  is match");

		} else {
			System.out.println("url is not match");
		}
		String pgSource = driver.getPageSource(); // return the page source
		System.out.println(pgSource);
		
		driver.navigate().back(); // click back button
		driver.navigate().forward(); // click forward button
		// driver.close(); // close the current browser
		driver.quit(); // close the open all windows
	}

}
