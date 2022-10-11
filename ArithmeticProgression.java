package recursion;

public class ArithmeticProgression 
{
	public static void main(String[] args) 
	{
		System.out.println(arithmetic(10)); //should be 55
	}
	
	private static int arithmetic(int k)
	{
		if (k == 1)
		{
			return 1;
		}
		
		else 
		{
			return k + arithmetic(k-1);
		}
	}
}



