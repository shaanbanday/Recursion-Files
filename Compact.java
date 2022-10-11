package recursion;

public class Compact 
{
	public static void main(String[] args) 
	{
		System.out.println(compact("I f G o d G o t U s T h e n W e G o n B e A l r i g h t"));
	}
	
	private static String compact (String line)
	{
		if ((line.equals("")) || (line.length() == 1))
		{
			return line;
		}
		
		else if (line.charAt(0) == ' ')
		{
			return compact(line.substring(1));
		}
		
		else
		{
			return line.charAt(0) + compact(line.substring(1));
		}
	}
}