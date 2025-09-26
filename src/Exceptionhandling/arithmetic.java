package Exceptionhandling;

public class arithmetic {
static int c;

		public static int divide(int a,int b)
		{
			try
			{
				c=(a/b);
			}				
			catch(ArithmeticException e)
			{
				System.out.println("user has passed 0 !!");
				e.printStackTrace();
			}
			return c;
			
		}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=divide(10,0);
		System.out.println(c);
		
	
	}

}
