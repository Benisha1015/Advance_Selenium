package Com.Demowebshop_Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressess_page {
	
	public Addressess_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@value='Add new']")
	private WebElement addnewAddressBtwn;
	
	@FindBy(xpath="//input[@value='Delete']")//using list bcz we dont need index of each , so get the list and use as per the index
	private List<WebElement> DeleteAddressbtwn;

	public WebElement getAddnewAddressBtwn() {
		return addnewAddressBtwn;
	}

	public List<WebElement> getDeleteAddressbtwn() {
		return DeleteAddressbtwn;
	}
	
	
	
	
	

}
