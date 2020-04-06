package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	
	@FindBy(xpath="//div[contains(text(),'Saved Addresses')]")
	private WebElement savedAddress;
	
	@FindBy(xpath="//div[contains(text(),' EDIT')]")
	private WebElement editAddress;
	
	@FindBy(name="name")
	private WebElement nameTB;
	
	@FindBy(name="mobile")
	private WebElement monileNoTB;
	
	
	@FindBy(name="address")
	private WebElement addressTB;
	
	@FindBy(xpath="//span[text()='Office']")
	private WebElement officeRadioBT;
	
	@FindBy(xpath="//div[@class='addAddressModal-button ' and contains(text(),'Save')]")
	private WebElement saveBT;

	public WebElement getSavedAddress() {
		return savedAddress;
	}

	public WebElement getEditAddress() {
		return editAddress;
	}

	public WebElement getNameTB() {
		return nameTB;
	}

	public WebElement getMonileNoTB() {
		return monileNoTB;
	}

	public WebElement getAddressTB() {
		return addressTB;
	}

	public WebElement getOfficeRadioBT() {
		return officeRadioBT;
	}

	public WebElement getSaveBT() {
		return saveBT;
	}
	
	
	

}
