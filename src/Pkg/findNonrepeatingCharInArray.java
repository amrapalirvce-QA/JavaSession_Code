package Pkg;

public class findNonrepeatingCharInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Thought";
		String s1=s.toLowerCase();
		System.out.println(nonrepeatingChar(s1));

	}
	
	public static char nonrepeatingChar(String s)
	{
		
		String s1=s.toLowerCase();
		
//		char[] chArray=s.toCharArray();
//		
//		chArray[0]=Character.toLowerCase(chArray[0]);
		
//		for(Character c:chArray)
//		{
//			System.out.print(c+" ");
//		}
//		
//		int n=chArray.length;
//		char[] foundArray= new char[n];
//		
		for(int i=0;i<s1.length();i++)
		{
			boolean found=false;
			
			for(int j=0;j<s1.length();j++)
			{
				if((i!=j)&&s1.charAt(i)==s1.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				//System.out.println(s1.charAt(i));
				//sysos.charAt(i);
				return s.charAt(i);
				
			}
		}
		return '$';
	}

}
