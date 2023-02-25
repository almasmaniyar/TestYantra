package pattern;

import java.util.Scanner;

public class T40 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1; i<=n ;i++)
		{
			int count=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1;k++)
			{
				if(k<i)
				System.out.print(count++);
				else
			System.out.print(count--);
				
			}
			System.out.println();
		}
		
	}

}
