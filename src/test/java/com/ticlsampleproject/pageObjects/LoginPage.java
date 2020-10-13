package com.ticlsampleproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver ;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(name="signin")
	@CacheLookup
	WebElement clicksigninbutton;
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="continuebtn")
	@CacheLookup
	WebElement clickcontinuebutton;
	
	public void clickSignin() {
		clickcontinuebutton.click();
	}
	
	public void setUserName(String username) {
		txtusername.sendKeys("9035766702");
	}
	
	public void clicksubmit() {
		clickcontinuebutton.click();
	}
	
	
	////*[@data-cy='userName'] // //*[@data-cy='continueBtn']

}
