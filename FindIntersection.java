package week1.day2;

public class FindIntersection {

	public static void main(String[] args) 
	{
		int i,j;
		int testarray1 [] = {3,2,11,4,6,7};
		int testarray2 [] = {1,2,8,4,9,7};
		
		for(i=0;i<testarray1.length;i++)
		{
						
			for(j=0;j<testarray2.length;j++)
			{
				if(testarray1[i] == testarray2[j])
				{
					System.out.println("Matching element in Array :"+testarray1[i]);
				}
				
				
			}
		}
	}

}
