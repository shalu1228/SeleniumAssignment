package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profileImg;
	
	public WebElement getProfileImg() {
		return profileImg;
	}

	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Men']")
	private WebElement menLink;
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Women']")
	private WebElement womenLink;
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Kids']")
	private WebElement kidsLink;
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Home & Living']")
	private WebElement homeLink;
	
	@FindBy(xpath="//div[@class='desktop-navLink']/a[text()='Discover']")
	private WebElement discoverLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishList;
	
	@FindBy(xpath="//span[text()='Bag']")
	private WebElement bagLink;
	
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement searchBx;

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getDiscoverLink() {
		return discoverLink;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getBagLink() {
		return bagLink;
	}

	public WebElement getSearchBx() {
		return searchBx;
	}
	
	

}
