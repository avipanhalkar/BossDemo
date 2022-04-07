package importantPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{


		int start=0,end=100;

		for(int i=start;i<=end;i++ )
		{	
			int onm=i;
            int num=i;
			int rev,sum=0;
			while(num>0)
			{
				rev=num%10;
				sum=sum*10+rev;
				num=num/10;
			}

			if(sum == onm) System.out.println(sum+"-");
		}




	}
}
