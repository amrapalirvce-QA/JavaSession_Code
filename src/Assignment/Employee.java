package Assignment;

public class Employee {

	int id;
	String name;
	double salary;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
		//this.salary = salary;
	}
	
	public int getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary+(salary*10)/100;
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee(301,"ammu");
		e.setSalary(90000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
	}
	
}
