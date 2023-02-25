package practice;

public class P12 {

	public static void main(String[] args) {
		int count=0;
		int a[]= {20,10,40,50,20};
		int i=0;
		for( i=0; i<a.length;i++)
		{
			if(a[i]==20)

			{
				count++;
				if(count==2)

					System.out.println(i);

			}
		}

	}
}




