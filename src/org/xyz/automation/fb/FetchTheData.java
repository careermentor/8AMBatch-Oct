package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchTheData
{
	WebDriver driver;
	
	
	@Test
	public void differentfileds() throws InterruptedException
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		
		
		String name = "java";
		System.out.println(name);
		
		System.out.println("Java");
		
		driver.get("https://www.facebook.com/");
		
		//Step1
		String ExpURL="https://www.facebook.com/";
				
		driver.get(ExpURL);  //pass the url
		
		String ActURL = driver.getCurrentUrl(); //fetching the url from the browser
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //hard assertion 
		
		SoftAssert sa = new SoftAssert();  //soft assertion
		sa.assertEquals(ActURL, ExpURL);  //
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();  //fetch the page title
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);  //compare 
		System.out.println("this test case exeucted");
		
		//Step2
		
		String ExpUsername = "Email address or phone number";
		String ActUsername = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsername);
		
		sa.assertEquals(ActUsername, ExpUsername);
		
		String ExpLoginbttn = "Log in";
		String ActLoginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginbttn);
		
		sa.assertEquals(ActLoginbttn, ExpLoginbttn);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		boolean logenb = driver.findElement(By.name("login")).isEnabled();
		System.out.println(logenb);
		sa.assertEquals(logenb, true);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		sa.assertAll();
	}
	}
