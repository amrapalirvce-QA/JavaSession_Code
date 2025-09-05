package Inheritance;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Vehicle();
		v.start();
		v.stop();
		v.refuel();
		System.out.println("=================");
		
		Vehicle v1=new Car();
		v1.start();
		v1.stop();
		System.out.println("=================");
		
		Car c=new Car();
		c.restart();
		c.start();
		c.carautolock();
		System.out.println("====================");		
		
		Car c1=new bmw();
		c1.start();
		c1.carautolock();
		c1.refuel();
		c1.carautolock();
		c1.locking();
		System.out.println("===================");
		
		bmw bw=new bmw();
		System.out.println(bw.speed);
		bmw.automaticGear();
		//bw.automaticGear();
		//bmw bw1=new bmw();
		
		
		
	}

}
