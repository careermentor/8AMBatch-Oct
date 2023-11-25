package testPkg;

public class RecapClass 
{
	
	public RecapClass(int a)
	{
		int b = a*a;
		System.out.println(b);
		System.out.println("this is a constructor");
	}

	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		
		return c;
		
	}
	
	public static void main(String[] args) {
		RecapClass rc = new RecapClass(10);
		rc.sum(30, 40);
		
	}
	
}
