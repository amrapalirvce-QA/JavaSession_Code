package Exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("open the browser !!");
		
		Thread.sleep(5000);//Checked Exception ( CompileTime Exception) - Interrupted Exception
		
		System.out.println("Close the browser !!");
		
	//	FileInputStream fi=new FileInputStream("/Documents/app.text");//FileNotFoundException - compiletime
		
	
		
	}

}
