package pattern;

import java.util.Scanner;

public class T30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p='A';
		for(int i=1; i<=n ;i++)
		{
			for(int j=1; j<=n;j++)
			{
				
				
				if(i==j)
				{
					
					System.out.print((char)p +" ");
					p++;
				}
				else
				{
					System.out.print(i+j +" ");
				}
				
			}
			System.out.println();
	}



}
}