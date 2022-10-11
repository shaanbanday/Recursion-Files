package recursion;

public class PrintStars
{
	public static void main(String[] args) 
	{
		printStars(100);
	}

	private static void printStars (int n)
	{
		if (n == 1)
		{
			printRow(n);
			printStars(n-1);
		}	
		
		else if (n > 1)
		{
			printRow(n);
			printStars(n-1);
			printRow(n);
		}
	}
	
	private static void printRow (int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print('*');
		}
		System.out.println();
	}
}