package testPkg;

public class QA2 extends QA1
{
	int i = 200;
	
	public void callVar()
	{
		System.out.println(super.i);//20
		super.sum(30, 50);
	}
	
	public final void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
	}
		
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.sub(40, 30);
		q2.sum(30, 40);
		q2.callVar();
		
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);
		
	}

	
	public void QA1IM() {
		System.out.println("this is QAIM");
		
	}
	
}
