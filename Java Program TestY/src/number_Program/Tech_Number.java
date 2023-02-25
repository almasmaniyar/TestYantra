package number_Program;

import java.util.Scanner;

public class Tech_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
        int copy=n;
		int count=0;
		while(n>0)
		{
	        n=n/10;
			count++;
		}
			if(count%2==0)
			{
				count=count/2;
				int pow=1;
				for(int i=1;i<=count ; i++)
				{
				pow=pow*10;
				}
				int n1=copy/pow;
				int n2=copy%pow;
				int sum=n1+n2;
				int sq=sum*sum;
				
				if(sq==copy)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");}
			}
			
		}
	}

