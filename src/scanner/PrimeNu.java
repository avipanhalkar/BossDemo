package scanner;

import java.util.Scanner;

public class PrimeNu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int no=sc.nextInt();
		int count=0;
		            //no=5
		for(int i=1;i<=no;i++) //
		{//i=1 2 3 4 5 6
			if(no%i == 0) 
			{
				count++;//1 2
			}
		}
		if(count == 2) 
		{
			System.out.println("Prime Number");
		}
		else {System.out.println("Not A Prime NUmber");}
		sc.close();
	}
}
