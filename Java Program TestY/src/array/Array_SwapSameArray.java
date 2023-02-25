package array;


public class Array_SwapSameArray {
	public static void main(String[] args) {
		//Scanner sc=new Scanner (System.in);
		//int size=sc.nextInt();
		int a[]= {10,20,30,40,50,60};
		int flag=0;
		for(int i=0; i<=a.length-1; i++)
		{
			flag=a[i-(a.length-1)];
			if(flag==a[i])
				a[i]=flag;
			System.out.println(a[i]);
			
		}
	}

}
