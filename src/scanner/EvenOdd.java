package scanner;

import java.util.Scanner;

public class EvenOdd {
	
	
	public void evenodd() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no...");
		int no=s.nextInt();
		
		
		if(no%2 == 0) 
		{
			System.out.println("Given no is Even...");
		}
		else {System.out.println("Given no is Odd...");}
	}

	public static void main(String[] args) {
		EvenOdd e=new EvenOdd();
		e.evenodd();
	}

}
