package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndPagePOMClass 
{
	private WebDriver driver;
	
	// BackHome Button
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backHomeButton;
	
	public void clickOnBackHomeButton()
	{
		backHomeButton.click();
	}
	
	//ShoppingEndMessage
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement shoppingEndMessage;
	
	public String getTextFromEndPage()
	{
		String textMsg = shoppingEndMessage.getText();
		return textMsg;		
	}
	
	// Constructor-----------------------------------------------------------------
	
	public EndPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	

}
