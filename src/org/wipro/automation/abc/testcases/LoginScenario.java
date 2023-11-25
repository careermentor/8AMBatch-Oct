package org.wipro.automation.abc.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.abc.baseClasspkg.InitiateBrowser;
import org.wipro.automation.abc.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void loginFunct() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
	}
	
	
}
