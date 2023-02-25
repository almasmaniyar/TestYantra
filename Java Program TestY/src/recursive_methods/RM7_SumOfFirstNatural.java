package recursive_methods;

public class RM7_SumOfFirstNatural {
	public static void main(String[] args) {
		int n =10;
				System.out.println(sum(n));
	}
	
public static int sum(int n) {
{
	if (n<=1)
	{
	return n;
	}		
	else 
	{
		return (n+sum(n-1));
	}

}
}
}