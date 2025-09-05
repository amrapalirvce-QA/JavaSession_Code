package Pkg;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr= {0,1,10,20,0,0,100,0};
//		int k=arr.length-1;
//		int temp=0;
//		
//		for(int i=0,j=k;i<=3&&j>=3;i++,j--)
//		{
//			if(arr[i]==0&&arr[j]==0)
//			{
//				j--;
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//				j--;
//						
//			}
//			else if(arr[i]!=0&&arr[j]==0)
//			{
//				if(arr[j]==0)
//				{
//					j--;
//					//i++;
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					//i++;
//				}
//									
//			}
//			else
//			{
//				//j--;
//				if(arr[i]!=0&&arr[j]!=0)
//				{
//					i++;
//					j--;
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					i++;
//					j--;
//				
//				}
//			}
//			
//		}
//		System.out.println(java.util.Arrays.toString(arr));
//	
		
//=======Matrix Print=======================================
//		int[][] matrix= new int[10][10];
//		
//		for(int i=0;i<10;i++)
//		{
//			for(int j=0;j<10;j++)
//			{
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the value of n :");
//		int n=sc.nextInt();
//		int ele[]= new int[n];
//		
//		
//		for(int i=0;i<n;i++)
//		{
//			ele[i]=sc.nextInt();
//			//System.out.print(ele+" ");
//		}
//		System.out.println(java.util.Arrays.toString(ele));
		//System.out.println("Enter the value of specific element :");
		//int element=sc.nextInt();
		//findElement(ele,element);
		//findMaxMin(ele);
		//findCommenStringInArray();
//		System.out.println(ele.length);
//		findSecondLargestElementInArray(ele);
		String reverse=findRev("automation");
		System.out.println("Reverse of string :"+reverse);
		int ar[]= {2,7,11,15};
		int target=17;
		System.out.println(java.util.Arrays.toString(ar));
		findTargetElement(ar,target);
		
				
	}
	
	 public static void findElement(int arr[],int element)
	 {
		
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==element)
			 {
				 System.out.println(element+" found at index : "+i);
			 }
			 			 
		 }
		 //System.out.println(element+" Not Found ");
		 	 		 
	 }
	 
	 public static void findMaxMin(int arr[])
	 {
		 int max=arr[0];
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>=max)
			 {
				 max=arr[i];
			 }
			 else if(arr[i]<=min)
			 {
				 min=arr[i];
			 }
			
		 }
		 System.out.println("largest element in array is: "+max);
		 System.out.println("smallest element in array is: "+min);
		 
	 }
	 
	 public static void findCommenStringInArray()
	 {
		 String[] strArray= {"AI","java","c++","python"};
		 String[] strArray1= {"django","java","c++","data"};
		 
		 for(int i=0;i<strArray.length;i++)
		 {
			 if(strArray[i]==strArray1[i])
			 {
				 System.out.println("common elements in stringarrays :"+strArray[i]);
			 } 
		 }
		 
	 }
	 
	 public static void findSecondLargestElementInArray(int arr[])
	 {
		 int temp=0;
		 for(int i=0,j=(arr.length-1);i<(arr.length/2)&&j>(arr.length/2);i++,j--)
		 {
			 if(arr[i]>arr[j])
			 {
				i++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			 }
		 }
		 System.out.println(java.util.Arrays.toString(arr));
		 System.out.println(arr[1]);
			 
	 }
	 
	  public  static void findTargetElement(int a[],int target)
	  {
		  int temp=a[0];
		  System.out.println(target);
		  for(int j=1;j<a.length;j++)
		  {
			  for(int i=j;i<a.length;i++)
			  {
				  temp+=a[i];
				  if(temp==target)
				  {
					  System.out.println(j+" "+i);
					  break;
				  }
				  temp=a[i];
				 
			  }
			 
		  }
		 // System.out.println("Element not found !!!");
		  System.out.println();
				  	  
	  }
	  
	  public static String findRev(String text)
	  {
		  //input : automation
		  //output : motuanoita
		  String rev="";
		  String rev1="";
		  
		  for(int i=4;i>=0;i--)
		  {
			  rev+=text.charAt(i);
		  }
		  System.out.println(rev);
		  for(int i=text.length()-1;i>=5;i--)
		  {
			  rev1+=text.charAt(i);
		  }
		  System.out.println(rev1);
		  String res=rev.concat(rev1);
		  
		  return res;
		  
	  }
	 	
	
}

