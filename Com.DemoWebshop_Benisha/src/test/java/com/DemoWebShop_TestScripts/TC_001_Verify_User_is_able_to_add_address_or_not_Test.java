package com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.Demowebshop_GenericUtility.BaseTest;
import Com.Demowebshop_Pom.AddNewAddress_page;
import Com.Demowebshop_Pom.Addressess_page;

public class TC_001_Verify_User_is_able_to_add_address_or_not_Test  extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
		System.out.println("Add Address Test Script");
		// the variable from base class has been taken to use the method in this class
		webdriverUtility.javascrollTillElement(driver, homePage.getAddressBtwn());
		homePage.getAddressBtwn().click();

		Addressess_page addressesspage = new Addressess_page(driver);
		addressesspage.getAddnewAddressBtwn().click();

		AddNewAddress_page newAddressPage = new AddNewAddress_page(driver);
		newAddressPage.getFirstnameTextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		newAddressPage.getLastnameTextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		newAddressPage.getEmailtextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));

		webdriverUtility.SelectByVisibleText(newAddressPage.getCountryTextfield(),
				fileUtility.readDataFromExcelFile("Sheet1", 1, 3));

		newAddressPage.getAddresscityTextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		newAddressPage.getAddress1Textfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		newAddressPage.getZippostaltextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 6));
		newAddressPage.getPhonenumbertextfield().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 7));
		newAddressPage.getAddressSaveBtn().click();

		webdriverUtility.webpagescreenshot(driver);

	}

}
