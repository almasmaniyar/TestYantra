package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,1,3};
		int temp=0;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0 ; j<a.length-1-i; j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;		
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
