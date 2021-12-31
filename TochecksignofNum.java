package week1.day2;

public class TochecksignofNum {
	
	public void tochecksignofNum(int a)
	{
		if(a>0)
		{
			System.out.println("Number is Positive");
		}
		else if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is neither Positive nor Negative");
		}
	}

	public static void main(String[] args) 
	{
		TochecksignofNum obj1 = new TochecksignofNum();
		obj1.tochecksignofNum(12);

	}

}
