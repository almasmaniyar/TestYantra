package array;

import java.util.Scanner;

public class Array_Multiple {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=sc.nextInt();
	int[] a=new int [n];
	System.out.println("enter the number");
	for(int i=0; i<n; i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
		if(a[i]%5==0)
		{
			System.out.println(a[i]+ " "+" is multiple of 5");
		}
		else 
		{
			System.out.println(a[i]+ " "+" is not multiple of 5");
		}
		}
	}


}
