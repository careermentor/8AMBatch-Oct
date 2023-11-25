package org.wipro.automation.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.abc.utilitiesClasspkg.PropUtiltiesClass;

public class SignupPage
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(PropUtiltiesClass.readelementigprop("Login_CreateNewAccount_xpath"))).click();
	}
	
	
	public void enter_firstnamename(String fname) throws Exception
	{
		driver.findElement(By.name(PropUtiltiesClass.readelementigprop("Signup_FirstName_name"))).sendKeys(fname);
	}
	
	
	public void click_submitbttn() throws Exception
	{
		driver.findElement(By.name(PropUtiltiesClass.readelementigprop("Signup_Submit_name"))).click();
	}
	
}
