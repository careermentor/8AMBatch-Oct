package org.wipro.automation.abc.dataGeneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D Array
		return data;
		
	}
	
}
