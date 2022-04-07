package string;

public class Equals {

	public static void main(String[] args) {
		
		String str="hello";
		String str2="hello";
		
		String str1=new String("hello");
		String str3=new String("hello");
		
		System.out.println(str == str2);//true
		System.out.println(str.equals(str2));//true
		System.out.println(str.equals(str1));//true
		System.out.println(str == str1);//false
		System.out.println(str1 == str3);//false
		System.out.println(str1.equals(str2));//true
	}
}
