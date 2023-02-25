package recursive_methods;

public class RM11_Fact {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		
		{
			return n*fact(n-1);
		}
		
	}

}
