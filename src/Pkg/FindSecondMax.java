package Pkg;

public class FindSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr= {40,10,90,60,70,85};
		int[] arr= {40,90,100};
		int temp1=arr[0];
		int temp2=arr[1];
		
		int max1=0;
		int max2=0;
		
		if(temp1>temp2)
		{
			max1=temp1;
		}
		else
		{
			max2=temp2;
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
				max2=max1;
			}
			else
			{
				max2=arr[i];
			}
			
		}
		System.out.println("Second largest element "+"max2: "+max2);
		
	}

}
