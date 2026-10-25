package com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Com.Demowebshop_GenericUtility.BaseTest;
import Com.Demowebshop_Pom.Bookspage;
import Com.Demowebshop_Pom.Shoppingcart_page;
import Com.Demowebshop_Pom.checkoutpage;

public class Tc_003_Verify_User_is_able_to_place_order_Test extends BaseTest {
	@Test
	public void placeorder() throws IOException, InterruptedException {
		System.out.println("Place Order");

		homePage.getSearchTextField().sendKeys(fileUtility.readDataFromPropertyFile("productname")+Keys.ENTER);
  	homePage.getSearchField().click();
		Thread.sleep(3000);
		Bookspage bookpage = new Bookspage(driver);
		webdriverUtility.javaScriptClick(driver, bookpage.getAddtocart());

		Thread.sleep(2000);
		homePage.getShoppingcartbtwn().click();

		Shoppingcart_page cartpage = new Shoppingcart_page(driver);
		cartpage.getTermsandservicebox().click();
		cartpage.getCheckoutbox().click();

		checkoutpage checkpage = new checkoutpage(driver);
		checkpage.getContinuebutton().get(0).click();
		checkpage.getContinuebutton().get(1).click();
		checkpage.getContinuebutton().get(2).click();
		checkpage.getContinuebutton().get(3).click();
		checkpage.getContinuebutton().get(4).click();

		checkpage.getConfirmbutton().click();
		Thread.sleep(2000);
		webdriverUtility.webpagescreenshot(driver);

	}

}
