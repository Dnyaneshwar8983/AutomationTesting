package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditioninSelenium {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		/*
		 * WebElement title=driver.findElement(By.
		 * xpath("//h1[text()[normalize-space()='omayo (QAFox.com)']]"));
		 * 
		 * if(title.isDisplayed()) { System.out.println("Title is displyed");
		 * 
		 * } else { System.out.println("Title is not displyed"); }
		 * 
		 * WebElement disbaleText=driver.findElement(By.id("tb2"));
		 * 
		 * System.out.println("disable text box  male " +disbaleText.isEnabled());
		 * 
		 * WebElement fieldTwoText=driver.findElement(By.xpath(
		 * "(//div[@class='widget-content']//textarea)[2]"));
		 * System.out.println("Enable text box  male " +fieldTwoText.isEnabled());
		 * 
		 * WebElement maleRadioButton=driver.findElement(By.id("radio1"));
		 * System.out.println(" before Radion button male "
		 * +maleRadioButton.isSelected()); maleRadioButton.click();
		 * System.out.println("After Radion button male "
		 * +maleRadioButton.isSelected());
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement fmaleRadioButton=driver.findElement(By.id("radio2"));
		 * System.out.println(" before Radion button female "
		 * +fmaleRadioButton.isSelected()); fmaleRadioButton.click();
		 * System.out.println("After Radion button female "
		 * +fmaleRadioButton.isSelected());
		 */
		
		WebElement orangeChectBox=driver.findElement(By.id("checkbox1"));
		WebElement blueChectBox=driver.findElement(By.id("checkbox2"));
		Thread.sleep(4000);
		Thread.sleep(4000);
		if(orangeChectBox.isSelected()) {
			blueChectBox.click();
		}
		else {
			orangeChectBox.click();
			blueChectBox.click();
		}
		
	}

}
