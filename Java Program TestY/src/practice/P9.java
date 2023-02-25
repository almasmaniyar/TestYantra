package practice;

public class P9 {
	public static void main(String[] args) {
		int n=2;
		int m=6;
		System.out.println(power(m,n));
	}
	public static int power(int m, int n)
	{
		if(m==0)
		{
			return 1;
		}
		else
		{
			return n*power(m-1,n);
		}
	}

}
