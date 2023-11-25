package testPkg;

public abstract class BasicClass    // concrete class
{

	int a = 20;
	
	
	
	public void meth1()   //concrete method
	{
		int a = 30;
		a=50;
		System.out.println("this is concrete method");
	}
	
	public abstract void meth2();
	
	
	public static void main(String[] args) 
	{
	
	//	BasicClass bc = new BasicClass();
		
	}
	
}
