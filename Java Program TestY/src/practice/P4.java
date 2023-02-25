package practice;

import java.util.Scanner;

public class P4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=sc.nextInt();
		for (int row=1; row<=n;row++)
		{
			for(int col=1; col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		
}
}