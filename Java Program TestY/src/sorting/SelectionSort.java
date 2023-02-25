package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {3,2,4,5,6};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; i<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
