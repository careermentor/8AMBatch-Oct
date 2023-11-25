package testPkg;

public class QA1 
{
	
	int i = 20;
	
	public void printVar()
	{
		final int i = 30;
		//i=40;
		
		System.out.println(i);  //30
		System.out.println(this.i); //20
	}
	
	
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		
	}
	//10+20.5 = 30.5
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: " + d);
		
	}
	
	public static void main(String[] args) {
		QA1 q1 = new QA1();
		q1.sum(30, 40);
		q1.sum(30, 40.5f);
		q1.sum(10, 20,30);
		
	}
	
}
