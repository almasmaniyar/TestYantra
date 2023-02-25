package methods;

import java.util.Scanner;

public class M4_Polygon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		String s=sc.nextLine();
		switch (s)
		{
		case "areaOfRectangle":
			areaOfRectangle(5,5);
			break;
		case "areaOfSquare":
			areaOfSquare(5);
			break;
		case "areaOfCircle":
			areaOfCircle(5);
			break;
		case "areaOfTriangle":
			areaOfTriangle(5,5);
			break;
			
		}
	}
	public static void areaOfRectangle(int a, int b)
	{
		int area=a*b;
		System.out.println(area);
	}
	public static void areaOfSquare(int a)
	{
		int area=a*a;
		System.out.println(area);
	}
	public static void areaOfCircle(double a)
	{
		double pi=3.14;
		double area=pi*a*a;
		System.out.println(area);
	}
	public static void areaOfTriangle(int a, int b)
	{
		double area=(a*b)*1/2;
		System.out.println(area);
	}

}
