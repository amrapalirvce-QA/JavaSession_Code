package Pkg;

import java.util.HashMap;

public class occurrenceofEachCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="selenium";
		char[] charArray=str.toCharArray();
		HashMap<Character,Integer> charMap=new HashMap<Character,Integer>();
		
		for(Character c: charArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			
			else
			{
				charMap.put(c,1);
			}
		}
		
		System.out.println(charMap);
		
		
		
	}

}
