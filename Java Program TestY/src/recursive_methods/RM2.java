package recursive_methods;

public class RM2 {
public static void main(String[] args) {
	welcome(6);
}
public static void welcome(int count)
{
	if (count<=1)
return;
	else
	{
		System.out.println("Welcome to testyantra");
	welcome(count-1);


}
}
}
