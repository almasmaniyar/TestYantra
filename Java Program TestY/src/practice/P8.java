package practice;

public class P8 {
	public static void main(String[] args) {
		int n=3;
		System.out.println(pro(n));
	}
public static int pro(int n)
{
	if(n<=1)
		{
		return n;
		}
	else
	{
		return (n*pro(n-1));
	}
	}
}
