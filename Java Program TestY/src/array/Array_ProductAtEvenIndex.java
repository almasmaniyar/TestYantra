package array;

import java.util.Scanner;

public class Array_ProductAtEvenIndex {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int n=sc.nextInt();
				int pro=1;
				int[] a=new int [n];
				for(int i=0; i<n; i++)
				{
					a[i]=sc.nextInt();
				}
				for(int i=0; i<n; i++)
				{
					if(i%2==0)
					{
						pro=pro*a[i];
					}
						
					}
				System.out.println(pro);
				
					
				}
			}

		




