package methods;

import java.util.Scanner;

public class M3_Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		String s=sc.nextLine();
		switch (s)
		{
		case "add":
			add();
			break;

		case "sub":
			sub();
			break;
		case "pro":
			pro();
			break;

		case "div":
			div();
			break;
		case "remainder":
			add();
			break;

		case "discount":
			add();
			break;
		}
	}
	public static void add()
	{
		int a=5;
		int b=5;
		System.out.println(a+b);
	}

	public static void sub()
	{
		int a=5;
		int b=5;
		System.out.println(a-b);

	}
	public static void pro()
	{
		int a=5;
		int b=5;
		System.out.println(a*b);
	}

	public static void div()
	{
		int a=5;
		int b=5;
		System.out.println(a/b);
	}

	public static void remainder()
	{
		int a=5;
		int b=5;
		System.out.println(a%b);
	}

	public static void discount()
	{
		int a=5;
		int b=5;
		System.out.println(a/b*100);
	}

}
