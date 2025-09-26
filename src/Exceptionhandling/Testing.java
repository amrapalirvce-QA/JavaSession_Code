package Exceptionhandling;



public class Testing {

	
	public static void m1()
	{
		System.out.println("m1");
		m2();
		
	}
	public static void m2()
	{
		try {
			System.out.println("m2");
			m3();
		}
		catch(ArithmeticException e)
		{
			System.out.println("user has passed 0");
			e.printStackTrace();
		}		
		
	}
	public static void m3() throws ArithmeticException
	{
		System.out.println("m3");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testing obj=new Testing();
		obj.m1();
		System.out.println("Hi !!!!");
	}

}
