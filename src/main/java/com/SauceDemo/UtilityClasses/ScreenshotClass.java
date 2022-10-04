package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		//date & time format code
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		String date = d1.format(d);
		
		//screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenshotFolder/SauceDemo"+date+".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("screenshot is taken");


	}

}
