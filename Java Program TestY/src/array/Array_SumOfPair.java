package array;

import java.util.Scanner;

public class Array_SumOfPair {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the first  array element");
		int i=0;
		for( i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();

		}
		for(int j=i+1; j<a.length;j++)
		{
		if(a[i]+a[j]==10)
		{
			System.out.println(a[i]+a[j]+"10");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

	}
}
