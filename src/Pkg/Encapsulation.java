package Pkg;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person();
		p.setName("ammu");
		String n =p.getName();
		
		p.setAge(29);
		int a = p.getAge();
		
		p.setGender("Female");
		String g=p.getGender();
		
		p.printInfo(n,a,g);
		
	
		
//	    int a1=11,b=22,c;
//		
//		c=a + b + a1++ + b++ + ++a1 + ++b;
//		
//		System.out.println("a : "+a1);
//		System.out.println("b : "+b);
//		System.out.println("C : "+c);
//				
//		int i=1, j=2, k=3;
//		int m = i-- - j-- - k--;
//		System.out.println("i="+i);
//		System.out.println("j="+j);
//
//		System.out.println("k="+k);
//
//		System.out.println("m="+m);
		
		int a2=1, b1=2;

		System.out.println(--b1 - ++a2 + ++b1 - --a2);
		
		
		int i=19, j=29, k=9;
		int m = i-- - j-- - k--;

		System.out.println("i="+i);

		System.out.println("j="+j);

		System.out.println("k="+k);
		System.out.println("m="+m);
		
      
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = false;
		boolean c4 = false;

		if (c1 || c2 || c3 || c4) {
		    System.out.println("selenium");
		}
	}

}
