package netflix;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
   Scanner s =new Scanner(System.in);
   System.out.println("Enter the First no...");
   int a=s.nextInt();
   System.out.println("Enter the Second no...");
   int b=s.nextInt();
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("After swaping First no-"+a);
   System.out.println("After swaping Second no-"+b);

	}

}
