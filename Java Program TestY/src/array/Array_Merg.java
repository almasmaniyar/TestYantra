package array;

import java.util.Scanner;

public class Array_Merg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the first  array element");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the size of second array ");
		int size1=sc.nextInt();
		int[] b=new int[size1];
		for(int i=0; i<b.length; i++)
		{
		b[i]=sc.nextInt();
		}
		int c[]= new int[a.length+b.length];
		int k=0;
		for(int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[k];
				k++;
			}
		}
		for(int i=0; i<c.length; i++)
		{
		System.out.println(c[i]);
	}

	}
}
