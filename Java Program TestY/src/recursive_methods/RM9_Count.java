package recursive_methods;

public class RM9_Count {
	static int n1=0;
	public static void main(String[] args) {
		int n=90;
		System.out.println(count(n));
	}
	public static int count(int n)
	{
		
		if(n==0)
		{
			return n1;
		}
		else
		{
			n1++;
		return count(n-1);
		}
	}

}
