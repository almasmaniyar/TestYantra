package array;

import java.util.Scanner;

public class Array_ElementPresent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		
		boolean flag=false;
		int [] d=new int[size];
		System.out.println("Enter the array element ");
		for(int i=0; i<size ;i++)
		{
			d[i]=sc.nextInt();
		}
		System.out.println("Enter the element ");
		int ele=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			if(ele==d[i])
			{
				flag=true;
				break;
			}
				
			}
		if(flag==true)
		{
			System.out.println(ele+ " is present " );
		}
		else
		{
			System.out.println(ele +"   not present ");
	}
	}
			
}
