package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeboardMouse
{
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("test");
		
		CaptureScreens.screenshotresults(driver,"handleFrames");
	}
	
	@Test(enabled=true)
	public void handleAlert() throws Exception
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept();
		CaptureScreens.screenshotresults(driver,"handleAlert1");
		
		
		
		CaptureScreens.screenshotresults(driver,"handleAlert2");
		
	}
	
	@Test(enabled=false)
	public void learnMouse() throws InterruptedException
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windid = driver.getWindowHandles();
		System.out.println(windid);
		
		Iterator<String> itr = windid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();	
		
		driver.switchTo().window(win2);
		driver.switchTo().window(win1)
;	}
	
	@Test(enabled=false)
	public void learnKeyboard() throws InterruptedException
	{
		
		driver= new ChromeDriver();   //launch your chrome browser
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys("user2").perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass12").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
}