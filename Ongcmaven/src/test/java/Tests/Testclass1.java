package Tests;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Browser;
import Pages.VerifyHomePage;
import Pages.VerifyNewUserPage;
import Pages.VerifyRegistrationPage;
import Utils.Utility;

public class Testclass1 extends Browser {
	
	private WebDriver driver;
	private VerifyHomePage verifyHomePage;
	private VerifyNewUserPage verifyNewUserPage;
	private VerifyRegistrationPage verifyRegistrationPage;
	private String testId;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@Parameters("browser")
	@BeforeTest
	public void LaunchBrowser(String browserName)
	{
		reporter=new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
		  
		if(browserName.equals("Chrome"))
		{
		   driver=launchChrome();
		}
		if(browserName.equals("Edge"))
		{
			driver=launchEdge();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@BeforeClass
	public void ObjectOfPages()
	{
		 verifyHomePage = new VerifyHomePage(driver);
		 verifyNewUserPage=new VerifyNewUserPage(driver);
		 verifyRegistrationPage=new VerifyRegistrationPage(driver);
		 
	}
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver.get("https://ongcindia.com");
	}
	
	@Test
	public void VerifyOngc()
	{
		testId="T101";
		verifyHomePage.clickOnVisitorButton();
		ArrayList<String>address= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(address.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(address.get(1));
		driver.switchTo().window(address.get(1));
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void VerifyUser()
	{
		testId="T102";
		
	   verifyNewUserPage.clickOnNewUser();
		verifyRegistrationPage.sendUserName();
		verifyRegistrationPage.sendPassword();
		verifyRegistrationPage.sendConfirmPassword();
		verifyRegistrationPage.sendFirstName();
		verifyRegistrationPage.sendMiddleName();
		verifyRegistrationPage.sendLastName();
		System.out.println("end program");
	}
	
	@AfterMethod
	public void CloseBrowser(ITestResult result) throws IOException
	{
		System.out.println("application logout");
		if(ITestResult.FAILURE==result.getStatus())
		Utility.captureScreenshot(testId);
	}
	
	@AfterClass
	public void deleteObject()
	{
		verifyHomePage=null;
		verifyNewUserPage=null;
		verifyRegistrationPage=null;
	}
	
	@AfterTest
	public void CloseTheBrowser()
	{
		System.out.println("successfully launched");
		driver=null;
		System.gc();
	}
	

}
