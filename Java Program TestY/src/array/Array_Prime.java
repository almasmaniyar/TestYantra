package array;

import java.util.Scanner;

public class Array_Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int n=sc.nextInt();
		int [] a=new int [n];
		System.out.println("enter the array element");
		for(int i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n ;i++)
		{
		
		boolean flag=true;
			int b=a[i];
			for(int j=2; j<b; j++)
			{
				if(b%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(b +" is prime number");
			}
			}
			}
		}
	
