package program;

import java.util.*;

public class RemoveDuplicateElement 
{

	public static void main(String[] args) 
	{
		int a[]= {2,4,5,20,6,5,7,30};
		int len=a.length;
		int j=0;
		int temp[]= new int[len]; 
		 
		     
	        for (int i=0; i<len-1; i++)
	        {  
	            if (a[i] != a[i+1])
	            {  
	                temp[j++] = a[i];  
	            }  
	         }  
	        
	        temp[j++] = a[len-1];     
	      
	        for (int i=0; i<j; i++)
	        {  
	            a[i] = temp[i];  
	        }  
		 
			
		for (int i = 0; i < j; i++) 
		{
		System.out.print(temp[i]+" ");	
		}
		
	
	}

}
