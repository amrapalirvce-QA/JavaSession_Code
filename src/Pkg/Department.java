package Pkg;

public class Department {
	private int dept_id;
	private String dept_name;
	private String adv;
	
	
	

	public int getDept_id() {
		return dept_id;
	}


	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}



	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}


	public String getAdv() {
		return adv;
	}

	public void setAdv(String adv) {
		this.adv = adv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept =new Department();
		
		dept.setDept_name("Admin");
		System.out.println(dept.getDept_name());
		
		dept.setDept_id(19);
		System.out.println(dept.getDept_id());
		
		dept.setAdv("null");
		System.out.println(dept.getAdv());

	}

}
