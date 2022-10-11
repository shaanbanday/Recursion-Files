package recursion;
import java.util.Scanner;
public class FibonnaciSequence 
{
	public static void main(String[] args) 
	{
		Scanner takeInput = new Scanner (System.in);
		System.out.println("Enter number ");
		int n = takeInput.nextInt();
		takeInput.close();
		System.out.println(fibNum(n));
	}
	
	private static int fibNum(int n)
	{
		int result = 0;
		if (n == 0)
		{
			result = 0;
		}
		
		else if (n == 1)
		{
			result = 1;
		}
		
		else
		{
			result = fibNum(n-1) + fibNum(n-2);
		}
		
		return result;
	}
}
