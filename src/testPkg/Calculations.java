package testPkg;

public class Calculations 
{
	
	public Calculations(int a, int b)
	{
		
		System.out.println("this is constructor");
		int c = a+b;
		System.out.println(c);
		
	}
	
	
	int a = 10;  //global variable
	
	public float printVal()  //without parameter/arguments
	{
		
		int a = 20;  //local variable
		float b = 30.5f;   //local variable
		float c = a+b;
		
		String d = "Java";
		
		System.out.println("sum of a&b: " + c);
		return c;
		
	}
	
	public int sum(int a, int b)  //with parameter/arguments/input
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
		
		//10+20+30
		//x = 10+20
		//x+30
		
	}
	
	public void printtext()
	{
		System.out.println(a); //20
	}
	
	public static void main(String[] args) 
	{
		Calculations cal = new Calculations(30, 40);  //constructor will be called automatically when we crate object of the class
		
		cal.printVal();  //50
		cal.printtext();
		
		int x = cal.sum(10, 20);  //30
		cal.sum(x, 30);
		cal.sum(30, 40);  //70
		
	}
	
	
	
	
	
	
}
