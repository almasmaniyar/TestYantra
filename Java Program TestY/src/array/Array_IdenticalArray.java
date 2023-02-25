package array;

import java.util.Scanner;

public class Array_IdenticalArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		boolean flag=false;
		System.out.println("Enter first array");
		for( int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array");
		int size1=sc.nextInt();
		int b[]=new int [size1];
		int j=0;
		for(j=0; j<size1; j++)
		{
			b[j]=sc.nextInt();
		}
		//int a[]= {1,2,3,4};
		//int b[]= {1,2,6,4};
		if(a.length==b.length)
		{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==b[j])
			{
				flag=true;
			}
				else
				{
					flag=false;
				}
		}			
		if(flag==true)
		{
				System.out.println("Array are identical");
			}
			else
			{
				System.out.println("Array are not identical");
			}
			
		}
		
			
	}
}


