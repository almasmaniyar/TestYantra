package methods;

import java.util.Scanner;

public class M6_IsPrime {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	System.out.println(isPrime(a));
}
	public static boolean isPrime(int a) {
		boolean flag=true;
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
			flag=false;
		}
		}
		if(flag==true)
		return true;
		else
		return flag;
	}
}