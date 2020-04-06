package com.myntra.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.NewAddressPage;
import com.myntra.objectRepository.ProfilePage;

public class TC_03_AddNewAddress extends Base{
	
	@Test
	public void newAddress()
	{
        ProfilePage prf=PageFactory.initElements(driver, ProfilePage.class);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		hp.getProfileImg().click();
		
		prf.getSaveAddress().click();
		
		NewAddressPage np=PageFactory.initElements(driver,NewAddressPage.class);
		
		np.getNewAddress().click();
		
		np.getNameTB().sendKeys("Shalini K N");
		
		np.getMobileTB().sendKeys("9206567718");
		
		np.getPincodeTB().sendKeys("560105");
		
		np.getStateTB().sendKeys("Karnataka");
		
		np.getCityTb().sendKeys("Bangalore");
		
		np.getAddressTb().sendKeys("#44,nisarga layout");
		
		np.getLocalityTb().sendKeys("harapanahalli");
		
		np.getHomeRadioBt().click();
		
		np.getSavedAddress().click();
	}

}
