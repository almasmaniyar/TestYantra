package recursive_methods;

public class RM10_Reverse_Number {

	public static void main(String[] args) {
		int n=123;
	reverse(n);

	}
	public static void reverse(int n)

	{
		if(n<=1)
		{
			System.out.println(n);
			
		}
		else
		{
			System.out.print(n%10 );
			reverse(n/10);
		}
	
	}

}
