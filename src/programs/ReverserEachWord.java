package programs;

public class ReverserEachWord {

	public static void main(String[] args) {
		  String str = "Life is Beautiful";
		  
		  
		  
		  String oop="";
		  for(int i=str.length()-1;i>=0;i--) 
		  {
			oop=oop+str.charAt(i);  
		  }
		  System.out.println(oop);
		  String[] words=str.split(" ");
		  
		  String op = "";
		  for(String word : words) 
		  {
			String rev = "";
			for(int i=word.length()-1;i>=0;i--) 
			{
			 rev=rev+word.charAt(i);	
			}
			op = op + rev + " ";
		  }
		  System.out.println(op);
	}
}
