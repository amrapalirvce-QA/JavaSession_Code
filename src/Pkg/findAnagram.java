package Pkg;
import java.util.Collections.*;
import java.util.Arrays;

public class findAnagram {

	 public static void main1(String[] args) {
		// TODO Auto-generated method stub

		String s="ACT";
		String s1="CAT";
		boolean value=false;
		
		char[] c1=s.toCharArray();
		char[] c2=s1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1,c2))
		{
			System.out.println(s+" "+s1+" : "+"is anagram");
		}
		
		
		
		
	}

}
