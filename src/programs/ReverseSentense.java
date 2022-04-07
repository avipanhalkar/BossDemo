package programs;

public class ReverseSentense {

	public static void main(String[] args) 
	{
	   String str = "Life is Beautiful";
	   
	   String[] words = str.split(" ");
	   
	   String op="";
	   for(int i=words.length-1;i>=0;i--) 
	   {
		op=op+words[i]+" ";   
	   }
	   
	   System.out.print(op);
	}
	
}
