package com.myntra.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLibrary.Base;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.WishListPage;

@Listeners(com.myntra.genericLibrary.ListenerImp.class)
public class TC_05_Remove_Item_From_WishList extends Base{
	
	@Test
	public void removeItem()
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		String hTitle=driver.getTitle();
		Reporter.log(hTitle, true);
		util.moveToElementClick(driver, hp.getWishList());
		String title=driver.getTitle();
		Reporter.log(title, true);
		WishListPage wp=PageFactory.initElements(driver, WishListPage.class);
		wp.getRemove().click();
		
		

	}

}
