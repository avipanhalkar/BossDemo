package netflix;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no...");
        int no=s.nextInt();
        int c=0;
        if(no>1) 
        {
        	for (int i=1;i<=no;i++) 
        	{
        		if(no%i==0) 
        		{c++;}
        	}
        	if(c==2) {System.out.println("Prime no...");}
        	else {System.out.println("Not a Prime no...");}
        }else {System.out.println("NO Should be Greter");}
	}

}
