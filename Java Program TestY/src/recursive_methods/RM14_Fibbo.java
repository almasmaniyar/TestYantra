package recursive_methods;

import java.util.Scanner;

public class RM14_Fibbo {
	static int n1=0,n2=1,n3;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		System.out.println(n1 + " "+n2);
		fiboo(n);
		
	}
	public static void fiboo(int n)
	{
		if(n>0)
		{
			System.out.print(n3+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		fiboo(n-1);
		}
		
		
	}

}
