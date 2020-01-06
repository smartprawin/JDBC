package program;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int n=0;
		System.out.println("enter the no. to be find :");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if (input%2==0) 
		{
		System.out.println(" entered input "+input+" is a even no.");	
		}else {
			System.out.println(" entered input "+input+" is a odd no.");	
		}
		
	}

}
