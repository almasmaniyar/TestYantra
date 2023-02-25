package two_D_Array;

import java.util.Scanner;

public class Two_D_ArraySum {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of row ");
			int a1=sc.nextInt();
			System.out.println("Enter the size of coloumn");
			int a2=sc.nextInt();
//			System.out.println("Enter the size of row ");
//			int a3=sc.nextInt();
//			System.out.println("Enter the size of coloumn");
//			int a4=sc.nextInt();
			int[][] a=new int[a1][a2];
			//int[][] b=new int[a3][a4];
			int sum=0;
			System.out.println("Enter the array elements ");
			for(int i=0; i<a1; i++)
			{
				for(int j=0; j<a2;j++)
				{
					a[i][j]=sc.nextInt();
				}

			}
//			for(int i=0; i<a1; i++)
//			{
//				for(int j=0; j<a2;j++)
//				{
//					b[i][j]=sc.nextInt();
//				}
//
//			}
			System.out.println("the array elements are  ");
			for(int i=0; i<a1; i++)
			{
				for(int j=0; j<a2;j++)
				{
					sum=sum+a[i][j];
				
					System.out.print(sum  +" ");
					
				}
				System.out.println();
			}

		}
	}
