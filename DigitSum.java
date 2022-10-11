package recursion;

public class DigitSum {

	public static void main(String[] args) 
	{
		System.out.println(digitSum(1)); //should return 1
		System.out.println(digitSum(43)); //should return 7
		System.out.println(digitSum(434567899)); //should return 55
		System.out.println(digitSum(9876)); //should return 30
		System.out.println(digitSum(-999)); //should return 27
	}
	
	private static int digitSum (int input)
	{
		if (input > 0)
		{
			if (input < 10)
			{
				return input;
			}
			
			else
			{
				return digitSum(input % 10) + digitSum(input / 10);
			}
		}
		
		else
		{
			if (Math.abs(input) < 10)
			{
				return input * -1;
			}
			
			else
			{
				return digitSum(input % 10) + digitSum(input / 10);
			}
		}
	}
}


