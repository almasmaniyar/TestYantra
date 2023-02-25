package pattern;

import java.util.Scanner;

public class T34 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number : ");
			int row=sc.nextInt(); 
			for(int i=row;i>0;i--)
			{
			 for(int j=1;j<=row-i;j++) {
			  System.out.print(" ");
			 }
			 for(int k=1;k<=2*i-1;k++)
			 {
			 if( i==row ||k==1 || k==2*i-1)
			 
			  System.out.print("*");
			else
			  System.out.print(" ");
			 }
			System.out.println();
	     }
	  }
	}

