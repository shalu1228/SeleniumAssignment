package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;


public class LoginPage {

	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profileImg;
	
	@FindBy(xpath="//a[text()='log in']")
	private WebElement logIn;
	
	@FindBy(name="email")
	private WebElement emailTb;
	
	@FindBy(name="password")
	private WebElement passwordTb;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement logInBt;
	
	
	@FindBy(xpath=" //div[contains(text(),'Logout')] ")
	private WebElement logOut;

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getProfileImg() {
		return profileImg;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getEmailTb() {
		return emailTb;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public WebElement getLogInBt() {
		return logInBt;
	}
	
	
	

}
