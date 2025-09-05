package Pkg;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Loop_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value for dividend: ");
//		int dividend=sc.nextInt();
//		System.out.println("Enter the value for divisor: ");
//		int divisor=sc.nextInt();
//		int rem=1,hcf=0;
//		
//		
//		while(rem!=0)
//		{
//			rem=dividend%divisor;
//			dividend=divisor;
//			divisor=rem;
//			
//		}
//		if(rem==0)
//		{
//			hcf=dividend;
//			
//		}
//		
//		System.out.println("HCF : " +hcf);
		
		
		
		//=======
       //Scanner sc=new Scanner(System.in);
//       int negSum=0;
//       int posSum=0;
//       int zeroSum=0;
//       
//       for(int i=-1;i<=10;i++)
//       {
//    	   int num=sc.nextInt();
//    	   if(num==0)
//    	   {
//    		   zeroSum++;
//    		   
//    	   }
//    	   else if(num<0)
//    	   {
//    		   negSum++;
//    	   }
//    	   else
//    	   {
//    		   posSum++;
//    	   }
//    	      		   
//    	   
//       }
//       System.out.println("sum of zeros:"+ zeroSum);
//       
//       System.out.println("sum of neg numbers:"+ negSum);
//       
//	   System.out.println("sum of pos numbers: "+ posSum);
		
//===========Armstrong numbers		
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the number :");
//       int num=sc.nextInt();
//       int temp=num;
//       int armSum=0;
//       
//       while(num>0)
//       {
//    	   armSum+=(num%10)*(num%10)*(num%10);
//    	   num/=10;
//       }
//       if(armSum==temp)
//       {
//    	   System.out.println(temp+" number is armstrong number: ");
//       }
//       else
//       {
//    	   
//        	   System.out.println(temp +" Given number is not armstrong number: ");
//           
//           
//       }
//		
//
//	}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int num=sc.nextInt();
//		int temp=num;
//		int digit=1,fact=1,digitSum=0;
//		
//		while(num>0)
//		{
//			digit=num%10;
//			num/=10;
//			fact=1;
//			if(digit==0)
//			{
//				//fact=1;
//				fact=1;
//			}
//			else
//			{
//				for(int i=1;i<=digit;i++)
//				{
//					fact*=i;
//				}
//			}
//			digitSum+=fact;
//			
//		}
//		if(num==0)
//		{
//			fact=1;
//			digitSum=fact;
//		}
//		if(digitSum==temp)
//		{
//			System.out.println(temp+ " is Strong number");
//		}
//		else
//		{
//			System.out.println(temp+ " is not strong number");
//		}
//	
		
//===================Fibonacii Series=======================================		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n1: ");
//		int n1=sc.nextInt();
//		System.out.println("Enter the value of n2: ");
//		int n2=sc.nextInt();
//		
//		int n3=0;
//		
//		System.out.println("Fibonacii Series: ");
//		System.out.print(n1+","+n2+",");
//		
//		for(int i=1;i<=10;i++)
//		{
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(n3+",");
//			
//		}
		
//====================number of words in string=======================		
//	String str="My name is amarapali";
//	char[] chArray=str.toCharArray();
//	int spaceCount=0;
//	int length=chArray.length;
//	for(int i=0;i<=length-1;i++)
//	{
//		if(chArray[i]==' ')
//		{
//			spaceCount++;
//		}
//	}
//	int count=spaceCount+1;
//	System.out.println("Number of words in : "+"'"+str+"'"+ "is: "+ count);
//	
	
//==========convert decimal number to octal=======================
//		int m=8;
//		int num=12345;
//		int count=0;
//		//int n=count;
//		int n=0;
//		int rem=1;
//		int octal=0;
//		int temp=num;
//		
//		while(num>0)
//		{
//			rem=num%8;
//			num/=8;
//			
//			if(n==0)
//			{
//				octal+=1*rem;
//			}
//			else if(n==1)
//			{
//				octal+=rem*m;
//			}
//			
//			else
//			{
//				for(int i=1;i<n;i++)
//				{
//					m=m*m;
//				}
//				octal+=rem*m;
//			}
//			
//			count++;
//			n=count;
//			
//		}
//		System.out.println("octal of decimal: "+temp+" is "+octal);
//		

		//=====================Find index of an element of an array=========
//		int arr[] = {1,2,3,4,5,6,7};
//		int ele=7;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==ele)
//			{
//				System.out.println("Index of : "+ele+" is "+i);
//				break;
//			}
//		}
		
		int arr[]= {10,20,20,40,40,60,70,80,60};
//		int remove=50;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==remove)
//			{
//				i++;
//			}
//			System.out.print(arr[i]+" , ");
//		}
//		//System.out.println(Arrays.toString(arr));
		
		
		
		//========copy elements from one array to other array
//		int size=arr.length;
//			
//		 int[] new_array = new int[size];
//		for(int i=0;i<arr.length;i++)
//		{				
//			new_array[i]=arr[i];
//				
//			
//		}
//		System.out.println(Arrays.toString(new_array));
		//System.out.println(Arrays.toString(new_array));
		
		//====================WAP to insert specific element on an array.
//		System.out.println(Arrays.toString(arr));
//		int pos=3;
//		int ele=1000;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i==(pos-1))
//			{
//				arr[i]=ele;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
	//======find maximum and minium element of an array.	
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i=1;i<arr.length;i++)
//		{
//			if(max<arr[i])
//			{
//				max=arr[i];
//			}
//			else
//			{
//				min=arr[i];
//			}
//		}
//		System.out.println("MAX: "+max+"\n"+" MIN: "+min);
//		
//		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Dupliacte elements are :"+ arr[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
		
	
	
	


