package Com.Demowebshop_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_page {
	
	
	public Welcome_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(partialLinkText="Log in")
	private WebElement Loginbtwn;

	public WebElement getLoginbtwn() {
		return Loginbtwn;
	}
	

	
	
		
	

}
