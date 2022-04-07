package importantPrograms;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int no=1235;
		int count=0;
		for(int i=1;i<=no;i++) 
		{
			if(no%i == 0) 
			{
			  count++;	
			}
		}
		if(count == 2)System.out.println("Given number is prime");
		else System.out.println("Not Prime number");
	}
}
