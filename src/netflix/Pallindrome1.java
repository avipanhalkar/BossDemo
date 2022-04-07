package netflix;

import java.util.Scanner;

public class Pallindrome1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no...");
		int rev=0;
		int no=s.nextInt();
		int onm=no;
		while(no>0) {
			rev=rev*10+no%10;
			no=no/10;
		}
		if(rev==onm) {System.out.println("Pallindrome no...");}
		else {System.out.println("not A pallindrome no...");}
	}

}
