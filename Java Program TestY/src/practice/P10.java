package practice;

import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		int f=1;
		for(int i=1;i<=rem;i++)
		{
			f=f*i;
		}
		sum=sum+f;
		n=n/10;
		
	}
	if(sum==n)
	System.out.println("Strong number");
	else
		System.out.println("Not A Strong Number");

}
}
