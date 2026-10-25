package Com.Demowebshop_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Log out")
	private WebElement Logoutbtwn;
	
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(id="small-searchterms")
	private WebElement searchField;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement Searchtext;
	
	@FindBy(partialLinkText="Addresses")
	private WebElement addressBtwn;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcartbtwn;

	
	public WebElement getShoppingcartbtwn() {
		return shoppingcartbtwn;
	}

	public WebElement getLogoutbtwn() {
		return Logoutbtwn;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchtext() {
		return Searchtext;
	}

	public WebElement getAddressBtwn() {
		return addressBtwn;
	}

	
	
	
	
	
	

}
