package importantPrograms;

public class REverseString {

	public static void main(String[] args) {
		String str = "aviva";

		String reverse = "";
		StringBuilder rev = new StringBuilder(str);
		System.out.println(rev.reverse());
		

		StringBuffer rrev = new StringBuffer(str);
		System.out.println(rrev.reverse());

		
		char[] ch=str.toCharArray();//{'a','v','i',' ',' p'}
		
		for (int i=ch.length-1;i>=0;i--) 
		{
			reverse = reverse+ch[i];
		}
		if(reverse.equals(str)) 
		{
		System.out.println("String is palindrome");	
		}else System.out.println("not palindrome");
		
		
		
	}
}
