package practice;

public class P16 {
	public static void main(String[] args) {
		long l=1234567890123456789l;
		char ch='4';
		System.out.println(ch);
		String name="Almas";
		System.out.println(name.length());
		String name1=name;
		String name2="Maniyar";
		String name3=name1 + " and "+name2;
		System.out.println(name3);
		String name4=name;
		System.out.println(name.charAt(0));
		for(int i=0; i<name4.length();i++)
		{
			System.out.println(name4.charAt(i));
	}
	}

}
