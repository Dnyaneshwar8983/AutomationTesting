package com.myshop.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.actiondrivers.Action;
import com.myshop.base.Base;

public class HomePage2 extends Base{

	Action action = new Action();
	
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	private WebElement addTocrad;
	
	@FindBy(xpath = "//div[@class='shopping_cart_container']//a[1]")
	private WebElement addToCartLogo;
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	private WebElement buttonCheckOut;
	
	
	
	public void HomePage2() {
		PageFactory.initElements(getDriver(), this);
			
	}
	
	public void clickOnButtonAddTocart() throws InterruptedException {
		
		action.click(getDriver(), addTocrad);
		Thread.sleep(2000);
		action.click(getDriver(), addToCartLogo);
		Thread.sleep(2000);
		action.click(getDriver(), buttonCheckOut);
	}
	

}
