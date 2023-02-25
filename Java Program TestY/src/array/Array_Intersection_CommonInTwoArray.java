package array;

import java.util.Scanner;

public class Array_Intersection_CommonInTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array ");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("enter the size of first array elements ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the size of second array ");
		int size1=sc.nextInt();
		int b[]= new int [size1];
		System.out.println("enter the size of second array element ");
		for(int i=0; i<size1; i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
				for(int j=0; j<size1;j++)
				{
					if(a[i]==b[j])
					{
						System.out.println(a[i]+ " is common elements");
					}
				}
			}
			
		
	}
}

