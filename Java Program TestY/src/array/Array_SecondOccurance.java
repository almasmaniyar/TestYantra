package array;


public class Array_SecondOccurance {

			public static void main(String[] args) {
			int count=0;
			boolean flag=true;
			int a[]= {20,10,40,50,20};
			int i=0;
			for( i=0; i<a.length;i++)
			{
			if(a[i]==20)
				
			{
				count++;
			}
				if(count==2)
				{
					flag=false;
					break;
				}
			}
			if(flag==false)
			{
			System.out.println(i);
			}
	}
}


