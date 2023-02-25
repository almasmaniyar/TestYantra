package recursive_methods;

import java.util.Scanner;

public class RM3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times");
		int n=sc.nextInt();
	
	birthday(n);
	}
	public static void  birthday(int count1)
	{
		
		if (count1<1) {
		}
		else
		{
			System.out.println("happy birthday ");
		birthday(count1-1);

}
		return ;
}
}