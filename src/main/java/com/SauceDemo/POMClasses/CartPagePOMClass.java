package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass 
{
	private WebDriver driver;
	
	// Product ---------------------------------------------------------------------------------
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private WebElement product;
	
	public void clickOnProduct()
	{
		product.click();
	}
	
	// Remove ----------------------------------------------------------------------------------
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removeButton;
	
	public void clickOnRemoveButton()
	{
		removeButton.click();
	}
	
	// Continue Shopping ----------------------------------------------------------------------
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueShoppingButton;
	
	public void clickOnContinueShoppingButton()
	{
		continueShoppingButton.click();
	}
	
	// Checkout -------------------------------------------------------------------------------
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutButton;
	
	public void clickOnCheckoutButton()
	{
		checkoutButton.click();
	}
	
	// Constructor ******************************************************************************
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

}
