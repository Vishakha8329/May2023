package Utils;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility {
	private static TakesScreenshot driver;

	public static void captureScreenshot( String testId) throws IOException
	{
		 
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
		File src=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\vishakha");
		FileHandler.copy(src, dest);
	}

}
