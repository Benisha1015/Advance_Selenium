package Com.Demowebshop_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_page {
	
	public AddNewAddress_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Address_FirstName")
	private WebElement  FirstnameTextfield;
	
	@FindBy(id="Address_LastName")
	private WebElement LastnameTextfield;
	
	@FindBy(id="Address_Email")
	private WebElement Emailtextfield;
	
	@FindBy(id="Address_CountryId")
	private WebElement countryTextfield;
	
	@FindBy(id="Address_City")
	private WebElement addresscityTextfield;
	
	@FindBy(id="Address_Address1")
	private WebElement address1Textfield;
	
	@FindBy(id="Address_ZipPostalCode")
	private WebElement zippostaltextfield;
	
	@FindBy(id="Address_PhoneNumber")
	private WebElement phonenumbertextfield;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement addressSaveBtn;
	

	public WebElement getAddressSaveBtn() {
		return addressSaveBtn;
	}

	public WebElement getFirstnameTextfield() {
		return FirstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return LastnameTextfield;
	}

	public WebElement getEmailtextfield() {
		return Emailtextfield;
	}

	public WebElement getCountryTextfield() {
		return countryTextfield;
	}

	public WebElement getAddresscityTextfield() {
		return addresscityTextfield;
	}

	public WebElement getAddress1Textfield() {
		return address1Textfield;
	}

	public WebElement getZippostaltextfield() {
		return zippostaltextfield;
	}

	public WebElement getPhonenumbertextfield() {
		return phonenumbertextfield;
	}
	
	
	
	
	
	
	

}
