package practice;


import java.util.Arrays;
  public class array 
{
	public static void main(String[] args)
	{
		 int arr[]= {2,4,8};
		 int flag=0;
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
		 {
			if(arr[i]%2==0)
			{
				flag=1;
			}
		 }
		 if(flag==0)
		 {
			 System.out.println("Array is odd");
		 }
		 else
		 {
			 System.out.println("Array is even");
		 }
	}
	
}
