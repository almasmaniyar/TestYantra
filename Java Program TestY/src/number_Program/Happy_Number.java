package number_Program;

import java.util.Scanner;

public class Happy_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			int p=n/10;	
		sum=(p*p)+(a*a);
			
		}
		
		if(sum==1)
		{
			System.out.println("happy");
		}
		else if(sum==4)
		{
			System.out.println("sad");
		}
	}

}
