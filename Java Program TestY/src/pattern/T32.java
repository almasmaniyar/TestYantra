package pattern;

import java.util.Scanner;

public class T32 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=1; i<=n ;i++)
	{
		for(int k=1; k>=n-i; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		/*for(int i1=5;i1>=1; i1--)
		{
			for(int j1=1; j1<=i1;j1++) {
			System.out.print("* ");
			}
		System.out.println();
}*/
}
}
