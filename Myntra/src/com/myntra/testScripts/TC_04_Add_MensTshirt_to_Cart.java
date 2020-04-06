package com.myntra.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.MenDropdown;

@Listeners(com.myntra.genericLibrary.ListenerImp.class)
public class TC_04_Add_MensTshirt_to_Cart extends Base{
	
	@Test 
	public void menTshirt()
	{
		MenDropdown md=PageFactory.initElements(driver, MenDropdown.class);
		
		util.moveToElement(driver, md.getMenLink());
		md.gettShirtLink().click();
		util.moveToElementDouble(driver, md.getTshirtImg());
		String cid=driver.getWindowHandle();
		
		driver.switchTo().window(cid);
		
		
		md.getWishlistNowBt().click();

	}

}
