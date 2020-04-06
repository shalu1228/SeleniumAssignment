package com.myntra.testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.EditProfilePage;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.ProfilePage;

@Listeners(com.myntra.genericLibrary.ListenerImp.class)
public class TC_01_EditProfile extends Base{
	
	@Test
	public void editProfile()
	{
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		util.moveToElement(driver, hp.getProfileImg());
		
		ProfilePage p=PageFactory.initElements(driver, ProfilePage.class);
		
		p.getEditProfile().click();
		
		EditProfilePage ep=PageFactory.initElements(driver, EditProfilePage.class);
		ep.getFirstNameTB().sendKeys("Shalini");
		ep.getLastNameTB().sendKeys("K N");
		ep.getDobTB().sendKeys("28-12-1998");
		ep.getFemaleRadio().click();
		ep.getLocationTB().sendKeys("bangalore");
		ep.getConfirmBt().click();
		
		
	}

}
