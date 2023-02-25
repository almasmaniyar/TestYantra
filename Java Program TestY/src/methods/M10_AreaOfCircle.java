package methods;

import java.util.Scanner;

public class M10_AreaOfCircle {
	public static void main(String[] args) {
		area();
	}
	public static void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double pi=3.14;
		double area=pi*n*n;
		System.out.println(area);
		return ;
	}

}
