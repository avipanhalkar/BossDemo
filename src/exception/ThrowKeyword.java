//package exception;
//
//import java.util.Scanner;
//
//public class ThrowKeyword {
//
//	static void validate(int age)
//	{	if (age>18)
//		{	System.out.println("eligible for mrg");	
//		}
//		else
//		{	throw new InvalidAgeException();
//		}
//	}
//	
//	public static void main(String[] args) 
//	{	Scanner s=new Scanner(System.in);
//		System.out.println("please enter your age ");
//		int age = s.nextInt();
//		ThrowKeyword.validate(age);
//	}
//}
//class InvalidAgeException extends RuntimeException 
//{	
//}