package org.wipro.automation.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.abc.utilitiesClasspkg.PropUtiltiesClass;

public class LoginPage
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(PropUtiltiesClass.readelementigprop("Login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(PropUtiltiesClass.readelementigprop("Login_Password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(PropUtiltiesClass.readelementigprop("Login_loginbttn_css"))).click();
	}
	
}
