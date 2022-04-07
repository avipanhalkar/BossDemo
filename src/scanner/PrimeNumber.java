package scanner;

import java.util.Scanner;

public class PrimeNumber {

	
		public static void main(String[] args) 
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number...");
			int no=sc.nextInt();
			int c=0;

			for(int i=1;i<=no;i++)
				{
					for (int j=1;j<=i;j++ )
					{
						if (i%j==0)
						{
							c++;
						}

					} }
				if (c==2)
				{System.out.println("Given Number Is Prime->"+no);
				}
				else {System.out.println("Not A Prime Number..."+no);}
	      
		}
	}


