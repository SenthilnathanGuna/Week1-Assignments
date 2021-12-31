package week1.day2;

import java.util.Arrays;

public class TofindMissingNum 
{

	public int tofindMissingNum(int test[])
	{
		int i=1,j;
		
		Arrays.sort(test);
		
		for(j=0;j<test.length;j++)
		{
			
		//	System.out.println("value : " + test[j]);
			if(i==test[j])
			{
			//	System.out.println("Matched"+i);
				i++;
				
			}
			else
			{
				System.out.println("Missing number in Array : "+i);
				i=i+2;
								
			}
			
		/*	else
			{
				System.out.println("Missing element in Array :"+i);
			}
			 */
		}
		
		return 1;
	}
	
	public static void main(String[] args) 
	{
		TofindMissingNum obj2 = new TofindMissingNum();
		int testarray1 [] = {3,1,2,4,6,7,8,10};
		obj2.tofindMissingNum(testarray1);

	}

}
