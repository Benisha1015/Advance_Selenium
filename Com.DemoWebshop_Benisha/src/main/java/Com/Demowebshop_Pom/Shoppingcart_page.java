package Com.Demowebshop_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart_page {

	
	public Shoppingcart_page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	@FindBy(id="termsofservice")
	private WebElement termsandservicebox;
	
	@FindBy( id="checkout")
	private WebElement checkoutbox;

	public WebElement getTermsandservicebox() {
		return termsandservicebox;
	}

	public WebElement getCheckoutbox() {
		return checkoutbox;
	}
	
	
	
	
	
}


