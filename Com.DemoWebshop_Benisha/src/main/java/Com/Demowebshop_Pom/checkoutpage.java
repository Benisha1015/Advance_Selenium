package Com.Demowebshop_Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage 
{
	public checkoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private List<WebElement> Continuebutton;
	
	@FindBy(xpath="(//input[@value='Confirm'])")
	private WebElement Confirmbutton;

	public List<WebElement> getContinuebutton() {
		return Continuebutton;
	}

	public WebElement getConfirmbutton() {
		return Confirmbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
