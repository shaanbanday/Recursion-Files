package recursion;

public class CharOccurances {

	public static void main(String[] args) 
	{
		System.out.println(occurances("yoooo", 'o'));
	}

	private static int occurances(String s, char c)
	{
		if (s.equals(""))
		{
			return 0;
		}
		
		else if (s.charAt(0) == c)
		{
			return 1 + occurances(s.substring(1), c);
		}
		
		else
		{
			return 0 + occurances(s.substring(1), c);
		}
	}
}