package Pkg;

public class staticNonStatic {
	
	static void display(staticNonStatic ns)
	{
		System.out.println("I am static method !!");
		ns.print();
	}

    void print()
    {
    	System.out.println("I am non static method !!");
    	//display(ns);
    }
    
    static int main(int a,int b)
    {
    	//display();
    	int c=a+b;
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//staticNonStatic.main(args);
		staticNonStatic ns=new staticNonStatic();
		System.out.println(staticNonStatic.main(10,20));
		staticNonStatic.display(ns);
		ns.print();
			
		
		
	}

}
