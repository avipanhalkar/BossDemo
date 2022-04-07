package importantPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int no = sc.nextInt();
		int a=0,b=1;
		int sum=0;
		
		System.out.println("Fibonacci Series as fallows");
		System.out.print(a+"-");
		System.out.print(b+"-");
		
		for(int i=0;i<=(no-3);i++) 
		{
			sum=a+b;
			System.out.print(sum+"-");
			a=b;
			b=sum;
		}
		sc.close();
		
	}
	
	
}
