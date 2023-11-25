package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class BrowserControl
{
	WebDriver driver;
	
	
	@Test
	public void differentfileds() throws InterruptedException
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.navigate().to("https://thetestingworld.com/testings/");  //pass the url
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("automation");
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		//driver.findElement(By.className("displayPopup")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		gen.selectByIndex(1);
		
		WebElement conel = driver.findElement(By.name("country"));
		
		Select con = new Select(conel);
		//con.selectByValue("10");
		//con.selectByVisibleText("India");
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("Australia");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Apache Junction"));
		
		ct.selectByVisibleText("Douglas");
		
	}
	
	@Test(enabled=false)
	public void launchBrowser() throws InterruptedException
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.navigate().to("https://www.google.com/");  //pass the url
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();  //close single window/tab
		driver.quit();  //close all the window/tab
		
		
	}
	
}
