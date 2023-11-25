package testPkg;

public class QA5 
{

	static int i = 20;
	
	public static void printvar()
	{
		
		System.out.println(i);
	}
	
	
	public void Hello()
	{
		System.out.println("this is hello method");
	}
	
	public static void main(String[] args) 
	{
	
		QA5 q5 = new QA5();
		//q5.printvar();
		q5.Hello();
		
		QA5.printvar();
		//QA5.Hello();
	}
	
}
