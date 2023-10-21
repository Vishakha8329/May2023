package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHomePage {
	@FindBy(xpath="//a[text()='Visitor management system']")
	private WebElement visitorManagementSytem;

	public VerifyHomePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	public void clickOnVisitorButton()
	{
		visitorManagementSytem.click();
	}
}
