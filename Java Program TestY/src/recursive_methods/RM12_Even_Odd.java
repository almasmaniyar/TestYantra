package recursive_methods;

import java.util.Scanner;

public class RM12_Even_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		evenOdd(n);
	}
	public static int evenOdd(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			if(n%2==0)
			System.out.println("The number is even" +n);
			else
				System.out.println("The number is Odd" +n);
		}
		return evenOdd(n-1);
		
	}

}
