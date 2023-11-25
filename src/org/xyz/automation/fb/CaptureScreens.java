package org.xyz.automation.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreens 
{

	public static void screenshotresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot screen = (TakesScreenshot) driver;  //take screenshot (prt sc)
		
		File f = screen.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/"   + name +   ".png");
		
		
		FileUtils.copyFile(f, fd);
		
		
	}
	
}
