package importantPrograms;

public class ReverseWords {
	
	public static void main(String[] args) {
		String str="life is beautifull";
		
		String[] sr = str.split(" ");
		String op="";
		for(int i=sr.length-1;i>=0;i--) 
		{
		 op=op+sr[i]+" "; 	
		}
		System.out.println(op);
	}

}
