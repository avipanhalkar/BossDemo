package scanner;

import java.util.Scanner;

class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int no =sc.nextInt();
		int rev=0,rem;

		while(no>0)
			{
				rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			System.out.println("Reverse number is->"+rev);


	}
}