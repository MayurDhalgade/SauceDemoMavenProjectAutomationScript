package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass 
{
private WebDriver driver;
	
	//FirstName
	@FindBy(xpath="(//input[@id='first-name'])")
	private WebElement firstName;
	
	public void sendFirstName()
	{
		firstName.sendKeys("Mayur");
	}
	
	//LastName
	@FindBy(xpath="(//input[@id='last-name'])")
	private WebElement lastName;
	
	public void sendLastName()
	{
		lastName.sendKeys("Dhalgade");
	}
	
	//PostalCode
	@FindBy(xpath="(//input[@id='postal-code'])")
	private WebElement postalCode;
	
	public void sendPostalCode()
	{
		postalCode.sendKeys("411014");
	}
	
	//cancel
	@FindBy(xpath="(//button[@id='cancel'])")
	private WebElement cancelOnCheckoutPage;
	
	public void clickOnCancelButton()
	{
		cancelOnCheckoutPage.click();
	}
	
	//continue
	@FindBy(xpath="(//input[@id='continue'])")
	private WebElement continueButton;
	
	public void ClickOncontinueButton()
	{
		continueButton.click();
	}
	
	//Constructor
	
	public CheckOutPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	

}
