package org.wipro.automation.abc.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.abc.baseClasspkg.InitiateBrowser;
import org.wipro.automation.abc.pages.LoginPage;
import org.wipro.automation.abc.pages.MenuOptionPage;

public class MenuTestScenario extends InitiateBrowser
{

	@Test
	public void validatemenuoptions() throws Exception
	{
		MenuOptionPage menu = new MenuOptionPage(driver);
		menu.click_menu();
		menu.click_MenuSignin();
		
	}
	
	
}
