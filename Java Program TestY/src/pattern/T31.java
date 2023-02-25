package pattern;

import java.util.Scanner;

public class T31 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=1; i<n ;i++)
	{
		for(int j=1; j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		for(int i1=5;i1>=1; i1--)
		{
			for(int j1=1; j1<=i1;j1++) {
			System.out.print("* ");
			}
		System.out.println();
}
}
}
