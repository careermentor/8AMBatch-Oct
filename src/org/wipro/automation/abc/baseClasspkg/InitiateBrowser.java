package org.wipro.automation.abc.baseClasspkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.abc.utilitiesClasspkg.PropUtiltiesClass;

public class InitiateBrowser
{
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(PropUtiltiesClass.readconfigprop("Browsername").equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();   //launch your chrome browser
		}
		
		else if(PropUtiltiesClass.readconfigprop("Browsername").equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();   //launch your chrome browser
		}
		
		else if(PropUtiltiesClass.readconfigprop("Browsername").equalsIgnoreCase("Safari"))
		{
			driver= new SafariDriver();   //launch your chrome browser
		}
		
		
		
		driver.get(PropUtiltiesClass.readconfigprop("ApplicationURL"));  //pass the url  //60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}