package methods;

import java.util.Scanner;

public class M12_GOT {
	public static void main(String[] args) {
		got();
	}
	public static void got()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
      System.out.println(a>b ?a :b>c?b:c);  

}

}