package org.wipro.automation.abc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.abc.baseClasspkg.InitiateBrowser;
import org.wipro.automation.abc.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void createNewAccount() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstnamename("Selenium");
		
		Select bday = new Select(driver.findElement(By.name("birthday_day")));
		bday.selectByVisibleText("23");
		
		sign.click_submitbttn();
	}
	
	
}
