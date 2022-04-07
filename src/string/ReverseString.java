package string;

public class ReverseString {

	
	 public static void main(String[] args)

	 {
		String str="Jay Hanuman";
		char[] a = str.toCharArray();

		for(int i=a.length-1;i>=0;i--)
		{
			     System.out.print(a[i]);
		}

			    System.out.println();
		String[] words = str.split(" ");

		for(int i=words.length-1;i>=0;i--)
		{
		System.out.print(words[i]);
		}

		System.out.println();
	 	
		String op="";
		 for(String ss : words)
		 {
		  String rev = "";

		      for(int i=ss.length()-1;i>=0;i--)
				{
				   rev=rev+ss.charAt(i)	;
				}
				op = op+rev+" ";
		 }
		   System.out.println(op);
	 }
	
}
