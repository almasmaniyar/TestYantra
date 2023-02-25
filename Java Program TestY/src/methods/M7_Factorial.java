package methods;

import java.util.Scanner;

public class M7_Factorial {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=sc.nextInt();
			System.out.println(factorial(a));
		}
			public static long factorial(int a) {
				int fact=1;
				if(a<0)
				{		System.out.println("Invalid number");
				return fact;
			}
				for(int i=a;i>=1;i--)
				{
					fact=fact*i;
				}
				return (fact);
				
	}

}
