package array;

import java.util.Scanner;

public class Array_SumOfOdd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	int[] a=new int [n];
	for(int i=0; i<n; i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0; i<n;i++)
	{
		if(a[i]%2!=0)
		{
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
}
}
