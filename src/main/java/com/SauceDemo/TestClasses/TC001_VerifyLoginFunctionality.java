package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC001_VerifyLoginFunctionality extends TestBaseClass
{
	
	
	@Test
	public void loginFunctionality() throws IOException, InterruptedException 
	{
	//Validation=============================================================
		
	String expectedURL = "https://www.saucedemo.com/inventory.html";
	String actualURL = driver.getCurrentUrl();
	
	Assert.assertEquals(actualURL, expectedURL,"URL is not matching");
	
	log.info("Validation is applied");
		
		// Take Screenshot
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on menu button");
	
	}
	
	
			
		
	

}
