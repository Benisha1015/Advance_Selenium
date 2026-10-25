package Com.Demowebshop_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {
	
	public Bookspage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement addtocart;

	

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	

	
	
	
	

}
