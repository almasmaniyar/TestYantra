package pattern;

import java.util.Scanner;

public class T39 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int ch='a';
			for(int i=1; i<=n ;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
				if(k%2==0)
					System.out.print((char) ch);
					ch++;
				}
				System.out.println();
			}
		}

	}


