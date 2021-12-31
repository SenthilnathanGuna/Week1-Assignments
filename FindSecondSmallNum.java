package week1.day2;

import java.util.Arrays;

public class FindSecondSmallNum 

	{
		
		public int getSecondSmallNum(int[] testarray)
		{
			int i=0;
			Arrays.sort(testarray);
			i = testarray[1];
			
			return i;
		}

		public static void main(String[] args) 
		{
			
			FindSecondSmallNum Obj1 = new FindSecondSmallNum();
			
		  	int[] testarray = {23,45,67,32,89,22};
		  	int SecondSmallNum = 0;
		  	SecondSmallNum = Obj1.getSecondSmallNum(testarray);
			System.out.println("Second Smallest Number in Array : "+SecondSmallNum);
			
			
		}

	}