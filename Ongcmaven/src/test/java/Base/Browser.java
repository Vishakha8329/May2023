package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public static WebDriver launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchEdge()
	{
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\BrowserFiles\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}

}
