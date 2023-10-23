package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public static WebDriver launchSafari()
	{
		System.setProperty("webdriver.safari.driver","src\\test\\resources\\BrowserFiles\\safaridriver.exe");
		WebDriver driver=new safariDriver();
		return driver;
	}
	
	public static WebDriver launchEdge()
	{
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\BrowserFiles\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}

}
