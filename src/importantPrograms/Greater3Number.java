package importantPrograms;

import java.util.Scanner;

public class Greater3Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 number");
		int a =sc.nextInt();
		
		System.out.println("Enter the 2 number");
		int b =sc.nextInt();
		
		System.out.println("Enter the 3 number");
		int c =sc.nextInt();
	
		
		if(a>b && a>c)
			System.out.println("first is greater");
		              
		else if(b>c && b>a) System.out.println("second is greater");
		else System.out.println("third is greater");
		
	}
}
