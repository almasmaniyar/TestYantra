package recursive_methods;

import java.util.Scanner;

public class RM8_N_Natural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(sum(n));

	}
	public static int sum(int n) {
		if(n<=1)
		{
			return n;
		}
		else
		{
			return(n+sum(n-1));
		}
	}

}
