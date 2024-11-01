package com.myshop.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.actiondrivers.Action;
import com.myshop.base.Base;





public class LogInPage extends Base {

	
	Action act = new Action();

	@FindBy(name="user-name")
	private WebElement tesxtBoxemailUserName;
	
	@FindBy(name="password")
	private WebElement textBoxpassword;
	
	@FindBy(id="login-button")
	private WebElement buttonLogin;
	
	@FindBy(xpath="//div[text()='Products']")
	private WebElement titlePoductHomePage;
	
	public void LogInPage() {
		PageFactory.initElements(getDriver(), this);
			
	}
	
	public boolean login2(String uname, String password) {
	
		act.type(tesxtBoxemailUserName, uname);
		act.type(textBoxpassword, password);
		act.click(getDriver(), buttonLogin);
		
		return titlePoductHomePage.isDisplayed();
	}
	
	
}
