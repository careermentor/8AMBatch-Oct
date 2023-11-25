package testPkg;

public class QA4 extends QA2 implements QA3I
{
		
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		QA4 q4 = new QA4();
		q4.sub(40, 30);
		//q4.sum(30, 40);
		//q4.mul(30, 40);
		q4.div(20, 10);
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);
		
	}

	
	public void methQA3IM() {
		System.out.println("this is interface QA3I method");
		
	}

	
	public void QA1IM() {
		System.out.println("this is interface QA1I method");
		
	}
	
}
