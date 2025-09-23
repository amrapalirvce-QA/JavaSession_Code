package Pkg;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class findUniqueCharecters {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[Input:String a ="rtrrutwe" Output:Unique Characters=[r,t,u,w,e]]
		
//		String a ="rtrrutwe";
//		char[] chAr=a.toCharArray();
//		
//	        Set<Character> uniqueChar = new HashSet<>();
//
//	        for (Character ch : chAr) {
//	        	uniqueChar.add(ch);
//	        }
//
//	        // Print the unique elements
//	        String str=new String(chAr);
//	        System.out.println("Original array: " + str);
//	        System.out.println("Unique elements: " + uniqueChar);
	        
	       // [Input:a ={2,2,3,4,2,6,8} Remove all occurences of 2 Output: Length after removing :4
		
		String str="India";
		System.out.println("Before revrse: "+str);
		
		char[] chAr=str.toCharArray();
		
		System.out.print("After reverse: ");
		for(int i=chAr.length-1;i>=0;i--)
		{
			System.out.print(chAr[i]);
		}
	       
	}
}


