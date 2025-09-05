package Inheritance;

public class bmw extends Car {
	  final int speed=100;
	
	
	
	@Override
	public void start()
	{
		System.out.println("bmw - key start");
	}
	
	@Override
	public void carautolock()
	{
		System.out.println("bmw -sensor autolock");
	}
	

	public static void automaticGear()
	{
		System.out.println("bmw - automaticGear");
	}
	
	
	

}
