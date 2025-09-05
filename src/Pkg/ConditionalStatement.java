package Pkg;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a1=12,b1=110;
//		if(a1>b1)
//		{
//			System.out.println("a1 is greater "+ a1);
//		}
//		else
//		{
//			System.out.println("b1 is greater "+ b1);
//		}
//		
		int a=20,b=110,c=5;
		int max;
//		if(a>b&&a>c)
//		{
//			max=a;
//			System.out.println("maximum number is :"+ max);
//			
//		}
//		else if (b>a&&b>c)
//		{
//			max=b;
//			System.out.println("maxmimum number is :"+ max);
//			
//		}
//		else if (c>a&&c>b)
//		{
//			max=c;
//			System.out.println("maxmimum number is :"+ max);
//					
//		}
		
		int num=3;
		if(num%3==0)
		{
			System.out.println("number is divisible by 3");
		}
		else
		{
			System.out.println("number is not divisible by 3");
		}
		
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
			
		}
		
		char ch='q';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch + " is vowel");
		}
		else
		{
			System.out.println(ch +" is consonant");
		}
		
//		System.out.println("Program to check digit or not in Java");
//	    Scanner sc = new Scanner (System.in);
//	    System.out.println ("Enter a input");
//	    char ch1 = sc.next ().charAt (0);
//	     if(ch1>='0' && ch1<='9')
//		 {
//		  	System.out.println("Given Input is Digit.");
//		 }
//		 else
//		 {
//		  	System.out.println("Given Input is Not Digit.");
//		 }
//	     
	     
	
	System.out.println("=================================");
	String str= "1ab23d1x19";
	
	//int len=chArray.length;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>='0'&&str.charAt(i)<='9')
		{
			System.out.println(str.charAt(i)+" is digit");
		}
		else
		{
			System.out.println(str.charAt(i) +" is alphabet");
		}
			
	}
	
	System.out.println("====================================");
	char char1='Z';
	System.out.println();
	if(char1>=97 && char1<=122)
	{
		System.out.println(char1 + " : islowercase");
	}
	else
	{
		System.out.println(char1 + " : isUpperCase");
	}
	
	
	System.out.println("=========================================");
	
//Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, 
	//Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F

	 int percentage=20;
	 if(percentage>=90)
	 {
		 System.out.println("Grade A");
	 }
	 else if (percentage>=80)
	 {
		 System.out.println("Grade B");		
	 }
	 else if (percentage>=70)
	 {
		 System.out.println("Grade C");		
	 }
	 else if (percentage>=60)
	 {
		 System.out.println("Grade D");		
		 
	 }
	 else if (percentage>=40)
	 {
		 System.out.println("Grade E");		
	 }
	 else
	 {
		 System.out.println("Grade F");	
	 }
	 
	 
	 int year=1991;
	 
	 if((year%400==0)||(year%4==0))
	 {
		 System.out.println(year + ": is leap year");
	 }
	 else
	 {
		 System.out.println(year + ": is not a leap year");
	 }
	 
	 
}
}
