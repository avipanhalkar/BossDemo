package netflix;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
      int no,rev=0,rem;
	  Scanner s=new Scanner(System.in);
      System.out.println("Enter the no...");
      no=s.nextInt();
      while(no>0) 
      {   rem=no%10;
    	  rev=rev*10+rem;
    	  no=no/10;
     }System.out.println("Reverse no is..."+rev);
	}

}
