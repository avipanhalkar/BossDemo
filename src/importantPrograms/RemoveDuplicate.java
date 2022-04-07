package importantPrograms;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str="jay bholenath ";
		
		String newstr=new String();
		int l=str.length();
		for(int i=0;i<l;i++) 
		{
			char charpos = str.charAt(i);
			
			if(newstr.indexOf(charpos) < 0) 
			{
			 newstr=newstr+charpos;	
			}
		}
		System.out.println(newstr);
	}
}
