package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner takeInput = new Scanner (System.in);
	
		System.out.println("Enter number ");
		int n = takeInput.nextInt();
		takeInput.close();
		System.out.println(factorial(n));
	}
	
	private static long factorial (int n)
	{
		long result;
		
		if (n == 0)
		{
			result = 1;
		}
		
		else
		{
			result = n*factorial(n-1);
		}		
		return result;
	}
}


