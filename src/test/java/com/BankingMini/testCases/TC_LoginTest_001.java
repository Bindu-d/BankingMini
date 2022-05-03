package com.BankingMini.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BankingMini.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{	
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Enter Username");
		
		lp.setPassword(password);
		logger.info("Enter Password");
		
		lp.clickSubmit();
	   	
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("LoginTest Passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("LoginTest Failed");
		}
		
	}


}
