package com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Demowebshop_GenericUtility.BaseTest;
import Com.Demowebshop_Pom.Addressess_page;

public class Tc_002_verify_is_able_to_deleteaddress_or_not_Test extends BaseTest {
	
	@Test
	public void deleteAddress() throws InterruptedException, IOException
	{
	
	System.out.println("Delete Address");	
	webdriverUtility.javascrollTillElement(driver, homePage.getAddressBtwn());
	homePage.getAddressBtwn().click();
	
	Addressess_page addresspage=new Addressess_page(driver);
	addresspage.getDeleteAddressbtwn().get(0).click();
	
	webdriverUtility.javaScriptPoPUpAccept(driver);
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	webdriverUtility.webpagescreenshot(driver);
	
		
		
	}

}
