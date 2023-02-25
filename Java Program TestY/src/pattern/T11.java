package pattern;

import java.util.Scanner;

public class T11 {
	public static void main(String[] args) {
		
			
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number of rows");
				int n=sc.nextInt();
				for (int row=n; row>=1;row--)
				{
					for(int col=n; col>=row;col--)
					{
						System.out.print(row);
					}
					System.out.println();
				}
				
				
		}
		
}
