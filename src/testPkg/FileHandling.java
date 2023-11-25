package testPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	
	public static void readprop() throws Exception
	{
		//File f = new File("./TestData/test.properties");
		
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		prop.load(fr);  //load the entire data which is present in properties file
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
		
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is Forth line");
		fw.flush();  //save
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\test.txt");  //file connection
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		//System.out.println(fr.read());
		//System.out.println(fr.read());
		//System.out.println(fr.read());
		
		int r = fr.read();  //r = 116, 
		
		while(r!=-1)  //116 104. 105, -1
		{
			System.out.print((char)r);
			r=fr.read(); //104
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		//FileHandling.readdata();
		//FileHandling.writedata();
		FileHandling.readprop();
		
	}
	
	
}
