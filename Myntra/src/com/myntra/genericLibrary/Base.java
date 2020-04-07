package com.myntra.genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.myntra.objectRepository.LoginPage;



public class Base {
	public FileLib flib = new FileLib();
	public WebDriver driver;
	public static WebDriver scrnDriver;
	public WebDriverWait wait;
	public LoginPage lp;
	public Utility util = new Utility();
	
	@BeforeClass
	public void configBC()
	{
		if(flib.getPropertyKeyValue("browser").equals("chrome"))
		{
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(ch);
			scrnDriver = driver;
		}
		else if(flib.getPropertyKeyValue("browser").equals("firefox"))
		{
			
			driver = new FirefoxDriver();
			scrnDriver = driver;
		}
		else
		{
			
			driver = new InternetExplorerDriver();
			scrnDriver = driver;
		}
		
		driver.manage().window().maximize();
		driver.get(flib.getPropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);		
	}
	
	
	@BeforeMethod
	public void configBM() throws InterruptedException
	{
		lp = PageFactory.initElements(driver, LoginPage.class);
		util.moveToElement(driver, lp.getProfileImg());
		lp.getLogIn().click();
		lp.getEmailTb().sendKeys(flib.getPropertyKeyValue("email"));
		lp.getPasswordTb().sendKeys(flib.getPropertyKeyValue("password"));
		lp.getLogInBt().click();
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void configAM()
	{
		lp = PageFactory.initElements(driver, LoginPage.class);
		util.moveToElement(driver, lp.getProfileImg());
		lp.getLogOut().click();
		
	}
	
	@AfterClass
	public void configAC()
	{
		driver.quit();
	}

}
