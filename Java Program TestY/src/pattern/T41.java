package pattern;

import java.util.Scanner;

public class T41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0; i<n;i++)
		{
			for(int j=n; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				if(i==4|| k==0|| k==i )
					System.out.print(" "+"*" );
				else
					System.out.print(" "+" ");
			}
				System.out.println();
			}
		}
	}


