package scanner;

import java.util.Scanner;

public class Paalndrome 
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int no=sc.nextInt();
		int rem,rev=0;
		int onm=no;
		
		while(no>0) 
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		
		if (rev==onm) {System.out.println("Given number is Pallindrome...");}
		else {System.out.println("Not a Pallindrome number...");}
		sc.close();
	}
	

}