package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	@FindBy(xpath="//div[contains(text(),'Edit Profile')]")
	private WebElement editProfile;
	
	
	@FindBy(xpath="//div[contains(text(),'Saved Addresses')]")
	private WebElement saveAddress;


	public WebElement getEditProfile() {
		return editProfile;
	}


	public WebElement getSaveAddress() {
		return saveAddress;
	}
	

}
