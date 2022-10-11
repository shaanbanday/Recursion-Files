package recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner takeDaInputTings = new Scanner (System.in);
		
		System.out.println("Enter a string");
		
		String s = takeDaInputTings.next();
		
		System.out.println(reverse(s));
		
		takeDaInputTings.close();

	}
	
	private static String reverse (String s)
	{	
		if (s.equals(""))
		{
			return s;
		}
		
		return reverse (s.substring(1)) + s.charAt(0);
	}

}
