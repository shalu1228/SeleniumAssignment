package com.myntra.testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
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
		String hTitle=driver.getTitle();
		Reporter.log(hTitle, true);
		util.moveToElement(driver, hp.getProfileImg());
		ProfilePage p=PageFactory.initElements(driver, ProfilePage.class);
		
		p.getEditProfile().click();
		String editTitle=driver.getPageSource();
		Reporter.log(editTitle, true);
		EditProfilePage ep=PageFactory.initElements(driver, EditProfilePage.class);
		ep.getFirstNameTB().sendKeys(flib.getExcelData("Profile", 1, 0));
		ep.getLastNameTB().sendKeys(flib.getExcelData("Profile", 1, 1));
		ep.getFemaleRadio().click();
		ep.getLocationTB().sendKeys(flib.getExcelData("Profile", 1, 3));
		ep.getConfirmBt().click();
		
		
		
	}

}
