package methods;

import java.util.Scanner;

public class M14_Grade {
	public static void main(String[] args) {
		grad();
	}
	public static void grad()
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter English  marks");
	int a=sc.nextInt();
	System.out.println("Enter Urdu marks");
	int b=sc.nextInt();
	System.out.println("Enter Maths marks");
	int c=sc.nextInt();
	System.out.println("Enter Marahthi marks");
	int d=sc.nextInt();
	System.out.println("Enter total marks");
		int n=sc.nextInt();
		int obtain=a+b+c+d;
		float perc=(obtain*100)/n;
		System.out.println(perc);
		if(perc>90)
		System.out.println("A");
		else if(perc>80 ||perc<=90)
			System.out.println("B");
		else if(perc>=60 ||perc<=90)
			System.out.println("C");
		else if(perc<60)
			System.out.println("D");
		else
			System.out.println("Give the valid input");
	}

}
