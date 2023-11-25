package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.get("https://www.facebook.com/");  //pass the url  //60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

	@Test(enabled=false)
	public void loginfunc()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234555fgg");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test
	public void signupFunct() throws Exception
	{
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	
}
