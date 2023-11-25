package org.wipro.automation.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.abc.utilitiesClasspkg.PropUtiltiesClass;

public class MenuOptionPage
{

	WebDriver driver;
	
	public MenuOptionPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_menu() throws Exception
	{
		driver.findElement(By.cssSelector(PropUtiltiesClass.readelementigprop("UO_Menu_css"))).click();
	}
		
	public void click_MenuSignin() throws Exception
	{
		driver.findElement(By.xpath(PropUtiltiesClass.readelementigprop("UO_Menu_SignIn_xpath"))).click();
	}
	
}
