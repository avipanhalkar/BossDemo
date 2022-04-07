package scanner;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int no=sc.nextInt();
		int a=0,b=1;
		int sum;
		System.out.println("Fibonacci Series is->");
		System.out.print(a+"-");
		System.out.print(b+"-");
		//series-> 0 1 1 2 3 5
		//a=  0 1 1 2 3
		//b=  1 1 2 3 5
		//sum=1 2 3 5   
		                //5
		for (int i=0;i<=(no-3);i++)//0 1 2 3
		{
			sum=a+b;//5
			System.out.print(sum+"-");//5
			a=b;
			b=sum;
		}
		sc.close();
		
	
	
	
	
	
	}

}
