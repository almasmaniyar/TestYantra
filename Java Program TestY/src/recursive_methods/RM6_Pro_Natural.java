package recursive_methods;

import java.util.Scanner;

public class RM6_Pro_Natural {
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(pro(n));
	}
	public static int pro(int n) {
		if (n<=1)
		{
			return n;
		}
		else
		{
			return(n*pro(n-1));
		}
	}
}
