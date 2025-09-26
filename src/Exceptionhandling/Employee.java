package Exceptionhandling;

import java.nio.channels.AlreadyBoundException;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int[] array=new int[5];
			
			array[6]=10;
			
			
			
			//System.out.println("Obj: "+obj);
			
			
		}				
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("user has entertered input in wrong index");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("provide proper input !!!");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Object is referencing to null !!");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		Employee obj=new Employee();
		obj=null;
		System.out.println("Obj: "+obj);
		System.out.println("Bye!!!!");
		


		
	}

}
