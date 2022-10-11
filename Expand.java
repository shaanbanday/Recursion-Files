package recursion;

public class Expand {

	public static void main(String[] args) 
	{
		System.out.println(expand("takbir"));
	}
	
	private static String expand (String s)
	{
		if (s.equals(""))
		{
			return s;
		}
		
		else if (s.length() == 1)
		{
			return s;
		}
		
		else 
		{
			return s.charAt(0) + "-" + expand(s.substring(1));
		}
	}
}