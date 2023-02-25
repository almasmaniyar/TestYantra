package recursive_methods;

public class RM1 {

	public static void main(String[] args) {
		hello(4);
	}
	public static void hello(int count)
	{
		if(count<=1)
		{
			return;
		}
		else
		{
			System.out.println("hi");
			hello(count-1);
		}
	}
	
}
