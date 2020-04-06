package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePage {
	@FindBy(name="firstName")
	private WebElement firstNameTB;
	
	@FindBy(name="lastName")
	private WebElement lastNameTB;
	
	@FindBy(name="dob")
	private WebElement dobTB;
	
	@FindBy(name="bio")
	private WebElement bioTB;
	
	@FindBy(name="location")
	private WebElement locationTB;
	
	@FindBy(xpath="//input[@value='FEMALE']")
	private WebElement FemaleRadio;
	
	@FindBy(xpath="//input[@value='MALE']")
	private WebElement MaleRadio;
	
	@FindBy(xpath="//div[contains(text(),'Confirm')]")
	private WebElement confirmBt;
	
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	private WebElement cancelBT;

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getDobTB() {
		return dobTB;
	}

	public WebElement getBioTB() {
		return bioTB;
	}

	public WebElement getLocationTB() {
		return locationTB;
	}

	public WebElement getFemaleRadio() {
		return FemaleRadio;
	}

	public WebElement getMaleRadio() {
		return MaleRadio;
	}

	public WebElement getConfirmBt() {
		return confirmBt;
	}

	public WebElement getCancelBT() {
		return cancelBT;
	}
	
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profileImg;

	public WebElement getProfileImg() {
		return profileImg;
	}

	
	
	
	
	
}
