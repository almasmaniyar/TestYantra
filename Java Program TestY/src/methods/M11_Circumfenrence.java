package methods;

import java.util.Scanner;

public class M11_Circumfenrence {
	public static void main(String[] args) {
		circum();
	}
	public static void circum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double  pi=3.14;
		double cir=2*pi*n;
		System.out.println(cir);
	}

}
