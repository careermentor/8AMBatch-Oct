package org.wipro.automation.abc.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.abc.baseClasspkg.InitiateBrowser;
import org.wipro.automation.abc.dataGeneratorpkg.TestDataGenerator;
import org.wipro.automation.abc.pages.LoginPage;

public class LoginScenario2_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGenerator.class)
	public void loginFunct(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
	
}
