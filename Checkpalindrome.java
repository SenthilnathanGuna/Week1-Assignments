package week1.day2;

import java.util.Arrays;

public class Checkpalindrome {
	
	public void checkpalindrome(int a)
	{
		
		int size = String.valueOf(a).length();
		int i=0,j=size-1;
		
		int[] temp1 = new int[size];
		int[] temp2 = new int[size];
		while(a>0)
		{
			temp2[i] = a%10;
			temp1[j] = a%10;
			a=a/10;
			i++;
			j--;
		}

		if(Arrays.equals(temp1, temp2)== true)
		{
			System.out.println("Number is Panlindrome");
		}
		else
		{
			System.out.println("Number is not Panlindrome");
		}
			
		
		/*for(i=0;i<temp2.length;i++)
		{
			System.out.println(temp1[i]);
			System.out.println(temp2[i]);
		}*/
	}

	public static void main(String[] args) 
	{ 
		int checknum = 12343212;
		Checkpalindrome obj1 = new Checkpalindrome();
		obj1.checkpalindrome(checknum);
		

	}

}
