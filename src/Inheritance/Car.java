package Inheritance;

public class Car extends Vehicle {
	
	@Override
	public void start()
	{
		System.out.println("car - push starts");
	}
	public void restart()
	{
		System.out.println("car - restarts");
	}

	private void autolock()
	{
		System.out.println("car autolocks by itself ");
	}
	
	public void carautolock()
	{
		autolock();
	}
	
	public static final void  locking()
	{
		System.out.println("Car - locking is specific ");
	}
	
}
