package array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element ");
		int size=sc.nextInt();
		double [] d=new double[size];
		for(int i=0; i<size;i++)
		{
			d[i]=sc.nextDouble();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(d[i]);
		}
	}

}


