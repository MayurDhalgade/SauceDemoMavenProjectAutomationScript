package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	private WebDriver driver;
	private Select s;
	
	// bagProduct --------------------------------------------------------
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	
	public void clickOnBagButton()
	{
		bagButton.click();
	}
	
	// AddToCart ------------------------------------------------------------------------
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement AddToCartButton;
		
		public String getTextFromCartButton()
		{
			String totalProducts = AddToCartButton.getText();
			return totalProducts;
		}
		
	//allAddToCart  -------------------------------------------------------
	@FindBy(xpath="//button[text()='Add to cart']")
	private List <WebElement> multipleAddToCartButton;
	
	public void clickAllAddToCart()
	{
		for(WebElement i : multipleAddToCartButton)
		    i.click();
	}
	
	// cartLogo
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement cartLogo;
	
	public void clickOnCartLogo()
	{
		cartLogo.click();
	}
	
	
	// Menu
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickOnMenu()
	{
		menuButton.click();
	}
	
	
	
	// Logout
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void clickOnLogout()
	{
		logoutButton.click();
	}
	
	
	//Constructor-----------------------------------------------------
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	
}
