
package constructor;

import java.util.Scanner;

public class Practice {
	
	 Practice()
	{
		this(10);
		System.out.println("Zero argument constructor");
	}
	
	Practice(int a)
	{
		this('a',true);
		System.out.println("One argument constructor->"+a);
	}

	
	Practice(char ch,boolean b)
	{
		System.out.println("Two argument constructor->"+ch+"  "+b);
	}
	
	
	void m1() 
	{
		
		m2();
		System.out.println("log in");
	    System.out.println("M1 method calling");
		
	}
	
	static void m2() 
	{
		m3();
		System.out.println("rtgs");
		System.out.println("M2 method calling");
		
	}
	
	
static	void m3() 
	{
		System.out.println("M3 method calling");
	}
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the data");
		 int a=sc.nextInt();
	
		new Practice(a);
	
	}
}














