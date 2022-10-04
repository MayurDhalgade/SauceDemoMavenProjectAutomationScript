package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	private WebDriver driver;

//userName Elm------------------------------------------------------------------------
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userName;

	public void sendUsername() 
	{
		userName.sendKeys("standard_user");
	}
//password Elm--------------------------------------------------------------------------
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public void sendPassword() 
	{
		password.sendKeys("secret_sauce");
	}
//Login button---------------------------------------------------------------------------	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
//Constructor------------------------------------------------------------------
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

}
