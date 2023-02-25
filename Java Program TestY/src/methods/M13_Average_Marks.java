package methods;

import java.util.Scanner;

public class M13_Average_Marks {

	public static void main(String[] args) {
	average();

	}
public static void average()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First marks");
	int a=sc.nextInt();
	System.out.println("Enter the second marks");
	int b=sc.nextInt();
	System.out.println("Enter the Third marks");
	int c=sc.nextInt();
	System.out.println("Enter the fourth marks");
	int d=sc.nextInt();
	System.out.println("Enter the fifth marks");
	int e=sc.nextInt();
	System.out.println("Enter the total marks");
	int total=sc.nextInt();
	int avg=(a+b+c+d+e)/5;
	int obtain=a+b+c+d+e;
	float perc=(obtain*100)/total;
	System.out.println(perc);
	System.out.println(avg);
	

}
}
