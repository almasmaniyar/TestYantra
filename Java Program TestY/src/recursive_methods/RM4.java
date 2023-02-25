package recursive_methods;

public class RM4 {
	public static void main(String[] args) {
		int n=10;
		System.out.println("Sum of natural numbers: "+ sum(n));
		
	}
	public static int sum(int n) {
		if(n<=1)
		{
			return n;
		}
		else
		{
			return(n+sum(n-1));
		}
		
	}

}
