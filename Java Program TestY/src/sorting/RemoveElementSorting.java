package sorting;

public class RemoveElementSorting {
public static void main(String[] args) {
	int a[]= {5,7,8,9,3,2};
	int p=1;
	int b[]=new int[a.length];
	b[0]=a[0];
	for(int i=0; i<a.length;i++)
	{
		if(b[p]<=a[i])
		{
			b[p]=a[i];
			p++;
		}
	}
	for(int i=0; i<p; i++)
	{
		System.out.println(a[i]); 
	}
}
}
