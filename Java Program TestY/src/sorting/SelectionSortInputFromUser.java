package sorting;

import java.util.Scanner;

public class SelectionSortInputFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array eleemnt ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			int min=i;
			for(int j=i+1; j<size; j++)
			{
				if(a[j]<a[min])
				{
					
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		
		}
		
		for(int i=0; i<size; i++)
			{
			System.out.println(a[i]);
			}
		}
}
