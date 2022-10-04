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

public class TC003_VerifySingleBagProductAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void singleBagProductAddToCartFunctionality() throws InterruptedException, IOException
	{
		// BagButton
		HomePagePOMClass homepage = new HomePagePOMClass(driver);
		
		homepage.clickOnBagButton();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on Add to cart button of single Bag product");

		//Validation-------------------------------------------------------
		
		String expectedCount = "1";
		String actualCount = homepage.getTextFromCartButton();
		
		Assert.assertEquals(actualCount, expectedCount, "Count is not matching");
		
		log.info("Validation is applied");

	}
	
}
