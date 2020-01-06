package program;

public class Sorting 
{

	public static void main(String[] args) 
	{
		
		int a[]= {23,12,45,22,77,88,77,1,0,99};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]<a[j]) 
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		for (int i : a) 
		System.out.print(i+" ");
	}

}
