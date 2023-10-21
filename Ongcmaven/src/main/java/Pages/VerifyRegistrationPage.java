package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyRegistrationPage {
	@FindBy(xpath="//input[@placeholder='User Name (Email)']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	private WebElement confirmPassword;
	
	@FindBy (xpath="//input[@placeholder='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;
	
	public VerifyRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		userName.sendKeys("visha8329@gmail.com");
	}
	public void sendPassword()
	{
		passWord.sendKeys("Vishakha@123");
	}
	public void sendConfirmPassword()
	{
		confirmPassword.sendKeys("Vishakha@123");
	}
	public void sendFirstName()
	{
		firstName.sendKeys("Vishakha");
	}
	public void sendMiddleName()
	{
		middleName.sendKeys("Keshavrao");
	}
	
	public void sendLastName()
	{
		lastName.sendKeys("Dhutade");
	}

}
