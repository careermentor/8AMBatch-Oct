package testPkg;

public class CallBasicClass extends BasicClass 
{

	
	public void meth2() 
	{
		System.out.println("this is my credential");
		
	}
	
	public static void main(String[] args)
	{
		CallBasicClass cbc = new CallBasicClass();
		cbc.meth1();
		cbc.meth2();
		
	}

}
