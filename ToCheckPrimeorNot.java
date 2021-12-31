package week1.day2;

public class ToCheckPrimeorNot 
{
	
	public void toCheckPrimeorNot(int a)
	{
		int i = 2,flag=1;
		for(i=2;i<=9;i++)
		{
			if((a%i==0))
			{
				if (a!=i) 
				{
					flag=0;
					break;
				}				
				
			}
		}
		if(flag==1)
		{
			System.out.println(a+ " is a Prime number");
		} 

		else 
		{ 
			System.out.println(a+ " is not a Prime number"); 
			
		}
		
		/*if((a%2==0)||(a%3==0)||(a%4==0)||(a%5==0)||(a%6==0)||(a%7==0)||(a%8==0)||(a%9==0))
		{
			System.out.println(a+ " is not a Prime number");
		}
		else
		{
			System.out.println(a+ " is a Prime number");
		}*/
		
	}

	public static void main(String[] args) 
	{
		ToCheckPrimeorNot obj1 =new ToCheckPrimeorNot();
		obj1.toCheckPrimeorNot(3);
	}

}
