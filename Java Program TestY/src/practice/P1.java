package practice;

public class P1 {
public static void main(String[] args) {
	int n=5;
	int a=n+1;
	boolean flag=true;
	for(int i=1; i<=n/2;i++)
	{
		if(i*i==a)
		{
			flag=false;
			break;
		}
	}
		if(flag==false)
		{
			System.out.println("Sunny number");
		}
		else
		{
			System.out.println(" not sunny number");
		}
	}
}

