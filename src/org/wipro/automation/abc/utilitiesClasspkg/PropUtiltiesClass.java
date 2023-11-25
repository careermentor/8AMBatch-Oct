package org.wipro.automation.abc.utilitiesClasspkg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropUtiltiesClass 
{

	public static String readconfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelementigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
}
