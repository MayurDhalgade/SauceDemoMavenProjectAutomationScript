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

public class TC004_VerifyMultipleAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void multipleAddToCartFunctionality() throws InterruptedException, IOException
	{
		// allItemsAddToCart
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		
		homepage.clickAllAddToCart();
		ScreenshotClass.takeScreenshot(driver);
		log.info("All 6 items added to cart");
		
		 // Validation================================================================================
		String expectedCount = "6";
        String actualCount = homepage.getTextFromCartButton();
		
	    Assert.assertEquals(actualCount, expectedCount, "Count is not matching");
	    
		log.info("Validation is applied");

	}
	
}
