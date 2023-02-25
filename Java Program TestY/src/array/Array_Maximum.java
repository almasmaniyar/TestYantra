package array;

import java.util.Scanner;

public class Array_Maximum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array ");
    int size=sc.nextInt();
    int a[]=new int[size];
    int max=0;
    System.out.println("Enter the array element");
	for(int i=0; i<size; i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0; i<size;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	
	
}
}
