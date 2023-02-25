package recursive_methods;

import java.util.Scanner;

public class RM13_Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int number=sc.nextInt();
		System.out.println("enter the power"); 
		int power=sc.nextInt();
		System.out.println(power(power,number));
	}
	public static int power(int power, int number)
	{
		if(power==0)
		{
			return 1;
		}
		else
		{
			return number*(power(power-1, number));

		}
			}

}
