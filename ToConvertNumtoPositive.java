package week1.day2;

import org.bouncycastle.math.raw.Mod;

public class ToConvertNumtoPositive 
{
	
	public void toConvertNumtoPositive(int a)
	{
		int convnum=0;
		if(a>=0)
		{
			System.out.println("Number is either Positive or Zero");
		}
		else
		{
			//convnum = Math.abs(a);
			convnum = a*(-1);
			System.out.println("The number "+a+" is converted to " +convnum);
		}
	}

	public static void main(String[] args)
	{
		ToConvertNumtoPositive obj1 = new ToConvertNumtoPositive();
		obj1.toConvertNumtoPositive(-50);
		

	}

}
