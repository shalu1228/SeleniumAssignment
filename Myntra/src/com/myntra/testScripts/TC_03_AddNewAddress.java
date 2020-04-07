package com.myntra.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.NewAddressPage;
import com.myntra.objectRepository.ProfilePage;

@Listeners(com.myntra.genericLibrary.ListenerImp.class)
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
		
		np.getNameTB().sendKeys(flib.getExcelData("NewAddress", 1, 0));
		
		np.getMobileTB().sendKeys(flib.getExcelData("NewAddress", 1, 1));
		
		np.getPincodeTB().sendKeys(flib.getExcelData("NewAddress", 1, 2));
		
		np.getStateTB().sendKeys(flib.getExcelData("NewAddress", 1, 3));
		
		np.getCityTb().sendKeys(flib.getExcelData("NewAddress", 1, 4));
		
		np.getAddressTb().sendKeys(flib.getExcelData("NewAddress", 1, 5));
		
		np.getLocalityTb().sendKeys(flib.getExcelData("NewAddress", 1, 6));
		
		np.getHomeRadioBt().click();
		
		np.getSavedAddress().click();
	}

}
