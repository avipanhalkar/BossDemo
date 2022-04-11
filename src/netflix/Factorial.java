package netflix;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the no...");
      int no=s.nextInt();
      int fact=1;
     if(no>1) 
     {
    	 for (int i=no;i>1;i--) 
      {
    	  fact=fact*i;
      }
    	 System.out.println("Factorial of no is..."+fact);
     } else {System.out.println("Enter proper input...");} 
     
     s.close();
     }

 	
 	


}
