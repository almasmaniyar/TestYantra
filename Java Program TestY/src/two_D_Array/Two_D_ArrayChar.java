package two_D_Array;

import java.util.Scanner;

public class Two_D_ArrayChar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of row ");
	int a1=sc.nextInt();
	System.out.println("Enter the size of coloumn");
	int a2=sc.nextInt();
	char[][] a=new char[a1][a2];
	System.out.println("Enter the array elements ");
	for(int i=0; i<a1; i++)
	{
		for(int j=0; j<a2;j++)
		{
			a[i][j]=sc.next().charAt(0);
		}

	}
	System.out.println("the array elements are  ");
	for(int i=0; i<a1; i++)
	{
		for(int j=0; j<a2;j++)
		{
			System.out.print(a[i][j] +" ");
		}
System.out.println();
	}

}
}