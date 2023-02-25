package array;

import java.util.Scanner;

public class Array_Occurence {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size ");
			int size=sc.nextInt();
			
		int count=0;
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
				count++;
				}
					 
				}
			System.out.println(count);
				
	}

}
