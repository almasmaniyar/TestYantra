package pattern;
import java.util.Scanner;
public class T5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of rows");
				int row=sc.nextInt();
				System.out.println("Enter the number of coloumns");
				int col=sc.nextInt();
				for(int i=0;i<=row;i++)
				{
					for (int j=1;j<=col;j++) {
						System.out.print("* ");
				}
					System.out.println();
				}
				
		
	}

}
