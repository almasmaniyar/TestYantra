package practice;

public class P2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>0;j--)
			{
				
					//if(i==1 ||i==n ||j==1 ||j==n ||i+j==n+1||i==j||j==n/2+1||i==n/2+1)
					System.out.print(" ");
				//else
					//System.out.print("   ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}