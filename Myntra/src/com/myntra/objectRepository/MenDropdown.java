package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenDropdown {
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Men']")
	private WebElement menLink;
	
	@FindBy(xpath="//div[@data-group='men']/descendant::a[text()='T-Shirts']")
	private WebElement tShirtLink;
	
	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement gettShirtLink() {
		return tShirtLink;
	}

	public WebElement getTshirtImg() {
		return tshirtImg;
	}

	public WebElement getWishlistNowBt() {
		return wishlistNowBt;
	}

	@FindBy(xpath="//img[contains(@title,'DILLINGER Men Navy Blue Colourblocked Round Neck T-shirt')]")
	private WebElement tshirtImg;
	
	@FindBy(xpath="//span[text()='WISHLIST NOW']")
	private WebElement wishlistNowBt;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistPage;

	public WebElement getWishlistPage() {
		return wishlistPage;
	}
	
	
	@FindBy(xpath="//p[contains(text(),'DILLINGER Men Navy Blue Colourblocked Round Neck T-shirt')]")
	private WebElement productName;

	public WebElement getProductName() {
		return productName;
	}

}
