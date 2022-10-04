package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage 
{
private WebDriver driver;
	
	// Product info ---------------------------------------------------------------------------
	@FindBy(xpath="(//div[@class='inventory_item_name'])")
	private  WebElement productinfo;
	
	public void clickOnproductinfo()
	{
		productinfo.click();
	}
	
	
	// Cancel ---------------------------------------------------------------------------------
	@FindBy(xpath="(//button[@id='cancel'])")
	private WebElement cancelButton;
	
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	
	
	// Finish ---------------------------------------------------------------------------------
	@FindBy(xpath="(//button[@id='finish'])")
	private WebElement finishButton;
	
	public void clickOnFinishButton()
	{
		finishButton.click();
	}
	
	// Constructor **************************************************************************
	public BillingPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
