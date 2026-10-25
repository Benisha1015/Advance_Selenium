package Com.Demowebshop_GenericUtility;

import java.io.IOException;
import java.time.Duration; /////configuration annotations


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.Demowebshop_Pom.Home_page;
import Com.Demowebshop_Pom.Login_page;
import Com.Demowebshop_Pom.Welcome_page;

public class BaseTest {

	public WebDriver driver;// making it public so we can use in other class
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Welcome_page WelcomePage;
	public Login_page LoginPage;
	public Home_page homePage;
	public webdriver_utility webdriverUtility = new webdriver_utility();

	public FileUtility fileUtility = new FileUtility();

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite-----DataBase Connection");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-----Report Genertaion");
		spark = new ExtentSparkReporter(Framework.reports);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("DemoWebshop");

	}

	@BeforeClass
	public void beforeclass() throws IOException {
		System.out.println("Before class----Lanch browser");
		
		//to run for command prompt we been using these two line for pararmeters
		//String browser=System.getProperty("browserName");
		//String url=System.getProperty("baseUrl");
		//we cannot use this to lines in the eclipse to run
		

		String browser = fileUtility.readDataFromPropertyFile("browsername");
		String url = fileUtility.readDataFromPropertyFile("url");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Running Test on chrome browser");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Running Test on edge browser");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Running Test on firefox browser");
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser");

		}

		sDriver = driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("before method------Login app");

		WelcomePage = new Welcome_page(driver);
		WelcomePage.getLoginbtwn().click();

		LoginPage = new Login_page(driver);
		LoginPage.getEmailTextField().sendKeys(fileUtility.readDataFromPropertyFile("username"));
		LoginPage.getPasswordTextField().sendKeys(fileUtility.readDataFromPropertyFile("password"));
		LoginPage.getLoginBtwn().click();

		homePage = new Home_page(driver);

	}

	///
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method-------login app");
		homePage.getLogoutbtwn().click();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after calss--------close browser");
		driver.quit();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test------ Reports ends");
		reports.flush();
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("after test------Database connection closed");

	}
}
