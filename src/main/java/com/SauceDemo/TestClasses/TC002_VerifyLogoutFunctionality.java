package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;


public class TC002_VerifyLogoutFunctionality extends TestBaseClass
{
	
	@Test
	public void logoutFunctionality() throws InterruptedException, IOException
	{
		// Logout
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		homepage.clickOnMenu();
		log.info("Clicked on menu button");
		
		homepage.clickOnLogout();
		log.info("Clicked on menu button");
		
		// Take Screenshot
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on menu button");
				
		// Validation================================================================================
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualTiURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualTiURL, expectedURL, "URL is not matching");
		
		log.info("Validation is applied");
		
	 }	
	
	
}
