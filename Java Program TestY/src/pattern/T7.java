package pattern;

public class T7 {

	public static void main(String[] args) {
		char a='a';
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 ||i==n ||j==1 || j==n)
				{
					System.out.print(a+ " ");
					a++;
				
				}
				else
				{
				System.out.print("  ");
			}
				
			}
			System.out.println();
			
		}

	}

}
