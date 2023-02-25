package sorting;

import java.util.Scanner;

public class BubbleSortInputFromUser {
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
	}

}
