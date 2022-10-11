package recursion;

public class BinarySeachRecursion {

	public static void main(String[] args) 
	{
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int top = array.length;
		int bottom = 0;
		
		System.out.println(binarySearch(3, top, bottom, array));
		
	}
	
	private static int binarySearch (int target, int top, int bottom, int [] arr)
	{		
		if (bottom < top) 
		{
			int middle = (bottom + top) / 2;
			
			if (target < middle)
			{
				return binarySearch(target, middle - 1, bottom, arr);
				
			}
			
			else
			{
				return binarySearch(target, bottom, middle + 1, arr);
			}
			
		}
		
		else
		{
			return 0;
		}
	}
	
	

}
