package Pkg;

public class arraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,1,-9,20,30,40,112,34,45};
		int[] rarr=new int[arr.length];
		System.out.println(java.util.Arrays.toString(arr));
	
		int temp=arr[0];
	
		for(int i=1;i<arr.length;i++)
		{
			
				if(arr[i]>temp)
				{
					temp=arr[i];
					//rarr[j]=temp;
					//j++;
					//break;
				}
				else
				{
					i++;
				}
				for(int j=0;j<arr.length;j++)
				{
					rarr[j]=temp;
					break;
				}
			
			
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(rarr));
		

	}

}
