package array;

import java.util.Scanner;

public class Array_Minimum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    int min=0;
	    System.out.println("Enter the array element");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=0; i<size;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min +" is smaller");
		
		
	}

}
