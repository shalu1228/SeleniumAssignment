package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage {
	
	@FindBy(xpath="//p[contains(text(),'DILLINGER Men Navy')]/parent::div[@class='itemdetails-itemDetails']/parent::div[@class='itemcard-itemActions']/preceding-sibling::div[@class='itemcard-itemImageDiv']/div[@class='itemcard-removeIcon']")
    private WebElement remove;
	
	@FindBy(xpath="//p[contains(text(),'DILLINGER Men Navy')]")
	private WebElement TshirtName;

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getTshirtName() {
		return TshirtName;
	}
}
