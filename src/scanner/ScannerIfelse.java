package scanner;

import java.util.Scanner;

public class ScannerIfelse {

	public void mrg(int a) 
	{
		
		if(a>0) 
		{
		  if(a>18 && a<35)
		  {
			 System.out.println("Elligible for marraige...");
		  }
		  else {System.out.println("Not Elligible for marraige");}
	    }
		else {System.out.println("Enter proper input");}
		
	}
 
	public static void main(String[] args) {
		ScannerIfelse s=new ScannerIfelse();
		Scanner ss=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the age...");
		int i=ss.nextInt();
		s.mrg(i);
		}
		
		
	}
}

