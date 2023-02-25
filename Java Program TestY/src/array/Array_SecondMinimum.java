package array;

import java.util.Scanner;

public class Array_SecondMinimum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    int min=0;
	    int min1=a[0];
	    System.out.println("Enter the array element");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<size;i++)
		{
			if(a[i]<min)
				min1=min;
		min1=a[i];
		}
		System.out.println(min1 +" is smaller");

		
		
		
		
	}
}
