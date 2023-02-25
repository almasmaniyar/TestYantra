package practice;

import java.util.Scanner;

public class P14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size] ;
System.out.println("enter the element ");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("print the element ");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
		}
	}
