
package importantPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no =sc.nextInt();
		
		 int fact=1;
		                //4
		for(int i=1; i<=no;i++) 
		{//2 3 4 5
			fact = fact*i;//1 2 6 24
		}
		
		System.out.println(fact);
		
		sc.close();
	} 

}
