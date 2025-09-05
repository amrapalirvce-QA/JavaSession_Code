package Pkg;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isActive;
		
		

	
	public Employee(String name) {
		this.name = name;
	}


	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, int age, double salary, boolean isActive) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}

	
		
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("ammu",28,50.0,true);
		System.out.println(e1.name);
		System.out.println(e1.name+" "+e1.age);
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println(e1.name+" "+" "+e1.age+" "+e1.salary+" "+e1.isActive);
		//Employee e2=new Employee();
		//System.out.println(e1.name,e1.age,e1.salary,e1.isActive);
		

	}

}
