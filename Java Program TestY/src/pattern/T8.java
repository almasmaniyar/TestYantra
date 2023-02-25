package pattern;

public class T8 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1|| i==4||j==1||j==4)
				{
					System.out.print(i+ "");
					
				}
				else 
				{
					System.out.print(" ");
					
				}
				
				
			}
			System.out.println();
		}
		
	}

}
