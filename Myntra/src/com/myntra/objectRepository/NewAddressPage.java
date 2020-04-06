package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAddressPage {
	
	@FindBy(xpath="//div[contains(text(),'Saved Addresses')]")
	private WebElement savedAddress;
	
	@FindBy(xpath="//div[contains(text(),' + Add New Address ')]")
	private WebElement newAddress;
	
	@FindBy(name="name")
	private WebElement nameTB;
	
	@FindBy(name="mobile")
	private WebElement mobileTB;
	
	@FindBy(name="pincode")
	private WebElement pincodeTB;
	
	public WebElement getSavedAddress() {
		return savedAddress;
	}

	public WebElement getNewAddress() {
		return newAddress;
	}

	public WebElement getNameTB() {
		return nameTB;
	}

	public WebElement getMobileTB() {
		return mobileTB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getStateTB() {
		return stateTB;
	}

	public WebElement getAddressTb() {
		return addressTb;
	}

	public WebElement getLocalityTb() {
		return localityTb;
	}

	public WebElement getCityTb() {
		return cityTb;
	}

	public WebElement getHomeRadioBt() {
		return homeRadioBt;
	}

	@FindBy(name="state")
	private WebElement stateTB;
	
	@FindBy(name="address")
	private WebElement addressTb;
	
	@FindBy(name="locality")
	private WebElement localityTb;
	
	@FindBy(name="city")
	private WebElement cityTb;
	
	@FindBy(xpath="//span[text()='Home']")
	private WebElement homeRadioBt;
	
	
	
	

}
