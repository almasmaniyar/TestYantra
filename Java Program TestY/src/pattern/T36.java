package pattern;

import java.util.Scanner;

public class T36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1; i<=n ;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				
				System.out.println(count%2==0);
					count++;
					
			}
			System.out.println();
		}
	}

}
