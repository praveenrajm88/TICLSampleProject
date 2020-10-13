package com.ticlsampleproject.testCases;

import org.testng.annotations.Test;

import com.ticlsampleproject.pageObjects.BaseClass;
import com.ticlsampleproject.pageObjects.LoginPage;

public class TC_SigninTest_001 extends BaseClass {
	@Test
	public void signinTest() {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		
		lp.clickSignin();
		lp.setUserName(username);
		lp.clicksubmit();
	}
 
}
 