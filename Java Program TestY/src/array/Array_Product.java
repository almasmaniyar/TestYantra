package array;

import java.util.Scanner;

public class Array_Product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int pro=1;
		int a[]=new int [size];
		for(int i=0 ;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<=size-1; i++)
		{
			pro=pro*a[i];
		}
		System.out.println(pro);
		
	}

}
