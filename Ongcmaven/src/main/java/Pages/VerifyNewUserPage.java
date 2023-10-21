package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyNewUserPage {
	@FindBy(xpath="//a[text()='New User/Visitor Sign Up Here']")
	private WebElement newUser;
	
	public VerifyNewUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewUser()
	{
		newUser.click();
	}

}
