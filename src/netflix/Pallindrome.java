package netflix;
import java.util.Scanner;
public class Pallindrome {
public static void main(String[] args) {
     int no,rev=0;
      Scanner s=new Scanner(System.in);
     System.out.println("Enter the no...");
     no=s.nextInt();
     int onm=no;
     
     if(no>1) {
     while(no>0) 
     {   rev=rev*10+no%10;
    	 no=no/10;
     } 
     if (rev==onm) 
     {System.out.println("Pallindrome no...");}
     else {System.out.println("Not a Pallindrome no...");}
	          }else {System.out.println("Enter the Proper Input...");}
     }

}
