package com.myntra.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.AddressPage;
import com.myntra.objectRepository.EditProfilePage;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.ProfilePage;

@Listeners(com.myntra.genericLibrary.ListenerImp.class)
public class TC_02_Edit_Address extends Base{
	
	@Test
	public void editAddress()
	{
		AddressPage ap=PageFactory.initElements(driver, AddressPage.class);
		
		ProfilePage prf=PageFactory.initElements(driver, ProfilePage.class);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.getProfileImg().click();
		
		prf.getSaveAddress().click();
		
		ap.getEditAddress().click();
		
		ap.getNameTB().sendKeys(flib.getExcelData("Address", 1, 0));
		
		ap.getMonileNoTB().sendKeys(flib.getExcelData("Address", 1, 1));
		
		ap.getAddressTB().sendKeys(flib.getExcelData("Address", 1, 2));
		
		ap.getSaveBT().click();
		
		ap.getOfficeRadioBT().click();
		
		
		
		
	}

}
