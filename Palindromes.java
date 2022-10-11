package recursion;

public class Palindromes {

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("saippuakivikauppias")); //Should be true
	}
	
	private static boolean isPalindrome(String s)
	{
		//Decisions
		if (s.equals(""))
		{
			return true;
		}
		
		else if (s.length() == 1)
		{
			return true;
		}
		
		else if (s.length() == 2)
		{
			if ((s.charAt(0)) == (s.charAt(1)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else
		{
			if ((s.charAt(0)) == (s.charAt(s.length() - 1)))
			{
				return isPalindrome(s.substring(1, s.length() - 1));
			}
			else
			{
				return false;
			}
		}
	}
}
