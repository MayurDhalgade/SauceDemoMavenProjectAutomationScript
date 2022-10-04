
package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemoMavenProject");
	
	
	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
	        driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
				"./DriverFolder/geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Throw the Exception");
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Wait applied");
		
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		//Login-------------------------------------------------------------------
		
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		
		lp.sendUsername();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Username Entered");
		
		lp.sendPassword();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Password Entered");
		
		lp.clickLoginButton();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on Login button");
	}
	
	@AfterMethod
	public void logout() throws IOException, InterruptedException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.clickOnMenu();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on menu button");
		hp.clickOnLogout();
		ScreenshotClass.takeScreenshot(driver);
		log.info("Clicked on logot button");
		
		log.info("Logout successful");
		
	}
	
	@AfterClass
	public void browserClose()
	{
		driver.quit();
		log.info("Browser closed");
		
	}
	
	
	
	

}
