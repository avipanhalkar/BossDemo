package string;

public class StringCharecters {

	public static void main(String[] args) {
		String str = "India is My Country";
		
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!= ' ') {
		   count++;	
		}
			}
		System.out.println(count);
	}
}
