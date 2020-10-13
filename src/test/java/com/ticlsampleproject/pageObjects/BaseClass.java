package com.ticlsampleproject.pageObjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public String baseURL = "https://www.makemytrip.com/";
	public String username = "praveen";
	public String password = "";
	public static WebDriver driver;

	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}

