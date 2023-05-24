package practice;

import java.util.Scanner;

public class array_remove_ele 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[6];
		System.out.println("Enter elements of array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("The elements of array are :");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print (arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the index of the element to be removed ");
		int remove_ele_ino=sc.nextInt();
		for (int i = 0; i < arr.length-1; i++) 
		{
			arr[i]=arr[i+1];
		}
		for (int i = 0; i < arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
