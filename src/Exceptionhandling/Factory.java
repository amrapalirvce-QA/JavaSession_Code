package Exceptionhandling;

public class Factory {

	
	
	public static void driverfactory(String browserName)
	{
		switch (browserName) {
		case "chrome":
			System.out.println("chrome browser launched !!");
			
			break;
			
		case "edge":
			System.out.println("edge browser launched !!");
			break;

		case "safari":
			System.out.println("safari browser launched !!");
			
		default:
			throw new MyException("======Invalid Browser=====");
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driverfactory("opera");
		System.out.println("get the URL!");

	}

}
