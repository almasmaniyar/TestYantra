package array;

import java.util.Scanner;

public class Array_Reverse {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element ");
	int size=sc.nextInt();
	int reverse=0;
	int [] d=new int[size];
	for(int i=0; i<size ;i++)
	{
		d[i]=sc.nextInt();
		
	}
	for(int i=d.length-1; i>=0;i--)
	{
		reverse=d[i];
		System.out.print(reverse +" ");
	}
}
}