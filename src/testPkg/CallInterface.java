package testPkg;

public class CallInterface implements SimpleInterface
{
	public void meth4()
	{
		System.out.println("this is class method 4");
	}
	
	public void meth3()
	{
	
		System.out.println("this is interface method3");
		
	}

	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
		ci.meth4();
	}
	
}
