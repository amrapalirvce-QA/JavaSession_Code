package Exceptionhandling;

public class user {

	
	
	public static void fillForm(String data)
	{
		if (data==null) {
			throw new MyException("=====Data IS NULL, CANT PROCEED=====");
			//System.out.println("bye!!!!");
			
		} else {

			System.out.println("Get the data !!!");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		fillForm(null);
		System.out.println("Fill the registration form");
		
	}

}
