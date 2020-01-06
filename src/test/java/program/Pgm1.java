package program;

public class Pgm1 
{

	public static void main(String[] args) 
	{
		
		//54321
		// 4321
		//  321
		//   21
		//    1
		
		int a=5, temp=5;
		int x=5;
		for (int i = 0; i < a; i++) 
		{
			
			for (int j = temp; j > 0; j--) 
			{
				
				
				System.out.print(j);
				
			}
			System.out.println();
			
			for (int j = 0; j <= a-x; j++) 
			{
				
				System.out.print(" ");
								
			}
			
			x--;
			temp--;
		}
		
	}

}
