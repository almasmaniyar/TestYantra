package practice;

public class P7 {
public static void main(String[] args) {
	message(5);
}
public static void  message(int n)
{
	if(n<=0)
		{
		return ;
		}
	else
	{
		System.out.println("Welecome to testYantra");
		message(n-1);
	}
	}
}
