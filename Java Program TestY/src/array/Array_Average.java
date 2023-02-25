package array;

import java.util.Scanner;

public class Array_Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int averg=0;
		int sum=0;
		int[] marks=new int [size];
		for(int i=0; i<size; i++)
		{
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
			averg=sum/size;
		}
		System.out.println(averg);
	}
}


