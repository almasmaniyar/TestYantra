package array;



public class Array_Palindrome {
	public static void main(String[] args) 
	{
		int a[]= {3,6,0,6,3};
		//int a[]= {3,6,0,6,8};
		int flag=0;
		int n=a.length;
		for(int i=0; i<=n/2 && n!=0 ;i++)
		{
			if(a[i]!=a[n-i-1])	
				flag=1;
				break;
					
		}
		if(flag==1)
			System.out.println("not palindrome");
		else
			System.out.println("Palindrome");
		
	}
		

	}


