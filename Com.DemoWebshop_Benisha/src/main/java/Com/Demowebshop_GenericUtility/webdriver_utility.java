package Com.Demowebshop_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
//where ever we call all method to perform action
public class webdriver_utility {
	public void webpagescreenshot(WebDriver driver) throws IOException {
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp =ts. getScreenshotAs(OutputType.FILE);
		File dest=new File(Framework.screenshotPath);
		FileHandler.copy(temp,dest);
	}
	
	public void SelectByVisibleText(WebElement DropdownElement,String Text)
	{
		Select sel=new Select(DropdownElement);
		sel.selectByVisibleText(Text);
		
	}
	
	public void javascrollTillElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		
	}
	
	public void javaScriptClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		
		
	}
	
	public void javaScriptPoPUpAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
		
		
		
		
		
	

}
