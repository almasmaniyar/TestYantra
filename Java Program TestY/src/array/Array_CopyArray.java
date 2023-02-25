package array;

import java.util.Scanner;

public class Array_CopyArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int[] a=new int[n];
	for(int i=0; i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
		
	 int b=a[i];
		System.out.println(b);
	}
}
}
